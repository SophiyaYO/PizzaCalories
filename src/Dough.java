public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.bakingTechnique = bakingTechnique;
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "white":
                this.flourType = flourType;
                break;
            case "wholegraine":
                this.flourType = flourType;
                break;
            default:
                validateFlourType();
                break;

        }
    }

    private void validateFlourType() {
        throw new IllegalArgumentException("Invalid type of dough.");
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            validateDoughWeight();
        }

        this.weight = weight;
    }

    private void validateDoughWeight() {
        throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
    }


}
