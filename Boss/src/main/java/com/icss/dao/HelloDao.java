package com.icss.dao;

import java.sql.Connection;

import org.springframework.stereotype.Repository;

import com.icss.util.Log;

@Repository
public class HelloDao extends BaseDao{	
	
	public String sayHello(String name) {
		Connection conn = this.openConnection();
		String result =  "Hello Mr." + name;
		
		Log.logger.info( result );
		
		this.closeConnection(conn);
		
		return result;
		
	}
	
	

    
}
