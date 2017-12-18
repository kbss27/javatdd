class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return null;
    }

    String currency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money)object;
        if(money.amount == this.amount &&
                getClass().equals(money.getClass())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return amount + " " + currency;
    }
}