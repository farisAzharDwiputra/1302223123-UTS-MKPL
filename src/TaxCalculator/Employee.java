/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxCalculator;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Employee {
    private String employeeId;
    private PersonalInfo personalInfo;
    private SalaryInfo salaryInfo;
    private FamilyInfo familyInfo;

    public Employee(String employeeId, PersonalInfo personalInfo, SalaryInfo salaryInfo) {
        this.employeeId = employeeId;
        this.personalInfo = personalInfo;
        this.salaryInfo = salaryInfo;
        this.familyInfo = new FamilyInfo();
    }

    public void setSpouse(String name, String idNumber) {
        familyInfo.setSpouse(name, idNumber);
    }

    public void addChild(String name, String idNumber) {
        familyInfo.addChild(name, idNumber);
    }

    public void setMonthlySalary(int grade) {
        salaryInfo.setMonthlySalaryByGrade(grade, personalInfo.isForeigner());
    }

    public void setAdditionalIncome(int income) {
        salaryInfo.setOtherMonthlyIncome(income);
    }

    public void setAnnualDeductible(int deductible) {
        salaryInfo.setAnnualDeductible(deductible);
    }

    public int getAnnualIncomeTax() {
        int monthsWorked = salaryInfo.calculateMonthsWorked();
        EmployeeTaxInfo info = new EmployeeTaxInfo(salaryInfo.getMonthlySalary(), salaryInfo.getOtherMonthlyIncome(), monthsWorked, salaryInfo.getAnnualDeductible(), familyInfo.isMarried(), familyInfo.getChildrenCount());
        return TaxFunction.calculateTax(info);
    }
}