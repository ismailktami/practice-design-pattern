package chain_of_responsability_ATM;

public class $10Handler extends RSHandler {


    @Override
    public void handle(long requestAmount) {
        long amount=requestAmount/10;

        if(amount>0){

            System.out.println("nombre de 10 : "+amount);

        }

            long pendingAmountToBeProcessed = requestAmount % 10;

            if (pendingAmountToBeProcessed > 0)
            {
                rsHandler.handle(pendingAmountToBeProcessed);

            }
    }
}
