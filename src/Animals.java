//родительский класс описывающий животных
public class Animals {
    // максимальная дистанция бега и плаванья
    int maxRunDistance;
    int maxSwimDistance;
    //проверяем максимальную дистанцию которую животное может преодолеть за раз
    String checkDistance(int d,int maxD){
        if(d < maxD)
            return "       " + String.format("%4d",d) + " метров";
        return "только " + String.format("%4d",maxD) + " метров";
    }
    // бег и плаванье
    public void run(int distance){
        run(this.getClass().getName(),distance,maxRunDistance);
    }

    public void swim(int distance){
        swim(this.getClass().getName(),distance,maxSwimDistance);
    }
    // вывод результатов расчетов бега и плаванья
    void run(String type,int distanсe,int maxRunDistance){
        System.out.println(String.format("%-6s",type) + " пробежал " + checkDistance(distanсe,maxRunDistance));
    }

    void swim(String type,int distanсe,int maxSwimDistance){
        System.out.println(String.format("%-6s",type) + " проплыл  " + checkDistance(distanсe,maxSwimDistance));
    }
    // вывод количества животныхх
    public static void printInfo()
    {
        System.out.println("количество собак    " + Dog.count);
        System.out.println("количество рыб      " + Fish.count);
        System.out.println("количество медведей " + Bear.count);
        System.out.println("количество тигров   " + Tiger.count);
        System.out.println("количество котов    " + Cat.count);
        System.out.println("всего животных      " + (Fish.count + Bear.count + Tiger.count + Cat.count + Dog.count));
    }

}

