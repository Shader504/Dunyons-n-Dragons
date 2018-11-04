public class Humano extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;

    public Humano(){
        crearRaza();
    }
    public void crearRaza(){
        this.fuerza = 1;
        this.destreza = 1;
        this.Constitucion = 1;
    }
    public int habilidad(){
        dados.d20();
        return 0;
    }
    public int getFuerza(){
        return this.fuerza;
    }
    public int getDestreza(){
        return this.destreza;
    }
    public int getConstitucion(){
        return this.Constitucion;
    }
}
