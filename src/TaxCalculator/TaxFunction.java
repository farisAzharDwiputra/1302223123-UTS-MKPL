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
public class TaxFunction {
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
    public static int calculateTax(EmployeeTaxInfo info) {
        int baseTaxFree = 54000000;
        
        if (info.numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
	}
        if (info.isMarried) {
            baseTaxFree += 4500000;
            baseTaxFree += 1500000 * Math.min(info.numberOfChildren, 3);
        } else {
            baseTaxFree += 0;
        }

        int netIncome = (info.monthlySalary + info.otherMonthlyIncome) * info.numberOfMonthWorking - info.deductible;
        int taxableIncome = netIncome - baseTaxFree;

        return Math.max((int) Math.round(taxableIncome * 0.05), 0);
    }
}
