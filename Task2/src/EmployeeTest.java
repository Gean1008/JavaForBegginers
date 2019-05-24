import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee first = new Employee("John", "Doe", 255);
        Employee second = new Employee("Peter", "Griffin", 50);

        System.out.printf("%s %s\t\t| Yearly salary: %.2f%n", first.getFirstName(),first.getLastName(), first.getSalary()*12);
        System.out.printf("%s %s\t| Yearly salary: %.2f%n", second.getFirstName(),second.getLastName(), second.getSalary()*12);

        Scanner input = new Scanner(System.in);
        System.out.println("\nInput new salary for first employee: ");
        double salary = first.getSalary() + first.getSalary()*0.1;
        first.setSalary(salary);

        System.out.printf("%s %s\t\t| Yearly salary: %.2f%n", first.getFirstName(),first.getLastName(), first.getSalary()*12);
        salary = second.getSalary() + second.getSalary()*0.1;
        second.setSalary(salary);
        System.out.printf("%s %s\t| Yearly salary: %.2f%n", second.getFirstName(),second.getLastName(), second.getSalary()*12);

    }
}
