import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner form = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println("¿What´s your name?");
        String name = form.nextLine();
        System.out.println();

        System.out.println("¿What´s your last name?");
        String lastName = form.nextLine();
        System.out.println();

        System.out.println("¿What´s your user name?");
        String userName = form.nextLine();
        System.out.println();

        System.out.println("¿What´s your password?");
        String password = form.nextLine();

        System.out.println();
        form.close();
        System.out.println("Hola "+ name + " "+ lastName+", tu nombre de usuario es " +userName+ " y tu contraseña es "+password+", gracias por registrarte.");
        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
    }
}