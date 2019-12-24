package composite2;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Directory {

    List<Directory> directories;

    public Folder(String name){
        this.name=name;
        this.directories= new ArrayList<>();
    }

    public void addDirectory(Directory d){
        this.directories.add(d);
    }




    @Override
    public void getChemin(int  niveau) {
        for (int i=0;i<niveau;i++){
            System.out.print("\t");
        }
        System.out.println(name);
        niveau++;
        for (Directory d :directories){
            d.getChemin(niveau);
        }
    }
}
