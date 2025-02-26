package fr.usmb.vpub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CaveTest {
    private Cave cave;

    @BeforeEach
    void SetUp(){
        cave = new Cave();
    }

    @Test
    void testAjoutBoisson() {
        Boisson boisson = new Boisson("Badoit");
        cave.add(boisson);
        Assertions.assertTrue(cave.getRayons().contains(boisson),
                "La cave devrait contenir la boisson 'Badoit'");
    }

    @Test
    void testPrendreBoisson() {
        Boisson boisson = new Boisson("Badoit");
        cave.add(boisson);
        cave.take("Badoit");
        Assertions.assertFalse(cave.getRayons().contains(boisson),
                "La cave ne devrait pas contenir la boisson 'Badoit'");
    }

    @Test
    void testPrendreBoissonSiPasDansRayon() {
        Assertions.assertEquals(null,cave.take("Badoit"));
    }
}