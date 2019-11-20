package adapter_head_first;

public class AdapterDindion implements Canard {


    Dindon d ;
    public AdapterDindion(Dindon d){
     this.d=d;
    }

    @Override
    public void cancaner() {
        d.glouglouter();
    }

    @Override
    public void voler() {

        for(int i=0;i<5;i++)
            d.voler();
    }
}
