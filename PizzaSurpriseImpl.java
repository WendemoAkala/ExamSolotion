package SecondExamPractice;

public class PizzaSurpriseImpl implements PizzaSurprise{
    private String type;

    public PizzaSurpriseImpl(String type) {
        this.type = type;
    }
    @Override
    public void activateSurprise() {
        System.out.println("You got a " + type + " surprise! Congratulations!");
    }
}
