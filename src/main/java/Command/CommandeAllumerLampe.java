package Command;

public class CommandeAllumerLampe implements Command {
    Lampe lampe;


    public CommandeAllumerLampe(Lampe l){
        this.lampe=l;
    }

    @Override
    public void executer() {
       lampe.allumer();
    }
}
