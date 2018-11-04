public class Elfo extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;

    public void Elfo(){
        crearRaza();
    }

    public void crearRaza(){
        this.fuerza = 0;
        this.destreza = 2;
        this.Constitucion = 1;
    }

    public int habilidad(){
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
