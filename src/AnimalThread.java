public class AnimalThread extends Thread{
    private Animal animal;
    private int runDistance;
    private int swimDistance;
    AnimalThread(Animal animal,int runDistance, int swimDistance)
    {
        this.animal = animal;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    @Override
    public void run()
    {
        animal.run(runDistance);
        animal.swim(swimDistance);
    }
}
