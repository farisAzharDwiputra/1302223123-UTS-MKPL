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
public class SalaryInfo {
    private LocalDate joinDate;
    private int monthlySalary, otherMonthlyIncome, annualDeductible;

public void setMonthlySalaryByGrade(int grade,boolean isForeigner) {	
    if (grade == 1) {
		monthlySalary = 3000000;
		if (isForeigner) {
			monthlySalary = (int) (3000000 * 1.5);
		}
    }else if (grade == 2) {
		monthlySalary = 5000000;
		if (isForeigner) {
			monthlySalary = (int) (3000000 * 1.5);
		}
    }else if (grade == 3) {
		monthlySalary = 7000000;
		if (isForeigner) {
			monthlySalary = (int) (3000000 * 1.5);
		}
    }
}

    public int calculateMonthsWorked() {
        LocalDate now = LocalDate.now();
        return now.getYear() == joinDate.getYear() ? now.getMonthValue() - joinDate.getMonthValue() : 12;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = annualDeductible;
    }
}