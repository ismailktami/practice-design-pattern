package decorateur.entities.factory;

import decorateur.entities.composant.Boisson;

public  abstract class Caffeteria {
    public abstract Boisson createBoisson(String type, String ...options);
}
