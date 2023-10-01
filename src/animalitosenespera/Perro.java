//Animal perro
package animalitosenespera;

//Recuerda que existen cinco grandes grupos de animales vertebrados: peces, anfibios, reptiles, aves y mamíferos.
//Vacunas: se quiere saber si tiene o no cualquier vacuna antes de ingresar o salir del centro. 

public class Perro {
    private String nombre,raza,grupo;
    private double edad;
    private boolean vacunas;

    //Creando constructor vacio
    public Perro() {
    }
    
    //Creando contructor con parametros

    public Perro(String nombre, String raza, String grupo, double edad, boolean vacunas) {
        this.nombre = nombre;
        this.raza = raza;
        this.grupo = grupo;
        this.edad = edad;
        this.vacunas = vacunas;
    }
    
    //Generando primer metodo
    public static void Caminar(){  
    }
    
    //Creando getter & Setter

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
