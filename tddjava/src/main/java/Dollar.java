public class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiply) {
        return new Dollar(amount * multiply, currency);
    }
}
