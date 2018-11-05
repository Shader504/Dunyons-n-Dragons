public class Enano extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;

    public Enano() {
        crearRaza();
    }

    public void crearRaza() {
        this.fuerza = 1;
        this.destreza = 0;
        this.Constitucion = 2;
    }

    public int habilidad() {
        return 1;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getConstitucion() {
        return Constitucion;
    }
}
