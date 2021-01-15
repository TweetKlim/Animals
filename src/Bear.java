public class Bear implements Animal {

    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private int runSpeed;
    private int swimSpeed;
    //вводим данные и плюсуем колличество
    Bear(String name) {
        this.name = name;
        maxRunDistance = 300;
        maxSwimDistance = 2000;
        runSpeed = 10;
        swimSpeed = 10;
    }

    public void run(int distance) {
        System.out.format("%-5s %2s выбежал\n" ,this.getClass().getName() , name);
        try {
            Thread.sleep(distance / runSpeed*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%-6s",this.getClass().getName()) + " пробежал " + checkDistance(distance,maxRunDistance) + " за " + (distance / runSpeed)+ " сек.");
    }
    @Override
    public void swim(int distance) {
        System.out.format("%-5s %2s выплыл\n" ,this.getClass().getName() , name);
        try {
            Thread.sleep(distance / swimSpeed*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%-6s",this.getClass().getName()) + " проплыл  " + checkDistance(distance,maxSwimDistance) + " за " + (distance / swimSpeed)+ " сек.");
    }
}