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
        if (this.Nombre == "Adran" || this.Nombre == "Elysium"){
          this.race = "Elfo";
        }
        else if (this.Nombre == "Isaac" || this.Nombre == "Jenkins"){
          this.race = "Humano";
        }
        else if (this.Nombre == "Klrak"){
          this.race = "Enano";
        }
        else if (this.Nombre == "Jenkins"){
          this.race = "Orco";
        }
    }
    public void asignarClase(int opC){
        if (this.Nombre == "Klrak" || this.Nombre == "Krrogh") {
            Barbaro barbaro = new Barbaro();
            this.claz = "Barbaro";
        }
        else if (this.Nombre == "Adran") {
            Picaro picaro = new Picaro();
            this.claz = "Picaro";
        }
        else if (this.Nombre == "Elysium" || this.Nombre == "Jenkins") {
            Mago mago = new Mago();
            this.claz = "Mago";
        }
        else if (this.Nombre == "Isaac") {
            Clerigo clerigo = new Clerigo();
            this.claz = "Clerigo";
        }
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
    public void asignarArmadura(){
        if (this.claz == "Barbaro" || this.claz == "Clerigo"){
          this.Armadura = 15;
        }
        else if (this.claz == "Picaro" || this.claz == "Mago"){
          this.Armadura = 10;
        }
    }
    public String getNombre() {
        return Nombre;
    }
    public String getRaza() {
        return race;
    }
    public String getClase() {
        return claz;
    }
    public int getVida() {
        return laif;
    }
    public int getArmadura(){
        return Armadura;
    }

}
