package com.bb.ui;


import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bb.R;
import com.bb.api.HttpApiAccessor;
import com.bb.db.DbControl;
import com.bb.model.Food;
import com.bb.util.AsyncImageLoader;
import com.bb.util.AsyncImageLoader.ImageCallback;
import com.bb.util.Constants;



public class FoodInfoActivity extends Activity {


	private Food food ;
	private EditText et_shuliang ;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.food_info);
		
//获取上一个activity传过来的参数值
		food = (Food) getIntent().getSerializableExtra("food");
		
		TextView tv_name = (TextView) this.findViewById(R.id.name);
		tv_name.setText(   food.getFood_name() + ": " + food.getFood_description() ) ;

		et_shuliang = (EditText) this.findViewById(R.id.shuliang); 
		
		
//		从服务器上获取图片，并且显示
		ImageView iv = (ImageView) this.findViewById(R.id.food_img) ; 
        String picPath = Constants.WEB_APP_URL + "upload/" + food.getFood_pic()  ; 
		AsyncImageLoader asyncImageLoader = new AsyncImageLoader();
		
		Drawable cachedImage = asyncImageLoader.loadDrawable(
    			picPath , iv , new ImageCallback() {

					public void imageLoaded(Drawable imageDrawable,
							ImageView imageView, String imageUrl) {
						imageView.setImageDrawable(imageDrawable);
					}
				});

		if (cachedImage == null) {
			iv.setImageResource(R.drawable.pork);
		} else {
			iv.setImageDrawable(cachedImage);
		}
		
//		给按钮做响应事件
//		et_seat = (EditText) this.findViewById(R.id.seat);  
		
		Button btn = (Button) findViewById(R.id.button1) ;
		
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
//				String seat = et_seat.getText().toString().trim();
//				添加到购物车，购物车数据临时存放在手机自带sqlite的数据库
//				String seat = String.valueOf( food.getFood_id() ) ;
				
				String  shuliang = et_shuliang.getText().toString();
				float	jiage =  food.getFood_discount_price() * Integer.valueOf(shuliang)  ;
				 
				DbControl 	dbControl   = new DbControl( FoodInfoActivity.this ) ;
				if( dbControl. addGwc( FoodInfoActivity.this , food.getFood_name()  ,  shuliang  , jiage )   ) {
	        		Log.i(" add gwc "," add gwc success "); 
//	        	    Intent i = new Intent( FoodInfoActivity.this, GwcListActivity.class);
//			        startActivity(i);
			        finish();
				} 
		       
			}
		}) ;
		
		
	}
	
	
}
