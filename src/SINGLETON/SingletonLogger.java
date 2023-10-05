package SINGLETON;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonLogger {

    private final String fileName = "singleton_log.txt";
    public static SingletonLogger singletonLogger = null;

    private PrintWriter printWriter;

    private SingletonLogger() throws IOException {
        FileWriter fw = new FileWriter("singleton_log.txt");
        printWriter = new PrintWriter(fw, true);
    }

    public synchronized static SingletonLogger getInstance() throws IOException {
        if(singletonLogger == null){
            singletonLogger = new SingletonLogger();
        }

        return singletonLogger;
    }

    public void logDepositMoney(int account, int amount) {
        printWriter.println("Deposited to " + account + " Amount : " + amount);
    }

    public void logWithdrawMoney(int account, int amount) {
        printWriter.println("Withdraw to " + account + " Amount : " + amount);
    }

    public void logTransfer(int account, int amount, int amount2) {
        printWriter.println("Trandfer to " + account + " Amount : " + amount + " Amount : " + amount2);
    }
}
