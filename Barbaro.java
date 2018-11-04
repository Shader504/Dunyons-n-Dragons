public class Barbaro extends Clase {
    private int Armadura;
    void crearClase(){
        this.Armadura = 15;
    }
    public void ataque(){
        int n = dados.d20();
        int armad = Enemigo.getArmadura();
        if (n>armad){
            int pain = dados.d8();
            pain = pain + Jugador.getFuerza();//hay que definir la fuerza del jugador
            Enemigo.getVida()= Enemigo.getVida() - pain;
        }
    }
    void defender(){

    }
}
//okay

//ahi abri el archivo, empezemos por ahi?
