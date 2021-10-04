/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brittany
 */
public class Equipment {

    private String eqmtToolNumber;
    private String eqmtToolName;
    private String eqmtDescription;
    private String eqmtSearchableWords;
    private String eqmtCategory;
    private String eqmtSkillLevel;
    private double eqmtPurchasCost;
    private String eqmtStatus;
    private String eqmtAvailable;
    private String eqmtCheckedOutDT;
    private String eqmtCheckedOutBy;
    private String eqmtExpectedReturnDT;
    private String eqmtActualReturnDT;
    private String eqmtUpdateDT;
    private String eqmtUpdateBy;
    private String eqmtCreateDT;
    private String eqmtCreatedBy;
    private int eqmtSeq;

    public Equipment() {
        eqmtToolNumber = "N/A";
        eqmtToolName = "N/A";
        eqmtDescription = "N/A";
        eqmtSearchableWords = "N/A";
        eqmtCategory = "N/A";
        eqmtSkillLevel = "N/A";
        eqmtPurchasCost = 0.0;
        eqmtStatus = "N/A";
        eqmtAvailable = "N/A";
        eqmtCheckedOutDT = "N/A";
        eqmtCheckedOutBy = "N/A";
        eqmtExpectedReturnDT = "N/A";
        eqmtActualReturnDT = "N/A";
        eqmtUpdateDT = "N/A";
        eqmtUpdateBy = "N/A";
        eqmtCreateDT = "N/A";
        eqmtCreatedBy = "N/A";
        eqmtSeq = 0;
    }

    public Equipment(String eqmtToolNumber, String eqmtToolName, String eqmtDescription, String eqmtSearchableWords, String eqmtCategory, String eqmtSkillLevel, double eqmtPurchasCost, String eqmtStatus, String eqmtAvailable, String eqmtCheckedOutDT, String eqmtCheckedOutBy, String eqmtExpectedReturnDT, String eqmtActualReturnDT, String eqmtUpdateDT, String eqmtUpdateBy, String eqmtCreateDT, String eqmtCreatedBy, int eqmtSeq) {
        this.eqmtToolNumber = eqmtToolNumber;
        this.eqmtToolName = eqmtToolName;
        this.eqmtDescription = eqmtDescription;
        this.eqmtSearchableWords = eqmtSearchableWords;
        this.eqmtCategory = eqmtCategory;
        this.eqmtSkillLevel = eqmtSkillLevel;
        this.eqmtPurchasCost = eqmtPurchasCost;
        this.eqmtStatus = eqmtStatus;
        this.eqmtAvailable = eqmtAvailable;
        this.eqmtCheckedOutDT = eqmtCheckedOutDT;
        this.eqmtCheckedOutBy = eqmtCheckedOutBy;
        this.eqmtExpectedReturnDT = eqmtExpectedReturnDT;
        this.eqmtActualReturnDT = eqmtActualReturnDT;
        this.eqmtUpdateDT = eqmtUpdateDT;
        this.eqmtUpdateBy = eqmtUpdateBy;
        this.eqmtCreateDT = eqmtCreateDT;
        this.eqmtCreatedBy = eqmtCreatedBy;
        this.eqmtSeq = eqmtSeq;
    }

    public String getEqmtToolNumber() {
        return eqmtToolNumber;
    }

    public void setEqmtToolNumber(String eqmtToolNumber) {
        this.eqmtToolNumber = eqmtToolNumber;
    }

    public String getEqmtToolName() {
        return eqmtToolName;
    }

    public void setEqmtToolName(String eqmtToolName) {
        this.eqmtToolName = eqmtToolName;
    }

    public String getEqmtDescription() {
        return eqmtDescription;
    }

    public void setEqmtDescription(String eqmtDescription) {
        this.eqmtDescription = eqmtDescription;
    }

    public String getEqmtSearchableWords() {
        return eqmtSearchableWords;
    }

    public void setEqmtSearchableWords(String eqmtSearchableWords) {
        this.eqmtSearchableWords = eqmtSearchableWords;
    }

    public String getEqmtCategory() {
        return eqmtCategory;
    }

    public void setEqmtCategory(String eqmtCategory) {
        this.eqmtCategory = eqmtCategory;
    }

    public String getEqmtSkillLevel() {
        return eqmtSkillLevel;
    }

    public void setEqmtSkillLevel(String eqmtSkillLevel) {
        this.eqmtSkillLevel = eqmtSkillLevel;
    }

    public double getEqmtPurchasCost() {
        return eqmtPurchasCost;
    }

    public void setEqmtPurchasCost(double eqmtPurchasCost) {
        this.eqmtPurchasCost = eqmtPurchasCost;
    }

    public String getEqmtStatus() {
        return eqmtStatus;
    }

    public void setEqmtStatus(String eqmtStatus) {
        this.eqmtStatus = eqmtStatus;
    }

    public String getEqmtAvailable() {
        return eqmtAvailable;
    }

    public void setEqmtAvailable(String eqmtAvailable) {
        this.eqmtAvailable = eqmtAvailable;
    }

    public String getEqmtCheckedOutDT() {
        return eqmtCheckedOutDT;
    }

    public void setEqmtCheckedOutDT(String eqmtCheckedOutDT) {
        this.eqmtCheckedOutDT = eqmtCheckedOutDT;
    }

    public String getEqmtCheckedOutBy() {
        return eqmtCheckedOutBy;
    }

    public void setEqmtCheckedOutBy(String eqmtCheckedOutBy) {
        this.eqmtCheckedOutBy = eqmtCheckedOutBy;
    }

    public String getEqmtExpectedReturnDT() {
        return eqmtExpectedReturnDT;
    }

    public void setEqmtExpectedReturnDT(String eqmtExpectedReturnDT) {
        this.eqmtExpectedReturnDT = eqmtExpectedReturnDT;
    }

    public String getEqmtActualReturnDT() {
        return eqmtActualReturnDT;
    }

    public void setEqmtActualReturnDT(String eqmtActualReturnDT) {
        this.eqmtActualReturnDT = eqmtActualReturnDT;
    }

    public String getEqmtUpdateDT() {
        return eqmtUpdateDT;
    }

    public void setEqmtUpdateDT(String eqmtUpdateDT) {
        this.eqmtUpdateDT = eqmtUpdateDT;
    }

    public String getEqmtUpdateBy() {
        return eqmtUpdateBy;
    }

    public void setEqmtUpdateBy(String eqmtUpdateBy) {
        this.eqmtUpdateBy = eqmtUpdateBy;
    }

    public String getEqmtCreateDT() {
        return eqmtCreateDT;
    }

    public void setEqmtCreateDT(String eqmtCreateDT) {
        this.eqmtCreateDT = eqmtCreateDT;
    }

    public String getEqmtCreatedBy() {
        return eqmtCreatedBy;
    }

    public void setEqmtCreatedBy(String eqmtCreatedBy) {
        this.eqmtCreatedBy = eqmtCreatedBy;
    }

    public int getEqmtSeq() {
        return eqmtSeq;
    }

    public void setEqmtSeq(int eqmtSeq) {
        this.eqmtSeq = eqmtSeq;
    }
    

}
