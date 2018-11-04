import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Juego {
    int raza;
    int clase;
    String nombre;
    private static void menuRaza(){
        System.out.println("Bienvenido a su Juego de Dunyons & Doragons.");
        System.out.println("Seleccione raza:");
        System.out.println("\t1. Humano");
        System.out.println("\t2. Elfo");
        System.out.println("\t3. Enano");
        System.out.println("\t4. Orco");
    }
    private static void menuClase(){
        System.out.println("Seleccione clase:");
        System.out.println("\t1. Barbaro");
        System.out.println("\t2. Picaro");
        System.out.println("\t3. Mago");
        System.out.println("\t4. Clerigo");
    }
    public static void main(String[] args) {
    	Scanner scanner = null;
        Jugador player = new Jugador();
    	Enemigo current;
    	try {
	        int defeated = 0;
	        List<Enemigo> enemigos = new ArrayList<Enemigo>();
	        scanner = new Scanner(System.in);
	        menuRaza();
	        System.out.print("Ingrese numero de raza: ");
	        int raza = scanner.nextInt();
	        player.asignarRaza(raza);
	        player.asignarVida(raza);
	        menuClase();
	        System.out.print("Ingrese numero de clase: ");
	        int clase = scanner.nextInt();
	        player.asignarClase(clase);
	        System.out.print("Ingrese nombre de personaje: ");
	        String nombre = scanner.next();
	        player.asignarNombre(nombre);
	        System.out.println("nombre: " + player.getNombre());
	        System.out.println("raza: " + player.getRaza());
	        System.out.println("clase: " + player.getClase());
	        System.out.println("Vida: " + player.getVida());
	        System.out.println("destreza: " + player.getDestreza());
        	System.out.println("fuerza: " + player.getFuerza());
        	System.out.println("armadura: " + player.getArmadura());
        	System.out.println("constitucion: " + player.getConstitucion());
	        for (int i=0; i<3; i++) {
	            enemigos.add(new Enemigo());
	        }

	        do{
	        	current = enemigos.get(defeated);
	        	System.out.println("el enemigo:");
	        	System.out.println("nombre: " + current.getNombre());
		        System.out.println("raza: " + current.getRaza());
		        System.out.println("clase: " + current.getClase());
		        System.out.println("Vida: " + current.getVida());
		        System.out.println("destreza: " + current.getDestreza());
	        	System.out.println("fuerza: " + current.getFuerza());
	        	System.out.println("armadura: " + current.getArmadura());
	        	System.out.println("constitucion: " + current.getConstitucion());
	        	defeated+=1;//para ver si aparecen los 3 enemigos
	            /*int breake = scanner.nextInt();//prueba
	            if (breake == 1){
	                break;
	            }//borrar despues
	            if (player.getVida() == 0){
	                System.out.println("Has perdido, buen Juego");
	            }
	            if (defeated == 3){
	                System.out.println("Has ganado, felicitaciones!");
	                break;
	            }*/
	        }while (defeated < 3);
    	}
    	finally {
    		if(scanner!=null)
    			scanner.close();
    	}
    }
}
