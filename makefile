JFLAGS = -g
JC = javac
JVM = java
FILE =
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES=\
	Juego.java\
	Barbaro.java\
	Clase.java\
	Clerigo.java\
	dados.java\
	Elfo.java\
	Enano.java\
	Enemigo.java\
	Humano.java\
	Jugador.java\
	Mago.java\
	Orco.java\
	Personaje.java\
	Picaro.java\
	Raza.java
MAIN = Juego
default: classes
classes: $(CLASSES:.java=.class)
run:classes
	$(JVM) $(MAIN)

clean:
	$(RM) *.class
