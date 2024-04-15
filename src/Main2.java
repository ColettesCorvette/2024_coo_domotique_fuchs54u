
public class Main2
{

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe");
		Hifi h1=new Hifi();
		ChemineeIntermediaire c1=new ChemineeIntermediaire(new Cheminee());

		t.ajouterAppareil(l1);
		t.ajouterAppareil(h1);
		t.ajouterAppareil(c1);

		TelecommandeGraphique tg=new TelecommandeGraphique(t);

	}
	
}
