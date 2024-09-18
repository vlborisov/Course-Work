package lab.sportmaster.stores;

import lab.sportmaster.goods.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lab.sportmaster.data.RandomUtils.randomAddress;

public class Shop {

    private String address;
    private List<Fruit> fruitsInShop = new ArrayList<>();

    public Shop(){
        this.address = randomAddress();
    }

    public Shop(String address){
        this.address = address;
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
