package zoo;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.speak();
//        dog.feed("jedzenie");
//        dog.feed("jedzenie", 2);

        Food paroowa = new Food("parówka", 50000);
        Food trutka = new Food("trutka", 50000);
        Food marchewa = new Food("marchewka", 10000);
        Food smaczek = new Food("smaczek", 5000);

        List<Food> jedzonko = new ArrayList<>();

        jedzonko.add(paroowa);
        jedzonko.add(trutka);
        jedzonko.add(marchewa);
        jedzonko.add(smaczek);

        for(Food food : jedzonko){
            if (food.foodType.equals(trutka)) {
                System.out.println("Fuj,sam se to zjedz!");
            } else {}
            dog.feed(food);
    }
}

}


