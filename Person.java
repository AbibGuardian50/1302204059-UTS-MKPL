package com.mycompany.utsmkpl;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Person {
    public String idNumber;
    public String firstName;
    public String lastName;
    public String address;
    	public boolean isForeigner;
    
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
                
}
}


