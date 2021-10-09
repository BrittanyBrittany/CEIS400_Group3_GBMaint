
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InventoryIO {

    private final String DATABASE_NAME = "cis400";
    private final String CONNECTION_STRING = 
            "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    private final String USER_NAME = "root";
    private final String PASSWORD = "andzarrian";

    //behaviours
    // save a student object to the database
    public void add(Inventory newPart) throws ClassNotFoundException, SQLException {
        //check for driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connect to DB
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

        String sqlStr = "INSERT INTO inventory (empName, category, type, "
                + "toolName, description, keywords, "
                + "allowStock, vendor, vendorCode, "
                + "cost, skillLevel) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
        pstmt.setString(1, newPart.getEmpName());
        pstmt.setString(2, newPart.getCategory());
        pstmt.setString(3, newPart.getType());
        pstmt.setString(4, newPart.getToolName());
        pstmt.setString(5, newPart.getDescription());
        pstmt.setString(6, newPart.getKeywords());
        pstmt.setString(7, newPart.getAllowStock());
        pstmt.setString(8, newPart.getVendor());
        pstmt.setDouble(9, newPart.getVendorCode());
        pstmt.setDouble(10, newPart.getCost());
        pstmt.setString(11, newPart.getSkillLevel());

        // execute the prepared statement
        pstmt.execute();

        //close connection 
        conn.close();
    }
}
