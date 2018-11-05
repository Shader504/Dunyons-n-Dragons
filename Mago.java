public class Mago extends Clase {
    private int Armadura;

    public Mago() {
        crearClase();
    }

    public void crearClase() {
        this.Armadura = 10;
    }

    public int ataque() {

    }

    public int defender(int mode) {
    	int n = dados.d20();
    	int m = dados.d20();
    	if (tipo == 1) {
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
