class SingleTask implements Runnable {
    public void run() {
        System.out.println("Executing single task with multiple threads.");
    }

    public static void main(String[] args) {
        SingleTask task = new SingleTask();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
    }
}
