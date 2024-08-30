package lab.sportmaster.goods;

public class Fruit extends Ware {

    protected String variety;

    public Fruit(double weight, String variety) {
        super(weight);
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Apple: {\n" +
                "    weight: " + this.weight + "\n" +
                "    variety: " + this.variety + "\n" +
                "}";
    }
}
