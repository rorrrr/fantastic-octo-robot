package Card_Game;
import behaviours.*;
import java.util.*;

public class Player implements DrawToAble {

  String name;
  MakeHandable hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<MakeHandable>();
  }

  public String getName(){
    return this.name;
  }

  public void drawCard(MakeHandable card) {
    hand.add(card);
  }

  public int getSumOfHand(){
    int i = 0;
    for (MakeHandable card : hand){
      i += card.getRank();
    }
    return i;
  }

}