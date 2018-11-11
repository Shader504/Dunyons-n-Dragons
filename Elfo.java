public class Elfo extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;
    private int Vida;

    public Elfo() {
        crearRaza();
    }
    
    //void crearClase:
    //recibe: nada
    //retorna: nada
    //Asigna las estadisticas de la raza del personaje: Fuerza, Destreza, y Constitucion
    public void crearRaza(){
        this.fuerza = 0;
        this.destreza = 2;
        this.Constitucion = 1;
    }
    
    //int habilidad:
    //recibe: nada
    //retorna: el valor que se suma al d20 al defender un ataque magico
    //Esta funcion aplica los efectos de la habilidad de la raza Elfo
    public int habilidad(){
    	System.out.println("\nSe activa la habilidad de la raza Elfo!");
    	System.out.println("Al d20 tirado se le suma 2.");
        return 2;
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
