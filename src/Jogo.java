public class Jogo {
    Jogador jogador1, jogador2;

    void iniciaJogo(Dado dado, Jogador jogador1, Jogador jogador2){

        //fiquei na dúvida se colocava isso e deixava o setNome public no jogador ou já garantia que ia vir diferente desde da App.java, 
        //por questão de segurança preferi mudar na app.java e deixar o setNome private

        /*if(jogador1.getNome().equals(jogador2.getNome())){
            jogador1.setNome(jogador1.getNome() + " 1");
            jogador2.setNome(jogador2.getNome() + " 2");
        }*/

        do {
            System.out.println("\n" + jogador1.getNome() + ", é sua vez!");
                jogador1.jogarDado(dado);
            System.out.println("\n------------------");
            System.out.println("\n" + jogador2.getNome() + ", é sua vez!");
            jogador2.jogarDado(dado);
            System.out.println("\n------------------");
            
            if (jogador1.getJogar()== jogador2.getJogar()) {
                System.out.println("Empate! Jogue de novo.");
            } else if (jogador1.getJogar() > jogador2.getJogar()){
                System.out.println("\n" + jogador1.getNome() + ", você venceu!\n" + "Placar: " + jogador1.getJogar() + " x " + jogador2.getJogar());
                break;
            } else {
                System.out.println("\n" + jogador2.getNome() + ", você venceu!\n" + "Placar: " + jogador1.getJogar() + " x " + jogador2.getJogar());
                break;
            }
            System.out.println("\n------------------");
        } while (true);
    }
}