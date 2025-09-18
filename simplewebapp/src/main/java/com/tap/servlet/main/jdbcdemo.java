package com.tap.servlet.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/databaseservice")
public class jdbcdemo extends HttpServlet{

    protected void doGet (HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
        try {
            String url="jdbc:mysql://localhost:3306/tflecommerce";
            String username="root";
            String password="password";
           
            PrintWriter pw=res.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);          
            Statement st=conn.createStatement();  

            st.executeUpdate("delete from products where name='t-shirt'");
            st.executeUpdate("insert into products (name,description,price,stock,category_id) values ('t-shirt','yellow color',300,30,1)");
            st.executeUpdate("update products set description='pink coloured t-shirt' where name='t-shirt'");
            st.executeUpdate("delete from products where name='ring'");
             ResultSet rs1= st.executeQuery("select * from products where id=20");
             rs1.next();
                for(int i=1;i<=8;i++){
                    pw.printf("%-25s",rs1.getString(i),"\t");
            }

            ResultSet rs=st.executeQuery("SELECT * FROM products");
                while(rs.next()){
                     pw.println(rs.getInt(1)+"  "+rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
