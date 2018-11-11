public class Barbaro extends Clase {
    private int Armadura;

    public Barbaro() {
        crearClase();
    }

    //void crearClase:
    //recibe: nada
    //retorna: nada
    //Asigna la armadura de la clase del personaje
    public void crearClase() {
        this.Armadura = 15;
    }

    //int ataque
    //recibe:   int State, el estado en que se encuentra el contrincante(ataque o defensa)
    //          String race, el nombre de la raza del personaje
    //          int armor, la armadura del contrincante
    //          int mod, el modificador de ataque, depende de que atributo usa el personaje para atacar(Fuerza, Destreza, o Constitucion)
    //          Double multiplier, el multiplicador de ataque(solo es usado para ataques magicos, y tiene el valor de 1, 0.5, o 0)
    //          int vida, la vida actual del contrincante.
    //			Raza ra, la raza del personaje
    //retorna: la nueva vida del contrincante
    //Esta funcion se encarga de verificar cuanto golpea el personaje al contrincante
    public int ataque(int State, String race, int armor, int mod, Double multiplier, int vida, Raza ra) {
    	int chance;
        boolean isCrit = false;
    	int dmg = 0;
    	if (State == 0) {
    		int n = dados.d20();

    		System.out.println("Tirando un d20.");

    		if (race.equals("Humano")) {
    			while (n == 1) {
    				n = ra.habilidad();
    			}
    		}

    		if (n == 20)
            	isCrit = true;

    		if (race.equals("Orco")) {
    			n += ra.habilidad();
    		}
    		System.out.println("Ha salido: " + n);
    		chance = n;
    	}
    	else {
    		int n = dados.d20();
    		int m = dados.d20();
    		System.out.println("Tirando dos d20.");

    		if (race.equals("Humano")) {
    			while (n == 1) {
    				n = ra.habilidad();
    			}
    			while (m == 1) {
    				m = ra.habilidad();
    			}
    		}
    		if (n == 20 && m == 20)
    			isCrit = true;
    		if (race.equals("Orco")) {
    			n += ra.habilidad();
    			m += ra.habilidad();
    		}
    		System.out.println("Primer d20: " + n);
	    	System.out.println("Segundo d20: " + m);
	    	chance = (n > m) ?  m : n;
    	}

    	if (chance >= armor) {
    		dmg = dados.d8() + mod;
    		if (isCrit) {
    			System.out.println("Ataque critico! El golpe se duplica");
    			System.out.println("Tirando d8.");
        		System.out.println("Ha salido: " + dmg);
    			return vida - dmg*2;
    		}
    		else {
	    		System.out.println("Ataque exitoso!");
	    		System.out.println("Tirando d8.");
	    		System.out.println("Ha salido: "+ dmg);
    		}
    	}
    	else
    		System.out.println("El ataque ha fallado.");
    	return vida - dmg;
    }

    //double defender:
    //recibe:	int State, el estado del contrincante
    //			String race, la raza del personaje
    //			Raza ra, la raza del personaje
    //retorna: el multiplicador del golpe que recibira el personaje
    //Esta funcion determina cual es el multiplicador del ataque del enemigo, ya sea 1.0, 0.5, o 0.0
    public double defender(int State, String race, Raza ra){
        int valor;
        boolean isEvadido = false;
    	Double retorno = 1.0;
    	if (State == 0) {
    		int n = dados.d20();
    		System.out.println("Tirando un d20.");

    		if (race.equals("Humano")) {
    			while (n == 1) {
    				n = ra.habilidad();
    			}
    		}

    		if (n == 20) {
    			isEvadido = true;
    		}

    		if (race.equals("Elfo")) {
    			n += ra.habilidad();
    		}
    		System.out.println("Ha salido: " + n + "\n");
    		valor = n;
    	}
    	else {
    		int n = dados.d20();
    		int m = dados.d20();
    		System.out.println("Tirando dos d20.");

    		if (race.equals("Humano")) {
    			while (n == 1) {
    				n = ra.habilidad();
    			}
    			while (m == 1) {
    				m = ra.habilidad();
    			}
    		}

    		if (n == 20 || m == 20)
    			isEvadido = true;

    		if (race.equals("Elfo")) {
    			n += ra.habilidad();
    			m += ra.habilidad();
    		}
    		System.out.println("Primer d20: " + n);
	    	System.out.println("Segundo d20: " + m + "\n");
	    	valor = (n > m) ?  n : m;
    	}
    	if (valor >= 13) {
    		if (isEvadido) {
    			System.out.println("El ataque fue evadido!\n");
    			retorno = 0.0;
    		}
    		else {
    			System.out.println("El golpe se reduce a la mitad.\n");
    			retorno = 0.5;
    		}
    	}
    	return retorno;
    }

    //GETTERS
    public int getArmadura() {
    	return this.Armadura;
    }
}
