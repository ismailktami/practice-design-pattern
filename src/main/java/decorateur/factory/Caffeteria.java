package decorateur.factory;

import decorateur.composant.Boisson;

public  abstract class Caffeteria {
    public abstract Boisson createBoisson(String type, String ...options);
}
