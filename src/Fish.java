public class Fish extends Animals {

    public static int count = 0;
    //вводим данные и плюсуем колличество
    Fish() {
        maxRunDistance = 0;
        maxSwimDistance = 500;
        count += 1;
    }
    // переопределяем т.к. рыба не умеет бегать
    public void run(int distance)
    {
        System.out.println(String.format("%-6s",this.getClass().getName()) + " не умеет бегать");
    }
}
