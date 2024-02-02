import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cd cd = new Cd("Sony", "CD-ROM", "700 MB", "CD-R");
        DiscoDuro discoDuro = new DiscoDuro("Seagate", "HDD-001", "2 TB", "HDD");
        System.out.println(cd);
        System.out.println(discoDuro);

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Girar Disco CD");
            System.out.println("2. Almacenar Datos en CD");
            System.out.println("3. Leer Datos de CD");
            System.out.println("4. Reportar Información de CD");
            System.out.println("5. Girar Disco Disco Duro");
            System.out.println("6. Almacenar Datos en Disco Duro");
            System.out.println("7. Leer Datos de Disco Duro");
            System.out.println("8. Reportar Información de Disco Duro");
            System.out.println("0. Salir");

            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    cd.girarDisco();
                    break;
                case 2:
                    in.nextLine();
                    System.out.println("Escribe que quieres almacenar:");
                    String contenidoCD = in.nextLine();
                    cd.almacenarDatos(Cd.class, contenidoCD);
                    break;
                case 3:
                    cd.leerDatos(Cd.class);
                    break;
                case 4:
                    cd.reportarInformacion();
                    break;
                case 5:
                    discoDuro.girarDisco();
                    break;
                case 6:
                    System.out.println("Escribe que quieres almacenar:");
                    String contenidoDD = in.nextLine();
                    discoDuro.almacenarDatos(DiscoDuro.class, contenidoDD);
                    break;
                case 7:
                    discoDuro.leerDatos(DiscoDuro.class);
                    break;
                case 8:
                    discoDuro.reportarInformacion();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);
    }
}
