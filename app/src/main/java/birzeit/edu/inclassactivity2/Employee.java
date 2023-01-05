package birzeit.edu.inclassactivity2;

public class Employee {
    private static  Employee[] employees ;
    private String name;
    private int salary;
    private boolean fullTime;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static Employee[] getEmployees() {
        return employees;
    }

    public static void setEmployees(Employee[] employees) {
        Employee.employees = employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
