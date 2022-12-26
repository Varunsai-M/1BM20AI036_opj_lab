import java.util.*;
enum move
{
 rock,
 paper,
 scissor
}
class game
{
 move m,c;
 game(move m)
 {
  this.m=m;
 }
void randomMove() {
    int pick = new Random().nextInt(move.values().length);
    c=move.values()[pick];
}

void display()
{ 
 randomMove();
 if(m==move.rock)
 {
  if(c==move.scissor)
  {
   System.out.println("You win");
   System.out.println("Your move:"+m+" computer move:"+c);
  }
  else
  {
   System.out.println("You lose");
   System.out.println("Your move:"+m+" computer move:"+c);
  }
 }
 else if(m==move.paper)
 {
  if(c==move.rock)
  {
   System.out.println("You win");
   System.out.println("Your move:"+m+" computer move:"+c);
  }
  else
  {
   System.out.println("You lose");
   System.out.println("Your move:"+m+" computer move:"+c);
  }
 }
 else
 {
  if(c==move.paper)
  {
   System.out.println("You win");
   System.out.println("Your move:"+m+" computer move:"+c);
  }
  else
  {
   System.out.println("You lose");
   System.out.println("Your move:"+m+" computer move:"+c);
  }
 }
}
}

class test_game
{
 public static void main(String args[])
 {
  game g=new game(move.rock);
  g.display();
 }
}