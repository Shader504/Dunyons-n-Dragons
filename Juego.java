import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Juego {
    int raza;
    int clase;
    String nombre;
    static Jugador player = new Jugador();
    static Enemigo current;
    static int PlayerState = 0;//0 si ataca, 1 si defiende
    static int EnemyState = 0;//0 si ataca, 1 si defiende

    //void menuRaza
    //recibe: nada
    //retorna: nada
    //Esta funcion imprime por pantalla la seleccion de la raza del jugador.
    private static void menuRaza() {
        System.out.println("Bienvenido a su Juego de Dunyons & Doragons.");
        System.out.println("Seleccione raza:");
        System.out.println("\t1. Humano");
        System.out.println("\t2. Elfo");
        System.out.println("\t3. Enano");
        System.out.println("\t4. Orco");
    }

    //void menuClase
    //recibe: nada
    //retorna: nada
    //Esta funcion imprime por pantalla la seleccion de la clase del jugador
    private static void menuClase() {
        System.out.println("\nSeleccione clase:");
        System.out.println("\t1. Barbaro");
        System.out.println("\t2. Picaro");
        System.out.println("\t3. Mago");
        System.out.println("\t4. Clerigo");
    }

    //void menuBatalla
    //recibe: nada
    //retorna: nada
    //Esta funcion imprime por pantalla la seleccion de la accion del jugador
    private static void menuBatalla() {
    	System.out.println("\nEscoja una opcion:");
    	System.out.println("\t1. Atacar");
    	System.out.println("\t2. Defender");
    	System.out.print("\nSeleccione una accion: ");
    }

    //void statsPlayer
    //recibe: nada
    //retorna: nada
    //Esta funcion imprime por pantalla la vida del jugador
    private static void statsPlayer() {
    	System.out.println("\nTu:");
    	System.out.println("\tVida: " + player.getVida());
    }

    //void statsEnemy
    //recibe: nada
    //retorna: nada
    //Esta funcion imprime por pantalla la vida del enemigo
    private static void statsEnemy() {
    	System.out.println("\n" + current.getNombre() + ", el enemigo:");
    	System.out.println("\tVida: "+ current.getVida());
    }

    public static void main(String[] args) {
    	Scanner scanner = null;
    	boolean Flag = true;
    	int defeated = 0;
    	boolean isDwarf = false;
        boolean isDwarfe = false;
        //se inicia el juego
        
    	try {
            List<Enemigo> enemigos = new ArrayList<Enemigo>(3);
            scanner = new Scanner(System.in);
            menuRaza();
            System.out.print("Ingrese numero de raza: ");
            int raza = scanner.nextInt();
            if (raza != 1 && raza !=2 && raza !=3 && raza !=4){
                System.out.println("Eso no es una raza, choose right");
            }
            else{
                player.asignarRaza(raza);
                player.asignarVida(raza);
                if (raza == 3)
                    isDwarf = true;
                menuClase();
    	        System.out.print("Ingrese numero de clase: ");
    	        int clase = scanner.nextInt();
                if (clase != 1 && clase !=2 && clase !=3 && clase !=4){
                    System.out.println("Eso no es una clase, choose right");
                }
                else{
                    player.asignarClase(clase);
                    System.out.print("\nIngrese el nombre de su personaje: ");
                    String nombre = scanner.next();
                    player.asignarNombre(nombre);
                    
                    for (int i=0; i<3; i++) {
                        enemigos.add(new Enemigo());
                    }

                    do{
                    	//comienza la batalla
                    	
                        if (isDwarf && player.getVida() < 12) {
                            player.setVida(player.getVida()+player.getHabilidad());
                        }
                        
                        current = enemigos.get(defeated);//defeated es la posicion de la lista
                        
                        if (current.getRaza() == "Enano"){
                            isDwarfe = true;
                        }
                        if (isDwarfe && current.getVida() < 10){
                            current.setVida(player.getVida()+player.getHabilidad());
                        }
                        
                        if (Flag) {
                            System.out.println("\n/////////////////////////////");
                            System.out.println("Se acerca un nuevo enemigo!");
                            System.out.println("/////////////////////////////");
                            Flag = false;
                        }
        	        	
                        if (player.getVida() <= 0) {
                        	break;
                        }
                        
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
                                dmg = player.attack(EnemyState, current.getArmadura(), multiplier, current.getVida());
                            else {
                                multiplier = current.defend(EnemyState);
                                dmg = player.attack(EnemyState, current.getArmadura(), multiplier, current.getVida());
                            }

                            current.setVida(dmg);
                        }
                        else if (opcion == 2) {
                            System.out.println("Ahora estas defendiendo.");
                            PlayerState = 1;
                        }

                        else {
                            System.out.println("Esta opcion no es valida");
                            continue;
                        }

                        if (current.getVida() <= 0) {
                            System.out.println("Has matado al enemigo!");
                            defeated+=1;
                            Flag = true;
                            continue;
                        }
                        
                        int EnemyOption = dados.d2();
                        if (EnemyOption == 1) {
                            int dmg;
                            Double multiplier = 1.0;
                            EnemyState = 0;
                            System.out.println("El enemigo esta atacando!\n");
                            if(current.getTipoAtaque() == 1)
                            dmg = current.attack(PlayerState, player.getArmadura(), multiplier, player.getVida());
                            else {
                                multiplier = player.defend(PlayerState);
                                dmg = current.attack(PlayerState, player.getArmadura(), multiplier, player.getVida());
                            }
                            player.setVida(dmg);
                        }
                        else {
                            EnemyState = 1;
                            System.out.println("El enemigo defiende!");
                        }

                    }while (defeated < 3 && player.getVida() > 0);
                }
            }
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
    		System.out.println("\nHas muerto!");
    		System.out.println("Game Over.");
    	}
    }
}
