public class Jugador implements Personaje {
    private String name;
    private String race;
    private String claz;
    private int life;

    public void asignarRaza(int opR) {
      if (opR == 1){
        Humano humano = new Humano(); //Imagine choosing Human //OMEGALUL
        this.race = "Humano";
      }
      else if (opR == 2){
        Elfo gnelf = new Elfo();
        this.race = "Elfo";
      }
      else if (opR == 3){
        Enano enano = new Enano();
        this.race = "Enano";
      }
      else if (opR == 4){
        Orco orco = new Orco(); //Lok-Tar Ogar
        this.race = "Orco";
      }
    }
    public void asignarClase(int opC) {
        if (opC ==  1) {
            Barbaro barbaro = new Barbaro();
            this.claz = "Barbaro";
        }
        else if (opC ==  2) {
            Picaro picaro = new Picaro();
            this.claz = "Picaro";
        }
        else if (opC ==  3) {
            Mago mago = new Mago();
            this.claz = "Mago";
        }
        else if (opC ==  4) {
            Clerigo clerigo = new Clerigo();
            this.claz = "Clerigo";
        }
    }
    public void asignarVida(int opcion) {
        if (opcion == 1){
          this.life = 11;
        }
        else if (opcion == 2){
          this.life = 11;
        }
        else if (opcion == 3){
          this.life = 12;
        }
        else if (opcion == 4){
          this.life = 11;
        }
    }
    public void asignarNombre(String nombre) {
      this.name = nombre;
    }
    public String getNombre() {
        return name;
    }
    public String getRaza() {
        return race;
    }
    public String getClase() {
        return claz;
    }
    public int getVida() {
        return life;
    }
}
