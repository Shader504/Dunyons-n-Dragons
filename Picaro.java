public class Picaro extends Clase {
    private int Armadura;
    void crearClase(){
        this.Armadura = 10;
    }
    void ataque(){
      int n = dados.d20();
      if (n>enemigo.Armadura){
        int pain = dados.d8();
        pain = pain + Jugador.getDestreza();
        enemigo.laif= enemigo.laif - pain;
      }
    }
    void defender(){

    }
}
