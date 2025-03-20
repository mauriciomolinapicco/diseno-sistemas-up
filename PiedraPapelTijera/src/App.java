import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Elemento del usuario
        Elemento elementoUsuario;
        Elemento elementoPC;

        while(true) {
            System.out.print("Elija piedra papel o tijera (minuscula): ");
            String eleccion = scanner.nextLine();
    
            switch(eleccion) {
                case "piedra": 
                    elementoUsuario = new Piedra();
                    break;
                case "papel":
                    elementoUsuario = new Papel();
                    break;
                case "tijera":
                    elementoUsuario = new Tijera();
                    break;
                default:
                System.out.println("Opcion incorrecta...");
                    continue;
            }
            break;
        }
        
        //elemento de la pc
        Random random = new Random();
        int randVal = random.nextInt(3);
        switch(randVal) {
            case 1: 
                elementoPC = new Piedra();
                break;
            case 2:
                elementoPC = new Papel();
                break;
            case 3:
                elementoPC = new Tijera();
                break;
            default:
                elementoPC = new Piedra();
                break;
        }     
        
        System.out.println("Tu elemento: " + elementoUsuario.toString());
        System.out.println("Elemento de la PC: " + elementoPC.toString());
        System.out.println(elementoPC.juegaContra(elementoUsuario));
    }
}