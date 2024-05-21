package MiniTest.MiniTest2;

public class FullTimeEmployee extends Employee implements Salary {
    private double bonus = 0.0d;
    private double fines = 0.0d;
    private double hardSaraly;
    public FullTimeEmployee(){

    }
    public FullTimeEmployee(int code,String name,int age, String phone,String email, double bonus, double fines, double hardSaraly){
        super(code, name, age, phone, email);
        this.bonus = bonus;
        this.fines = fines;
        this.hardSaraly = hardSaraly;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public double getHardSaraly() {
        return hardSaraly;
    }

    public void setHardSaraly(double hardSaraly) {
        this.hardSaraly = hardSaraly;
    }

    @Override
    public double salaire() {
        return getHardSaraly()+ getBonus() - getFines();
    }
}
