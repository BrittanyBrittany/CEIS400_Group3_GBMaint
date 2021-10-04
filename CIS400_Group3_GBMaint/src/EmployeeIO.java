
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brittany
 */
public class EmployeeIO {

    private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/cis400";
    private final String USER_NAME = "root";
    private final String PASSWORD = "Br1tt4ny";

    //behaviours
    // save a student object to the database
    public void add(Employee emp) throws ClassNotFoundException, SQLException {
        //check  for driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connect to DB
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        //write student rwcord to DB
        String sqlStr = "INSERT INTO employee (employeeID, empName, empLastName,"
                + " address, address2, city, state,"
                + " postalCode, email, areaCode, phoneNum3,"
                + " phoneNum4, empNotes, empdeptType,"
                + " empRole, empSupervisor, skillLvl,"
                + " empStatus, empUpdateDT, empUpdateBy, "
                + "empCreateDT, empCreatedBy, empSeq) Values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
        pstmt.setInt(1, emp.getEmployeeID());
        pstmt.setString(2, emp.getEmpName());
        pstmt.setString(3, emp.getEmpLastName());
        pstmt.setString(4, emp.getAddress());
        pstmt.setString(5, emp.getAddress2());
        pstmt.setString(6, emp.getCity());
        pstmt.setString(7, emp.getState());
        pstmt.setString(8, emp.getPostalCode());
        pstmt.setString(9, emp.getEmail());
        pstmt.setInt(10, emp.getAreaCode());
        pstmt.setInt(11, emp.getPhoneNum3());
        pstmt.setInt(12, emp.getPhoneNum4());
        pstmt.setString(13, emp.getEmpNotes());
        pstmt.setString(14, emp.getEmpdeptType());
        pstmt.setString(15, emp.getEmpRole());
        pstmt.setString(16, emp.getEmpSupervisor());
        pstmt.setInt(17, emp.getSkillLvl());
        pstmt.setString(18, emp.getEmpStatus());
        pstmt.setString(19, emp.getEmpUpdateDT());
        pstmt.setString(20, emp.getEmpUpdateBy());
        pstmt.setString(21, emp.getEmpCreateDT());
        pstmt.setString(22, emp.getEmpCreatedBy());
        pstmt.setInt(23, emp.getEmpSeq());

        pstmt.execute();

        conn.close();

    }

    
    public void terminate(int employeeID) throws SQLException {
        // connect to the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        // delete the record
        String SQL = "UPDATE employee set empStatus = 'T' WHERE employeeID = ?";
        PreparedStatement pstmt = conn.prepareStatement(SQL);
        pstmt.setInt(1, employeeID);
        pstmt.execute();

        // close the database connection
        conn.close();
    }

    

}
