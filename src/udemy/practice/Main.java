package udemy.practice;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator test = new SimpleCalculator();

        test.setFirstNumber(0);
        test.setSecondNumber(1.25);

        System.out.println(test.getAdditionResult());
        System.out.println(test.getDivisionResult());
    }
}
