import java.util.Arrays;

public class DispositivoAlmacenamiento {
    private String brand;
    private String nombre;
    private String capacidad;
    private int numeroAlmacenados;
    private String[] almacenamiento;

    private String tipoDisco;

    //Constructor

    public DispositivoAlmacenamiento(String brand, String nombre, String capacidad, String tipoDisco) {
        this.brand = brand;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoDisco = tipoDisco;
        this.numeroAlmacenados = 0;
        this.almacenamiento = new String[100];
    }

    // Getters y Setters
    public String getBrand() {
        return brand;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public String[] getAlmacenamiento() {
        String[] almacenamientoReal = new String[numeroAlmacenados];
        for (int i = 0; i < numeroAlmacenados; i++){
            almacenamientoReal[i] = almacenamiento[i];
        }
        return almacenamientoReal;
    }

    //Metodos

    protected void girarDisco() {
        System.out.println(getBrand() + " girando...");
    }

    protected void almacenarDatos(Class clase, String contenido) {
        if (clase == Cd.class) {
            System.out.println("Almacenando datos en " + getBrand() + " mediante láser magnético");
            almacenamiento[numeroAlmacenados] = contenido;
            numeroAlmacenados++;
        }else {
            System.out.println("Almacenando datos en " + getBrand() + " mediante cabezal magnético");
            almacenamiento[numeroAlmacenados] = contenido;
            numeroAlmacenados++;
        }
    }

    protected void leerDatos(Class clase) {
        if (clase == Cd.class){
            System.out.println("Leyendo datos de " + getBrand() + " mediante láser magnético");
            System.out.println(Arrays.toString(getAlmacenamiento()));
        }else{
            System.out.println("Leyendo datos de " + getBrand() + " mediante cabezal magnético");
            System.out.println(Arrays.toString(getAlmacenamiento()));
        }
    }

    protected void reportarInformacion() {
        System.out.println("Información del disco " + getBrand() + ": " +
                "Nombre: " + getNombre() + ", Capacidad: " + getCapacidad() +
                ", Contenido: " + (Arrays.toString(getAlmacenamiento())) + ", Tipo de disco: " + getTipoDisco());
    }

    public String toString() {
        return "Información del disco " + getBrand() + ": " +
                "Nombre: " + getNombre() + ", Capacidad: " + getCapacidad() +
                ", Contenido: " + (Arrays.toString(getAlmacenamiento())) + ", Tipo de disco: " + getTipoDisco();
    }
}
