package chain_of_responsability_ATM;

public abstract class RSHandler {

    protected RSHandler rsHandler;

    public  void nexHandler(RSHandler rsHandler){
        this.rsHandler=rsHandler;

    }
    public abstract void handle(long requestAmount);


}
