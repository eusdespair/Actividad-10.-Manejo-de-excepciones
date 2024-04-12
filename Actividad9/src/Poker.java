import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.start();
    }

    public void start() {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Poker!");
        int option = -1;


        do {
            try {
                option = showMenu(scanner);
                switch (option) {
                    case 1:
                        deck.shuffle();
                        break;
                    case 2:
                        deck.head();
                        break;
                    case 3:
                        deck.pick();
                        break;
                    case 4:
                        deck.hand();
                        break;
                    case 0:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (option != 0);

        scanner.close();
    }

    public int showMenu(Scanner scanner) throws Exception {
        System.out.println("Selecciona una opción:");
        System.out.println("1 Mezclar deck");
        System.out.println("2 Sacar una carta");
        System.out.println("3 Carta al azar");
        System.out.println("4 Generar una mano de 5 cartas");
        System.out.println("0 Salir");

        int option = scanner.nextInt();
        if (option < 0 || option > 4) {
            throw new Exception("Opción no válida");
        }
        return option;
    }
}
