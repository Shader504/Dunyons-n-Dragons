import java.util.Random;

public class dados {

    //int d20:
    //recibe: nada
    //retorna: int n, el numero escogido
    //Escoge un numero al azar entre 1 y 20.
    public static int d20() {
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;
        return n;
    }

    //int d6:
    //recibe: nada
    //retorna:
    //Escoge un numero al azar entre 1 y 6.
    public static int d6() {
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;
        return n;
    }

    //int d8:
    //recibe: nada
    //retorna: int n, el numero escogido
    //Escoge un numero al azar entre 1 y 8.
    public static int d8() {
        Random rand = new Random();
        int n = rand.nextInt(8) + 1;
        return n;
    }

    //int d2:
    //recibe: nada
    //retorna: int n, el numero escogido
    //Escoge un numero al azar entre 1 y 2.
    public static int d2() {
    	Random rand = new Random();
    	int n = rand.nextInt(2) + 1;
    	return n;
    }
}
