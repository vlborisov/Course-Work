package lab.sportmaster.goods;

import static lab.sportmaster.data.RandomUtils.*;

public class Orange extends Fruit {

    protected int peelThickness;
    protected int slicesCount;

    public Orange(double weight, String variety, int peelThickness, int slicesCount) {
        super(weight, variety);
        this.peelThickness = peelThickness;
        this.slicesCount = slicesCount;
    }

    public Orange() {
        super(randomDouble(0,1), randomOrangeVariety());
        this.peelThickness = randomInt(0,5);
        this.slicesCount = randomInt(6,9);
    }

    @Override
    public String toString() {
        return "Orange: {\n" +
                "    weight: " + this.weight + "\n" +
                "    variety: " + this.variety + "\n" +
                "    peelThickness: " + this.peelThickness + "\n" +
                "    slicesCount: " + this.slicesCount + "\n" +
                "}";
    }

}
