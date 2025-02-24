package fr.usmb.vpub;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BoissonTest {
    private String nom="Coca";
    private Float degree= 12.0F;

    protected void setUp(){
        Boisson boisson = new Boisson(nom);
    }

    @Test
    public void CreationBoissonNonAlcoolise(){
        Boisson boisson = new Boisson(nom);
        assertEquals(nom,boisson.toString());
    }

    @Test
    public void CreationBoissonAlcoolise(){
        Boisson boisson = new Boisson(nom,degree);
        assertEquals(nom+" (l'abus d'alcool est dangereux pour la sante)",boisson.toString());
    }

    @Test
    public void CreationBoisson0Degrees(){
        Boisson boisson = new Boisson(nom,0.0F);
        assertEquals(nom, boisson.toString());
    }

    @Test
    public void CreationBoissonAntiAlcoolise(){
        Throwable throwable =  assertThrows(Throwable.class, () -> {
            Boisson boisson = new Boisson(nom, -12.0F);
        });
        assertEquals(FileNotFoundException.class, throwable.getClass());


    }
}