package UserInterface;

import java.io.*;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;


    public static void main(String[] args) throws IOException {

        mostrarMenu();

    }

    public static void mostrarMenu() throws IOException {

        int opcion;
        opcion = -1;

        do {

            out.println();
            out.println("1. ");
            out.println("2. ");
            out.println("3. ");
            out.println("4. ");
            out.println("5. ");
            out.println("6. ");
            out.println("0. ");
            out.println();
            out.println("Digite uno de los números y presione enter para continuar.");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);
            out.println();

        } while (opcion != 0);

    }

    static void procesarOpcion(int opcion) throws IOException {

        switch (opcion) {

            case 1:
                ;
                break;

            case 2:
                elegirTipoCliente();
                break;
            case 3:
                ;
                break;

            case 4:
                ;
                break;

            case 5:
                ;
                break;

            case 6:
                ;
                break;

            case 0:
                out.println("Gracias por usar la aplicación.");
                break;

            default:

                out.println("¡opción inválida!");
                break;
        }

    }

    public static void registrarUsuario() throws IOException {

        //La aplicacion permitirá un unico usuario

        String nombre;
        String apellidos;
        String correo;
        String direccion;
        int telefono;
        int ID;
        String genero;


        out.println("Ingrese el nombre del usuario.");
        nombre = in.readLine();

        out.println("Ingrese los apellidos del usuario.");
        apellidos = in.readLine();

        out.println("Ingrese el correo electrónico del usuario.");
        correo = in.readLine();

        out.println("Ingrese el número de identificación del usuario.");
        ID = Integer.parseInt(in.readLine());

        out.println("Ingrese la dirección del usuario.");
        direccion = in.readLine();

        out.println("Ingrese el género del usuario (Hombre/Mujer).");
        genero = in.readLine();

        out.println("Registrar tmabien AVATAR cuando aprenda a hacerlo");


    }

    public static void elegirTipoCliente() throws IOException {

        int opcion;

        out.println("Digite el digito correspondiente al tipo de cliente que desea registrar:");
        out.println("1. Para registrar un cliente físico.");
        out.println("2. Para registrar un cliente jurídico.");
        opcion = Integer.parseInt(in.readLine());


        switch (opcion) {

            case 1:
                registrarClienteFisico();
                break;

            case 2:
                registrarClienteJuridico();
                break;
        }


    }

    public static void elegirTipoProyecto() throws IOException {

        int opcion;

        out.println("Digite el digito correspondiente al tipo de proyecto que desea registrar:");
        out.println("1. Para registrar un proyecto académico.");
        out.println("2. Para registrar un proyecto comercial.");
        opcion = Integer.parseInt(in.readLine());


        switch (opcion) {

            case 1:
                registrarProyectoAcademico();
                break;

            case 2:
                registrarProyectoComercial();
                break;
        }


    }


    public static void registrarClienteFisico() throws IOException {

        /*En el caso de los clientes físicos se debe manejar el nombre, primer apellido,
        segundo apellido, provincia, cantón, distrito, dirección exacta, correo electrónico
        y teléfono.*/

        String nombre;
        String apellidos;
        String provincia;
        String canton;
        String distrito;
        String direccion;
        String correo;
        int telefono;

        out.println("Registrar un cliente físico:");
        out.println("Ingrese el nombre del cliente.");
        nombre = in.readLine();

        out.println("Ingrese los apellidos del cliente.");
        apellidos = in.readLine();

        out.println("Ingrese la provincia donde vive el cliente.");
        provincia = in.readLine();

        out.println("Ingrese el cantón donde vive el cliente.");
        canton = in.readLine();

        out.println("Ingrese el distrito donde vive el cliente.");
        distrito = in.readLine();

        out.println("Ingrese la dirección del cliente.");
        direccion = in.readLine();

        out.println("Ingrese el correo del cliente");
        correo = in.readLine();

        out.println("Ingrese el teléfono del cliente.");
        telefono = Integer.parseInt(in.readLine());


    }

    public static void registrarClienteJuridico() throws IOException {

        //Debe tener un contacto: debe tener el nombre, el primer apellido,
        // el segundo apellido, la cédula, teléfono y correo electrónico.

        String nombre;
        String apellidos;
        String provincia;
        String canton;
        String distrito;
        String direccion;
        String correo;
        int telefono;
        int ID;

        out.println("Registrar un cliente juridico:");
        out.println("Ingrese el nombre del cliente.");
        nombre = in.readLine();

        out.println("Ingrese el número de cédula del cliente.");
        ID = Integer.parseInt(in.readLine());

        out.println("Ingrese la provincia donde vive el cliente.");
        provincia = in.readLine();

        out.println("Ingrese el cantón donde vive el cliente.");
        canton = in.readLine();

        out.println("Ingrese el distrito donde vive el cliente.");
        distrito = in.readLine();

        out.println("Ingrese la dirección del cliente.");
        direccion = in.readLine();

        out.println("Ingrese el correo del cliente");
        correo = in.readLine();

        out.println("Ingrese el teléfono del cliente.");
        telefono = Integer.parseInt(in.readLine());

        //deseable, que se pueda poner la ubicación usando las librerías de Google.

    }

    /*Para los proyectos , se ocupará un código para poderlo identificar, un nombre,
    una descripción, fecha de inicio y fecha de fin, así como las tecnologías asociadas
    y una serie de actividades, además del cliente asociado. También habrá dos tipos de
    proyecto, los académicos (que tendrán como cliente al usuario de la aplicación) y los
    comerciales (que deberán de tener un cliente asociado).*/


    public static void registrarProyectoAcademico(){

        int codigo;
        String nombre;
        String descripcion;

        //date que usa el profesor
        String FechaInicio;
        String FechaFinal;

        //asociaciones
        String tecnologias;
        String actividades;
        String cliente; //usuario en este caso, dudas aqui


    }

    public static void registrarProyectoComercial(){



    }

    public static void registrarTecnologias(){

        int codigo;
        String nombre;

    }

}
