import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.println("Employee #" + i + 1 + ": ");

            System.out.print("ID: ");
            int id = sc.nextInt();

            while (hasID(employees, id)) {
                System.out.println("ID already exists!");
                id = sc.nextInt();
            }


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();

            System.out.print("Salary: ");
            sc.nextLine();
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }
        System.out.println();
        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = sc.nextInt();

        Employee emp = employees.stream().filter(i -> i.getId() == id).findAny().orElse(null);

        if (emp == null) {
            System.out.println("ERROR: This ID does not exist!");
        } else {
            System.out.print("Enter the percentage for the salary increase: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("** EMPLOYESS LIST **");
        for (Employee pessoa : employees) {
            System.out.printf("ID:%d %nNAME:%s %nSALARY=%.2f%n", pessoa.getId(), pessoa.getName(), pessoa.getSalary());
            System.out.println("-------------------------------");
        }

        sc.close();
    }

    public static boolean hasID(List<Employee> list, int id) {
        Employee emp = list.stream().filter(i -> i.getId() == id).findAny().orElse(null);
        return emp != null;
    }


}

