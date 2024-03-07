import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Por favor digite seu nome: ");
        Scanner eventoDigitarNome = new Scanner(System.in);
        String nome = eventoDigitarNome.nextLine();

        System.out.print("Digite agora sua idade: ");
        Scanner eventoDigitarIdade = new Scanner(System.in);
        Short idade = eventoDigitarIdade.nextShort();

        System.out.println("Seu nome é "+ nome + " e sua idade é " + idade + " anos.");
    }
}
