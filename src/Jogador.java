public class Jogador {
    private String nome;
    private int jogar;
    private Dado dado;

    public Jogador (String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if(nome.isEmpty()){
            System.out.println("Nome vazio, atribuido como 'Jogador sem Nome'");
            this.nome = "Jogador Sem Nome";
        }else{
            this.nome = nome;
        }
    }

    public int getJogar() {
        return jogar;
    }

    private void setJogar(int jogar) {
        if(jogar<1){
            System.out.println("Houve um problema durante o dado girar, atribuido face 1 como padrão");
            this.jogar = 1;
        }else{
            this.jogar = jogar;
        }
    }

    public Dado getDado() {
        return dado;
    }

    //Fiquei na dúvida se aq no setDado precisava fazer alguma validação. 
    private void setDado(Dado dado) {
        this.dado = dado;
    }

    public void jogarDado(Dado dado){
        dado.giraDado();
        setJogar(dado.getValor());
        System.out.println("\n"+ getNome() +", sua face: " + dado.getValor());
    }
}