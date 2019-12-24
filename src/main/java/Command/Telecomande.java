package Command;

public class Telecomande {
    Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonExecuter(){
        command.executer();
    }

}
