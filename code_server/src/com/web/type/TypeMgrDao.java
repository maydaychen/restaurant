package com.web.type;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.origin.base.DAOBase; 



public class TypeMgrDao {

	

	public  void delete( String id ){
			DAOBase dao = new DAOBase(); 
			String sql = " delete from  type where id=" + id  ; 
			dao.executeSql(sql);   	  
	}
	
	
	public  void save( Type object ){

    	DAOBase dao = new DAOBase(); 
    	String sql = null; 
    	if( object.getId() == 0) {
    		sql =   "insert into type (   name , content , state  )" +
					"  values( '" + object.getName()   + "' , '" + object.getContent()  + "' , '" + object.state   + "' )";   
    	}else{
    		sql = " update type  set  name ='" + object.getName() + "'  , content = '" + object.getContent() + "'  , state = '" + object.state 
    				+  "'  where id = " + object.getId() ; 
    	}
		dao.executeSql(sql);   	 
	}

	public  Type getObjectById( String id ){
		
    	DAOBase dao = new DAOBase();
		Type object =  null ; 
		try { 
			String sql = "select * from type  where id=" + id ;  
			 
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			if(rs.next()) {
				
				object = new Type();
				object.setId(  rs.getInt(1)  ); 
				object.setName( rs.getString(2) );   
				object.setContent(  rs.getString(3) ); 
				object.state =  rs.getString(4)  ; 
				return object ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dao != null)
				dao.release();			
		}
		return null;
	}
	 
	
	public  List getAll(  int pageIndex  , int pageSize  , String name ){
		
		List<Type> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
		try { 
			String sql = "select * from type ";  
			if( name != null ){
				sql += " where name like '%" + name + "%' " ;
			}
			sql += " order by id desc "   ;  
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Type object = new Type();
				object.setId(  rs.getInt(1)  ); 
				object.setName( rs.getString(2) );   
				object.setContent(  rs.getString(3) ); 
				object.state =  rs.getString(4)  ; 
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
	
	public  List getAll( String name ){
		
		List<Type> list = new ArrayList() ;
    	DAOBase dao = new DAOBase();
		try { 
			String sql = "select * from type ";  
			if( name != null ){
				sql += " where name like '%" + name + "%' " ;
			}
			sql += " order by id desc  ; "  ;  
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
			while(rs.next()) {
				Type object = new Type();
				object.setId(  rs.getInt(1)  ); 
				object.setName( rs.getString(2) );   
				object.setContent(  rs.getString(3) ); 
				object.state =  rs.getString(4)  ; 
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
	
	
	
	public int getTotalCount( ){
		
		String sql = " select count(id) ids from type " ;
	 	DAOBase dao = new DAOBase();
		int rowCount = 0; 
		try { 
	    	dao.querySql(sql);
    		ResultSet rs = dao.getRes(); 
    		if(rs.next()) { 
    		    rowCount = rs.getInt("ids"); 
    		}
    		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dao != null)
				dao.release();			
		}
		return rowCount ;
	} 
	
	
}
