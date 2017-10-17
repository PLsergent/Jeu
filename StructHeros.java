package Jeu;

interface StructHeros{
  public String toString();
  public String getNom();
  public void etat();
  public double calculPuissance();
  public void combat(Heros herosDefense);
  public void perdPoints(double nbPointsPerdus);

}
