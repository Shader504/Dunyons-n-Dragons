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
    public void habilidad(){
        if (dados.d20() == 1){
          dados.d20();
        }
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

//

//change anything?
