 //Animal Conejo
package animalitosenespera;

public class Conejo extends Animal implements Cualidades { 
    
    private String sonido;

    public Conejo() {
    }

    public Conejo(String Sonido) {
        this.sonido = Sonido;
    }

    public Conejo(String Sonido, String nombre, String raza, String tipo, double edad, boolean vacunas) {
        super(nombre, raza, tipo, edad, vacunas);
        this.sonido = Sonido;
    }

    @Override
    public String ComunicarSonido() {
        String sonido = "Ronroneo";
        return sonido;    
    }
    
    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    }
