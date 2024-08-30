package lab.sportmaster.data;

import com.github.javafaker.*;
import lab.sportmaster.goods.Apple;
import lab.sportmaster.goods.Fruit;
import lab.sportmaster.goods.Orange;

public final class RandomUtils {

    private static final Faker faker = new Faker();

    private RandomUtils() {
    }

    public static int randomInt(int min, int max) {
        return faker.number().numberBetween(min, max);
    }

    public static String randomAppleVariety() {
        String[] appleVariety = {"Голден", "Гала", "Черный принц", "Карамелька", "Спартан", "Фуджи", "Ренет Симиренко", "Хоней Крисп"};
        return appleVariety[randomInt(0, 7)];
    }

    public static String randomOrangeVariety() {
        String[] orangeVariety = {"Клементин", "Муркотт", "Надоркотт", "Сатсума", "Уншиу", "Шива-микан", "Нова"};
        return orangeVariety[randomInt(0, 6)];
    }

    public static String randomAddress() {
        String[] addresses = {"Невский проспект, 146", "Караванная, 1 лит А", "Стремянная, 1", "Фонарный переулок, 7", "Загородный проспект, 35", "улица Льва Толстого, 9", "Литейный проспект, 43"};
        return addresses[randomInt(0, 6)];
    }

    public static double randomDouble(int min, int max) {
        return faker.number().randomDouble(2, min, max);
    }

    public static boolean randomBoolean() {
        return faker.bool().bool();
    }

    public static Fruit[] generateArrayOfFruitsWithRandomLength() {
        int count = randomInt(5, 10);
        Fruit[] arr = new Fruit[count];
        for (int i = 0; i < arr.length; i++) {
            if (randomBoolean()) {
                arr[i] = new Apple();
            } else {
                arr[i] = new Orange();
            }
        }
        return arr;
    }

}
