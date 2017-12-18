public class Franc extends Money{

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiply) {
        return new Money(amount * multiply, currency);
    }
}
