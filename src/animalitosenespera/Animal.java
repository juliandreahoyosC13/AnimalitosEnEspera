//Creando la clase madre/padre para explorar el pilar de herencia
package animalitosenespera;
//Recuerda que existen cinco grandes grupos de animales vertebrados: peces, anfibios, reptiles, aves y mamíferos.
//Vacunas: se quiere saber si tiene o no cualquier vacuna antes de ingresar o salir del centro.
public class Animal {
    String nombre,raza,grupo;
    double edad;
    boolean vacunas;
    
    //Constructor vacio

    public Animal() {
    }
    
    //Constructor con atributos

    public Animal(String nombre, String raza, String grupo, double edad, boolean vacunas) {
        this.nombre = nombre;
        this.raza = raza;
        this.grupo = grupo;
        this.edad = edad;
        this.vacunas = vacunas;
    }
     
    //Getter and Setter

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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
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
    
    
}
