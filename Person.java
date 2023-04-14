package com.mycompany.utsmkpl;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Person {
    public String idNumber;
    private String firstName;
    private String lastName;
    public String address;
    public List<String> childNames;
    public List<String> childIdNumbers;
    private String spouseName;
    private String spouseIdNumber;
        
    
    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
    }
    
    public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
    }
    public enum JenisGender {
            Laki_laki,
            Perempuan
    }
    public JenisGender gender;
    
    public Person (String firstName,String lastName,String address, JenisGender gender) {
                this.firstName = firstName;
		this.lastName = lastName;
                this.address = address;
                this.gender = gender;
                childNames = new LinkedList<String>();
                childIdNumbers = new LinkedList<String>();
}
}


