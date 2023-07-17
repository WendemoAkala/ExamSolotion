package SecondExamPractice;

import java.time.LocalDate;
import java.util.Random;

public class Employee implements PizzaSurprise {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private int salary;
    private LocalDate startDate;
    private int rank;
    private LocalDate rankDate;
    private String pizzaSurprise;

    public Employee(int id, String firstName, String lastName, String address, int salary, LocalDate startDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.startDate = startDate;
        setRank();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getRank() {
        return rank;
    }

    public LocalDate getRankDate() {
        return rankDate;
    }

    public void setRank() {
        Random random = new Random();
        rank = random.nextInt(100) + 1;
        rankDate = LocalDate.now();
    }


    public void updateRankDate(LocalDate date) {
        rankDate = date;
    }

    public String getPizzaSurprise() {
        return pizzaSurprise;
    }

    public void activateSurprise() {
        if (pizzaSurprise != null) {
            System.out.println("You got a surprise! Congratulations!");
        }
    }

    public void setPizzaSurprise(String pizzaSurprise) {
        this.pizzaSurprise = pizzaSurprise;
    }
}
