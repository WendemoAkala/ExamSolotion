package SecondExamPractice;

import jdk.internal.jimage.ImageStrings;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PizzaStore {
    private int id;
    private String name;
    private String address;
    private int numberOfEmployees;
    private ArrayList<Employee> storeEmployees;
    private String phoneNumber;
    private int rank;

    public PizzaStore(int id, String name, String address, int numberOfEmployees, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.storeEmployees = new ArrayList<>();
        this.phoneNumber = phoneNumber;
        calculateRank();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public ArrayList<Employee> getStoreEmployees() {
        return storeEmployees;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getRank() {
        return rank;
    }

    public void addEmployee(Employee employee) {

            this.storeEmployees.add(employee);
            numberOfEmployees++;
            calculateRank();

    }

    public void removeEmployee(Employee employee) {
        if (storeEmployees.remove(employee)) {
            numberOfEmployees--;
            calculateRank();
        }
    }

    public int calculateEmployeeExpenses() {
        int totalExpenses = 0;
        for (Employee employee : this.storeEmployees) {
            totalExpenses += employee.getSalary();
        }
        return totalExpenses;
    }

    private void calculateRank() {
        if (storeEmployees.isEmpty()) {
            rank = 0;
            return;
        }

        int sumRanks = 0;
        for (Employee employee : storeEmployees) {
            sumRanks += employee.getRank();
        }

        if (this instanceof PizzaHut) {
            rank = sumRanks / storeEmployees.size();
        } else if (this instanceof PizzaDominos) {
            rank = sumRanks;
        }
    }

    public int calculateRangedRank(int range) {
        int sumRanks = 0;
        int validEmployees = 0;
        LocalDate currentDate = LocalDate.now();

        for (Employee employee : storeEmployees) {
            LocalDate rankDate = employee.getRankDate();
            if (currentDate.minusDays(range).isBefore(rankDate) || currentDate.minusDays(range).isEqual(rankDate)) {
                sumRanks += employee.getRank();
                validEmployees++;
            } else {
                employee.updateRankDate(null);
            }
        }

        if (validEmployees > 0) {
            if (this instanceof PizzaHut) {
                rank = sumRanks / validEmployees;
            } else if (this instanceof PizzaDominos) {
                rank = sumRanks;
            }
        } else {
            rank = 0;
        }

        return rank;
    }
}
