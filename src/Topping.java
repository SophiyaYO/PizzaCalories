public class Topping {
    private final static double MEAT_CALORIES = 1.2;
    private final static double VEGGIES_CALORIES = 0.8;
    private final static double CHEESE_CALORIES = 1.1;
    private final static double SAUCE_CALORIES = 0.9;

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType) {
            case "meat":
                this.toppingType = toppingType;
                break;
            case "veggies":
                this.toppingType = toppingType;
                break;
            case "cheese":
                this.toppingType = toppingType;
                break;
            case "sauce":
                this.toppingType = toppingType;
                break;

            default:
                validateToppings(this.toppingType);
                break;
        }
    }

    private String getToppingType() {
        return this.toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            validateWeight(this.toppingType);
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        return (this.weight * 2) * toppingModifiers(this.getToppingType());
    }

    private double toppingModifiers(String toppingType) {
        double toppingModifier = 1;
        switch (toppingType) {
            case "meat":
                toppingModifier = MEAT_CALORIES;
                break;
            case "veggies":
                toppingModifier = VEGGIES_CALORIES;
                break;
            case "cheese":
                toppingModifier = CHEESE_CALORIES;
                break;
            case "sauce":
                toppingModifier = SAUCE_CALORIES;
                break;
        }
        return toppingModifier;
    }

    private void validateToppings(String input) {
        throw new IllegalArgumentException(String.format(
                "Cannot place %s on top of your pizza.",
                input));
    }

    private void validateWeight(String toppingType) {
        throw new IllegalArgumentException(String.format(
                "%s weight should be in the range [1..50].",
                toppingType));
    }
}
