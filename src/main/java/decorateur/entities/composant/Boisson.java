package decorateur.entities.composant;

public abstract class Boisson {
    String description;
    public abstract double cout();

    public String getDescription() {
        return description;
    }
}
