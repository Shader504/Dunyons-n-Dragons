public class Humano extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;

    void Humano(){

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
        return fuerza;
    }
    public int getDestreza(){
        return destreza;
    }
    public int getConstitucion(){
        return Constitucion;
    }
}
