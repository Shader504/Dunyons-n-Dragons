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
      int defeated = 0;
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
      do{
        /*prueba*/int breake = scanner.nextInt();
        if (breake == 1){
          break;
        }/*borrar despues*/
        if (player.getVida() == 0){
          System.out.println("Has perdido, buen Juego");
        }
        if (defeated == 3){
          System.out.println("Has ganado, felicitaciones!");
          break;
        }
      }while (defeated < 4);
    }
}
