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
public class FamilyInfo {
    private String spouseName, spouseIdNumber;
    private List<String> childNames = new LinkedList<>();
    private List<String> childIds = new LinkedList<>();

    public void setSpouse(String name, String idNumber) {
        this.spouseName = name;
        this.spouseIdNumber = idNumber;
    }

    public void addChild(String name, String id) {
        childNames.add(name);
        childIds.add(id);
    }

    public boolean isSingle() {
        return spouseIdNumber == null || spouseIdNumber.isEmpty();
    }

    public int getChildrenCount() {
        return Math.min(childIds.size(), 3); // Pajak hanya hitung maksimal 3 anak
    }
}
