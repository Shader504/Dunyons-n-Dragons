public class Elfo extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;

    void Elfo(){
    }
    void crearRaza(){
        this.fuerza = 0;
        this.destreza = 2;
        this.Constitucion = 1;
    }
    int habilidad(){
        return 2;
    }
    public int getFuerza(){
        return fuerza;
    }
    public int getDestreza(){
        return destreza;
    }
    public int getConstitucion(){
        return Constitucion;
    }
}
