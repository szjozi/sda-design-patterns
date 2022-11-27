package creational.builder;


public class Sandwich {

    private final boolean ham;
    private final boolean cheese;
    private final boolean topping;

    private Sandwich(boolean ham, boolean cheese, boolean topping) {
        this.ham = ham;
        this.cheese = cheese;
        this.topping = topping;
    }

    public static class Builder {

        private boolean ham;
        private boolean cheese;
        private boolean topping;

        public Builder ham(boolean ham) {
            this.ham = ham;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder topping(boolean topping) {
            this.topping = topping;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(ham, cheese, topping);
        }
    }

    public static Builder builder() {
        return new Builder();
    }


    @Override
    public String toString() {
        return "Sandwich(ham=" + ham + " cheese="
                + cheese + ", topping=" + topping + ')';
    }
}
