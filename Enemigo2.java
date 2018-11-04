import java.util.Random;

public class Enemigo implements Personaje {
    private int Armadura;
    private String race;
    private String claz;
    private int laif;
    private String Nombre;
    public Enemigo() {
        int option = dados.d6();
        if (option == 1){
            asignarNombre("Klrak");
        }
        if (option == 2){
            asignarNombre("Adran");
        }
        if (option == 3){
            asignarNombre("Isaac");
        }
        if (option == 4){
            asignarNombre("Elysium");
        }
        if (option == 5){
            asignarNombre("Krrogh");
        }
        if (option == 6){
            asignarNombre("Jenkins");
        }
        asignarRaza(option);
        asignarClase(option);
        asignarVida(option);
        asignarArmadura();
    }
    public void asignarRaza(int opR){
        if (opR == 2 || opR == 4){
            Elfo elf = new Elfo();
            this.race = "Elfo";
        }
        else if (opR == 3 || opR == 6){
            Humano human = new Humano();
            this.race = "Humano";
        }
        else if (opR == 1){
            Enano dwarf = new Enano();
            this.race = "Enano";
        }
        else if (opR == 5){
            Orco orc = new Orco();
            this.race = "Orco";
        }
    }
    public void asignarClase(int opC){
        if (opC == 1 || opC == 5) {
            Barbaro barbaro = new Barbaro();
            this.claz = "Barbaro";
        }
        else if (opC == 2) {
            Picaro picaro = new Picaro();
            this.claz = "Picaro";
        }
        else if (opC == 4 || opC == 6) {
            Mago mago = new Mago();
            this.claz = "Mago";
        }
        else if (opC == 3) {
            Clerigo clerigo = new Clerigo();
            this.claz = "Clerigo";
        }
    }
    public void asignarVida(int op){
        if (op == 1){
            this.laif = 10;
        }
        else {
            this.laif = 9;
        }
    }
    public void asignarNombre(String Nombre){
        this.nombre = Nombre;
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
