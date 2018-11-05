public class Orco extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;

    public Orco() {
        crearRaza();
    }

    public void crearRaza() {
        this.fuerza = 2;
        this.destreza = 0;
        this.Constitucion = 1;
    }

    public int habilidad() {
        return 2;
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
