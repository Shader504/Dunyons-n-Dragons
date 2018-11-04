public class Enemigo implements Personaje {
    private String race;
    private String claz;
    private String nombre;
    private int laif;
    private int Fuerza;
    private int Destreza;
    private int Constitucion;
    private int Armadura;

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
            this.claz = "Barbaro";
            this.Armadura = barbarian.getArmadura();
        }
        else if (opC == 2) {
            Picaro rogue = new Picaro();
            this.claz = "Picaro";
            this.Armadura = rogue.getArmadura();
        }
        else if (opC == 4 || opC == 6) {
            Mago mage = new Mago();
            this.claz = "Mago";
            this.Armadura = mage.getArmadura();
        }
        else if (opC == 3) {
            Clerigo priest = new Clerigo();
            this.claz = "Clerigo";
            this.Armadura = priest.getArmadura();
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

    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return race;
    }
    public String getClase() {
        return claz;
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
