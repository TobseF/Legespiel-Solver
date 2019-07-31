package org.whatsoftwarecando.legespiel.configs;

import org.whatsoftwarecando.legespiel.Card;
import org.whatsoftwarecando.legespiel.Field;
import org.whatsoftwarecando.legespiel.GameConfig;
import org.whatsoftwarecando.legespiel.IPicture;

import java.util.ArrayList;

import static org.whatsoftwarecando.legespiel.configs.PatternConfig.Picture.*;

/**
 * Configuration based on 4x4 puzzle with sparkling illusion patterns.
 */
public class PatternConfig extends GameConfig {


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

    @Override
    protected ArrayList<Card> createAvailableCards() {
        ArrayList<Card> availableCards = new ArrayList<>();
        availableCards.add(new Card(E, F ,C, F));
        availableCards.add(new Card(E, C ,F, E));
        availableCards.add(new Card(E, F ,C, C));
        availableCards.add(new Card(F, E ,E, A));

        availableCards.add(new Card(F, E ,G, B));
        availableCards.add(new Card(E, G ,H, F));
        availableCards.add(new Card(C, H ,C, A));
        availableCards.add(new Card(D, B ,H, B));

        availableCards.add(new Card(B, G ,E, F));
        availableCards.add(new Card(F, E ,G, C));
        availableCards.add(new Card(A, G ,D, G));
        availableCards.add(new Card(A, H ,C, E));

        availableCards.add(new Card(F, C ,E, H));
        availableCards.add(new Card(C, C ,F, E));
        availableCards.add(new Card(G, F ,E, F));
        availableCards.add(new Card(E, F ,C, E));

        return availableCards;
    }

    @Override
    protected Field createEmptyField() {
        return new Field(4, 4);
    }
}
