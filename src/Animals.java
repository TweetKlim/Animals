public class Animals {
    int maxRunDistance;
    int maxSwimDistance;
    public void run(int distance){
        run(this.getClass().getName(),distance,maxRunDistance);
    }
    public void swim(int distance){
        swim(this.getClass().getName(),distance,maxSwimDistance);
    }
    public void run(String type,int distanсe,int maxRunDistance)
    {
        if(maxRunDistance == 0) {
            System.out.println(type + " не умеет бегать");
        }
        else if(distanсe < maxRunDistance)
            System.out.println(type + " преодолел " + distanсe + " метров");
        else
            System.out.println(type + " преодолел только " + maxRunDistance + " метров");
    }

    public void swim(String type,int distanсe,int maxSwimDistance){
        if(maxSwimDistance == 0) {
            System.out.println(type + " не умеет плавать");
        }
        else if(distanсe < maxSwimDistance)
            System.out.println(type + " проплыл " + distanсe + " метров");
        else
            System.out.println(type + " проплыл только " + maxSwimDistance + " метров");
    }

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

