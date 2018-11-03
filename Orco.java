public class Orco extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;
    void Orco(){

    }
    void crearRaza(){
        this.fuerza = 2;
        this.destreza = 0;
        this.Constitucion = 1;
    }
    void habilidad(){
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
