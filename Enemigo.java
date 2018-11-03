import java.util.Random;

public class Enemigo implements Personaje {
  private int Armadura;
  private String race;
  private String claz;
  private int laif;
  private String Nombre;
  public void enemigoNombre(){
    int p = dados.d6();
    if (p == 1){
      this.Nombre = "Klrak";
    }
    if (p == 2){
      this.Nombre = "Adran";
    }
    if (p == 3){
      this.Nombre = "Isaac";//even in here Isaac is a character but not in smash LuL
    }
    if (p == 4){
      this.Nombre = "Elysium";
    }
    if (p == 5){
      this.Nombre = "Krrogh";
    }
    if (p == 6){
      this.Nombre = "Jenkins";
    }
  }
  public void asignarRaza(int opR){

  }
  public void asignarClase(int opC){

  }
  public void asignarVida(int Constitucion){
    if (this.Nombre == "Adran" || this.Nombre == "Elysium"){
      this.laif = 9;
    }
    else if (this.Nombre == "Isaac" || this.Nombre == "Jenkins"){
      this.laif = 9;
    }
    else if (this.Nombre == "Klrak"){
      this.laif = 10;
    }
    else if (this.Nombre == "Jenkins"){
      this.laif = 9;
    }
  }
  public void asignarNombre(String Nombre){
      enemigoNombre();
  }

}

//cya hopefully l8r

//
