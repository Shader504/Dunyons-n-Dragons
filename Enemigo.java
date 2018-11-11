public class Enemigo implements Personaje {
    private String race;
    private String claz;
    private Clase cl;
    private Raza ra;
    private String nombre;
    private int tipoAtaque;//1 si es fisico, 2 si es magico

    public Enemigo() {
        int option = dados.d6();
        if (option == 1){
            asignarNombre("Klrak");
        }
        if (option == 2){
            asignarNombre("Adran");
        }
        if (option == 3){
            asignarNombre("Isaac");
        }
        if (option == 4){
            asignarNombre("Elysium");
        }
        if (option == 5){
            asignarNombre("Krrogh");
        }
        if (option == 6){
            asignarNombre("Jenkins");
        }
        asignarRaza(option);
        asignarClase(option);
        asignarVida(option);
    }

    public void asignarRaza(int opR){
        if (opR == 2 || opR == 4){
            Elfo elf = new Elfo();
            this.race = "Elfo";
            this.ra = elf;
        }
        else if (opR == 3 || opR == 6){
            Humano human = new Humano();
            this.race = "Humano";
            this.ra = human;
        }
        else if (opR == 1){
            Enano dwarf = new Enano();
            this.race = "Enano";
            this.ra = dwarf;
        }
        else if (opR == 5){
            Orco orc = new Orco();
            this.race = "Orco";
            this.ra = orc;
        }

    }

    public void asignarClase(int opC){
        if (opC == 1 || opC == 5) {
            Barbaro barbarian = new Barbaro();
            this.cl = barbarian;
            this.claz = "Barbaro";
            this.tipoAtaque = 1;
        }
        else if (opC == 2) {
            Picaro rogue = new Picaro();
            this.cl = rogue;
            this.claz = "Picaro";
            this.tipoAtaque = 1;
        }
        else if (opC == 4 || opC == 6) {
            Mago mage = new Mago();
            this.cl = mage;
            this.claz = "Mago";
            this.tipoAtaque = 2;
        }
        else if (opC == 3) {
            Clerigo priest = new Clerigo();
            this.cl = priest;
            this.claz = "Clerigo";
            this.tipoAtaque = 2;
        }
    }
    
    public void asignarVida(int op){
        if (op == 1){
            ra.setVida(10);
        }
        else {
            ra.setVida(9);;
        }
    }

    //int attack:
    //recibe:	int State, el estado del contrincante(ataque o defensa)
    //			int armor, la armadura del contrincante
    //			Double multiplier, el multiplicador de ataque(solo usado para ataques magicos)
    //			int vida, la vida actual del contrincante
    //retorna: la nueva vida del contrincante
    //Esta funcion llama a la funcion de ataque de la clase correspondiente
    public int attack(int State, int armor, Double multiplier, int vida) {
    	if (this.claz.equals("Barbaro"))
    		return cl.ataque(State, this.race, armor, ra.getFuerza(), multiplier, vida, this.ra);
    	else if (this.claz.equals("Picaro"))
    		return cl.ataque(State, this.race, armor, ra.getDestreza(), multiplier, vida, this.ra);
    	else if (this.claz.equals("Mago"))
    		return cl.ataque(State, this.race, armor, ra.getDestreza(), multiplier, vida, this.ra);
    	else
    		return cl.ataque(State, this.race, armor, ra.getConstitucion(), multiplier, vida, this.ra);
    }

    //double defend:
    //recide: int State, el estado del contrincante(ataque o defensa)
    //retorna: el multiplicador de ataque
    //Esta funcion llama a la funcion de defensa de la clase correspondiente
    public double defend(int State) {
    	return cl.defender(State, this.race, this.ra);
    }

    //SETTERS
    public void setVida(int damage) {
    	ra.setVida(damage);;
    }

    public void asignarNombre(String Nombre){
        this.nombre = Nombre;
    }
    
    //GETTERS
    public int getTipoAtaque() {
    	return this.tipoAtaque;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getRaza() {
        return this.race;
    }
    public String getClase() {
        return this.claz;
    }
    public int getVida() {
        return ra.getVida();
    }
    public int getFuerza() {
    	return ra.getFuerza();
    }
    public int getDestreza() {
    	return ra.getDestreza();
    }
    public int getConstitucion() {
    	return ra.getConstitucion();
    }
    public int getArmadura() {
    	return cl.getArmadura();
    }
    public int getHabilidad() {
    	return ra.habilidad();
    }
}
