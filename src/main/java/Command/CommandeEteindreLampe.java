package Command;

public class CommandeEteindreLampe implements  Command {
    Lampe lampe;
    public CommandeEteindreLampe(Lampe l){
        this.lampe=l;
    }

    @Override
    public void executer() {
        lampe.eteindre();
    }
}
