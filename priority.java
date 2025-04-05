class OddThread extends Thread {
    public void run() {
        System.out.println("OddThread priority: " + this.getPriority());
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        System.out.println("EvenThread priority: " + this.getPriority());
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.setPriority(Thread.MIN_PRIORITY);   // Priority 1
        even.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        odd.start();
        even.start();
    }
}
