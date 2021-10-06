/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brittany
 */
public class OrderEquipment {

    private String ordEqmtOrderNumber;
    private String ordEqmtToolNumber;
    private String ordEqmtToolName;
    private String ordEqmtUpdateDT;
    private String ordEqmtUpdateBy;
    private String ordEqmtCreateDT;
    private String ordEqmtCreatedBy;
    private int ordEqmtSeq;

    public OrderEquipment() {
        ordEqmtOrderNumber = "N/A";
        ordEqmtToolNumber = "N/A";
        ordEqmtToolName = "N/A";
        ordEqmtUpdateDT = "N/A";
        ordEqmtUpdateBy = "N/A";
        ordEqmtCreateDT = "N/A";
        ordEqmtCreatedBy = "N/A";
        ordEqmtSeq = 0;
    }

    public OrderEquipment(String ordEqmtOrderNumber, String ordEqmtToolNumber, String ordEqmtToolName, String ordEqmtUpdateDT, String ordEqmtUpdateBy, String ordEqmtCreateDT, String ordEqmtCreatedBy, int ordEqmtSeq) {
        this.ordEqmtOrderNumber = ordEqmtOrderNumber;
        this.ordEqmtToolNumber = ordEqmtToolNumber;
        this.ordEqmtToolName = ordEqmtToolName;
        this.ordEqmtUpdateDT = ordEqmtUpdateDT;
        this.ordEqmtUpdateBy = ordEqmtUpdateBy;
        this.ordEqmtCreateDT = ordEqmtCreateDT;
        this.ordEqmtCreatedBy = ordEqmtCreatedBy;
        this.ordEqmtSeq = ordEqmtSeq;
    }

    public String getOrdEqmtOrderNumber() {
        return ordEqmtOrderNumber;
    }

    public void setOrdEqmtOrderNumber(String ordEqmtOrderNumber) {
        this.ordEqmtOrderNumber = ordEqmtOrderNumber;
    }

    public String getOrdEqmtToolNumber() {
        return ordEqmtToolNumber;
    }

    public void setOrdEqmtToolNumber(String ordEqmtToolNumber) {
        this.ordEqmtToolNumber = ordEqmtToolNumber;
    }

    public String getOrdEqmtToolName() {
        return ordEqmtToolName;
    }

    public void setOrdEqmtToolName(String ordEqmtToolName) {
        this.ordEqmtToolName = ordEqmtToolName;
    }

    public String getOrdEqmtUpdateDT() {
        return ordEqmtUpdateDT;
    }

    public void setOrdEqmtUpdateDT(String ordEqmtUpdateDT) {
        this.ordEqmtUpdateDT = ordEqmtUpdateDT;
    }

    public String getOrdEqmtUpdateBy() {
        return ordEqmtUpdateBy;
    }

    public void setOrdEqmtUpdateBy(String ordEqmtUpdateBy) {
        this.ordEqmtUpdateBy = ordEqmtUpdateBy;
    }

    public String getOrdEqmtCreateDT() {
        return ordEqmtCreateDT;
    }

    public void setOrdEqmtCreateDT(String ordEqmtCreateDT) {
        this.ordEqmtCreateDT = ordEqmtCreateDT;
    }

    public String getOrdEqmtCreatedBy() {
        return ordEqmtCreatedBy;
    }

    public void setOrdEqmtCreatedBy(String ordEqmtCreatedBy) {
        this.ordEqmtCreatedBy = ordEqmtCreatedBy;
    }

    public int getOrdEqmtSeq() {
        return ordEqmtSeq;
    }

    public void setOrdEqmtSeq(int ordEqmtSeq) {
        this.ordEqmtSeq = ordEqmtSeq;
    }
    

}
