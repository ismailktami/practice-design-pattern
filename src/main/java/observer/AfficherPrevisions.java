package observer;

public class AfficherPrevisions implements Observer {
    private float pression=0;

    @Override
    public void update(float t, float h, float p) {
        System.err.println("--------------Aff Previsions----------------");

        if(  p-pression >0 )
            System.out.println("Amelioration en cours ");
        else if(p-pression<0)
            System.out.println("Le temps se en raffraichit ");
        else
            System.out.println("Dépression bien installée");

      pression=p;
        System.out.println("--------------------------------------------\n");

    }

}
