
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    }

    public void terminate(int employeeID) throws SQLException {
        // connect to the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        String SQL = "UPDATE employee set empStatus = 'T' WHERE employeeID = ?";
        PreparedStatement pstmt = conn.prepareStatement(SQL);
        pstmt.setInt(1, employeeID);
        pstmt.execute();

        // close the database connection
        conn.close();
    }

    public ArrayList<Employee> allowedCreators() throws ClassNotFoundException, SQLException {
        //create an empty array list
        ArrayList<Employee> creatorList = new ArrayList<Employee>();

        //check for driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Connect to DB
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        //get records from DB
        String strSQL = "SELECT * FROM employee WHERE empRole in ('Supervisor', 'Manager', 'Administrator') and empStatus = 'A'";//SELECT * FROM qwizardingworld.gringotts WHERE answerCorrect = 'Yellow' or answerCorrect = 'Green' or answerCorrect = 'True';
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(strSQL);
        // while rs.next is while ResultSet(which is a table) has a next field
        while (rs.next()) {
            int employeeID = rs.getInt(1);
            String empName = rs.getString(2);
            String empLastName = rs.getString(3);
            String address = rs.getString(4);
            String address2 = rs.getString(5);
            String city = rs.getString(6);
            String state = rs.getString(7);
            String postalCode = rs.getString(8);
            String email = rs.getString(9);
            int areaCode = rs.getInt(10);
            int phoneNum3 = rs.getInt(11);
            int phoneNum4 = rs.getInt(12);
            String empNotes = rs.getString(13);
            String empdeptType = rs.getString(14);
            String empRole = rs.getString(15);
            String empSupervisor = rs.getString(16);
            int skillLvl = rs.getInt(17);
            String empStatus = rs.getString(18);
            String empUpdateDT = rs.getString(19);
            String empUpdateBy = rs.getString(20);
            String empCreateDT = rs.getString(21);
            String empCreatedBy = rs.getString(22);
            int empSeq = rs.getInt(23);

            Employee emp = new Employee(employeeID, empName, empLastName, address, address2, city, state, postalCode,
                    email, areaCode, phoneNum3, phoneNum4, empNotes, empdeptType, empRole,
                    empSupervisor, skillLvl, empStatus, empUpdateDT, empUpdateBy, empCreateDT, empCreatedBy, empSeq);
            creatorList.add(emp);
        }

        // when list has finished being gathered we must close the connection to DB
        conn.close();
        return creatorList;
    }

    public ArrayList<Employee> allEmployees() throws ClassNotFoundException, SQLException {
        //create an empty array list
        ArrayList<Employee> allEmpList = new ArrayList<Employee>();

        //check for driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Connect to DB
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        //get records from DB
        String strSQL = "SELECT * FROM employee";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(strSQL);
        // while rs.next is while ResultSet(which is a table) has a next field
        while (rs.next()) {
            int employeeID = rs.getInt(1);
            String empName = rs.getString(2);
            String empLastName = rs.getString(3);
            String address = rs.getString(4);
            String address2 = rs.getString(5);
            String city = rs.getString(6);
            String state = rs.getString(7);
            String postalCode = rs.getString(8);
            String email = rs.getString(9);
            int areaCode = rs.getInt(10);
            int phoneNum3 = rs.getInt(11);
            int phoneNum4 = rs.getInt(12);
            String empNotes = rs.getString(13);
            String empdeptType = rs.getString(14);
            String empRole = rs.getString(15);
            String empSupervisor = rs.getString(16);
            int skillLvl = rs.getInt(17);
            String empStatus = rs.getString(18);
            String empUpdateDT = rs.getString(19);
            String empUpdateBy = rs.getString(20);
            String empCreateDT = rs.getString(21);
            String empCreatedBy = rs.getString(22);
            int empSeq = rs.getInt(23);

            Employee emp = new Employee(employeeID, empName, empLastName, address, address2, city, state, postalCode,
                    email, areaCode, phoneNum3, phoneNum4, empNotes, empdeptType, empRole,
                    empSupervisor, skillLvl, empStatus, empUpdateDT, empUpdateBy, empCreateDT, empCreatedBy, empSeq);

            allEmpList.add(emp);
        }

        // when list has finished being gathered we must close the connection to DB
        conn.close();
        return allEmpList;
    }

    public List<String> maintEmps() throws ClassNotFoundException, SQLException {
        List<String> maintEmpONLY = new ArrayList<String>();
        //check for driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Connect to DB
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        //get records from DB
        String strSQL = "SELECT empName, empLastName FROM employee Where empdeptType = 'Maintenance Dept' and empStatus = 'A'";
        Statement stmnt = conn.createStatement();
        ResultSet rs4 = stmnt.executeQuery(strSQL);
        // while rs.next is while ResultSet(which is a table) has a next field
        while (rs4.next()) {
            maintEmpONLY.add(rs4.getString(2) + ", " + rs4.getString(1));
        }
        conn.close();
        return maintEmpONLY;
    }

    public List<String> whseEmps() throws ClassNotFoundException, SQLException {
        List<String> whseEmpONLY = new ArrayList<String>();
        //check for driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Connect to DB
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        //get records from DB
        String strSQL = "SELECT empName, empLastName FROM employee Where empdeptType = 'Warehouse 01' or empdeptType = 'Warehouse 02' and empStatus = 'A'";
        Statement stmnt = conn.createStatement();
        ResultSet rs4 = stmnt.executeQuery(strSQL);
        // while rs.next is while ResultSet(which is a table) has a next field
        while (rs4.next()) {
            whseEmpONLY.add(rs4.getString(2) + ", " + rs4.getString(1));
        }
        conn.close();
        return whseEmpONLY;
    }

}
