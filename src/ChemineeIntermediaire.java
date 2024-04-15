public class ChemineeIntermediaire implements Appareil
{

    private Cheminee che;

    public ChemineeIntermediaire(Cheminee c)
    {
        this.che=c;
    }

    @Override
    public void allumer()
    {
        this.che.changerIntensite(100);
    }

    @Override
    public void eteindre()
    {
        this.che.changerIntensite(0);
    }


    public String toString()
    {
        return che.toString();
    }


    public boolean isAllume()
    {
        return this.che.getLumiere()>0;
    }

}
