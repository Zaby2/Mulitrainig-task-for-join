class Thinker extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + "Get started");
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "Taking Spoon");
        }
       for (int i = 0; i < 10; i++) {
           System.out.println(getName() + "Thinking");
       }
        System.out.println("End");
    }
}

public class Main {
    public static void main(String[] args) {
        Thinker thx1 = new Thinker();
        Thinker thx2 = new Thinker();
        Thinker thx3 = new Thinker();
        Thinker thx4 = new Thinker();
        Thinker thx5 = new Thinker();
        thx1.start();
        try {
            thx1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thx2.start();
        try {
            thx2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thx3.start();
        try {
            thx3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thx4.start();
        try {
            thx4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thx5.start();
        try {
            thx5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

