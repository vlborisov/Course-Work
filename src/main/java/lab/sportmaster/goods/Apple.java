package lab.sportmaster.goods;

import static lab.sportmaster.data.RandomUtils.*;

public class Apple extends Fruit {

    protected boolean isWaxed;
    protected boolean suitableForMakingCider;

    public Apple(double weight, String variety, boolean isWaxed, boolean suitableForMakingCider) {
        super(weight, variety);
        this.isWaxed = isWaxed;
        this.suitableForMakingCider = suitableForMakingCider;
    }

    public Apple() {
        super(randomDouble(0,1), randomAppleVariety());
        this.isWaxed = randomBoolean();
        this.suitableForMakingCider = randomBoolean();
    }

    @Override
    public String toString() {
        return "Apple: {\n" +
                "    weight: " + this.weight + "\n" +
                "    variety: " + this.variety + "\n" +
                "    isWaxed: " + this.isWaxed + "\n" +
                "    suitableForMakingCider: " + this.suitableForMakingCider + "\n" +
                "}";
    }

}
