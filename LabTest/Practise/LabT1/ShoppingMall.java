package LabTest.LabT1;

import java.util.ArrayList;

public class ShoppingMall {
    public static void main(String[] args) {
        FoodStore McDonalds = new FoodStore("McDonalds", "Mike", "0101122334");
        McDonalds.AddMenu("Burger", 10);
        McDonalds.AddMenu("Freid Chicken", 12);
        McDonalds.AddEmployee("Jack", null);
        McDonalds.AddEmployee("Jane", null);

        FoodStore SushiMentai = new FoodStore("Sushi Mentai", "Max", "0112233445");
        SushiMentai.AddMenu("Chicken Katsu Don", 15);
        SushiMentai.AddMenu("Ramen", 12);
        SushiMentai.AddEmployee("Adam", null);
        SushiMentai.AddEmployee("Alex", null);
        SushiMentai.AddEmployee("Andrew", null);

        FoodStore Penyet = new FoodStore("Waroeng Penyet", "Mike", "0101122334");
        Penyet.AddMenu("Ayam Penyet", 10);
        Penyet.AddEmployee("Lex", null);
        Penyet.AddEmployee("Leon", null);

        FashionStore Uniqlo = new FashionStore("Uniqlo", "Nate", "01999887765");
        Uniqlo.AddCloth("Shirt", 80);
        Uniqlo.AddCloth("T-Shirt", 60);
        Uniqlo.AddEmployee("Kate", null);
        Uniqlo.AddEmployee("Ken", null);
        Uniqlo.AddEmployee("Kurt", null);

        FashionStore Padini = new FashionStore("Padini", "Nick", "0195544332");
        Padini.AddCloth("Blouse", 100);
        Padini.AddCloth("Shirt", 80);
        Padini.AddEmployee("Frank", null);
        Padini.AddEmployee("Felix", null);

        FashionStore Mango = new FashionStore("Mango", "Nicole", "0194433221");
        Mango.AddCloth("Dress", 120);
        Mango.AddEmployee("Ron", null);
        Mango.AddEmployee("John", null);

        FoodStore[] foodStores = { McDonalds, SushiMentai, Penyet };
        FashionStore[] fashionStores = { Uniqlo, Padini, Mango };

        foodStores[1].Display();
        fashionStores[2].Display();
        ;

        System.out.printf("Food store with highest number of employees: %s\n", FindMax(foodStores));
        System.out.printf("Fashion store with highest number of employees: %s\n", FindMax(fashionStores));
        System.out.println();
        System.out.printf("The contact person for McDonalds and Sushi Mentai is %s\n", McDonalds.equal(SushiMentai));
        System.out.printf("The contact person for McDonalds and Waroeng Penyet is %s\n", McDonalds.equal(Penyet));
        System.out.printf("The contact person for  Sushi Mentai and Waroeng Penyet is %s\n", SushiMentai.equal(Penyet));
        System.out.println();
        System.out.println(compare(SushiMentai, Penyet));
        System.out.println();
        System.out.println(FindExpensive(McDonalds));
        System.out.println(FindExpensive(Padini));
    }

    public static <T extends Comparable<T>> String FindMax(T[] arr) {
        T maxStore = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(maxStore) > 0) {
                maxStore = arr[i];
            }
        }
        if (maxStore instanceof FoodStore) {
            return ((FoodStore) maxStore).getShopName();
        } else if (maxStore instanceof FashionStore) {
            return ((FashionStore) maxStore).getShopName();
        } else {
            return null;
        }
    }

    public static <T extends Comparable<T>> String compare(T obj1, T obj2) {
        T moreStore = obj1;
        if (moreStore.compareTo(obj2) < 0) {
            moreStore = obj2;
        }

        if (moreStore instanceof FoodStore) {
            return String.format("%s has more employees than %s",
                    ((FoodStore) moreStore).getShopName(),
                    ((FoodStore) (obj1 == moreStore ? obj2 : obj1)).getShopName());
        } else if (moreStore instanceof FashionStore) {
            return String.format("%s has more staff members than %s",
                    ((FashionStore) moreStore).getShopName(),
                    ((FashionStore) (obj1 == moreStore ? obj2 : obj1)).getShopName());
        } else {
            return null;
        }
    }

    public static <T extends Comparable<T>> String FindExpensive(T obj) {
        ArrayList<Item> items;
        String shopName;

        if (obj instanceof FoodStore) {
            FoodStore store = (FoodStore) obj;
            items = store.menu;
            shopName = store.getShopName();
        } else if (obj instanceof FashionStore) {
            FashionStore store = (FashionStore) obj;
            items = store.clothes;
            shopName = store.getShopName();
        } else {
            return null; 
        }

        if (items.isEmpty()) {
            return String.format("%s has no items", shopName);
        }

        Item maxPriceItem = items.get(0);
        for (Item item : items) {
            if ((int)item.getPrice() > (int)maxPriceItem.getPrice()) {
                maxPriceItem = item;
            }
        }

        return String.format("The most expensive item at %s is %s",
                shopName, maxPriceItem.getItemName());
    }
}
