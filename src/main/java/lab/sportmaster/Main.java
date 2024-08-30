package lab.sportmaster;

import lab.sportmaster.stores.CityStorage;
import lab.sportmaster.stores.Shop;

import static lab.sportmaster.data.RandomUtils.generateArrayOfFruitsWithRandomLength;

public class Main {
    public static void main(String[] args) {
        CityStorage cityStorage = new CityStorage();
        Shop firstShop = new Shop();
        Shop secondShop = new Shop();

        cityStorage.addFruitsToList(generateArrayOfFruitsWithRandomLength());

        printInfo(cityStorage,firstShop,secondShop);

        cityStorage.shipFruitsToShop(firstShop, 2);
        cityStorage.shipFruitsToShop(secondShop, 3);

        printInfo(cityStorage,firstShop,secondShop);
    }

    public static void printInfo(CityStorage cityStorage, Shop firstShop, Shop secondShop){
        System.out.println(cityStorage.toString() + "\n" + firstShop.toString() + "\n" + secondShop.toString());
    }

}