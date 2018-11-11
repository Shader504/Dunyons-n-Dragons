public class Enemigo implements Personaje {
    private String race;
    private String claz;
    private Clase cl;
    private String nombre;
    private int laif;
    private int Fuerza;
    private int Destreza;
    private int Constitucion;
    private int Armadura;
    private int tipoAtaque;//1 si es fisico, 2 otherwise

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
        asignarArmadura();
    }

    public void asignarRaza(int opR){
        if (opR == 2 || opR == 4){
            Elfo elf = new Elfo();
            this.race = "Elfo";
            this.Fuerza = elf.getFuerza();
            this.Destreza = elf.getDestreza();
            this.Constitucion = elf.getConstitucion();
        }
        else if (opR == 3 || opR == 6){
            Humano human = new Humano();
            this.race = "Humano";
            this.Fuerza = human.getFuerza();
            this.Destreza = human.getDestreza();
            this.Constitucion = human.getConstitucion();
        }
        else if (opR == 1){
            Enano dwarf = new Enano();
            this.race = "Enano";
            this.Fuerza = dwarf.getFuerza();
            this.Destreza = dwarf.getDestreza();
            this.Constitucion = dwarf.getConstitucion();
        }
        else if (opR == 5){
            Orco orc = new Orco();
            this.race = "Orco";
            this.Fuerza = orc.getFuerza();
            this.Destreza = orc.getDestreza();
            this.Constitucion = orc.getConstitucion();
        }

    }

    public void asignarClase(int opC){
        if (opC == 1 || opC == 5) {
            Barbaro barbarian = new Barbaro();
            this.cl = barbarian;
            this.claz = "Barbaro";
            this.Armadura = barbarian.getArmadura();
            this.tipoAtaque = 1;
        }
        else if (opC == 2) {
            Picaro rogue = new Picaro();
            this.cl = rogue;
            this.claz = "Picaro";
            this.Armadura = rogue.getArmadura();
            this.tipoAtaque = 1;
        }
        else if (opC == 4 || opC == 6) {
            Mago mage = new Mago();
            this.cl = mage;
            this.claz = "Mago";
            this.Armadura = mage.getArmadura();
            this.tipoAtaque = 2;
        }
        else if (opC == 3) {
            Clerigo priest = new Clerigo();
            this.cl = priest;
            this.claz = "Clerigo";
            this.Armadura = priest.getArmadura();
            this.tipoAtaque = 2;
        }
    }

    public void asignarVida(int op){
        if (op == 1){
            this.laif = 10;
        }
        else {
            this.laif = 9;
        }
    }

    public void asignarNombre(String Nombre){
        this.nombre = Nombre;
    }

    public void asignarArmadura(){
        if (this.claz == "Barbaro" || this.claz == "Clerigo"){
            this.Armadura = 15;
        }
        else if (this.claz == "Picaro" || this.claz == "Mago"){
            this.Armadura = 10;
        }
    }

    public void setVida(int damage) {
    	this.laif -= damage;
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
        return this.laif;
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
