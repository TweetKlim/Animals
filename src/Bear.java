public class Bear extends Animals {

    public static int count = 0;
    //вводим данные и плюсуем колличество
    Bear() {
        maxRunDistance = 300;
        maxSwimDistance = 2000;
        count += 1;
    }
}