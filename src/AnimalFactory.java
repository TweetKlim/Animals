public class AnimalFactory {
    private int catCount = 0;
    private int dogCount = 0;
    private int tigerCount = 0;
    private int bearCount = 0;
    private int fishCount = 0;
    public Animal getAnimal(AnimalTypes type) {
        Animal toReturn = null;
        switch (type) {
            case CAT:
                catCount++;
                toReturn = new Cat(Integer.toString(catCount));
                break;
            case TIGER:
                tigerCount++;
                toReturn = new Tiger(Integer.toString(tigerCount));
                break;
            case BEAR:
                bearCount++;
                toReturn = new Bear(Integer.toString(bearCount));
                break;
            case FISH:
                fishCount++;
                toReturn = new Fish(Integer.toString(fishCount));
                break;
            case DOG:
                dogCount++;
                toReturn = new Dog(Integer.toString(dogCount));
                break;
            default:
                throw new IllegalArgumentException("Wrong animal type:" + type);
        }
        return toReturn;
    }
    public void printInfo()
    {
        System.out.println("количество собак    " + dogCount);
        System.out.println("количество рыб      " + fishCount);
        System.out.println("количество медведей " + bearCount);
        System.out.println("количество тигров   " + tigerCount);
        System.out.println("количество котов    " + catCount);
        System.out.println("всего животных      " + (fishCount + bearCount + tigerCount + catCount + dogCount));
    }
}
