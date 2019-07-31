package org.whatsoftwarecando.legespiel.configs;

import org.whatsoftwarecando.legespiel.Card;
import org.whatsoftwarecando.legespiel.Field;
import org.whatsoftwarecando.legespiel.GameConfig;
import org.whatsoftwarecando.legespiel.IPicture;

import java.util.ArrayList;

import static org.whatsoftwarecando.legespiel.configs.SampleOneSolutionConfig.Picture.A;
import static org.whatsoftwarecando.legespiel.configs.SampleOneSolutionConfig.Picture.B;
import static org.whatsoftwarecando.legespiel.configs.SampleOneSolutionConfig.Picture.C;
import static org.whatsoftwarecando.legespiel.configs.SampleOneSolutionConfig.Picture.D;
import static org.whatsoftwarecando.legespiel.configs.SampleOneSolutionConfig.Picture.E;
import static org.whatsoftwarecando.legespiel.configs.SampleOneSolutionConfig.Picture.F;
import static org.whatsoftwarecando.legespiel.configs.SampleOneSolutionConfig.Picture.G;
import static org.whatsoftwarecando.legespiel.configs.SampleOneSolutionConfig.Picture.H;

/**
 * Configuration based on sample 4 x 4 game with exact one solution.
 */
public class SampleOneSolutionConfig extends GameConfig {


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

        availableCards.add(new Card(H, C, A, D ));
        availableCards.add(new Card(B, A, D, C ));
        availableCards.add(new Card(G, D, B, E ));
        availableCards.add(new Card(A, B, D, F ));

        availableCards.add(new Card(D, H, G, C ));
        availableCards.add(new Card(C, G, F, B ));
        availableCards.add(new Card(E, F, H, A ));
        availableCards.add(new Card(F, H, A, G ));

        availableCards.add(new Card(C, H, A, E ));
        availableCards.add(new Card(B, A, E, F ));
        availableCards.add(new Card(A, E, C, H ));
        availableCards.add(new Card(G, C, B, E ));

        availableCards.add(new Card(E, G, D, F ));
        availableCards.add(new Card(F, D, A, H ));
        availableCards.add(new Card(H, A, B, F ));
        availableCards.add(new Card(E, B, G, D ));

        return availableCards;
    }

    @Override
    protected Field createEmptyField() {
        return new Field(4, 4);
    }
}
