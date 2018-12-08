/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author bikash
 */
public class UsersDao {
    
    
    public static boolean validate(String name,String password){
      boolean status=false;
      try{
         Connection con=DB.getConnection();
         PreparedStatement ps=con.prepareStatement("select * from Users where UserName=? and UserPass=?");
         ps.setString(1,name);
         ps.setString(2,password);
         ResultSet rs=ps.executeQuery();
         status=rs.next();
         con.close();
      }catch(Exception e){System.out.println(e);}
      return status;
   }
    
    //사용자 이름 이미 있는지 확인하자
    public static boolean CheckIfAlready(String UserName)
    {
        boolean status=false;
      try{
         Connection con=DB.getConnection();
         PreparedStatement ps=con.prepareStatement("select * from userlist where Name=?");
         ps.setString(1,UserName);
         ResultSet rs=ps.executeQuery();
         status=rs.next();
         con.close();
      }catch(Exception e){System.out.println(e);}
      return status;
        
    }
    
    
    //사용자 추가
    public  static int AddUser(String User,int ID,String child,int age,String phone) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
         int status =0;
         try{
        
            Connection con =DB.getConnection();
            PreparedStatement ps= con.prepareStatement("insert into userlist(IDNumber,LibraryName,PhoneNum,Name,ChildName,ChildAge) values(?,?,?,?,?,?)");
            ps.setInt(1,ID);
            ps.setString(2, "청주도서관");
            ps.setString(3, phone);
            ps.setString(4,User);
            ps.setString(5,child);
            ps.setInt(6,age);
            status =ps.executeUpdate();
            con.close();
}catch(Exception e){System.out.println(e);}
    return status; 
    
    
    }

    
}
