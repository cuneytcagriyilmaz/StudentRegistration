package Threads;

import Services.JsonService;

import java.io.IOException;

// Runnable Interface was implemented to use thread.
public class WriteThread implements Runnable{

    // A boolean variable is defined to check if the read operation has finished
    static boolean isReaded = false;
    @Override
    public void run() {
        try {
            //If the read operation is finished, the thread for the write operation starts running.
            if (isReaded == true){
                Thread.sleep(3000);
                JsonService jsonService = new JsonService();
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

}
