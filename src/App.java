
import utilitarios.Teclado;

public class App {
    public static void main(String[] args) throws Exception { 

        //Fiz um pequeno teste e tentei colocar o dado para preencher primeiro, mas ae parece q ficava "poluido" o teclado talvez, pq aparecia o readString ele dava como vazio.
        //Não fui muito a funda para testar o que era, só inverti a ordem para essa de agora e funcionou.
        
        String nome1 = Teclado.readString("Digite o nome do primeiro Jogador : ");
        String nome2 = Teclado.readString("Digite o nome do segundo Jogador : ");

        if(nome1.equals(nome2)){
            nome1 += " 1";
            nome2 += " 2";
        }

        Jogador jogador1 = new Jogador (nome1);
        Jogador jogador2 = new Jogador (nome2);

        int faces = Teclado.readInt("Digite o número de faces do dado: ");
        Dado dado = new Dado(faces);
        


        Jogo jogo = new Jogo();
        
        
        jogo.iniciaJogo(dado, jogador1, jogador2);
    }
}