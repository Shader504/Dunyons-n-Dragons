public class Picaro extends Clase {
    private int Armadura;

    public Picaro() {
        crearClase();
    }

    public void crearClase() {
        this.Armadura = 10;
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
        if (n>Enemigo.getArmadura()) {
            int pain = dados.d8();
            pain = pain + Jugador.getDestreza();
            Enemigo.getVida()= Enemigo.getVida() - pain;
        }*/
    }

    public int defender(int tipo) {
    	int n = dados.d20();
    	int m = dados.d20();
    	if (tipo == 1) {//el enemigo es fisico
	    	return 0;
    	}
    	else {//el enemigo es magico
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
