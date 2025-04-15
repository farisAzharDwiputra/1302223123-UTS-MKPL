/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxCalculator;

/**
 *
 * @author LENOVO
 */
public class PersonalInfo {
    private String firstName, lastName, idNumber, address;
    private boolean isForeigner, gender;

    public PersonalInfo(String firstName, String lastName, String idNumber, String address, boolean isForeigner, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public boolean isGender() {
        return gender;
    }
    
}
