//Animal perro
package animalitosenespera;

//Recuerda que existen cinco grandes grupos de animales vertebrados: peces, anfibios, reptiles, aves y mamíferos.
//Vacunas: se quiere saber si tiene o no cualquier vacuna antes de ingresar o salir del centro. 

public class Perro {
    String nombre,raza,grupo;
    double edad;
    boolean vacunas;

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
    
}
