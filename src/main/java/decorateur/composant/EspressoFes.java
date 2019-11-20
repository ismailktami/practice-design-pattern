package decorateur.composant;

public class EspressoFes extends Boisson {
    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cout() {
        return 11;
    }

    public EspressoFes(){
        description="delicieux espresso";

    }
}
