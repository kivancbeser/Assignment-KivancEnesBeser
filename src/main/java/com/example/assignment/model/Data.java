package com.example.assignment.model;

import javax.persistence.*;

@Entity
@Table(name = "data")
public class Data {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "source")
    private String source;

    @Column(name = "codeListCode")
    private String codeListCode;

    //I add unique true becase written in document. When you try second time upload, you get failed this check already in the database
    @Column(unique = true, name = "code")
    private String code;

    @Column(name = "displayValue")
    private String displayValue;

    @Column(name = "longDescription")
    private String longDescription;

    @Column(name = "fromDate")
    private String fromDate;

    @Column(name = "toDate")
    private String toDate;

    //This may be Integer but I prefer String.
    //If we set Integer, we have to change save method in service.
    @Column(name = "sortingPriority")
    private String sortingPriority;

    public Data(String source, String codeListCode, String code, String displayValue, String longDescription, String fromDate, String toDate, String sortingPriority) {
        this.source = source;
        this.codeListCode = codeListCode;
        this.code = code;
        this.displayValue = displayValue;
        this.longDescription = longDescription;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.sortingPriority = sortingPriority;
    }

    public Data() {

    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCodeListCode() {
        return codeListCode;
    }

    public void setCodeListCode(String codeListCode) {
        this.codeListCode = codeListCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getSortingPriority() {
        return sortingPriority;
    }

    public void setSortingPriority(String sortingPriority) {
        this.sortingPriority = sortingPriority;
    }

    @Override
    public String toString() {
        return "Data{" +
                "source='" + source + '\'' +
                ", codeListCode='" + codeListCode + '\'' +
                ", code='" + code + '\'' +
                ", displayValue='" + displayValue + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", sortingPriority='" + sortingPriority + '\'' +
                '}';
    }
}
