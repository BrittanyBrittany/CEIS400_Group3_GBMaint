
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brittany
 */
public class OrderIO {
    private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/cis400";
    private final String USER_NAME = "root";
    private final String PASSWORD = "Br1tt4ny";

    //behaviours
    // save a student object to the database
    public void add(Order ord) throws ClassNotFoundException, SQLException {
        //check  for driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connect to DB
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        //Need to change code below to match Order
        /*
        String sqlStr = "INSERT INTO employee (empName, empLastName,"
                + " address, address2, city, state,"
                + " postalCode, email, areaCode, phoneNum3,"
                + " phoneNum4, empNotes, empdeptType,"
                + " empRole, empSupervisor, skillLvl,"
                + " empStatus, empUpdateDT, empUpdateBy, "
                + "empCreateDT, empCreatedBy, empSeq) Values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
        //pstmt.setInt(1, emp.getEmployeeID());
        pstmt.setString(1, emp.getEmpName());
        pstmt.setString(2, emp.getEmpLastName());
        pstmt.setString(3, emp.getAddress());
        pstmt.setString(4, emp.getAddress2());
        pstmt.setString(5, emp.getCity());
        pstmt.setString(6, emp.getState());
        pstmt.setString(7, emp.getPostalCode());
        pstmt.setString(8, emp.getEmail());
        pstmt.setInt(9, emp.getAreaCode());
        pstmt.setInt(10, emp.getPhoneNum3());
        pstmt.setInt(11, emp.getPhoneNum4());
        pstmt.setString(12, emp.getEmpNotes());
        pstmt.setString(13, emp.getEmpdeptType());
        pstmt.setString(14, emp.getEmpRole());
        pstmt.setString(15, emp.getEmpSupervisor());
        pstmt.setInt(16, emp.getSkillLvl());
        pstmt.setString(17, emp.getEmpStatus());
        pstmt.setString(18, emp.getEmpUpdateDT());
        pstmt.setString(19, emp.getEmpUpdateBy());
        pstmt.setString(20, emp.getEmpCreateDT());
        pstmt.setString(21, emp.getEmpCreatedBy());
        pstmt.setInt(22, emp.getEmpSeq());

        pstmt.execute();

        conn.close();
*/
    }
    
}
