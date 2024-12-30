package lab.sportmaster.stores;

import lab.sportmaster.goods.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class CityStorage {

    private ArrayList<Fruit> fruitsList = new ArrayList<>();

    @Override
    public String toString() {
        return "CityStorage: {\n" +
                "    fruitsList " + this.fruitsList +
                "\n}";
    }

    public ArrayList<Fruit> getFruitsList(){
        return this.fruitsList;
    }

    public void addFruitsToList(Fruit[] newFruits) {
        this.fruitsList.addAll(Arrays.asList(newFruits));
    }

    public void shipFruitsToShop(Shop shop, int countOfProduct) {
        for (int i = 0; i < countOfProduct; i++) {
            shop.addNewFruit(this.fruitsList.get(0));
            this.fruitsList.remove(0);
        }
    }

}
