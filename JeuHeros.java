package Jeu;

public class JeuHeros{
  public static void main(String[] args) {
    HerosTerre bruno = new HerosTerre("bruno",100,30,25);
    HerosO david = new HerosO("david",150,15,30);
    HerosFeu matt= new HerosFeu("Matthieu",200,105,10);

    bruno.combat(matt);
    System.out.println("=========");
    bruno.combat(matt);
    System.out.println("=========");
    bruno.combat(matt);
    System.out.println("=========");
    bruno.combat(matt);
    System.out.println("=========");
    bruno.combat(matt);
    System.out.println("=========");
    bruno.combat(matt);

  }
}
