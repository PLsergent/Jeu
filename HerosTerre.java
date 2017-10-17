package Jeu;

public class HerosTerre extends Heros{
  private double poids;
  private double agilite;

  public HerosTerre(){
    poids=0;
    agilite=0;
  }

  public HerosTerre(String nom, double pdv, double poids, double agilite){
    super(nom,pdv);
    this.poids=poids;
    this.agilite=agilite;
  }

  public double calculPuissance(){
    return (poids/20)*(agilite);
  }

  public String toString(){
    return nom+" :"+pointsVie+" pdv, poids: "+poids+"kg, agilite: "+agilite;
  }

  public void combat(Heros herosDefense){
    double puissAtt=this.calculPuissance();
    double puissDef=herosDefense.calculPuissance();
    if (puissAtt>puissDef){
      herosDefense.perdPoints(40);
    }else if (puissDef>puissAtt){
        this.perdPoints(15);
    }else{
      System.out.println("Puissances égales");}

    this.etat();
    herosDefense.etat();
  }
}
