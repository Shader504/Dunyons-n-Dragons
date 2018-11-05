import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Juego {
    int raza;
    int clase;
    String nombre;
    static Jugador player = new Jugador();
    static Enemigo current;
    static int state;//0 si ataca, 1 si defiende, no se si implementarlo asi xd
    private static void menuRaza() {
        System.out.println("Bienvenido a su Juego de Dunyons & Doragons.");
        System.out.println("Seleccione raza:");
        System.out.println("\t1. Humano");
        System.out.println("\t2. Elfo");
        System.out.println("\t3. Enano");
        System.out.println("\t4. Orco");
    }
    private static void menuClase() {
        System.out.println("\nSeleccione clase:");
        System.out.println("\t1. Barbaro");
        System.out.println("\t2. Picaro");
        System.out.println("\t3. Mago (WIP)");
        System.out.println("\t4. Clerigo (WIP)");
    }
    private static void menuBatalla() {
    	System.out.println("\t1. Atacar (WIP si es magico)");
    	System.out.println("\t2. Defender (WIP)");
    	System.out.println("\t3. Pasar al siguiente enemigo (if stuck only)");
    	System.out.println("\t4. Give up on life (it literally kills you)");
    	System.out.print("\nSeleccione una accion: ");
    }
    private static void statsPlayer() {
    	System.out.println("\nTu:");
    	System.out.println("\tVida: " + player.getVida());
    }
    private static void statsEnemy() {
    	System.out.println("\n" + current.getNombre() + ", el enemigo:");
    	System.out.println("\tVida: "+ current.getVida());
    }
    public static void main(String[] args) {
    	Scanner scanner = null;
    	Boolean Flag = true;
    	int defeated = 0;
    	Boolean isDwarf = false;
    	try {
	        List<Enemigo> enemigos = new ArrayList<Enemigo>(3);
	        scanner = new Scanner(System.in);
	        menuRaza();
	        System.out.print("Ingrese numero de raza: ");
	        int raza = scanner.nextInt();
	        player.asignarRaza(raza);
	        player.asignarVida(raza);
	        if (raza == 3)
	        	isDwarf = true;
	        menuClase();
	        System.out.print("Ingrese numero de clase: ");
	        int clase = scanner.nextInt();
	        player.asignarClase(clase);
	        System.out.print("\nIngrese nombre de personaje: ");
	        String nombre = scanner.next();
	        player.asignarNombre(nombre);
	        /*System.out.println("nombre: " + player.getNombre());
	        System.out.println("raza: " + player.getRaza());
	        System.out.println("clase: " + player.getClase());
	        System.out.println("Vida: " + player.getVida());
	        System.out.println("destreza: " + player.getDestreza());
        	System.out.println("fuerza: " + player.getFuerza());
        	System.out.println("armadura: " + player.getArmadura());
        	System.out.println("constitucion: " + player.getConstitucion());*/
	        for (int i=0; i<3; i++) {
	            enemigos.add(new Enemigo());
	        }

	        do{
	        	if (isDwarf && player.getVida() < 12) {
	        		player.setVida(-1);
	        	}
	        	current = enemigos.get(defeated);//defeated es la posicion de la lista
	        	if (Flag) {
	        		System.out.println("\nSe acerca un nuevo enemigo!");
	        		Flag = false;
	        	}

	        	/*System.out.println("el enemigo:");
	        	System.out.println("nombre: " + current.getNombre());
		        System.out.println("raza: " + current.getRaza());
		        System.out.println("clase: " + current.getClase());
		        System.out.println("Vida: " + current.getVida());
		        System.out.println("destreza: " + current.getDestreza());
	        	System.out.println("fuerza: " + current.getFuerza());
	        	System.out.println("armadura: " + current.getArmadura());
	        	System.out.println("constitucion: " + current.getConstitucion());*/
	        	statsPlayer();
	        	statsEnemy();
	        	menuBatalla();
	        	int opcion = scanner.nextInt();
	        	if (opcion == 1) {
	        		state = 0;
	        		//System.out.println("Yeah, esto todavia no esta implementado, come back later");
	        		if (player.getTipoAtaque() == 1) {
	        			System.out.println("Tirando dado:");
	        			int a = player.attack();
	        			if (a >= current.getArmadura()) {
	        				System.out.println("Ataque exitoso!");
	        				int dam = dados.d8();
	        				System.out.println("Has tirado: " + dam);
	        				current.setVida(dam);
	        			}
	        		}
	        	}
	        	else if (opcion == 2) {
	        		state = 1;
	        	}
	        	else if (opcion == 3) {
	        		defeated+=1;
	        		Flag = true;
	        	}
	        	else if (opcion == 4) {
	        		player.setVida(player.getVida());
	        	}
	        	else {
	        		System.out.println("Ingresa un numero entre 1 y 4 u fuck");
	        	}
	        	System.out.println("\n");
	        	if (state==0) {
	        		if (current.getTipoAtaque() == 1) {//enemigo fisico
	        			System.out.println("El enemigo esta tirando su dado.");
		        		int b = current.attack(state);
		        		if (b >= player.getArmadura()) {
		        			System.out.println("El enemigo esta atacando!");
		        			int ataque = dados.d8();
		        			System.out.println("El enemigo ha tirado: " + ataque);
		        			player.setVida(ataque);
		        		}
		        		else {
		        			System.out.println("El enemigo no ha logrado atacar.");
		        		}
	        		}
	        		else {//enemigo magico
	        			System.out.println("El enemigo magico todavia no ha sido implementado en la alpha del juego. Vuelva mas tarde");
	        		}
	        	}

	        	else if (state==1) {
	        		if (current.getTipoAtaque() == 1) {//enemigo fisico
	        			System.out.println("El enemigo esta tirando sus dados.");
		        		int b = current.attack(state);
		        		System.out.println("El dado a utilizar sera: " + b);
		        		if (b >= player.getArmadura()) {
		        			System.out.println("El enemigo esta atacando!");
		        			int ataque = dados.d8();
		        			System.out.println("El enemigo ha tirado: " + ataque);
		        			player.setVida(ataque);
		        		}
		        		else {
		        			System.out.println("El enemigo no ha logrado atacar.");
		        		}
	        		}
	        		else {//enemigo magico
	        			System.out.println("El enemigo magico todavia no ha sido implementado en la alpha del juego. Vuelva mas tarde");
	        		}
	        	}

	        	if (current.getVida() <= 0) {
	        		System.out.println("Has matado al enemigo!");
	        		defeated+=1;
	        		Flag = true;
	        	}
	        }while (defeated < 3 && player.getVida() > 0);
    	}
    	finally {
    		if (scanner!=null)
    			scanner.close();
    	}
    	if (defeated == 3) {
    		System.out.println("\nFelicitaciones!");
    		System.out.println("Has ganado el juego!");
    	}
    	else {
    		System.out.println("\nlol u died");
    		System.out.println("Git gud scrub");
    	}
    }
}
