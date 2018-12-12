package mainlibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ToyDao {
public static int save(String ToyName,String Type, String Age, String Company){
   int status=0;
   try{
      Connection con=DB.getConnection();
      PreparedStatement ps=con.prepareStatement("insert into toylist(ToyName,Type,Age,Company) values(?,?,?,?)");
      ps.setString(1,ToyName);
      ps.setString(2,Type);
      ps.setString(3,Age);
      ps.setString(4,Company);
      status=ps.executeUpdate();
      con.close();
   }catch(Exception e){System.out.println(e);}
   return status;
}

    /**
     *
     * @param Company
     * @return
     */
    public static boolean ToyNameValidate( String ToyName)
{
    boolean status = false;
    try(Connection con = DB.getConnection()) {
        PreparedStatement ps = con.prepareStatement("select * from toylist where ToyName = ?"); 
        ps.setString(1, ToyName);
        ResultSet rs=ps.executeQuery();
        status=rs.next();
        con.close();
    }catch(Exception e){System.out.println(e);}
    return status;
}
    
    public static int AddToyName( String ToyName)
    {
        int status= 0;
        try(Connection con = DB.getConnection()) {
      PreparedStatement ps=con.prepareStatement("insert into toylist(ToyName) values(?)");
      ps.setString(1,ToyName);
      status=ps.executeUpdate();
                con.close();
   }catch(Exception e){System.out.println(e);}
   return status;
        
    }

  
    
    public static int SaveToy(String ToyNameN, String TypeN, String AgeN,  String CompanyN) {
            int status= 0;
        try(Connection con = DB.getConnection()) {
      PreparedStatement ps=con.prepareStatement("insert into toylist(ToyName,Type,Age,Company) values(?,?,?,?)");
               ps.setString(1, ToyNameN);
                ps.setString(2, TypeN);
                ps.setString(3, AgeN);
                ps.setString(4, CompanyN);
      status=ps.executeUpdate();
                con.close();
   }catch(Exception e){System.out.println(e);}
   return status;    }
    
    public static int Delete(int ToyNum)
    {
          int status= 0;
        try(Connection con = DB.getConnection()) {
      PreparedStatement ps=con.prepareStatement("DELETE * FROM toylist where ToyNum=?");
      ps.setInt(1,ToyNum);
      status=ps.executeUpdate();
                con.close();
   }catch(Exception e){System.out.println(e);}
   return status;
        
    }

            
    
 

}
