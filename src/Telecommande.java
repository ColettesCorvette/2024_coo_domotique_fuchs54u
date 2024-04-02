import java.util.ArrayList;

public class Telecommande {
    
    private ArrayList<Lampe> lampes;

    public Telecommande()
    {
        this.lampes= new ArrayList<>();
    }

    public void ajouterLampe(Lampe l)
    {
        this.lampes.add(l);
    }

    public void activerLampe(int indiceLampe)
    {
        throw new Error("code non écrit");
    }

    public void desactiverLampe(int indiceLampe)
    {
        throw new Error("code non écrit");
    }



}
