public class Clerigo extends Clase {
    private int Armadura;

    public Clerigo() {
        crearClase();
    }

    public void crearClase() {
        this.Armadura = 15;
    }
    public void ataque(int mode) {

    }

    public int defender(int tipo) {//esta parte esta mal, ye i know
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
