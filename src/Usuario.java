import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();// instancia a classe para uso na classe usuario.

        try (Scanner valorEntrada = new Scanner(System.in)) {
            int opcaoUsuario;

            do { // inicio do loop
                if (!smartTv.isLigado) {
                    System.out.println("1 - Ligar TV");
                    System.out.println("8 - Sair");
                }
                if (smartTv.isLigado) {
                    System.out.println("2 - Subir Canal");
                    System.out.println("3 - Diminuir Canal");
                    System.out.println("4 - Aumentar Volume");
                    System.out.println("5 - Diminuir Volume");
                    System.out.println("6 - Mudar de Canal");
                    System.out.println("7 - Desligar Tv");
                    System.out.println("8 - Sair");
                }
                opcaoUsuario = valorEntrada.nextInt(); // le o proximo valor digitado pelo usuario.

                // chama o metodo da classe smartTv passando o valor digitado pelo usuario e
                // recebe o retorno.
                boolean valorDigitadoValido = smartTv.controlaSmartTv(opcaoUsuario);

                if (!smartTv.isLigado && valorDigitadoValido) {
                    break;
                }
            } while (opcaoUsuario != 8); // Repete enquanto o usuario nao digitar 8 para sair.
        }
    }
}
