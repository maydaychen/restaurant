package com.bb.ui;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

import com.bb.R;
import com.bb.util.Constants;


/**
 * 显示菜谱
 * @author Administrator
 *
 */
public class Foods extends TabActivity {
	
    private TabHost tabs;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.foods);
        
//        tab显示——招牌菜
        tabs = getTabHost();        
        TabHost.TabSpec listTab = tabs.newTabSpec("list");
        Intent list = new Intent(this, FoodsList.class);
        listTab.setContent(list);
        listTab.setIndicator("招牌菜", this.getResources().getDrawable(R.drawable.message_32));

        list.putExtra("type", Constants.FLAG_ZEOR);
        tabs.addTab(listTab);


//      tab显示——热门菜
        TabHost.TabSpec repliesTab = tabs.newTabSpec("replies");
        Intent replies = new Intent(this, FoodsList.class);
        repliesTab.setContent(replies);
        repliesTab.setIndicator("热门菜", this.getResources().getDrawable(R.drawable.message_32));
        replies.putExtra("type", Constants.FLAG_TOP);
        tabs.addTab(repliesTab);


//      tab显示——全部
        TabHost.TabSpec allTab = tabs.newTabSpec("all");
        Intent all = new Intent(this, FoodsList.class);
        allTab.setContent(all);
        allTab.setIndicator("全部", this.getResources().getDrawable(R.drawable.message_32));
        all.putExtra("type", Constants.FLAG_ALL);
        tabs.addTab(allTab);        
    }
    
}