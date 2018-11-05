public class Barbaro extends Clase {
    private int Armadura;

    public Barbaro() {
        crearClase();
    }

    public void crearClase() {
        this.Armadura = 15;
    }

    public int ataque(int mode) {
    	int n = dados.d20();
    	int m = dados.d20();
    	if (mode == 0) {
    		return n;
    	}
    	else {
    		System.out.println("Primer dado: " + n);
	    	System.out.println("Segundo dado: " + m);
	    	return (n>m)? m : n;
    	}
        /*int n = dados.d20();
        int armad = Enemigo.getArmadura();
        if (n>armad){
            int pain = dados.d8();
            pain = pain + Jugador.getFuerza();
            Enemigo.getVida()= Enemigo.getVida() - pain;
        }*/
    }

    public int defender(int tipo) {//esta parte esta mal, ye i know
    	int n = dados.d20();
    	int m = dados.d20();
    	if (tipo == 1) {//el enemigo ataca fisicamente
	    	System.out.println("Tirando dados:");
	    	System.out.println("Ha salido: " + n);
	    	System.out.println("Ha salido: " + m);
	    	return (n>m)? m : n;
    	}
    	else {//el enemigo ataca magicamente
    		System.out.println("Tirando dados:");
	    	System.out.println("Ha salido: " + n);
	    	System.out.println("Ha salido: " + m);
	    	return (n>m)? n : m;
    	}
    }

    public int getArmadura() {
    	return this.Armadura;
    }
}
