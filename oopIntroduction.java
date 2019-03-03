/**
 * oopIntroduction
 */
public class oopIntroduction {

  public static void main(String[] args) {
    
    Monitor abc = new Monitor();
    abc.szerokość = 125;
    abc.wysokość = 20;
    abc.nazwa = "Samsung";

    abc.wyswietlDane();
    abc.wlacz();
    abc.wyswietlDane();
  }
  
}

class Monitor{

  String nazwa;
  int szerokość;
  int wysokość;
  boolean czyWlaczony= false;

  void wlacz(){
    czyWlaczony = true;
  }
  void wylacz()
  {
    czyWlaczony = false;
  }
  void wyswietlDane()
  {
    String czyWlaczony2 = czyWlaczony ? "Włączony" : "Wyłączony";
    System.out.println(nazwa+" "+ szerokość+" "+ wysokość+" "+ czyWlaczony2);
  }
}