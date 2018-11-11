public class Orco extends Raza {
    private int fuerza;
    private int destreza;
    private int Constitucion;
    private int Vida;

    public Orco() {
        crearRaza();
    }

    //void crearClase:
    //recibe: nada
    //retorna: nada
    //Asigna las estadisticas de la raza del personaje: Fuerza, Destreza, y Constitucion
    public void crearRaza() {
        this.fuerza = 2;
        this.destreza = 0;
        this.Constitucion = 1;
    }

    //int habilidad:
    //recibe: nada
    //retorna: el valor que se suma al d20 al atacar fisicamente
    //Esta funcion aplica los efectos de la habilidad de la raza Orco, se le suma 2 al d20 al atacar fisicamente
    public int habilidad() {
    	System.out.println("\nSe ha activado la habilidad de la raza Orco!");
    	System.out.println("Se le suma 2 al valor del d20 tirado");
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
