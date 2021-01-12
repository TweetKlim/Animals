public class Cat extends Animals {

    public static int count = 0;
    //вводим данные и плюсуем колличество
    Cat() {
        maxRunDistance = 200;
        maxSwimDistance = 0;
        count += 1;
    }
    // переопределяем т.к. кошла не умеет плавать
    public void swim(int distance)
    {
        System.out.println(String.format("%-6s",this.getClass().getName()) + " не умеет плавать");
    }

}
