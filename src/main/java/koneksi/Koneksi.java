package koneksi;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Koneksi {
    private Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    public Koneksi(){
        String databaseURL = "jdbc:sqlserver://172.31.2.36:1433;databaseName=Klikindomaret_Customer_Preproduction";
        String user = "sa";
        String password = "Int3l@1dm";
        connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connecting to Database...");
            connection = DriverManager.getConnection(databaseURL, user, password);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    //
//    @BeforeClass
//    public void setUpDB() {
//        String databaseURL = "jdbc:sqlserver://172.31.2.36:1433;databaseName=Klikindomaret_Customer_Preproduction";
//        String user = "sa";
//        String password = "Int3l@1dm";
//        connection = null;
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            System.out.println("Connecting to Database...");
//            connection = DriverManager.getConnection(databaseURL, user, password);
//            if (connection != null) {
//                System.out.println("Connected to the Database...");
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//    }
//    @Test
//    public void test() {
//
//        try{
//            //String query = "SELECT SUBSTRING(OTPCode,1,1) As Kode1, SUBSTRING(OTPCode,2,1) As Kode2, SUBSTRING(OTPCode,3,1) As Kode3, SUBSTRING(OTPCode,4,1) As Kode4 FROM PreRegistration Where Mobile='0895338021090'";
//            String query = "Select top 1 * From Customers";
//            // Get the contents of userinfo table from DB
//            statement = connection.createStatement();
//            rs = statement.executeQuery(query);
//            // Print the result untill all the records are printed
//            // res.next() returns true if there is any next record else returns false
//            while (rs.next())
//            {
//                String ID = rs.getString("ID");
//                String LName = rs.getString("LName");
//                String Email = rs.getString("Email");
//                //int Otp4 = rs.getInt("Kode4");
//                System.out.println(rs.getInt(ID));
//                System.out.println(rs.getString(LName));
//                System.out.println(rs.getString(Email));
//                //System.out.println(rs.getInt(Otp4));
//            }
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }

    @Test
    public List<String> getOTPChangeNumber(String otpcode) {
        List <String> ResultOTP = new ArrayList<String>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(
                    "select * From PreRegistration Where Mobile=?");
            pstmt.setString(1,otpcode);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()){
                String OTP = rs.getString("OTPCode");
                for (char ch : OTP.toCharArray()) {

                    ResultOTP.add(String.valueOf(ch));
                }

                //String EmpName= rs.getString("Mobile");
                //String EmpAddress=rs.getString(3);
                //String Email=rs.getString("Email");
                System.out.println(ResultOTP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ResultOTP;
    }

    @Test
    public List<String> getOTPIsakuConnect(String otpcode) {
        List <String> ResultOTP = new ArrayList<String>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(
                    "select * From CustomerAuthorization Where Mobile=?");
            pstmt.setString(1,otpcode);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()){
                String OTP = rs.getString("OTPCode");
                for (char ch : OTP.toCharArray()) {

                    ResultOTP.add(String.valueOf(ch));
                }

                //String EmpName= rs.getString("Mobile");
                //String EmpAddress=rs.getString(3);
                //String Email=rs.getString("Email");
                System.out.println(ResultOTP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ResultOTP;
    }

    @Test
    public List<String> getOTPAccount(String otpaccount) {
        List <String> ResultOTP = new ArrayList<String>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(
                    "select * From Customers Where Mobile=?");
            pstmt.setString(1,otpaccount);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()){
                String OTP = rs.getString("AccountOTP");
                for (char ch : OTP.toCharArray()) {

                    ResultOTP.add(String.valueOf(ch));
                }

                //String EmpName= rs.getString("Mobile");
                //String EmpAddress=rs.getString(3);
                //String Email=rs.getString("Email");
                System.out.println(ResultOTP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ResultOTP;
    }
    @Test
    public List<String> getOTPEmail(String otpemail) {
        List <String> ResultOTP = new ArrayList<String>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(
                    "select * From EmailRegistration Where Email=?");
            pstmt.setString(1,otpemail);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()){
                String OTP = rs.getString("OTP");
                for (char ch : OTP.toCharArray()) {

                    ResultOTP.add(String.valueOf(ch));
                }

                //String EmpName= rs.getString("Mobile");
                //String EmpAddress=rs.getString(3);
                //String Email=rs.getString("Email");
                System.out.println(ResultOTP);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ResultOTP;
    }
}

