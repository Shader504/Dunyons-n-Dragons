public class Picaro extends Clase {
    private int Armadura;
    void crearClase(){
        this.Armadura = 10;
    }
    void ataque(){
      int n = dados.d20();
      if (n>Enemigo.getArmadura()){
        int pain = dados.d8();
        pain = pain + Jugador.getDestreza();
        Enemigo.getVida()= Enemigo.getVida() - pain;
      }
    }
    void defender(){

    }
}
