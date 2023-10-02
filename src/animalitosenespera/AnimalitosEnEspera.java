package animalitosenespera;

public class AnimalitosEnEspera {

    public static void main(String[] args) {
        
        Animal conejito = new Animal("Nube","Californiano","Mamifero",5,true);
        System.out.println("El conejito ingresado se llama: " + conejito.nombre);
        
        Gato gatito = new Gato();
        gatito.setNombre("Orange");
        gatito.setGrupo("Mamifero");
        gatito.setRaza("Persa");
        gatito.setEdad(9);
        gatito.setVacunas(false);
        
        System.out.println("El gatito ingresado se llama " + gatito.getNombre() + " y es de raza " + gatito.getRaza());
        
       
    }
    
}
