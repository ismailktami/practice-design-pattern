package decorateur.composant;

public class SumartaFes extends Boisson {
    public SumartaFes(){
        description="delicieux samarta";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }


    @Override
    public double cout() {
        return 12;
    }
}
