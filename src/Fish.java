public class Fish implements Animal {

    private String name;
    private int maxSwimDistance;
    private int swimSpeed;
    //вводим данные и плюсуем колличество
    Fish(String name) {
        this.name = name;
        maxSwimDistance = 500;
        swimSpeed = 10;
    }
    // переопределяем т.к. рыба не умеет бегать
    @Override
    public void run(int distance)
    {
        System.out.println(String.format("%-6s",this.getClass().getName()) + " не умеет бегать");
    }
    @Override
    public void swim(int distance) {
        System.out.format("%-5s %2s выплыла\n" ,this.getClass().getName() , name);
        try {
            Thread.sleep(distance / swimSpeed*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%-6s",this.getClass().getName()) + " проплылa " + checkDistance(distance,maxSwimDistance) + " за " + (distance / swimSpeed)+ " сек.");
    }

}
