import java.util.Scanner;

public class SmartTv {
    Scanner inVal = new Scanner(System.in);
    int canal = 5;
    int volume = 10;
    boolean isLigado = false;

    public void setCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void ligar() {
        isLigado = true;
    }

    public void desligar() {
        isLigado = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public boolean controlaSmartTv(int opcaoUsuario) {
        boolean valorValido = false;

        if (!isLigado && (!(opcaoUsuario == 1) && !(opcaoUsuario== 8))){
            System.out.println("Erro digite (1 - Ligar TV) ou (8 - Sair)");
        }else if(isLigado && ((opcaoUsuario == 1) || (opcaoUsuario== 8))) {
            valorValido = true;
        } else if (isLigado && opcaoUsuario <= 1 || opcaoUsuario >= 9) {
            System.out.println("Erro digite (2 - Subir Canal), (3 - Diminuir Canal), (4 - Aumentar Volume), (5 - Diminuir Volume),");
            System.out.println("(6 - Mudar de Canal), (7 - Desligar Tv) ou (8 - Sair)");
        }else{
            valorValido = true;
        }

        if(valorValido) {
            if (opcaoUsuario == 1 && !isLigado) {
                ligar();
                System.out.println("A Tv foi ligada...");
            } else if (opcaoUsuario == 2 && isLigado) {
                aumentarCanal();
            } else if (opcaoUsuario == 3 && isLigado) {
                diminuirCanal();
            } else if (opcaoUsuario == 4 && isLigado) {
                aumentarVolume();
            } else if (opcaoUsuario == 5 && isLigado) {
                if (volume > 0) {
                    diminuirVolume();
                }
            } else if (opcaoUsuario == 6 && isLigado) {
                System.out.println("Mudar para o canal: ");
                int mudarCanalPara = inVal.nextInt();
                setCanal(mudarCanalPara);
            } else if (opcaoUsuario == 7 && isLigado) {
                desligar();
                System.out.println("A Tv foi Desligada...");
            } else if (opcaoUsuario >= 2 && opcaoUsuario <= 7 && !isLigado) {
                System.out.println("Ligue a TV!");
            }

            if (isLigado) {
                System.out.println("               ");
                System.out.println("._________________________________.");
                System.out.println("|                                 |");
                if (opcaoUsuario != 8) {
                    System.out.println("|            Tv Ligada            |");
                    System.out.println("|      Canal:  " + canal + "                  |");
                    String volumeDesc = volume <= 0 ? "Mudo" : String.valueOf(volume);
                    System.out.println("|     Volume:  " + volumeDesc + "                 |");
                } else {
                    System.out.println("|           Tv Desligada          |");
                    System.out.println("|                                 |");
                }
                System.out.println("|                                 |");
                System.out.println("|_________________________________|");
                System.out.println("      |                    |       ");
            } else {
                System.out.println("               ");
                System.out.println("._________________________________.");
                System.out.println("|                                 |");

                System.out.println("|           Tv Desligada          |");
                System.out.println("|                                 |");

                System.out.println("|                                 |");
                System.out.println("|_________________________________|");
                System.out.println("      |                    |       ");
            }
        }
        return valorValido;
    }
}
