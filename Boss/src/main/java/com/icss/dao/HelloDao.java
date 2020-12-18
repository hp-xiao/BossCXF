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
	
	
	public void payMoney(double money) {
		Connection conn = this.openConnection();
		
		Log.logger.info("HelloDao付款：" + money);
		
		this.closeConnection(conn);
	}
    
}
