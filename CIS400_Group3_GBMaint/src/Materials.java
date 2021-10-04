/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brittany
 */
public class Materials {

    private String matWarehouseLocation;
    private String matItemNumber;
    private String matItemName;
    private String matDescription;
    private String matSearchableWords;
    private String matCategory;
    private double matPurchaseCost;
    private double matQtyOnHand;
    private String matStatus;
    private String matUpdateDT;
    private String matUpdateBy;
    private String matCreateDT;
    private String matCreatedBy;
    private int matSeq;

    public Materials() {
    matWarehouseLocation = "na";
    matItemNumber = "na";
    matItemName = "na";
    matDescription = "na";
    matSearchableWords = "na";
    matCategory = "na";
    matPurchaseCost = 0.0;
    matQtyOnHand = 0.0;
    matStatus = "na";
    matUpdateDT = "na";
    matUpdateBy = "na";
    matCreateDT = "na";
    matCreatedBy = "na";
    matSeq = 0;
}

    public Materials(String matWarehouseLocation, String matItemNumber, String matItemName, String matDescription, String matSearchableWords, String matCategory, double matPurchaseCost, double matQtyOnHand, String matStatus, String matUpdateDT, String matUpdateBy, String matCreateDT, String matCreatedBy, int matSeq) {
        this.matWarehouseLocation = matWarehouseLocation;
        this.matItemNumber = matItemNumber;
        this.matItemName = matItemName;
        this.matDescription = matDescription;
        this.matSearchableWords = matSearchableWords;
        this.matCategory = matCategory;
        this.matPurchaseCost = matPurchaseCost;
        this.matQtyOnHand = matQtyOnHand;
        this.matStatus = matStatus;
        this.matUpdateDT = matUpdateDT;
        this.matUpdateBy = matUpdateBy;
        this.matCreateDT = matCreateDT;
        this.matCreatedBy = matCreatedBy;
        this.matSeq = matSeq;
    }

    public String getMatWarehouseLocation() {
        return matWarehouseLocation;
    }

    public void setMatWarehouseLocation(String matWarehouseLocation) {
        this.matWarehouseLocation = matWarehouseLocation;
    }

    public String getMatItemNumber() {
        return matItemNumber;
    }

    public void setMatItemNumber(String matItemNumber) {
        this.matItemNumber = matItemNumber;
    }

    public String getMatItemName() {
        return matItemName;
    }

    public void setMatItemName(String matItemName) {
        this.matItemName = matItemName;
    }

    public String getMatDescription() {
        return matDescription;
    }

    public void setMatDescription(String matDescription) {
        this.matDescription = matDescription;
    }

    public String getMatSearchableWords() {
        return matSearchableWords;
    }

    public void setMatSearchableWords(String matSearchableWords) {
        this.matSearchableWords = matSearchableWords;
    }

    public String getMatCategory() {
        return matCategory;
    }

    public void setMatCategory(String matCategory) {
        this.matCategory = matCategory;
    }

    public double getMatPurchaseCost() {
        return matPurchaseCost;
    }

    public void setMatPurchaseCost(double matPurchaseCost) {
        this.matPurchaseCost = matPurchaseCost;
    }

    public double getMatQtyOnHand() {
        return matQtyOnHand;
    }

    public void setMatQtyOnHand(double matQtyOnHand) {
        this.matQtyOnHand = matQtyOnHand;
    }

    public String getMatStatus() {
        return matStatus;
    }

    public void setMatStatus(String matStatus) {
        this.matStatus = matStatus;
    }

    public String getMatUpdateDT() {
        return matUpdateDT;
    }

    public void setMatUpdateDT(String matUpdateDT) {
        this.matUpdateDT = matUpdateDT;
    }

    public String getMatUpdateBy() {
        return matUpdateBy;
    }

    public void setMatUpdateBy(String matUpdateBy) {
        this.matUpdateBy = matUpdateBy;
    }

    public String getMatCreateDT() {
        return matCreateDT;
    }

    public void setMatCreateDT(String matCreateDT) {
        this.matCreateDT = matCreateDT;
    }

    public String getMatCreatedBy() {
        return matCreatedBy;
    }

    public void setMatCreatedBy(String matCreatedBy) {
        this.matCreatedBy = matCreatedBy;
    }

    public int getMatSeq() {
        return matSeq;
    }

    public void setMatSeq(int matSeq) {
        this.matSeq = matSeq;
    }
    
}
