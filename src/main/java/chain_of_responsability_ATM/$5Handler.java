package chain_of_responsability_ATM;

public class $5Handler extends RSHandler {



    @Override
    public void handle(long requestAmount) {
        long amount=requestAmount/5;

        if(amount>0){

            System.out.println("nombre de 5 : "+amount);
        }

            long pendingAmountToBeProcessed = requestAmount % 5;

            if (pendingAmountToBeProcessed > 0)
            {
                rsHandler.handle(pendingAmountToBeProcessed);

            }
    }
}
