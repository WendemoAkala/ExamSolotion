package SecondExamPractice;

import java.time.LocalDate;

public class PizzaStoreMain {
    public static void main(String[] args) {
        // Create Pizza Hut store
        PizzaHut pizzaHut = new PizzaHut(1, "Pizza Hut", "123 Main St", 5, "123-456-7890");

        // Create Pizza Dominos store
        PizzaDominos pizzaDominos = new PizzaDominos(2, "Pizza Dominos", "456 Elm St", 10, "987-654-3210");

        // Create employees for Pizza Hut
        Employee employee1 = new Employee(1, "John", "Doe", "456 Pine St", 2000,  LocalDate.now());
        Employee employee2 = new Employee(2, "Jane", "Smith", "789 Oak St", 2200, LocalDate.now());

        // Add employees to Pizza Hut
        pizzaHut.addEmployee(employee1);
        pizzaHut.addEmployee(employee2);

        // Create employees for Pizza Dominos
        Employee employee3 = new Employee(3, "Michael", "Johnson", "987 Maple St", 1800, LocalDate.now());
        Employee employee4 = new Employee(4, "Emily", "Davis", "654 Birch St", 2100, LocalDate.now());

        // Add employees to Pizza Dominos
        pizzaDominos.addEmployee(employee3);
        pizzaDominos.addEmployee(employee4);

        // Calculate employee expenses for each store
        int pizzaHutExpenses = pizzaHut.calculateEmployeeExpenses();
        int pizzaDominosExpenses = pizzaDominos.calculateEmployeeExpenses();

        System.out.println("Pizza Hut employee expenses: $" + pizzaHutExpenses);
        System.out.println("Pizza Dominos employee expenses: $" + pizzaDominosExpenses);

        // Set pizza surprise for an employee
        employee1.setPizzaSurprise("Free pizza for a month!");

        // Activate pizza surprise for an employee
        employee1.activateSurprise();

        // Remove an employee from Pizza Hut
        pizzaHut.removeEmployee(employee2);

        // Calculate rank within a specified range for Pizza Dominos
        int pizzaDominosRangedRank = pizzaDominos.calculateRangedRank(1);
        System.out.println("Pizza Dominos rank within range: " + pizzaDominosRangedRank);

    }
}