package SecondExamPractice;

import java.util.ArrayList;

public class PizzaDominos extends PizzaStore implements PizzaSurprise{
    public PizzaDominos(int id, String name, String address, int numberOfEmployees, String phoneNumber) {
        super(id, name, address, numberOfEmployees, phoneNumber);
    }

    @Override
    public void activateSurprise() {
    }
}