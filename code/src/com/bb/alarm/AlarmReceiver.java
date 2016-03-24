package com.bb.alarm; 


import java.util.ArrayList;
import java.util.Calendar;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Note;

import com.bb.R;
import com.bb.api.HttpApiAccessor; 
import com.bb.ui.Foods;
import com.bb.ui.GwcListActivity;



public class AlarmReceiver extends BroadcastReceiver { 


	int notification_id = 19172439;
	NotificationManager nm;
	
	
	/** 
	 * 
	* 通过广播进行扫描，是否到达时间后再响起闹铃 
	* 
	* */ 
	@Override 
	public void onReceive(Context context, Intent intent) { 
		  
	      //获取当前的年、月、日、小时、分钟
	    Calendar c = Calendar.getInstance(); 
	
	    boolean isReady = false;
		try {
			isReady = HttpApiAccessor.getTuisong(-1, -1, "&tuisong=yes");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    if(  isReady ) {
	    	nm = (NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);	
			/* create Intent，调用AlarmAlert.class */
		    Intent intent2 = new Intent(context, Foods.class);

			Notification notification = new Notification( R.drawable.ic_launcher , "菜品完成" ,System.currentTimeMillis());
   		
	       	//后面的参数分别是显示在顶部通知栏的小图标，小图标旁的文字（短暂显示，自动消失）系统当前时间 
	       	notification.defaults=Notification.DEFAULT_ALL;  
	       	notification.flags = notification.FLAG_AUTO_CANCEL ;
	       
	       	
	       	//这是设置通知是否同时播放声音或振动，声音为Notification.DEFAULT_SOUND
	       	//振动为Notification.DEFAULT_VIBRATE;
	       	//Light为Notification.DEFAULT_LIGHTS，在我的Milestone上好像没什么反应
	       	//全部为Notification.DEFAULT_ALL
	       	//如果是振动或者全部，必须在AndroidManifest.xml加入振动权限
	       	PendingIntent pt = PendingIntent.getActivity( context , 0, intent2 , PendingIntent.FLAG_UPDATE_CURRENT);
	       	//点击通知后的动作，这里是转回main 这个Acticity
	       	notification.setLatestEventInfo( context  , "菜品已经完成" , "请稍后" , pt);
	       	nm.notify(notification_id, notification); 
	    }
	} 
	
 
	private static String pad(int c) {    
		
		if (c >= 10)        
			return String.valueOf(c);    
		else        
			return "0" + String.valueOf(c);
		
	}
	
	
} 
