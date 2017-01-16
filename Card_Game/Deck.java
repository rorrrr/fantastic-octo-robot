package Card_Game;
import behaviours.*;
import java.util.*;

public class Deck /*implements Dealable*/
{
  // String name; /* do i need to name a deck of cards */
public ArrayList setOfCards; /*doubt this should be "deck" */

  public Deck () 
  {

    // this.setOfCards = setOfCards;
    {
      this.setOfCards = new ArrayList();
      for (int i = 0; i < 13; i++)
        {
          Rank value = Rank.values()[i];

          for (int j=0; j < 4; j++)
          {
            Card card = new Card(value, Suit.values()[j]);
            this.setOfCards.add(card);
          }
          // AHHH why wont add work
      }
    }
      // Collections.shuffle(setOfCards) = this.setOfCards;
    // deck is unshuffled????
    
       // Iterator cardIterator = setOfCards.iterator();
       // while (cardIterator.hasNext())
       // {
       //   Card aCard = cardIterator.next();
       //   System.out.println(aCard.getCardValue() + " of " + aCard.getSuit());
       // }
  }

  public MakeHandable showNextCard(int index)
  {
    return setOfCards.get(index);
  }
  // might not be next

  public MakeHandable removeCard(int index)
  {
    return setOfCards.remove(index);
  }
}