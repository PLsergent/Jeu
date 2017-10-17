package Jeu;

public class HerosO extends Heros{
  private double nbNageoire;
  private double vitesse;

  public HerosO(){
    nbNageoire=0;
    vitesse=0;
  }

  public HerosO(String nom, double pdv, double nbNageoire, double vitesse){
    super(nom,pdv);
    this.nbNageoire=nbNageoire;
    this.vitesse=vitesse;
  }

  public double calculPuissance(){
    return nbNageoire*vitesse;
  }

  public String toString(){
    return nom+" :"+pointsVie+" pdv, possède: "+nbNageoire+" nageoires, vitesse: "+vitesse+"km/h";
  }

  public void combat(Heros herosDefense){
    double puissAtt=this.calculPuissance();
    double puissDef=herosDefense.calculPuissance();
    if (puissAtt>puissDef){
      herosDefense.perdPoints(50);
    }else if ((puissAtt==puissDef) && (this.pointsVie>=50)){
      herosDefense.perdPoints(25);
    }else if ((puissDef>puissAtt) && (this.pointsVie>=50)){
      herosDefense.perdPoints(15);
    }else{
      this.perdPoints(10);}

    this.etat();
    herosDefense.etat();
  }
}
