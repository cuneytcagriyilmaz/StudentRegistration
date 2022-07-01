import Threads.ReadThread;
import Threads.WriteThread;

public class Main {
    public static void main(String[] args) {

        // Objects of read and write threds are created.
        WriteThread writeThread= new WriteThread();
        ReadThread readThread= new ReadThread();

        // Threads are initialized.
        writeThread.run();
        readThread.run();

    }


}
