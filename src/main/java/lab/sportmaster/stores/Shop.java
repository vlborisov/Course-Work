package lab.sportmaster.stores;

import lab.sportmaster.goods.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

import static lab.sportmaster.data.RandomUtils.randomAddress;

public class Shop {

    private String address;
    private ArrayList<Fruit> fruitsInShop = new ArrayList<>();

    public Shop(){
        this.address = randomAddress();
    }

    @Override
    public String toString() {
        return "Shop: {\n" +
                "   address: " + this.address +
                "\n   fruitsList: " + this.fruitsInShop.toString() +
                "\n}" ;
    }

    public void addNewFruit(Fruit fruit){
        this.fruitsInShop.add(fruit);
    }

    public void addArrOfFruits(Fruit[] fruits){
        this.fruitsInShop.addAll(Arrays.asList(fruits));
    }

}
