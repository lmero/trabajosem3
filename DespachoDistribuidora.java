import java.util.Scanner;

public class DespachoDistribuidora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario:");
        String nombreUsuario = scanner.nextLine();
        
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Ingrese la marca del vehículo:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese la cilindrada del vehículo:");
        int cilindrada = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el tipo de combustible del vehículo:");
        String tipoCombustible = scanner.nextLine();

        System.out.println("Ingrese la capacidad en pasajeros del vehículo:");
        int capacidadPasajeros = scanner.nextInt();

        // Mostrar los datos ingresados por el usuario
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        scanner.close();
    }
}
