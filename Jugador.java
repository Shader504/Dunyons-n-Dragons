public class Jugador implements Personaje {
    private String name;
    private String race;
    private String claz;
    private Clase cl;
    private int life;
    private int Fuerza;
    private int Destreza;
    private int Constitucion;
    private int Armadura;
    private int tipoAtaque;//1 si es fisico, 2 otherwise
    
    public void asignarRaza(int opR) {
        if (opR == 1) {
            Humano human = new Humano();
            this.race = "Humano";
            this.Fuerza = human.getFuerza();
            this.Destreza = human.getDestreza();
            this.Constitucion = human.getConstitucion();
        }
        else if (opR == 2) {
            Elfo elf = new Elfo();
            this.race = "Elfo";
            this.Fuerza = elf.getFuerza();
            this.Destreza = elf.getDestreza();
            this.Constitucion = elf.getConstitucion();
        }
        else if (opR == 3) {
            Enano dwarf = new Enano();
            this.race = "Enano";
            this.Fuerza = dwarf.getFuerza();
            this.Destreza = dwarf.getDestreza();
            this.Constitucion = dwarf.getConstitucion();
        }
        else if (opR == 4) {
            Orco orc = new Orco();
            this.race = "Orco";
            this.Fuerza = orc.getFuerza();
            this.Destreza = orc.getDestreza();
            this.Constitucion = orc.getConstitucion();
        }
    }
    
    public void asignarClase(int opC) {
        if (opC ==  1) {
            Barbaro barbarian = new Barbaro();
            this.cl = barbarian;
            this.claz = "Barbaro";
            this.Armadura = barbarian.getArmadura();
            this.tipoAtaque = 1;
        }
        else if (opC ==  2) {
            Picaro rogue = new Picaro();
            this.cl = rogue;
            this.claz = "Picaro";
            this.Armadura = rogue.getArmadura();
            this.tipoAtaque = 1;
        }
        else if (opC ==  3) {
            Mago mage = new Mago();
            this.cl = mage;
            this.claz = "Mago";
            this.Armadura = mage.getArmadura();
            this.tipoAtaque = 2;
        }
        else if (opC ==  4) {
            Clerigo priest = new Clerigo();
            this.cl = priest;
            this.claz = "Clerigo";
            this.Armadura = priest.getArmadura();
            this.tipoAtaque = 2;
        }
    }
    
    public void asignarVida(int opcion) {
        if (opcion == 1) {
            this.life = 11;
        }
        else if (opcion == 2) {
            this.life = 11;
        }
        else if (opcion == 3) {
            this.life = 12;
        }
        else if (opcion == 4) {
            this.life = 11;
        }
    }
    public int attack(int State, int armor, int life, Double multiplier) {
    	if (this.claz.equals("Barbaro"))
    		return cl.ataque(State, this.race, this.claz, this.tipoAtaque, armor, life, this.Fuerza, multiplier);
    	else if (this.claz.equals("Picaro"))
    		return cl.ataque(State, this.race, this.claz, this.tipoAtaque, armor, life, this.Destreza, multiplier);
    	else if (this.claz.equals("Mago"))
    		return cl.ataque(State, this.race, this.claz, this.tipoAtaque, armor, life, this.Destreza, multiplier);
    	else
    		return cl.ataque(State, this.race, this.claz, this.tipoAtaque, armor, life, this.Constitucion, multiplier);
    }
    public double defend(int State) {
    	return cl.defender(State, this.race, this.claz);
    }
    
    public void asignarNombre(String nombre) {
        this.name = nombre;
    }
    public void setVida(int damage) {
    	this.life -= damage;
    }
    
    public int getTipoAtaque() {
    	return this.tipoAtaque;
    }
    public String getNombre() {
        return this.name;
    }
    public String getRaza() {
        return this.race;
    }
    public String getClase() {
        return this.claz;
    }
    public int getVida() {
        return this.life;
    }
    public int getFuerza() {
    	return this.Fuerza;
    }
    public int getDestreza() {
    	return this.Destreza;
    }
    public int getConstitucion() {
    	return this.Constitucion;
    }
    public int getArmadura() {
    	return this.Armadura;
    }
}
