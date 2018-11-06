import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Juego {
    int raza;
    int clase;
    String nombre;
    static Jugador player = new Jugador();
    static Enemigo current;
    static int PlayerState = 0;//0 si ataca, 1 si defiende, no se si implementarlo asi xd
    static int EnemyState = 0;//0 si ataca, 1 si defiende
    
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
    	System.out.println("\nEscoja una ocpion:");
    	System.out.println("\t1. Atacar (WIP si es magico)");
    	System.out.println("\t2. Defender (WIP)");
    	System.out.println("\t3. Pasar al siguiente enemigo (if stuck only)");
    	System.out.println("\t4. Give up on life (it literally kills you)");
    	System.out.println("\t5. Win the game!");//TODO: agregar opcion para ver stats(?)
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
    	boolean Flag = true;
    	int defeated = 0;
    	boolean isDwarf = false;
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
	        System.out.print("\nIngrese el nombre de su personaje: ");
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
	        		System.out.println("\n/////////////////////////////");
	        		System.out.println("Se acerca un nuevo enemigo!");
	        		System.out.println("/////////////////////////////");
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
	        	System.out.println("\n");
	        	if (opcion == 1) {
	        		int dmg;
	        		Double multiplier = 1.0;
	        		PlayerState = 0;
	        		System.out.println("Atacando al enemigo!");
	        		if (player.getTipoAtaque() == 1)
	        			dmg = player.attack(EnemyState, current.getArmadura(), current.getVida(), multiplier);
	        		else {
	        			multiplier = current.defend(EnemyState);
	        			dmg = player.attack(EnemyState, current.getArmadura(), current.getVida(), multiplier);
	        		}
	        		
	        		current.setVida(dmg);
	        	}
	        	else if (opcion == 2) {
	        		System.out.println("Ahora estas defendiendo.");
	        		PlayerState = 1;
	        	}
	        	else if (opcion == 3) {
	        		defeated+=1;
	        		Flag = true;
	        		continue;
	        	}
	        	else if (opcion == 4) {
	        		player.setVida(player.getVida());
	        		break;
	        	}
	        	else if (opcion == 5) {
	        		defeated=3;
	        		break;
	        	}
	        	else {
	        		System.out.println("Ingresa un numero entre 1 y 4 u fuck");
	        	}
	        	
	        	int EnemyOption = dados.d2();
	        	if (EnemyOption == 1) {
	        		int dmg;
	        		Double multiplier = 1.0;
	        		EnemyState = 0;
	        		System.out.println("El enemigo esta atacando!\n");
	        		if(current.getTipoAtaque() == 1)
	        			dmg = current.attack(PlayerState, player.getArmadura(), player.getVida(), multiplier);
	        		else {
	        			multiplier = player.defend(PlayerState);
	        			dmg = current.attack(PlayerState, player.getArmadura(), player.getVida(), multiplier);
	        		}
	        		player.setVida(dmg);
	        	}
	        	else {
	        		EnemyState = 1;
	        		System.out.println("El enemigo defiende!");
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
