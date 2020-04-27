package catalin;

import java.util.List;

public class Card {
    private int rank;
    private String suit;

    //Explicit Constructor
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //Default Constructor
    public Card() {
    }


    @Override
    public String toString() {
        return "Rank = " + displayRank(rank) + " " + suit + "\n";
    }

    private String displayRank(int rank) {
        if (rank >= 2 && rank <= 10) {
            return String.valueOf(rank);
        }
        if (rank == 11) {
            return "J";
        }
        if (rank == 12) {
            return "Q";

        }
        if (rank == 13) {
            return "K";
        }

        return "A";
    }
}
