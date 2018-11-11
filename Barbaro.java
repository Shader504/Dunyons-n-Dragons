public class Barbaro extends Clase {
    private int Armadura;

    public Barbaro() {
        crearClase();
    }

    public void crearClase() {
        this.Armadura = 15;
    }

    public int ataque(int State, String race, String claz, int attackType, int armor, int vida, int mod, Double multiplier) {
    	int chance;
    	int dmg = 0;
    	if (State == 0) {
    		int n = dados.d20();
    		System.out.println("Tirando un d20.");
    		if (race.equals("Orco")) {
    			n += 2;
    		}
    		else if (race.equals("Humano")) {
    			while (n == 1) {
    				n = dados.d20();
    			}
    		}
    		System.out.println("Ha salido: " + n);
    		chance = n;
    	}
    	else {
    		int n = dados.d20();
    		int m = dados.d20();
    		System.out.println("Tirando dos d20.");
    		if (race.equals("Orco")) {
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
	    	System.out.println("Segundo d20: " + m);
	    	chance = (n > m) ?  m : n;
    	}

    	if (chance >= armor) {
    		dmg = dados.d8() + mod;
    		if (chance >= 20) {
    			System.out.println("Ataque critico! El golpe se duplica");
    			System.out.println("Tirando d8.");
        		System.out.println("Ha salido: "+ dmg);
    			return dmg*2;
    		}
    		else {
	    		System.out.println("Ataque exitoso!");
	    		System.out.println("Tirando d8.");
	    		System.out.println("Ha salido: "+ dmg);
    		}
    	}
    	else
    		System.out.println("El ataque ha fallado.");
    	return dmg;
    }

    public double defender(int State, String race, String claz){
    	int valor;
    	Double retorno = 1.0;
    	if (State == 0) {
    		int n = dados.d20();
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
	    	valor = (n > m) ?  m : n;
    	}
    	if (valor >= 13) {
    		if (valor >= 20) {
    			System.out.println("El enemigo evade el ataque!\n");
    			retorno = 0.0;
    		}
    		else {
    			System.out.println("El golpe contra el enemigo se reduce a la mitad.");
    			retorno = 0.5;
    		}
    	}
    	return retorno;
    }

    public int getArmadura() {
    	return this.Armadura;
    }
}
