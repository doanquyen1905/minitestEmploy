package MiniTest.MiniTest2;

public class PartTimeEmployee extends Employee implements Salary {
    private int hoursWorking = 0;
    public PartTimeEmployee(){

    }
    public PartTimeEmployee(int code, String name, int age, String phone, String email, int hoursWorking){
        super(code, name, age, phone, email);
        this.hoursWorking = hoursWorking;
    }

    @Override
    public double salaire() {
        return getHoursWorking() * 100000;
    }

    public int getHoursWorking() {
        return hoursWorking;
    }

    public void setHoursWorking(int hoursWorking) {
        this.hoursWorking = hoursWorking;
    }
}
