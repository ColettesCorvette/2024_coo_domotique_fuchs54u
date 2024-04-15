import java.util.ArrayList;

public class Telecommande
{
    
    private ArrayList<Appareil> appareils;


    public Telecommande()
    {
       this.appareils = new ArrayList<>();
    }

    public void ajouterAppareil(Object o)
    {
       this.appareils.add((Appareil)o);
    }

    public void activerAppareil(int indice)
    {
        this.appareils.get(indice).allumer();
    }

    public void desactiverAppareil(int indice)
    {
        this.appareils.get(indice).eteindre();
    }

    public void activerTout()
    {
        for(Appareil a : this.appareils)
            a.allumer();
    }

    public boolean contains(Lampe l)
    {
        return appareils.contains(l);
    }

    public String toString()
    {
        String res="Telecommande{";

        for(Appareil a : appareils)
        {
            res+=a.toString()+", ";
        }
        return res+'}';
    }

    public int getNombre()
    {
        return appareils.size();
    }
}
