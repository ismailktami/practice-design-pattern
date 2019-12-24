package chain_of_responsability_ATM;

public class $100Handler extends RSHandler {



    @Override
    public void handle(long requestAmount) {
            long amount=requestAmount/100;

            if(amount>0){

                System.out.println("nombre de 100 : "+amount);

            }

                long pendingAmountToBeProcessed = requestAmount % 100;

                if (pendingAmountToBeProcessed > 0)
                {
                    rsHandler.handle(pendingAmountToBeProcessed);

                }

    }
}
