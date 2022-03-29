public class Task {
    public static void main(String[] args){
        Car c1 = new Car("Kona",250);
        Car c2 = new Car("Ioniq",220);

        Runnable racer1 = new Racer(c1);
        Runnable racer2 = new Racer(c2);

        new Thread(racer1).start();
        new Thread(racer2).start();
    }
}