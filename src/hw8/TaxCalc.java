package hw8;

public class TaxCalc {
    public  static  TaxPayment[] calculateTaxForAll(Employee[] employees) {
        TaxPayment[] taxPayments = new TaxPayment[employees.length];
        for (int i = 0; i < employees.length; i++) {
            taxPayments[i] = taxForEmployee(employees[i]);
        }
        return taxPayments;
    }

    public static TaxPayment taxForEmployee(Employee employee){
        double effectiveSalary = employee.salary - employee.children * 1000;
double taxRate;
        if (effectiveSalary > 10000){
    taxRate = 0.23;
} else if (effectiveSalary > 5000) {
            taxRate = 0.18;
        }else {
            taxRate = 0.13;
            
        }
        TaxPayment taxPayment = new TaxPayment();
        taxPayment.name = employee.name;;
        taxPayment.tax = effectiveSalary * taxRate;
        return taxPayment;
    }
}
