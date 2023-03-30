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
        System.out.println("A Tv foi Desligada...");
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
        String msgValorValido = "";
        
        if (isLigado) {
            if (opcaoUsuario <= 1 || opcaoUsuario >= 9) {
                
                msgValorValido = 
                        "Erro digite (2 - Subir Canal), (3 - Diminuir Canal), (4 - Aumentar Volume), (5 - Diminuir Volume),"+
                        "(6 - Mudar de Canal), (7 - Desligar Tv) ou (8 - Sair)";
            }else{
                valorValido = true;
            }
        } else {
            if (!(opcaoUsuario == 1) && !(opcaoUsuario == 8)) {
                msgValorValido = "Erro digite (1 - Ligar TV) ou (8 - Sair)";
            } else {
                valorValido = true;
            }
        }
        
        if (valorValido) {

            if (isLigado) {
                switch (opcaoUsuario) {
                    case 2:
                        aumentarCanal();
                        break;
                    case 3:
                        diminuirCanal();
                        break;
                    case 4:
                        aumentarVolume();
                        break;
                    case 5:
                        if (volume > 0) {
                            diminuirVolume();
                        }
                        break;
                    case 6:
                        System.out.println("Mudar para o canal: ");
                        int mudarCanalPara = inVal.nextInt();
                        setCanal(mudarCanalPara);
                        break;
                    case 7:
                    case 8:
                        desligar();
                        break;
                }
                
                Tela(opcaoUsuario);
            } else {

                switch (opcaoUsuario) {
                    case 1:
                        ligar();
                        System.out.println("A Tv foi ligada...");
                        Tela(opcaoUsuario);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        System.out.println("Ligue a TV!");
                        break;
                }
            }
        }else{
            System.out.println(msgValorValido);
        }
        return valorValido;
    }

    public void Tela(int opcaoUsuario){
        if (!(opcaoUsuario == 7) && !(opcaoUsuario == 8)){
            System.out.println("               ");
            System.out.println("._________________________________.");
            System.out.println("|                                 |");           
            System.out.println("|            Tv Ligada            |");
            System.out.println("|      Canal:  " + canal + "                  |");
            String volumeDesc = volume <= 0 ? "Mudo" : String.valueOf(volume);
            System.out.println("|     Volume:  " + volumeDesc + "                 |");
            System.out.println("|                                 |");
            System.out.println("|_________________________________|");
            System.out.println("      |                    |       ");
            System.out.println("               ");
        }else{
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
}
