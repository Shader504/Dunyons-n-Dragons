public class Humano extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;
    private int Vida;

    public Humano() {
        crearRaza();
    }
    
    //void crearClase:
    //recibe: nada
    //retorna: nada
    //Asigna las estadisticas de la raza del personaje: Fuerza, Destreza, y Constitucion
    public void crearRaza() {
        this.fuerza = 1;
        this.destreza = 1;
        this.Constitucion = 1;
    }
    
    //int habilidad:
    //recibe: nada
    //retorna: un numero al azar entre 1 y 20
    //Esta funcion aplica los efectos de la habilidad de la raza Humano, tirar un d20 nuevamente si ha salido 1.
    public int habilidad() {
    	System.out.println("\nSe ha activado la habilidad de la raza Humano!");
    	System.out.println("Ha salido 1, por lo que se vuelve a tirar el d20.");
        return dados.d20();
    }
    
    //SETTERS
    public void setVida(int newVida) {
    	this.Vida = newVida;
    }
    
    //GETTERS
    public int getFuerza() {
        return this.fuerza;
    }
    
    public int getDestreza() {
        return this.destreza;
    }
    
    public int getConstitucion() {
        return this.Constitucion;
    }
    public int getVida() {
    	return this.Vida;
    }
}
