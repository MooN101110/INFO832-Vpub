package fr.usmb.vpub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocktailTest {
    private Cocktail cocktail1;

    @BeforeEach
    protected void setUp() {
        cocktail1 = new Cocktail("Monaco");
    }

    @Test
    public void testPasIngredient() {
        Assertions.assertEquals(0, cocktail1.ingrediants.size());
    }

    @Test
    public void testIngredient() {
        cocktail1.add("Limonade", 2.5d);
        Assertions.assertEquals(1, cocktail1.ingrediants.size());
    }

    @Test
    public void testBoissonAlcoolisee() {
        cocktail1.add("Limonade", 2.5d);
        Assertions.assertFalse(cocktail1.alcoolFree());
    }

    @Test
    public void testPlusieursIngredients() {
        cocktail1.add("Limonade", 2.5d);
        cocktail1.add("Biere", 100d);
        Assertions.assertEquals(2, cocktail1.ingrediants.size());
    }
}