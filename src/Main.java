import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear();
        bear.setId(1);
        bear.setName("Yogi");
        bear.setWeight(200);
        bear.furLength = 40;

        Tiger tiger = new Tiger();
        tiger.name = "Jataka";
        tiger.weight = 150;
        tiger.clawLength = 25;

        Wolf wolf = new Wolf();
        wolf.name="Howler";
        wolf.weight = 70;
        wolf.fangLength = 40;

        Dog dog = new Dog();
        dog.name = "Scooby";
        dog.weight = 30;

        List<Animal> animalsList = new ArrayList<>();

       animalsList.add(bear);
       animalsList.add(tiger);
       animalsList.add(wolf);
       animalsList.add(dog);





        System.out.println(animalsList.size());
        animalsList.forEach(Animal::introduce);

        List<Animal> howlers = new ArrayList<>();
        howlers.add(wolf);
        howlers.add(dog);

        System.out.println("");
        System.out.print("My name is " + howlers.get(0).getName()+ " and I am barking " );
        wolf.bark();
        System.out.println("");
        System.out.print("My name is " + howlers.get(1).name+ " and I am barking " );
        dog.bark();
        System.out.println("");
        for (int i = 0; i < howlers.size() ; i++) {
            System.out.println("My name is " + howlers.get(i).name+ " and I am barking " );
        }
        dog.sitPretty();















    }
}
