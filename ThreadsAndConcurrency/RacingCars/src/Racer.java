public class Racer implements Runnable {

    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    /* TODO 
Create a constructor that receives a Car objec and initializes c.*/
    public Racer(Car c) {
        this.c = c;
    }

    @Override
    /* TODO 
Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
    public void run() {
        while (this.c.odometer < distance) {
            if (this.c.miles == 0) {
                try {
                    System.out.println("Charging " + this.c.name);
                    this.c.charge();
                    Thread.sleep((int) this.c.miles);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (this.c.miles > 0) {
                this.c.move(1);
            }
        }
    }

}
