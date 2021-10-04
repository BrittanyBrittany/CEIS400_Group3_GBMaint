/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brittany
 */
public class OrderMaterial {

    private String ordMatOrderNumber;
    private String ordMatWarehouseLocation;
    private String ordMatItemNumber;
    private String ordMatItemName;
    private double ordMatQtyTotal;
    private double ordMatQtyLine;
    private String ordMatUpdateDT;
    private String ordMatUpdateBy;
    private String ordMatCreateDT;
    private String ordMatCreatedBy;
    private int ordMatSeq;

    public OrderMaterial() {
        ordMatOrderNumber = "N/A";
        ordMatWarehouseLocation = "N/A";
        ordMatItemNumber = "N/A";
        ordMatItemName = "N/A";
        ordMatQtyTotal = 0.0;
        ordMatQtyLine = 0.0;
        ordMatUpdateDT = "N/A";
        ordMatUpdateBy = "N/A";
        ordMatCreateDT = "N/A";
        ordMatCreatedBy = "N/A";
        ordMatSeq = 0;
    }

    public OrderMaterial(String ordMatOrderNumber, String ordMatWarehouseLocation, String ordMatItemNumber, String ordMatItemName, double ordMatQtyTotal, double ordMatQtyLine, String ordMatUpdateDT, String ordMatUpdateBy, String ordMatCreateDT, String ordMatCreatedBy, int ordMatSeq) {
        this.ordMatOrderNumber = ordMatOrderNumber;
        this.ordMatWarehouseLocation = ordMatWarehouseLocation;
        this.ordMatItemNumber = ordMatItemNumber;
        this.ordMatItemName = ordMatItemName;
        this.ordMatQtyTotal = ordMatQtyTotal;
        this.ordMatQtyLine = ordMatQtyLine;
        this.ordMatUpdateDT = ordMatUpdateDT;
        this.ordMatUpdateBy = ordMatUpdateBy;
        this.ordMatCreateDT = ordMatCreateDT;
        this.ordMatCreatedBy = ordMatCreatedBy;
        this.ordMatSeq = ordMatSeq;
    }

    public String getOrdMatOrderNumber() {
        return ordMatOrderNumber;
    }

    public void setOrdMatOrderNumber(String ordMatOrderNumber) {
        this.ordMatOrderNumber = ordMatOrderNumber;
    }

    public String getOrdMatWarehouseLocation() {
        return ordMatWarehouseLocation;
    }

    public void setOrdMatWarehouseLocation(String ordMatWarehouseLocation) {
        this.ordMatWarehouseLocation = ordMatWarehouseLocation;
    }

    public String getOrdMatItemNumber() {
        return ordMatItemNumber;
    }

    public void setOrdMatItemNumber(String ordMatItemNumber) {
        this.ordMatItemNumber = ordMatItemNumber;
    }

    public String getOrdMatItemName() {
        return ordMatItemName;
    }

    public void setOrdMatItemName(String ordMatItemName) {
        this.ordMatItemName = ordMatItemName;
    }

    public double getOrdMatQtyTotal() {
        return ordMatQtyTotal;
    }

    public void setOrdMatQtyTotal(double ordMatQtyTotal) {
        this.ordMatQtyTotal = ordMatQtyTotal;
    }

    public double getOrdMatQtyLine() {
        return ordMatQtyLine;
    }

    public void setOrdMatQtyLine(double ordMatQtyLine) {
        this.ordMatQtyLine = ordMatQtyLine;
    }

    public String getOrdMatUpdateDT() {
        return ordMatUpdateDT;
    }

    public void setOrdMatUpdateDT(String ordMatUpdateDT) {
        this.ordMatUpdateDT = ordMatUpdateDT;
    }

    public String getOrdMatUpdateBy() {
        return ordMatUpdateBy;
    }

    public void setOrdMatUpdateBy(String ordMatUpdateBy) {
        this.ordMatUpdateBy = ordMatUpdateBy;
    }

    public String getOrdMatCreateDT() {
        return ordMatCreateDT;
    }

    public void setOrdMatCreateDT(String ordMatCreateDT) {
        this.ordMatCreateDT = ordMatCreateDT;
    }

    public String getOrdMatCreatedBy() {
        return ordMatCreatedBy;
    }

    public void setOrdMatCreatedBy(String ordMatCreatedBy) {
        this.ordMatCreatedBy = ordMatCreatedBy;
    }

    public int getOrdMatSeq() {
        return ordMatSeq;
    }

    public void setOrdMatSeq(int ordMatSeq) {
        this.ordMatSeq = ordMatSeq;
    }
    
    

}
