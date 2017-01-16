package Card_Game;
import behaviours.*;
import java.util.*;

public class Game {
  private String name;
  MakeRulesable rules;

  public Game(){
    this.name = name;
  }

  public void setRules(MakeRulesable rules) {
    this.rules = rules;
  }

  public MakeRulesable hasRules(){
    return this.rules;
  }

}