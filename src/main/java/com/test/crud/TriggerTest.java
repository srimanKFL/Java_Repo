package com.test.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TriggerTest {
	
	public static void main(int empID, float oldSal, float newSal)throws SQLException {  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kfltestdemo","root","admin");  
            String sql = "INSERT INTO sal_audit VALUES (?, ?, ?)";
    		try {
    			PreparedStatement pstmt = conn.prepareStatement(sql);
    			pstmt.setInt(1, empID);
    			pstmt.setFloat(2, oldSal);
    			pstmt.setFloat(3, newSal);
    			pstmt.executeUpdate();
    			pstmt.close();
    		} catch (SQLException e) {
    			System.err.println(e.getMessage());
    		} 
        }catch(Exception ex){
            System.out.println(ex);
        }  
    }
}
