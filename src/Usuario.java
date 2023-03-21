import java.util.Scanner;

public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();
        Scanner inVal = new Scanner(System.in);


        int opcao;//= inVal.nextInt();
        do  {
            opcao = inVal.nextInt();
            if (opcao == 1 && !smartTv.isLigado) {
                smartTv.setLigado();
            } else if (opcao == 2 && smartTv.isLigado) {
                smartTv.aumentaCanal();
            } else if (opcao == 3 && smartTv.isLigado) {
                smartTv.diminuirCanal();
            } else if (opcao == 4 && smartTv.isLigado) {
                smartTv.aumentaVolume();
            } else if (opcao == 5 && smartTv.isLigado) {
                smartTv.diminuirVolume();
            } else if (opcao == 6 && smartTv.isLigado) {
                int mudarCanalPara = inVal.nextInt();
                smartTv.setCanal(mudarCanalPara);
            } else if (opcao == 7 && smartTv.isLigado) {
                smartTv.setDesligado();
            } else if (opcao >= 2 && opcao <= 5 && !smartTv.isLigado) {
                System.out.println("Ligue a TV!");
            }

            String status = smartTv.isLigado ? "Ligada" : "Desligada";
            System.out.println("A TV esta " + status);
            System.out.println("Canal:  " + smartTv.canal);
            System.out.println("O volume esta em  " + smartTv.volume);
        }while(opcao != 8);
    }
}
