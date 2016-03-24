package com.bb.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.bb.model.Food;
import com.bb.model.Type;
import com.bb.util.Constants;


/**
 * 
 * @author 
 *
 */
public class HttpApiAccessor {

	
	/** 
	 *  从服务器获取所有的新闻分类
	 */
	public static ArrayList<Type> getAllNewsType(   )  {
		String url =  Constants.WEB_APP_URL + "type.do?method=list&type=json" ;
		ArrayList<Type> ret = null;
		String jsonString;
		try {
			jsonString = BaseAuthenicationHttpClient.doRequest(url, "", "");
			JSONArray jsonArray = new JSONArray( jsonString  ); 
			ret = new ArrayList<Type>();
			for( int i = 0; i != jsonArray.length(); i++){
				JSONObject json = jsonArray.getJSONObject(i);
				Type object = jsonToType(json);
				ret.add(object);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	
	private static  Type jsonToType(JSONObject json) throws JSONException{
		Type object = new Type();
		object.setId( json.getInt("id") );
		object.setName(  json.getString("name") );
		object.setContent( json.getString("content") ); 
		return object;
	}
	
	
	
	public static String saveOrder( HashMap params  ) {
		String url = Constants.WEB_APP_URL + "orderEdit.do?method=save&type=json"  ;
		String result = null ;

		result = BaseAuthenicationHttpClient.doRequest(url, "", "" , params );

		return result ; 
	}
	
 
	public static boolean getTuisong(long lastId, int pageNo, String flag) throws Exception{
		String url = Constants.WEB_APP_URL + "order.do?method=goAlert&type=json&id=" + Constants.userId ;
		
		url = appendParams(url, lastId, pageNo);
		String jsonString = BaseAuthenicationHttpClient.doRequest(url, "", "");

		JSONArray jsonArray = new JSONArray(jsonString);	 
		
		if( jsonArray.length() > 0 ) 
			return true; 
		
		return false;
	}

		

//根据flag去获取指定的菜谱类型
	public static ArrayList<Food> getFollowed(long lastId, int pageNo, String news_type) throws Exception{
		String url = Constants.WEB_APP_URL + "foodList.do?type=json";
	 
		if( news_type != null ){
			try {								
				//news_type  = URLEncoder.encode(news_type, "utf-8") ;
				news_type=java.net.URLEncoder.encode(news_type, "UTF-8");
				news_type=java.net.URLEncoder.encode(news_type, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			url += "&f=" +  news_type  ;
		}
		return getUpdatesList(url,lastId,pageNo);
	}

	
//	
	private static ArrayList<Food> getUpdatesList(String url,long lastId, int pageNo) throws Exception{
		url = appendParams(url, lastId, pageNo);
		String jsonString = BaseAuthenicationHttpClient.doRequest(url, "", "");

		JSONArray jsonArray = new JSONArray(jsonString);		
		ArrayList<Food> ret = new ArrayList<Food>();
		for( int i = 0; i != jsonArray.length(); i++){
			JSONObject json = jsonArray.getJSONObject(i);
			Food food = jsonToFood(json);
			ret.add(food);
		}
		return ret;
	}
	
//	将json数据解析赋值到food类
	private static Food jsonToFood(JSONObject json) throws JSONException{
		Food food = new Food();
		food.setFood_description(json.getString("food_description"));
		food.setFood_discount_price(Float.valueOf(json.get("food_discount_price").toString()));
		food.setFood_flag( json.getString("food_flag" ));
		food.setFood_id(json.getInt("food_id"));
		food.setFood_name(json.getString("food_name"));
		food.setFood_pic(json.getString("food_pic"));
		food.setFood_price(Float.valueOf(json.get("food_price").toString()));
		return food;
	}

	
	private static String appendParams(String url, long lastId, int pageNo) {
		if(lastId != -1){
			url = "?last_id=" + lastId;
		}
		if(pageNo != -1){
			url = "&pageNo=" + pageNo;
		}
		return url;
	}

	
	
}



