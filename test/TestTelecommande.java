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

        tel.ajouterLampe(l);

        assertEquals(true,tel.contains(l));

    }
    @Test
    public void ajout_avec_un_element()
    {

        Telecommande tel = new Telecommande();

        Lampe[] l = {new Lampe("Luminere1"),new Lampe("Luminere2")};

        tel.ajouterLampe(l[0]);
        tel.ajouterLampe(l[1]);

        assertEquals(true,tel.contains(l[1]));

    }

    @Test
    public void activation_position_0()
    {

        Telecommande tel = new Telecommande();

        Lampe l = new Lampe("lampe");

        tel.ajouterLampe(l);

        tel.activerLampe(0);

        assertEquals(true,l.isAllume());

    }

    @Test
    public void activation_position_1()
    {

        Telecommande tel = new Telecommande();

        Lampe l = new Lampe("lampe");
        l.allumer();

        tel.ajouterLampe(l);

        tel.activerLampe(0);
        //tel.desactiverLampe(0);

        assertEquals(true,l.isAllume());


    }

    @Test
    public void activation_lampe_inexistante()
    {
        Telecommande tel = new Telecommande();

        Lampe l = new Lampe("lampe");

        tel.activerLampe(0);

        assertEquals(false,l.isAllume());

    }


}

