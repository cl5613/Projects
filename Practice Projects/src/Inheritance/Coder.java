package Inheritance;

public class Coder extends Employee{

    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("Name is " + super.getName() + "Age is " + super.getAge()
                + "Salary is " + super.getSalary() + " is writing the code");
    }

}
