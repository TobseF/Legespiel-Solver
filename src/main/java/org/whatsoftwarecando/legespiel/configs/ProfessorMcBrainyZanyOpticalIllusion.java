package org.whatsoftwarecando.legespiel.configs;

import org.whatsoftwarecando.legespiel.Card;
import org.whatsoftwarecando.legespiel.Field;
import org.whatsoftwarecando.legespiel.GameConfig;
import org.whatsoftwarecando.legespiel.IPicture;

import java.util.ArrayList;

import static org.whatsoftwarecando.legespiel.configs.ProfessorMcBrainyZanyOpticalIllusion.Picture.*;

/**
 * Configuration based on "Professor McBrainy`s Zany COSMOS optical illusion puzzle".
 * It's a field out of 4 x 4 cards with black/silver sparkling illusion patterns.
 * Check the <a href="https://github.com/TobseF/Legespiel-Solver/wiki/Legespiel-Solver">Wiki</a>
 * to find the patterns witch math th figures.
 */
public class ProfessorMcBrainyZanyOpticalIllusion extends GameConfig {


    @Override
    protected ArrayList<Card> createAvailableCards() {
        ArrayList<Card> availableCards = new ArrayList<>();
        availableCards.add(new Card(E, C, F, F));
        availableCards.add(new Card(E, F, E, C));
        availableCards.add(new Card(E, C, C, F)); //d
        availableCards.add(new Card(F, E, A, E));

        availableCards.add(new Card(F, G, B, E));
        availableCards.add(new Card(E, H, F, G));
        availableCards.add(new Card(C, C, A, H));
        availableCards.add(new Card(D, H, B, B));

        availableCards.add(new Card(B, E, F, G));
        availableCards.add(new Card(F, G, C, E));
        availableCards.add(new Card(A, D, G, G));
        availableCards.add(new Card(A, C, E, H));

        availableCards.add(new Card(F, E, H, C));
        availableCards.add(new Card(C, F, E, C)); // d
        availableCards.add(new Card(G, E, F, F));
        availableCards.add(new Card(E, C, E, F));

        return availableCards;
    }

    @Override
    protected Field createEmptyField() {
        return new Field(4, 4);
    }

    enum Picture implements IPicture {

        A, B, C, D, E, F, G, H;

        @Override
        public boolean matches(IPicture other) {
            if (other instanceof Picture) {
                return this.ordinal() == ((Picture) other).ordinal();
            } else {
                return false;
            }
        }
    }
}