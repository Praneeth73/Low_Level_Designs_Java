package SINGLETON;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) throws IOException {

        Logger logger = new Logger();
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();


        logger.logDepositMoney(1,100);
        logger.logTransfer(2,200,100);
        logger2.logWithdrawMoney(2,200);
        logger1.logDepositMoney(3,100);
        logger.logWithdrawMoney(4,123);
        logger2.logDepositMoney(2, 100);


        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        SingletonLogger singletonLogger1 = SingletonLogger.getInstance();
        SingletonLogger singletonLogger2 = SingletonLogger.getInstance();


        singletonLogger.logDepositMoney(1,100);
        singletonLogger.logTransfer(2,200,100);
        singletonLogger2.logWithdrawMoney(2,200);
        singletonLogger1.logDepositMoney(3,100);
        singletonLogger.logWithdrawMoney(4,123);
        singletonLogger2.logDepositMoney(2, 100);


    }


}
