import java.util.*;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        // создаем массив и добавляем животных
        AnimalFactory factory = new AnimalFactory();

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(factory.getAnimal(AnimalTypes.DOG));
        animals.add(factory.getAnimal(AnimalTypes.FISH));
        animals.add(factory.getAnimal(AnimalTypes.BEAR));
        animals.add(factory.getAnimal(AnimalTypes.TIGER));
        animals.add(factory.getAnimal(AnimalTypes.CAT));
        animals.add(factory.getAnimal(AnimalTypes.TIGER));
        animals.add(factory.getAnimal(AnimalTypes.TIGER));

        // все животные пробегают и проплывают дистанцию
        for(int i = 0; i < animals.size(); ++i) {
            new AnimalThread(animals.get(i),800,200).start();
        }
        Thread.sleep(15000);
        // выводим колличество животных
        factory.printInfo();

    }
}
