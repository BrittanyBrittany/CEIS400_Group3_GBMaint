

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brittany
 */
public class Employee {
    // attributes

    private int employeeID;
    private String empName;
    private String empLastName;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String postalCode;
    private String email;
    private int areaCode;
    private int phoneNum3;
    private int phoneNum4;
    private String empNotes;
    private String empdeptType;
    private String empRole;
    private String empSupervisor;
    private int skillLvl;
    private String empStatus;
    private String empUpdateDT;
    private String empUpdateBy;
    private String empCreateDT;
    private String empCreatedBy;
    private int empSeq;

    public Employee() {
        employeeID = 0;
        empName = "N/A";
        empLastName = "N/A";
        address = "N/A";
        address2 = "N/A";
        city = "N/A";
        state = "N/A";
        postalCode = "N/A";
        email = "N/A";
        areaCode = 0;
        phoneNum3 = 0;
        phoneNum4 = 0;
        empNotes = "N/A";
        empdeptType = "N/A";
        empRole = "N/A";
        empSupervisor = "N/A";
        skillLvl = 0;
        empStatus = "N/A";
        empUpdateDT = "N/A";
        empUpdateBy = "N/A";
        empCreateDT = "N/A";
        empCreatedBy = "N/A";
        empSeq = 0;

    }

    public Employee(int employeeID, String empName, String empLastName, String address, String address2, String city, String state, String postalCode, String email, int areaCode, int phoneNum3, int phoneNum4, String empNotes, String empdeptType, String empRole, String empSupervisor, int skillLvl, String empStatus, String empUpdateDT, String empUpdateBy, String empCreateDT, String empCreatedBy, int empSeq) {
        this.employeeID = employeeID;
        this.empName = empName;
        this.empLastName = empLastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.email = email;
        this.areaCode = areaCode;
        this.phoneNum3 = phoneNum3;
        this.phoneNum4 = phoneNum4;
        this.empNotes = empNotes;
        this.empdeptType = empdeptType;
        this.empRole = empRole;
        this.empSupervisor = empSupervisor;
        this.skillLvl = skillLvl;
        this.empStatus = empStatus;
        this.empUpdateDT = empUpdateDT;
        this.empUpdateBy = empUpdateBy;
        this.empCreateDT = empCreateDT;
        this.empCreatedBy = empCreatedBy;
        this.empSeq = empSeq;
    }
    
        //behaviors
    @Override
    public String toString( )
    {
     return empName;      // only show the Customer’s name
    }
    
    public String getDetails( )
    {
        String output = empName + " " + empLastName + "\n";
        output += address;
        if(!address2.isEmpty()){
        output += "\n " + address2;}        
        output += "\n" +  city   + ", "  +  state + " "  + postalCode + "\n";
        output += "Email: " + email + "\n";
        output += "Phone: (" + areaCode + ")" + phoneNum3 + "-" + phoneNum4 + "\n";
        output += "Assigned Area: " + empdeptType + " as " + empRole 
                + ",skill level " + skillLvl + "\n";
        output += "Assigned to Supervisor: " + empSupervisor + "\n";
        output += "Employee Notes: " + empNotes + "\n";
        output += "Record Entered By: " + empCreatedBy + "\n";
        
        return output;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPhoneNum3() {
        return phoneNum3;
    }

    public void setPhoneNum3(int phoneNum3) {
        this.phoneNum3 = phoneNum3;
    }

    public int getPhoneNum4() {
        return phoneNum4;
    }

    public void setPhoneNum4(int phoneNum4) {
        this.phoneNum4 = phoneNum4;
    }

    public String getEmpNotes() {
        return empNotes;
    }

    public void setEmpNotes(String empNotes) {
        this.empNotes = empNotes;
    }

    public String getEmpdeptType() {
        return empdeptType;
    }

    public void setEmpdeptType(String empdeptType) {
        this.empdeptType = empdeptType;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getEmpSupervisor() {
        return empSupervisor;
    }

    public void setEmpSupervisor(String empSupervisor) {
        this.empSupervisor = empSupervisor;
    }

    public int getSkillLvl() {
        return skillLvl;
    }

    public void setSkillLvl(int skillLvl) {
        this.skillLvl = skillLvl;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getEmpUpdateDT() {
        return empUpdateDT;
    }

    public void setEmpUpdateDT(String empUpdateDT) {
        this.empUpdateDT = empUpdateDT;
    }

    public String getEmpUpdateBy() {
        return empUpdateBy;
    }

    public void setEmpUpdateBy(String empUpdateBy) {
        this.empUpdateBy = empUpdateBy;
    }

    public String getEmpCreateDT() {
        return empCreateDT;
    }

    public void setEmpCreateDT(String empCreateDT) {
        this.empCreateDT = empCreateDT;
    }

    public String getEmpCreatedBy() {
        return empCreatedBy;
    }

    public void setEmpCreatedBy(String empCreatedBy) {
        this.empCreatedBy = empCreatedBy;
    }

    public int getEmpSeq() {
        return empSeq;
    }

    public void setEmpSeq(int empSeq) {
        this.empSeq = empSeq;
    }

}
