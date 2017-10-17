package Jeu;

public class HerosFeu extends Heros{
  private double taille;
  private double puissanceFeu;

  public HerosFeu(){
    taille=0;
    puissanceFeu=0;
  }

  public HerosFeu(String nom, double pdv, double taille, double puissanceFeu){
    super(nom,pdv);
    this.taille=taille;
    this.puissanceFeu=puissanceFeu;
  }

  public double calculPuissance(){
    return (taille/100)*puissanceFeu;
  }

  public String toString(){
    return nom+" :"+pointsVie+" pdv, mesure: "+taille+"cm, puissance de feu: "+puissanceFeu;
  }

  public void combat(Heros herosDefense){
    double puissAtt=this.calculPuissance();
    double puissDef=herosDefense.calculPuissance();
    if (this.pointsVie>=20){
      if (puissAtt>puissDef){
        herosDefense.perdPoints(60);
      }else if (puissAtt==puissDef){
        herosDefense.perdPoints(20);
      }else{
        System.out.println("La puissance de defenseur est supérieur");}
    }else{
      System.out.println("Lattaque ne peut pas avoir lieux");}

    this.etat();
    herosDefense.etat();
  }
}
