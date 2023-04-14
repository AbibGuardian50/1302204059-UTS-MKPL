/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsmkpl;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Coding
 */
public class Family extends Employee {
    public List<String> childNames;
    public List<String> childIdNumbers;
    private String spouseName;
    private String spouseIdNumber;
    
    public family () {
        childNames = new LinkedList<String>();
        childIdNumbers = new LinkedList<String>();
    }
    
    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
    }
    
    public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
    }
}
