package Threads;

import Services.JsonService;

import java.io.IOException;

public class ReadThread implements Runnable{
    @Override
    public void run() {
        try {
            // The read operation runs when the program starts.
            System.out.println("File Reading");
            Thread.sleep(1500);
            System.out.println("File Read");
            JsonService jsonService = new JsonService();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
