/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brittany
 */
public class Order {

    private String ordNumber;
    private String ordDT;
    private String ordCustomerNumber;
    private String ordCustomerName;
    private String ordCustomerAddr1;
    private String ordCustomerPickupOrDeliv;
    private String ordCustomerPhone;
    private String ordStatus;
    private String ordDeliveryDT;
    private String ordUpdateDT;
    private String ordUpdateBy;
    private String ordCreateDT;
    private String ordCreatedBy;
    private int ordSeq;

    public Order() {
        ordNumber = "N/A";
        ordDT = "N/A";
        ordCustomerNumber = "N/A";
        ordCustomerName = "N/A";
        ordCustomerAddr1 = "N/A";
        ordCustomerPickupOrDeliv = "N/A";
        ordCustomerPhone = "N/A";
        ordStatus = "N/A";
        ordDeliveryDT = "N/A";
        ordUpdateDT = "N/A";
        ordUpdateBy = "N/A";
        ordCreateDT = "N/A";
        ordCreatedBy = "N/A";
        ordSeq = 0;
    }

    public Order(String ordNumber, String ordDT, String ordCustomerNumber, String ordCustomerName, String ordCustomerAddr1, String ordCustomerPickupOrDeliv, String ordCustomerPhone, String ordStatus, String ordDeliveryDT, String ordUpdateDT, String ordUpdateBy, String ordCreateDT, String ordCreatedBy, int ordSeq) {
        this.ordNumber = ordNumber;
        this.ordDT = ordDT;
        this.ordCustomerNumber = ordCustomerNumber;
        this.ordCustomerName = ordCustomerName;
        this.ordCustomerAddr1 = ordCustomerAddr1;
        this.ordCustomerPickupOrDeliv = ordCustomerPickupOrDeliv;
        this.ordCustomerPhone = ordCustomerPhone;
        this.ordStatus = ordStatus;
        this.ordDeliveryDT = ordDeliveryDT;
        this.ordUpdateDT = ordUpdateDT;
        this.ordUpdateBy = ordUpdateBy;
        this.ordCreateDT = ordCreateDT;
        this.ordCreatedBy = ordCreatedBy;
        this.ordSeq = ordSeq;
    }

    public String getOrdNumber() {
        return ordNumber;
    }

    public void setOrdNumber(String ordNumber) {
        this.ordNumber = ordNumber;
    }

    public String getOrdDT() {
        return ordDT;
    }

    public void setOrdDT(String ordDT) {
        this.ordDT = ordDT;
    }

    public String getOrdCustomerNumber() {
        return ordCustomerNumber;
    }

    public void setOrdCustomerNumber(String ordCustomerNumber) {
        this.ordCustomerNumber = ordCustomerNumber;
    }

    public String getOrdCustomerName() {
        return ordCustomerName;
    }

    public void setOrdCustomerName(String ordCustomerName) {
        this.ordCustomerName = ordCustomerName;
    }

    public String getOrdCustomerAddr1() {
        return ordCustomerAddr1;
    }

    public void setOrdCustomerAddr1(String ordCustomerAddr1) {
        this.ordCustomerAddr1 = ordCustomerAddr1;
    }

    public String getOrdCustomerPickupOrDeliv() {
        return ordCustomerPickupOrDeliv;
    }

    public void setOrdCustomerPickupOrDeliv(String ordCustomerPickupOrDeliv) {
        this.ordCustomerPickupOrDeliv = ordCustomerPickupOrDeliv;
    }

    public String getOrdCustomerPhone() {
        return ordCustomerPhone;
    }

    public void setOrdCustomerPhone(String ordCustomerPhone) {
        this.ordCustomerPhone = ordCustomerPhone;
    }

    public String getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus;
    }

    public String getOrdDeliveryDT() {
        return ordDeliveryDT;
    }

    public void setOrdDeliveryDT(String ordDeliveryDT) {
        this.ordDeliveryDT = ordDeliveryDT;
    }

    public String getOrdUpdateDT() {
        return ordUpdateDT;
    }

    public void setOrdUpdateDT(String ordUpdateDT) {
        this.ordUpdateDT = ordUpdateDT;
    }

    public String getOrdUpdateBy() {
        return ordUpdateBy;
    }

    public void setOrdUpdateBy(String ordUpdateBy) {
        this.ordUpdateBy = ordUpdateBy;
    }

    public String getOrdCreateDT() {
        return ordCreateDT;
    }

    public void setOrdCreateDT(String ordCreateDT) {
        this.ordCreateDT = ordCreateDT;
    }

    public String getOrdCreatedBy() {
        return ordCreatedBy;
    }

    public void setOrdCreatedBy(String ordCreatedBy) {
        this.ordCreatedBy = ordCreatedBy;
    }

    public int getOrdSeq() {
        return ordSeq;
    }

    public void setOrdSeq(int ordSeq) {
        this.ordSeq = ordSeq;
    }
    

}
