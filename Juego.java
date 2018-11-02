import java.util.Scanner;
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
    Scanner scanner = new Scanner(System.in);
    Jugador player = new Jugador();
    menuRaza();
    System.out.print("Ingrese numero de raza: ");
    int raza = scanner.nextInt();
    menuClase();
    System.out.print("Ingrese numero de clase: ");
    int clase = scanner.nextInt();
    System.out.print("Ingrese nombre de personaje: ");
    String nombre = scanner.next();
    player.asignarRaza(raza);
    player.asignarVida(raza);
    player.asignarClase(clase);
    player.asignarNombre(nombre);
    System.out.println("nombre: " + player.getNombre());
    System.out.println("raza: " + player.getRaza());
    System.out.println("clase: " + player.getClase());
    System.out.println("Vida: " + player.getVida());
  }
}

//

//ye estaba pensando lo mismo, comenzemos con el humano 

/*
Bienvenido a su Juego de Dunyons & Doragons.
Seleccione raza:
	1. Humano
	2. Elfo
	3. Enano
	4. Orco
Ingrese numero de raza: 4
Seleccione clase:
	1. Barbaro
	2. Picaro
	3. Mago
	4. Clerigo
Ingrese numero de clase: 1
Ingrese nombre de personaje: Amoral
nombre: Amoral
raza: Orco
clase: Barbaro
Vida: 11
*/
