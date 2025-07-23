package com.java.Q_multithreading;

public class Wait {


    public static void main(String[] args) {

        Wait obj = new Wait();

        Thread t1 = new Thread(obj::waitmethod);
//        Thread t1secodnthread = new Thread(obj::waitmethod);
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                obj.signalmethod();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

//        Thread t2secondthread = new Thread(() -> {
//            try {
//                Thread.sleep(2000);
//                obj.signalmethod();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });

        t1.start();
//        t1secodnthread.start();
        t2.start();
//        t2secondthread.start();
    }
    public void waitmethod(){
        System.out.println("Process Started");
        synchronized (this) {
            System.out.println("Thread 1 started");
            try{
                System.out.println("Thread 1 is in waiting state");
                this.wait();
                System.out.println("Thread 1 received green signal");
            } catch (InterruptedException e) {
                System.out.println("Thread 1 is interrupted");
            }
            System.out.println("Continuing the process");
        }
    }

    public void signalmethod() {
        synchronized (this) {
            System.out.println("Signal method started as Thread 2");
            //this.notify(); // Notify waiting threads
            this.notifyAll();
            // important point notify all should always need to be called in syncronized block.
            System.out.println("Notifying thread 1 to proceed");
        }
    }

}
