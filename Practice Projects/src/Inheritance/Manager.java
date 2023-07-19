package Inheritance;

public class Manager extends Employee {

    private double bonus;

    public Manager() {
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Name is " + super.getName()
                + "Age is " + super.getAge()
                + "Salary is " + super.getSalary() + "Bouns is " + bonus + " is arranging tasks");
    }
}
