public class Barbaro extends Clase {
    private int Armadura;
    void crearClase(){
        this.Armadura = 15;
    }
    void ataque(){
      int n = dados.d20();
      if (n>enemigo.Armadura){
        int pain = dados.d8();
        pain = pain + Jugador.getFuerza();//hay que definir la fuerza del jugador
        enemigo.laif= enemigo.laif - pain;
      }
    }
    void defender(){

    }
}
//okay

//ahi abri el archivo, empezemos por ahi?
