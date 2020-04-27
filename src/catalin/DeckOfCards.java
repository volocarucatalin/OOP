package catalin;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private List<Card> cards;

    public DeckOfCards() {
        this.cards = generateCards();

    }

    private List<Card> generateCards() {
        List<Card> result = new ArrayList<>();
        for (int i = 2; i <= 14; i++) {
            Card cardHeart = new Card(i,"Heart");
            Card cardDiamond = new Card(i,"Diamond");
            Card cardClubs = new Card(i,"Clubs");
            Card cardSpade = new Card(i,"Spade");
            result.add(cardHeart);
            result.add(cardDiamond);
            result.add(cardClubs);
            result.add(cardSpade);

        }
        return result;
    }


    public List<Card> getCards() {
        return cards;
    }

}
