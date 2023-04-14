package com.mycompany.utsmkpl;

import com.mycompany.utsmkpl.TaxFunction;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Coding
 */
public class Employee extends Person  {

	private String employeeId;
        
        private Date dateJoined;
        private Date monthWorkingInYear;
 
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    public Employee(String employeeId, String idNumber, Date dateJoined , person isForeigner, person Person) {
		this.employeeId = employeeId;
		this.firstName = Person;
		this.lastName = Person;
		this.idNumber = idNumber;
		this.address = Person;
		this.dateJoined = dateJoined;
		this.isForeigner = Person;
		this.gender = Person;
	}
	private static  int SalaryGrade1 = 3000000;
        private static  int SalaryGrade2 = 5000000;
        private static  int SalaryGrade3 = 7000000;
	public void setMonthlySalary(int grade) {
            
		if (grade == 1) {
			monthlySalary = SalaryGrade1;
			if (isForeigner) {
				SalaryGrade1 =  (int) (SalaryGrade1 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = SalaryGrade2;
			if (isForeigner) {
				SalaryGrade2 = (int) (SalaryGrade2 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = SalaryGrade3;
			if (isForeigner) {
				SalaryGrade3 = (int) (SalaryGrade3 * 1.5);
			}
		}
	}
        
        
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}

	
	
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == yearJoined) {
			monthWorkingInYear = date.getMonthValue() - monthJoined;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
