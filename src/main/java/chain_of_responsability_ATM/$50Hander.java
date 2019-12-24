package chain_of_responsability_ATM;

public class $50Hander extends RSHandler {




    @Override
    public void handle(long requestAmount) {
                    long amount=requestAmount/50;
                    if(amount>0){

                        System.out.println("nombre de 50 : "+amount);


                    }

                        long pendingAmountToBeProcessed = requestAmount % 50;

                        if (pendingAmountToBeProcessed > 0)
                        {
                            rsHandler.handle(pendingAmountToBeProcessed);

                        }

    }
}
