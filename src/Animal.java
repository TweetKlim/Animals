public interface Animal {
    default String checkDistance(int d, int maxD){
        if(d < maxD)
            return "       " + String.format("%4d",d) + " метров";
        return "только " + String.format("%4d",maxD) + " метров";
    }
    void run(int distance);
    void swim(int distance);
}
