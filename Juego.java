import java.util.Scanner;
public class Juego {
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
    menuRaza();
    System.out.print("Ingrese numero de raza: ");
    int raza = scanner.nextInt();
    Jugador player = new Jugador();
    //player.asignarRaza(raza);
    //player.asignarVida(raza);
    menuClase();
    System.out.print("Ingrese numero de clase: ");
    int clase = scanner.nextInt();
    //player.asignarClase(clase);
    System.out.print("Ingrese nombre de personaje: ");
    String nombre = scanner.next();
    //player.asignarNombre(nombre);
  }
}

//

//lets go over there
