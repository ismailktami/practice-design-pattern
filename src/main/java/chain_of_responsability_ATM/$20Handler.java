package chain_of_responsability_ATM;

public class $20Handler extends RSHandler {




    @Override
    public void handle(long requestAmount) {
        long amount=requestAmount/20;
        if(amount>0){

            System.out.println("nombre de 20 : "+amount);

        }

            long pendingAmountToBeProcessed = requestAmount % 20;

            if (pendingAmountToBeProcessed > 0)
            {
                rsHandler.handle(pendingAmountToBeProcessed);

            }

    }
}
