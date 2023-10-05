package SINGLETON;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    //This file name won't be changed so use
    private final String fileName = "log.txt";

    private PrintWriter printWriter;

    public Logger() throws IOException {
        FileWriter fw =  new FileWriter("log.txt");
        printWriter = new PrintWriter(fw,true);
    }

    public void logDepositMoney(int account, int amount){
        printWriter.println("Deposited to " + account + " Amount : " +amount );
    }
    public void logWithdrawMoney(int account, int amount){
        printWriter.println("Withdraw to " + account + " Amount : " +amount );
    }
    public void logTransfer(int account, int amount, int amount2){
        printWriter.println("Trandfer to " + account + " Amount : " +amount + " Amount : " +amount2 );
    }
}
