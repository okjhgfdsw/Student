class TaskOne extends Thread {
    public void run() {
        System.out.println("Task One is running.");
    }
}

class TaskTwo extends Thread {
    public void run() {
        System.out.println("Task Two is running.");
    }
}

public class MultiTaskingExample {
    public static void main(String[] args) {
        TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();

        t1.start();
        t2.start();
    }
}
