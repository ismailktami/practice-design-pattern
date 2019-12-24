package composite2;

public class File extends Directory {

    public File(String c){
        this.name=c;
    }

    @Override
    public void getChemin(int niveau) {
        for (int i=0;i<niveau;i++){
            System.out.print("\t");
        }
        System.out.println(name);    }
}
