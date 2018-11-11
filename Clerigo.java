public class Clerigo extends Clase {
    private int Armadura;

    public Clerigo() {
        crearClase();
    }

    public void crearClase(){
        this.Armadura = 15;
    }
    public int ataque(int State, String race, String claz, int attackType, int armor, int vida, int mod, Double multiplier) {
    	Double a;
    	if (multiplier == 0)
    		return 0;
    	else {
    		System.out.println("Tirando un d6.");
    		int n = dados.d6() + mod;
    		System.out.println("Ha salido: " + n + "\n");
    		a=n*multiplier;
    		System.out.println("Golpe efectivo: " + a.intValue());
    		return a.intValue();
    	}
    }

    public double defender(int State, String race, String claz){
    	int valor;
      int pre;
    	Double retorno = 1.0;
    	if (State == 0) {
    		int n = dados.d20();
        pre = n;
    		System.out.println("El enemigo esta tirando un d20.");
    		if (race.equals("Elfo")) {
    			n += 2;
    		}
    		else if (race.equals("Humano")) {
    			while (n == 1) {
    				n = dados.d20();
    			}
    		}
    		System.out.println("Ha salido: " + n + "\n");
    		valor = n;
    	}
    	else {
    		int n = dados.d20();
    		int m = dados.d20();
        pre = (n > m) ?  n : m;
    		System.out.println("El enemigo esta tirando dos d20.");
    		if (race.equals("Elfo")) {
    			n += 2;
    			m += 2;
    		}
    		else if (race.equals("Humano")) {
    			while (n == 1) {
    				n = dados.d20();
    			}
    			while (m == 1) {
    				m = dados.d20();
    			}
    		}
    		System.out.println("Primer d20: " + n);
	    	System.out.println("Segundo d20: " + m + "\n");
	    	valor = (n > m) ?  n : m;
    	}
    	if (valor >= 13) {
    		if (pre >= 20) {
    			System.out.println("El enemigo evade el ataque!\n");
    			retorno = 0.0;
    		}
    		else {
    			System.out.println("El golpe contra el emenigo se reduce a la mitad.\n");
    			retorno = 0.5;
    		}
    	}
    	return retorno;
    }

    public int getArmadura() {
    	return this.Armadura;
    }
}
