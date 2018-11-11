public class Enano extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;
    private int Vida;

    public Enano(){
        crearRaza();
    }
    
    //void crearClase:
    //recibe: nada
    //retorna: nada
    //Asigna las estadisticas de la raza del personaje: Fuerza, Destreza, y Constitucion
    public void crearRaza(){
        this.fuerza = 1;
        this.destreza = 0;
        this.Constitucion = 2;
    }
    
    //int habilidad:
    //recibe: nada
    //retorna: el valor de la habilidad de la raza Enano
    //Esta funcion aplica los efectos de la habilidad de la raza Enano, le suma 1 a la vida del personaje
    public int habilidad(){
    	System.out.println("\nSe ha activado la habilidad de la raza Enano!");
    	System.out.println("El personaje recupera 1 de vida.");
        return 1;
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
