public class Dog implements Animal {

    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private int runSpeed;
    private int swimSpeed;
    //вводим данные и плюсуем колличество
    Dog(String name) {
        this.name = name;
        maxRunDistance = 500;
        maxSwimDistance = 10;
        runSpeed = 30;
        swimSpeed = 10;
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
    @Override
    public void swim(int distance) {
        System.out.format("%-5s %2s выплыла\n" ,this.getClass().getName() , name);
        try {
            Thread.sleep(distance / swimSpeed*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%-6s",this.getClass().getName()) + " проплыл  " + checkDistance(distance,maxSwimDistance) + " за " + (distance / swimSpeed)+ " сек.");
    }
}
