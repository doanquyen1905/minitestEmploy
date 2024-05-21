package MiniTest.MiniTest2;

public class MainEmployee {
    public static void main(String[] args) {
        Employee [] listEmployee = new Employee[3];
        Employee employee1 = new FullTimeEmployee(1,"David",24,"0856156372","David@gmail.com",100000.0,0.0,6000000.0);
        listEmployee[0] = employee1;
        Employee employee2 = new FullTimeEmployee(2,"Jame  ",23,"0856156456","Jame@gmail.com",100000.0,0.0,7000000.0);
        listEmployee[1] = employee2;
        Employee employee3 = new PartTimeEmployee(3,"Tom",20,"0986378456","Tom@gmail.com",100);
        listEmployee[2] = employee3;
        double sumSalary = 0.0d;
        double sumSalaryPartTime = 0.0d;
        sumSalary = getSumSalary(listEmployee, sumSalary);
        double salaryAVG = sumSalary/listEmployee.length;
        System.out.println(salaryAVG);
        displayLowSalary(listEmployee, salaryAVG);
        sumSalaryPT(listEmployee, sumSalaryPartTime);
        sortFullTimeBySalary(listEmployee);
        System.out.println("Sap xep nhan vien full time theo muc luong tang dan: ");
        for(Employee employee : listEmployee ){
            if(employee instanceof FullTimeEmployee fullTimeEmployee){
                System.out.println(fullTimeEmployee.getName() + ", luong: " + fullTimeEmployee.salaire());
            }
        }
    }

    private static void sortFullTimeBySalary(Employee[] listEmployee) {
        for (int i = 0; i < listEmployee.length -1; i++) {
            for (int j = 0; j < listEmployee.length - i -1; j++) {
                if(listEmployee[i] instanceof FullTimeEmployee ft1 && listEmployee[j] instanceof FullTimeEmployee ft2) {
                    if(ft1.salaire() < ft2.salaire()) {
                        Employee temp = listEmployee[i];
                        listEmployee[i] = listEmployee[j];
                        listEmployee[j] = temp;
                    }
                }
            }
        }
    }
    private static void sumSalaryPT(Employee[] listEmployee, double sumSaralyPartTime) {
        for (Employee employee: listEmployee){
            if (employee instanceof PartTimeEmployee){
                sumSaralyPartTime += ((PartTimeEmployee) employee).salaire();
            }
        }
        System.out.println(sumSaralyPartTime);
    }

    private static void displayLowSalary(Employee[] listEmployee, double saralyAVG) {
        for (Employee employee: listEmployee){
            if (employee instanceof FullTimeEmployee){
                if (((FullTimeEmployee) employee).salaire()< saralyAVG){
                    System.out.println(employee);
                }
            }
        }
    }

    private static double getSumSalary(Employee[] listEmployee, double sumSalary) {
        for (Employee employee: listEmployee){
            if (employee instanceof PartTimeEmployee){
                sumSalary = sumSalary + ((PartTimeEmployee) employee).salaire();
            }
            if (employee instanceof FullTimeEmployee){
                sumSalary = sumSalary + ((FullTimeEmployee) employee).salaire();
            }
        }
        return sumSalary;
    }

}
