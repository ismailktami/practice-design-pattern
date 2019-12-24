package Command;

public class Client {

    public static void main(String[] args) {

        Lampe lampe=new Lampe();

        Telecomande t=new Telecomande();

        Command c=new CommandeAllumerLampe(lampe);
        t.setCommand(c);
        t.buttonExecuter();

        Command c1=new CommandeEteindreLampe(lampe);
        t.setCommand(c1);
        t.buttonExecuter();


    }
}
