import java.util.*;

public class Main {


    public static void main(String[] args) {
        // создаем массив и добавляем животных
        ArrayList<Animals> animals = new ArrayList<Animals>();
        animals.add(new Dog());
        animals.add(new Fish());
        animals.add(new Dog());
        animals.add(new Tiger());
        animals.add(new Bear());
        animals.add(new Cat());
        animals.add(new Tiger());
        animals.add(new Tiger());
        // все животные пробегают и проплывают дистанцию
        for(int i = 0; i < animals.size(); ++i) {
            animals.get(i).run(800);
            animals.get(i).swim(200);
        }
        // выводим колличество животных
        Animals.printInfo();

    }
}
