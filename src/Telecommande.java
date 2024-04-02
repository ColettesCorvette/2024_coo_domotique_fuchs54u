import java.util.ArrayList;

public class Telecommande {
    
    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi> chaines;

    public Telecommande()
    {
        this.lampes= new ArrayList<>();
        this.chaines=new ArrayList<>();
    }

    public void ajouterLampe(Lampe l)
    {
        this.lampes.add(l);
    }

    public void activerLampe(int indiceLampe)
    {
        if(!lampes.isEmpty())
            lampes.get(indiceLampe).allumer();
        else
            return;
    }

    public void desactiverLampe(int indiceLampe)
    {
        if(!lampes.isEmpty())
            lampes.get(indiceLampe).eteindre();
        else
            return;
    }

    public void activerTout()
    {
        for(Lampe l : lampes) {
            if (!lampes.isEmpty())
                l.allumer();
        }
    }

    public boolean contains(Lampe l)
    {
        return lampes.contains(l);
    }

    @Override
    public String toString() {
        return "Telecommande{" +
                "lampes=" + lampes +
                "hifi=" + chaines +
                '}';
    }

    public void ajoutChaine(Hifi hf)
    {
        chaines.add(hf);
    }

    public void modulerSon(int indice)
    {
        if(!chaines.isEmpty())
            chaines.get(indice).allumer();
        else
            return;
    }

    public void arretChaine(int indice)
    {
        if(!chaines.isEmpty())
            chaines.get(indice).eteindre();
        else
            return;

    }

}
