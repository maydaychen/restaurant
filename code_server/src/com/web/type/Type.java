package com.web.type;

import java.io.Serializable;

public class Type  implements Serializable { 

	
	public int  id ;
	public String name  ;
	public String content ;  
	public String state ;  
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	 
	
	
	
	
	  
}
