public class Bear extends Animals {
    public static int count = 0;
    Bear() {
        maxRunDistance = 300;
        maxSwimDistance = 2000;
        count += 1;
    }
}