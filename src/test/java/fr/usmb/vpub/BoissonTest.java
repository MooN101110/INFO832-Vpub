package fr.usmb.vpub;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BoissonTest {
    private String nom="Coca";
    private Float degree= 12.0F;

    @Test
    void CreationBoissonNonAlcoolise(){
        Boisson boisson = new Boisson(nom);
        assertEquals(nom,boisson.toString());
    }

    @Test
    void CreationBoissonAlcoolise(){
        Boisson boisson = new Boisson(nom,degree);
        assertEquals(nom+" (l'abus d'alcool est dangereux pour la sante)",boisson.toString());
    }

    @Test
    void CreationBoisson0Degrees(){
        Boisson boisson = new Boisson(nom,0.0F);
        assertEquals(nom, boisson.toString());
    }

    @Test
    void CreationBoissonAntiAlcoolise(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Boisson boisson = new Boisson("Vin", -12.0F);
        });

        assertEquals("Le degré d'alcool ne peut pas être négatif.", exception.getMessage());
    }
}