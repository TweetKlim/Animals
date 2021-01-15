public class Cat implements Animal {

    private String name;
    private int maxRunDistance;
    private int runSpeed;
    //вводим данные и плюсуем колличество
    Cat(String name) {
        this.name = name;
        maxRunDistance = 200;
        runSpeed = 20;
    }
    @Override
    public void run(int distance) {
        System.out.format("%-5s %2s выбежал\n" ,this.getClass().getName() , name);
        try {
            Thread.sleep(distance / runSpeed*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%-6s",this.getClass().getName()) + " пробежала " + checkDistance(distance,maxRunDistance) + " за " + (distance / runSpeed)+ " сек.");
    }

    // переопределяем т.к. кошла не умеет плавать
    @Override
    public void swim(int distance)
    {
        System.out.println(String.format("%-6s",this.getClass().getName()) + " не умеет плавать");
    }

}
