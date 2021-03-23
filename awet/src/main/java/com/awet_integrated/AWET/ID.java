package com.awet_integrated.AWET;

import javax.persistence.*;

@Entity
@Table(name = "id_table")
public class ID {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number_id")
    private int id;
    @Column(name = "tagname")
    private String tagName;
    @Column(name = "attiributename")
    private String attiributeName;
    @Column(name = "user_key")
    private String keyOfValue;
    @Column(name = "user_value")
    private String value;
    @Column(name = "how_identification")
    private String how;
    @Column(name = "test_case_number")
    private int test_case_number;
    @Column(name = "xpath")
    private String xpathOfElementForSendingValueBeforeClick;
    @Column(name = "beforeClickType")
    private String beforeClickType;
    @Column(name = "infobeforeClickType")
    private String infoBeforeClickType;
    @Column(name = "application_name")
    private String applicationName;
    @Column(name = "java_file_name")
    private String javaFileName;

    public ID() {

    }

    public ID(String tagName, String keyOfValue, String lastName, String how, int test_case_number, String attiributeName, String xpathOfElementForSendingValueBeforeClick, String beforeClickType, String infoBeforeClickType, String javaFileName, String applicationName) {
        this.tagName = tagName;
        this.keyOfValue = keyOfValue;
        this.value = lastName;
        this.how = how;
        this.test_case_number = test_case_number;
        this.attiributeName = attiributeName;
        this.xpathOfElementForSendingValueBeforeClick = xpathOfElementForSendingValueBeforeClick;
        this.beforeClickType = beforeClickType;
        this.infoBeforeClickType = infoBeforeClickType;
        this.javaFileName = javaFileName;
        this.applicationName = applicationName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKeyOfValue(String key) {
        this.keyOfValue = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyOfValue() {
        return keyOfValue;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String idNameToSend) {
        this.tagName = idNameToSend;
    }

    @Override
    public String toString() {
        return "Test [id=" + tagName + "key" + keyOfValue + ", value=" + value + "]";
    }

    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }

    public int getTest_case_number() {
        return test_case_number;
    }

    public void setTest_case_number(int test_case_number) {
        this.test_case_number = test_case_number;
    }

    public String getAttiributeName() {
        return attiributeName;
    }

    public void setAttiributeName(String attiributeName) {
        this.attiributeName = attiributeName;
    }

    public String getXpathOfElementForSendingValueBeforeClick() {
        return xpathOfElementForSendingValueBeforeClick;
    }

    public void setXpathOfElementForSendingValueBeforeClick(String xpathOfElementForSendingValueBeforeClick) {
        this.xpathOfElementForSendingValueBeforeClick = xpathOfElementForSendingValueBeforeClick;
    }

    public String getBeforeClickType() {
        return beforeClickType;
    }

    public void setBeforeClickType(String beforeClickType) {
        this.beforeClickType = beforeClickType;
    }

    public String getInfoBeforeClickType() {
        return infoBeforeClickType;
    }

    public void setInfoBeforeClickType(String infoBeforeClickType) {
        this.infoBeforeClickType = infoBeforeClickType;
    }

    public String getJavaFileName() {
        return javaFileName;
    }

    public void setJavaFileName(String javaFileName) {
        this.javaFileName = javaFileName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}