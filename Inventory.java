
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brothrock
 */
public class Inventory {
    // attributes
    
    private String empName;
    private String category;
    private String type;
    private String toolName;
    private String description;
    private String keywords;
    private String allowStock;
    private String vendor;
    private double vendorCode;
    private double cost;
    private String skillLevel;
    
    
    public Inventory(){
        empName = "N/A";
        category = "N/A";
        type = "N/A";
        toolName = "N/A";
        description = "N/A";
        keywords = "N/A";
        allowStock = "N/A";
        vendor = "N/A";
        vendorCode = 0.0;
        cost = 0.0;
        skillLevel = "N/A";
    }
    
    public Inventory(String empName, String category, String type, String toolName, 
            String description, String keywords, String allowStock, String vendor, int vendorCode, 
            double cost, String skillLevel)
    {
        this.empName = empName;
        this.category = category;
        this.type = type;
        this.toolName = toolName;
        this.description = description;
        this.keywords = keywords;
        this.allowStock = allowStock;
        this.vendor = vendor;
        this.vendorCode = vendorCode;
        this.cost = cost;
        this.skillLevel = skillLevel;
        
    }
    
    //behaviors
    public String preview ()
    {
        DecimalFormat fmt = new DecimalFormat( "$#,##0.00");
        String output = "Employee Name: " + empName + "\n";
        output += "Category: " + category + "\n";
        output += "Type: " + type + "\n";
        output += "Tool Name: " + toolName + "\n";
        output += "Description: " + description + "\n";
        output += "Keywords: " + keywords + "\n";
        output += "Stock Available at: " + allowStock + "\n";
        output += "Vendor: " + vendor + "\n";
        output += "Vendor Code: " + vendorCode + "\n";
        output += "Cost: " + fmt.format(cost) + "\n";
        output += "Skill Level: " + skillLevel + "\n";
        
        
        return output;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getAllowStock() {
        return allowStock;
    }

    public void setAllowStock(String allowStock) {
        this.allowStock = allowStock;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    
}
