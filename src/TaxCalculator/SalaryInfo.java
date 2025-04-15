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

    public void setMonthlySalaryByGrade(int grade, boolean isForeigner) {
        int[] salaries = {0, 3000000, 5000000, 7000000};
        monthlySalary = (int) (salaries[grade] * (isForeigner ? 1.5 : 1.0));
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