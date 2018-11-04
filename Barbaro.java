public class Barbaro extends Clase {
    private int Armadura;

    public Barbaro() {
        crearClase();
    }

    public void crearClase() {
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

    public void defender(){

    }

    public int getArmadura() {
    	return this.Armadura;
    }
}
