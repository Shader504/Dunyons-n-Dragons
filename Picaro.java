public class Picaro extends Clase {
    private int Armadura;

    public Picaro() {
        crearClase();
    }

    public void crearClase(){
        this.Armadura = 10;
    }

    public void ataque(){
        int n = dados.d20();
        if (n>Enemigo.getArmadura()){
            int pain = dados.d8();
            pain = pain + Jugador.getDestreza();
            Enemigo.getVida()= Enemigo.getVida() - pain;
        }
    }

    public void defender(){

    }

    public int getArmadura() {
    	return this.Armadura;
    }
}
