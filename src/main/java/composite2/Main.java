package composite2;

public class Main {

    public static void main(String[] args) {
        Directory d=new File("file1");
        Folder f=new Folder("folder1");
        f.addDirectory(new File("file2"));
        Folder f2=new Folder("folder2");
        f2.addDirectory(new File("file3"));
        Folder f3=new Folder("folder4");
        f2.addDirectory(f3);
        f3.addDirectory(new File("file5"));
        f.addDirectory(f2);

        f.getChemin(0);
    }
}
