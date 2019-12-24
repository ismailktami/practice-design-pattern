package chain_of_responsability_ATM;

public class ATM {

    private static  RSHandler $100 =new $100Handler();
    private static  RSHandler $50 =new $50Hander();
    private static  RSHandler $20 =new $20Handler();
    private static  RSHandler $10 =new $10Handler();
    private static  RSHandler $5 =new $5Handler();



    static {
        $100.nexHandler($50);        $50.nexHandler($20);
        $20.nexHandler($10);        $10.nexHandler($5);

    }

    public static  void withdraw( long requestedAmount )
    {

        $100.handle(requestedAmount);
    }

}
