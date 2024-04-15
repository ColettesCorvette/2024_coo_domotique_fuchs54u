import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TestTelecommande{
    @Test
    /**
     * ajout d'une lampe à une télécommande vide
     */
    public void ajout_Tel_Vide()
    {
        Telecommande tel = new Telecommande();

        Lampe l = new Lampe("lampe");

        tel.ajouterAppareil(l);

        assertEquals(true,tel.contains(l));

    }
    @Test
    public void ajout_avec_un_element()
    {

        Telecommande tel = new Telecommande();

        Lampe[] l = {new Lampe("Luminere1"),new Lampe("Luminere2")};

        tel.ajouterAppareil(l[0]);
        tel.ajouterAppareil(l[1]);

        assertEquals(true,tel.contains(l[1]));

    }

    @Test
    public void activation_position_0()
    {

        Telecommande tel = new Telecommande();

        Lampe l = new Lampe("lampe");

        tel.ajouterAppareil(l);

        tel.activerAppareil(0);

        assertEquals(true,l.isAllume());

    }

    @Test
    public void activation_position_1()
    {

        Telecommande tel = new Telecommande();

        Lampe l = new Lampe("lampe");
        l.allumer();

        tel.ajouterAppareil(l);

        tel.activerAppareil(0);
        //tel.desactiverLampe(0);

        assertEquals(true,l.isAllume());


    }

    @Test
    public void activation_lampe_inexistante()
    {
        Telecommande tel = new Telecommande();

        Lampe l = new Lampe("lampe");

        try {
            tel.activerAppareil(0);
        } catch (IndexOutOfBoundsException e) {
            assertEquals(false,l.isAllume());
        }



    }

    @Test
    public void activer_tout()
    {
        Telecommande tel = new Telecommande();

        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        Hifi h = new Hifi();
        Hifi h2 = new Hifi();
        ChemineeIntermediaire c = new ChemineeIntermediaire(new Cheminee());
        ChemineeIntermediaire c2 = new ChemineeIntermediaire(new Cheminee());


        tel.ajouterAppareil(l1);
        tel.ajouterAppareil(l2);
        tel.ajouterAppareil(h);
        tel.ajouterAppareil(h2);
        tel.ajouterAppareil(c);
        tel.ajouterAppareil(c2);

        tel.activerTout();

        assertEquals(true,l1.isAllume());
        assertEquals(true,l2.isAllume());
        assertEquals(true,h.isAllume());
        assertEquals(true,h2.isAllume());
        assertEquals(true,c.isAllume());
        assertEquals(true,c2.isAllume());


    }


}

