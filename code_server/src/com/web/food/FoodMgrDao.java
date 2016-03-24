package com.web.food;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.origin.base.DAOBase;  
import com.web.util.Constant;



public class FoodMgrDao {

	

	public  void delete( String id ){
			DAOBase dao = new DAOBase(); 
			String sql = " delete from  " + Constant.DB_PREFIX + "food_info   where  food_id=" + id  ; 
			dao.executeSql(sql);   	  
	}
	
	
	public  void save( Food object ){

    	DAOBase dao = new DAOBase(); 
		String sql =  "insert into " + Constant.DB_PREFIX + "food_info ( food_name  , food_pic , food_description , food_price , food_discount_price ,food_flag ) values( '" + 
								object.getFood_name()  + "' , '" + object.getFood_pic()  + "' , '" + object.getFood_description() + "' , " + 
								object.getFood_price()  + " , "  + object.getFood_discount_price() +  " , '" + object.getFood_flag()  + "' )";   
		dao.executeSql(sql);   	 
	}

	
	public  List getAll(){
		
		List<Food> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
		try { 
			String sql=" select * from " + Constant.DB_PREFIX + "food_info  order by food_id desc  ";  
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Food object = new Food();
				object.setFood_id(  String.valueOf( rs.getInt(1))  );
				object.setFood_name( rs.getString(2) ) ;
				object.setFood_pic( rs.getString(3) ); 
				object.setFood_description( rs.getString(4) ); 
				object.setFood_price(  String.valueOf( rs.getFloat(5) ) );
				object.setFood_discount_price(  String.valueOf( rs.getFloat(6) ) );
				object.food_flag =  rs.getString(7)  ;
				object.food_count =  rs.getString("food_count") ; 
				list.add(object); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dao != null)
				dao.release();			
		}
		return list;
	}
	
 
	public  List getFoodsByFlag( String flag ){
		
		List<Food> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
		try { 
			String sql=" select * from " + Constant.DB_PREFIX + "food_info  where food_flag=  '" + flag + "' order by food_id desc  "  ;  
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Food object = new Food();
				object.setFood_id(  String.valueOf( rs.getInt(1))  );
				object.setFood_name( rs.getString(2) ) ;
				object.setFood_pic( rs.getString(3) ); 
				object.setFood_description( rs.getString(4) ); 
				object.setFood_price(  String.valueOf( rs.getFloat(5) ) );
				object.setFood_discount_price(  String.valueOf( rs.getFloat(6) ) );
				object.food_flag =  rs.getString(7)  ;
				object.food_count =  rs.getString("food_count") ; 
				list.add(object); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dao != null)
				dao.release();			
		}
		return list;
	}
	
}
