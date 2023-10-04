//Animal Gato
package animalitosenespera;

public class Gato extends Animal implements Cualidades{
    
    private String sonido;

    public Gato() {
    }

    public Gato(String sonido) {
        this.sonido = sonido;
    }

    public Gato(String sonido, String nombre, String raza, String tipo, double edad, boolean vacunas) {
        super(nombre, raza, tipo, edad, vacunas);
        this.sonido = sonido;
    }
    @Override
    public String ComunicarSonido() {
        String sonido = "Miaw";
        return sonido;
    }
}


