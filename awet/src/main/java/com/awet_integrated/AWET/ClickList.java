package com.awet_integrated.AWET;

import javax.persistence.*;

@Entity
@Table(name = "click_table")
public class ClickList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number_id")
    private int id;
    @Column(name = "clickxpath")
    private String clickxpath;

    @Column(name = "tagname")
    private String tagname;
    @Column(name = "how_identification")
    private String how;
    @Column(name = "test_case_number")
    private int test_case_number;
    @Column(name = "how_xpath_byid")
    private String how_xpath_id;
    @Column(name = "java_file_name")
    private String javaFileName;
    @Column(name = "application_name")
    private String applicationName;
    @Column(name = "infoBeforeClickType")
    private String infoBeforeClickType;


    public ClickList() {

    }

    public ClickList(String clickxpath, String tagname, String how, int test_case_number, String how_xpath_id, String javaFileName, String applicationName, String infoBeforeClickType) {
        this.clickxpath = clickxpath;
        this.tagname = tagname;
        this.how = how;
        this.test_case_number = test_case_number;
        this.how_xpath_id = how_xpath_id;
        this.javaFileName = javaFileName;
        this.applicationName = applicationName;
        this.infoBeforeClickType= infoBeforeClickType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClickxpath() {
        return clickxpath;
    }

    public void setClickxpath(String clickxpath) {
        this.clickxpath = clickxpath;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    @Override
    public String toString() {
        return "Test [id=" + clickxpath;
    }

    public int getTest_case_number() {
        return test_case_number;
    }

    public void setTest_case_number(int test_case_number) {
        this.test_case_number = test_case_number;
    }

    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }

    public String getHow_xpath_id() {
        return how_xpath_id;
    }

    public void setHow_xpath_id(String how_xpath_id) {
        this.how_xpath_id = how_xpath_id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    public String getInfoBeforeClickType() {
        return infoBeforeClickType;
    }

    public void setInfoBeforeClickType(String infoBeforeClickType) {
        this.infoBeforeClickType = infoBeforeClickType;
    }

}