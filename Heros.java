package Jeu;

public abstract class Heros{
  protected String nom;
  protected double pointsVie;

  public Heros(){
    nom="";
    pointsVie=0;
  }

  public Heros(String nm, double pdv){
    nom=nm;
    pointsVie=pdv;
  }

  public String getNom(){
    return nom;
  }

  public void etat(){
    if (pointsVie>0){
       System.out.println("L'heros "+this.nom+" possède "+pointsVie+" pdv.");
    }else if (pointsVie<=0){
       System.out.println("El heroe esta muerto");}
  }

  public void perdPoints(double nbPointsPerdus){
    pointsVie=pointsVie-nbPointsPerdus;
    System.out.println("El heroe a perdu "+nbPointsPerdus+" points de vie");
    System.out.println("Il reste "+pointsVie+" au héros.");
  }

  public abstract double calculPuissance();
  public abstract void combat(Heros herosDefense);

}
