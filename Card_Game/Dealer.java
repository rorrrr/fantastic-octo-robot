package Card_Game;
import behaviours.*;
import java.util.*;

public abstract class Dealer implements CanDealable {
  ArrayList<DrawToAble> players;
  Dealable deck;


  public Dealer(){
    this.players = new ArrayList<DrawToAble>();
    this.deck = deck;
  }

  // public void setDeck(DrawToAble deck){
  //   this.deck = deck;
  // }
  // why am i doing this didnt i just do it?

  public void addPlayer(DrawToAble player){
    players.add(player);
  }

  public int countPlayers(){
    return players.size();
  }

  public DrawToAble getPlayer(int index){
    return players.get(index);
  } 
  // returning a specific player

  public ArrayList<DrawToAble> getPlayers(int index){
    return this.players;
  }

  // need to find a way to take a card from the deck, then turn deck from DEALABLE to the current. then continue?
  public MakeHandable drawACardToDealer(){
    Deck drawnDeck = (Deck) deck;
    return drawnDeck.removeCard(0);
  }

  public void dealCardToPlayer(DrawToAble player){
    MakeHandable cardToDraw = deck.removeCard(0);
    player.drawCard(cardToDraw);
  }


  public void dealStartOfHand(int number){
    for(int i = 0; i < number; i++){
      for (DrawToAble player : players){
        dealCardToPlayer(player);
      }
    }
  }



}

