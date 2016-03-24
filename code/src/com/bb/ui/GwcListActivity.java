package com.bb.ui;


import java.util.HashMap;
import java.util.List;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bb.Main;
import com.bb.R;
import com.bb.alarm.AlarmReceiver;
import com.bb.api.HttpApiAccessor;
import com.bb.db.DbControl; 
import com.bb.util.Constants;


/**
 * 
 *  
 * @author Administrator
 *
 */
public class GwcListActivity extends ListActivity {
	

    private static final int DELETE_ID = Menu.FIRST ;
    
	private NoteAdapter adapter;
	private List<Gwc> list ;
 
	public static class ViewHolder {
		public TextView tvName;
		public TextView tvPrice;
		public TextView tvId;
	}
	 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.gwc_list);

        
        TextView tv_add = (TextView)findViewById(R.id.btn_add);
        tv_add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
            	showDialog(GwcListActivity.this);
			}
		});
        
    	new LoadTask().execute();	
        registerForContextMenu(getListView());
    }

    private void showDialog( Context context ){
    	
    	LayoutInflater li = LayoutInflater.from(context);
		View promptsView = li.inflate(R.layout.prompts_gequ, null);
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
		alertDialogBuilder.setView(promptsView);
		
//		final EditText et_search_name = (EditText) promptsView.findViewById(R.id.search_name);
//		final EditText et_search_type = (EditText) promptsView.findViewById(R.id.search_type);
		final EditText et_search_song = (EditText) promptsView.findViewById(R.id.search_song);
		
		Double price = 0d ;
		
		for(int i=0 ; i< list.size() ;i++){ 
			price += Double.valueOf( list.get(i).getPrice() ) ; 
		}
		TextView et_search_name = (TextView) promptsView.findViewById(R.id.search_name);
		 
		et_search_name.setText( "总价: " + price + "元" ) ;
		
		
		alertDialogBuilder
			.setCancelable(false)
			.setTitle("搜索")
			.setPositiveButton("OK",
			  new DialogInterface.OnClickListener() {
			    public void onClick(DialogInterface dialog,int pid) {
					
//			    	 String password = et_search_name.getText().toString().trim() ;
//			    	 String zuowei = et_search_type.getText().toString().trim() ;
			    	 String beizhu = et_search_song.getText().toString().trim() ;
			    	 
						HashMap orderMap = new HashMap();  
						
						String food_name = "";
						int food_id = 0 ;
						double price = 0d ;
						String seat = "" ;
						
						for(int i=0 ; i< list.size() ;i++){
							food_name += list.get(i).getFood_name() + "--" + list.get(i).getPrice() + " ,"; 
							food_id = list.get(i).getId() ;
							seat += list.get(i).getSeat()+ "_" ;
							price += Double.valueOf( list.get(i).getPrice() ) ; 
						}
						orderMap.put("order.food_id",  String.valueOf( food_id )  );	
						orderMap.put("order.food_name",  food_name  );
						orderMap.put("order.seat",  Constants.userId  );
						orderMap.put("order.beizhu",  beizhu );
						orderMap.put("order.price",  String.valueOf( price ) );
						
						orderMap.put("food_ids",  seat );
						
						Log.i("price ", price + "" + food_name ) ;
						
//						发送订单信息给服务端
						String  result  = HttpApiAccessor.saveOrder(  orderMap )   ;
						DbControl 	dbControl   = new DbControl( GwcListActivity.this ) ;
						dbControl.deleteAllGwc(GwcListActivity.this ) ;
						Toast.makeText(GwcListActivity.this, "下订单成功！", Toast.LENGTH_SHORT).show();
			    	 
						AlarmManager aManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
						
						Intent intent = new Intent( GwcListActivity.this, AlarmReceiver.class ); 
						intent.setAction("AlarmReceiver");
						PendingIntent pendingIntent = PendingIntent.getBroadcast( GwcListActivity.this, 0, intent, 0 );
//						定时时间,要两分钟
						aManager.setRepeating(AlarmManager.RTC, 0, 2*60*1000, pendingIntent); 

						Intent i = new Intent(GwcListActivity.this, TypeListActivity.class);
			            startActivity(i);

						finish();
//			         new LoadTask().execute();   
			    }
			  });
		
		alertDialogBuilder.setNegativeButton("取消",  
                new DialogInterface.OnClickListener() {  
                    public void onClick(DialogInterface dialog, int whichButton) {  
                         
                    }  
		  });

		AlertDialog alertDialog = alertDialogBuilder.create(); 
		alertDialog.show(); 
}

    
    
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
            ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, DELETE_ID, 0, "删除");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case DELETE_ID:
//            	从sqlite数据库清空数据
                AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();
                DbControl dbControl = new DbControl(GwcListActivity.this);
                Gwc object = list.get(  Long.valueOf(info.id).intValue() );
                dbControl.deleteGwc( GwcListActivity.this , object.getId() ) ; 
            	new LoadTask().execute();	
                return true;
        }
        return super.onContextItemSelected(item);
    }
    
    
	/**
	 * 异步加载所有 
	 */
	public class LoadTask extends AsyncTask<Void, Void, Void>{
		
		
		protected Void doInBackground(Void... arg0) { 
			
			DbControl dbControl = new DbControl(GwcListActivity.this);
			list =  dbControl.getAllGwc( GwcListActivity.this ) ;
			return null;
		} 
		
		protected void onPostExecute(Void result) {
			adapter = new NoteAdapter();
			setListAdapter(adapter);
			removeDialog(0);
			super.onPostExecute(result);
		}
		
		protected void onPreExecute() {
			showDialog(0);
			super.onPreExecute();
		}
	}
	
	
	public class NoteAdapter extends BaseAdapter {

		
		public int getCount() {
			return list.size();
		}

		
		public Object getItem(int arg0) {
			return list.get(arg0);
		}

		
		public long getItemId(int position) {
			return position;
		}

		
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder = null;
			if (convertView == null) {
				holder = new ViewHolder();
				convertView = LayoutInflater.from(getApplicationContext())
						.inflate(R.layout.gwc_item, null);
				holder.tvName = (TextView) convertView.findViewById(R.id.name);
				holder.tvPrice = (TextView) convertView.findViewById(R.id.price);
				
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			holder.tvName.setText(list.get(position).getFood_name()  ); 	
			holder.tvPrice.setText( "数量:" + list.get(position).getSeat() + " 价格:" +  list.get(position).getPrice()   ); 
			
			
			return convertView;
		}
		
	}
	

	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id); 
//		Intent intent = new Intent(GwcListActivity.this, NoteEditActivity.class);
//		intent.putExtra( "note" , list.get(position)  );
//        startActivityForResult( intent , ACTIVITY_EDIT);
	}

 
    
	 
}
