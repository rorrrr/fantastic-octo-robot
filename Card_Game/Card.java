package Card_Game;
import behaviours.*;
import java.util.*;
 
public class Card /*implements MakeHandable*/{
  private Suit suit;
  private Rank rank;
 
  public Card (Rank rank, Suit suit)
  {
    this.rank = rank;
    this.suit = suit;
  }
 
  public Suit getSuit()
  {
    return suit;
  }
 
  // public void setSuit(Suit suit)
  // {
  //   this.suit = suit;
  // }  should i be setting when i have made that forloop.
 
  public Rank getRank()
  {
    return rank;
  }
 
  // public void setRank(Rank rank)
  // {
  //   this.rank = rank;
  // }
}