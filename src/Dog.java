public class Dog extends Animals {

    public static int count = 0;
    //вводим данные и плюсуем колличество
    Dog() {
        maxRunDistance = 500;
        maxSwimDistance = 10;
        count += 1;
    }

}
