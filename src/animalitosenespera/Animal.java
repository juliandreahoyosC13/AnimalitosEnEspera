//Creando la clase madre/padre para explorar el pilar de herencia
package animalitosenespera;
//Recuerda que existen cinco grandes grupos de animales vertebrados: peces, anfibios, reptiles, aves y mamíferos.
//Vacunas: se quiere saber si tiene o no cualquier vacuna antes de ingresar o salir del centro.

public abstract class Animal {

    String nombre, raza, tipo;
    double edad;
    boolean vacunas;

    public Animal() {
    }

    public Animal(String nombre, String raza, String tipo, double edad, boolean vacunas) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
        this.vacunas = vacunas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }
    
    

    public abstract String ComunicarSonido();

}
