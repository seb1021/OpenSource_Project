package mainlibrary;

import java.sql.*;
import javax.swing.JTextField;
public class TransToyDao {
   
public static boolean checkToy(String Toycallno){
   boolean status=false;
   try{
      Connection con=DB.getConnection();
      PreparedStatement ps=con.prepareStatement("select * from toylist where ToyID=?");
      ps.setString(1,Toycallno);
                ResultSet rs=ps.executeQuery();
      status=rs.next();
      con.close();
   }catch(Exception e){System.out.println(e);}
   return status;
}
   //장난감번호 찾아보기
     public static boolean ToyValidate( String ToyID)
    {
    boolean status = false;
    try(Connection con = DB.getConnection()) {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM toylist"); 
        ResultSet rs=ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int colnum=rsmd.getColumnCount();
        int i;
        while(rs.next())
        {
             //System.out.println(rs.getString("ChildName"));
           System.out.println(rs.getInt("ToyNum")+"    "+ToyID);
           int temp = rs.getInt("ToyNum");
           if(temp == Integer.parseInt(ToyID))
              status  =true;
        }
    }catch(Exception e){System.out.println(e);}
    return status;
}
//사용자 번호 찾기
    public static boolean UserValidate(String UserID)
    {
    boolean status = false;
    try(Connection con = DB.getConnection()) {
        PreparedStatement ps = con.prepareStatement("select * from userlist"); 
        ResultSet rs=ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int colnum=rsmd.getColumnCount();
        int i;
        while(rs.next())
        {
             //System.out.println(rs.getString("ChildName"));
           System.out.println(rs.getInt("IDNumber")+"    "+UserID);
           int temp = rs.getInt("IDNumber");
           if(temp == Integer.parseInt(UserID))
              status  =true;
        }
        con.close();
    }catch(Exception e){System.out.println(e);}
    return status;
}

public static int updateToy(String Toycallno){
   int status=0;
   int quantity=0,issued=0;
   try{
      Connection con=DB.getConnection();
      
      PreparedStatement ps=con.prepareStatement("select quantity,issued from Toys where callno=?");
      ps.setString(1,Toycallno);
      ResultSet rs=ps.executeQuery();
      if(rs.next()){
         quantity=rs.getInt("quantity");
         issued=rs.getInt("issued");
      }
      
      if(quantity>0){
      PreparedStatement ps2=con.prepareStatement("update toylist set quantity=?,issued=? where callno=?");
      ps2.setInt(1,quantity-1);
      ps2.setInt(2,issued+1);
      ps2.setString(3,Toycallno);
      
      status=ps2.executeUpdate();
      }
      con.close();
   }catch(Exception e){System.out.println(e);}
   return status;
}
//userlist에 장난감 번호 넣기
public static int IssueToy(int ToyID, int UserID, String IDate, String RDate)
{
    int status =0;
    
    try{
        
        Connection con =DB.getConnection();
       // PreparedStatement ps= con.prepareStatement("insert into issudtoy values(?,?,?,?)");
        PreparedStatement ps2 = con.prepareStatement("UPDATE userlist SET Toy =? WHERE IDNumber =?");
        /*ps.setInt(1,ToyID);
        ps.setInt(2, UserID);
        ps.setString(3,IDate);
        ps.setString(4,RDate);*/
        ps2.setInt(1,ToyID);
        ps2.setInt(2, UserID);
        //status =ps.executeUpdate();
       status = ps2.executeUpdate();
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
}

   
    public static int ReturnToy(int ToyID,int UserID)
{
    int status =0;
    try{
        
        Connection con =DB.getConnection();
        PreparedStatement ps= con.prepareStatement("delete * from IssuedToy where ToyNum=? and UserID=?");
        ps.setInt(1,ToyID);
        ps.setInt(2, UserID);
        status =ps.executeUpdate();
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
}


public static boolean CheckIssuedToy(int ToyID)
{
    boolean status = false;
    try(Connection con = DB.getConnection()) {
        PreparedStatement ps = con.prepareStatement("select * from userlist  where Toy=?"); 
        ps.setInt(1, ToyID);
        ResultSet rs=ps.executeQuery();
        status=rs.next();
        con.close();
    }catch(Exception e){System.out.println(e);}
    return status;
}

   public static int Check(int UserID)
   {
       boolean status=false;
       int num = 0;
       try(Connection con = DB.getConnection()) {
        PreparedStatement ps = con.prepareStatement("select * from Toy_Count UserID=?"); 
        ps.setInt(2, UserID);
        ResultSet rs=ps.executeQuery();
        status=rs.next();
        num = rs.getInt("ToyNo");
        con.close();
    }catch(Exception e){System.out.println(e);}
       if(num==5)
           return 0;
       else
           return 1;
   }
       
   }
    

