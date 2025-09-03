public class Dado {
    private int valor;
    private int faces;

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }

    public int getFaces() {
        return faces;
    }

    private void setFaces(int faces) {
        this.faces = faces;
    }

    public Dado (int faces){
        if (faces < 2){
            System.out.println("\nFoi atribuido 2 faces ao dado por não atingir faces mínimas");
            setFaces(faces);
        }else{
            setFaces(faces);
        };
    };

    void giraDado(){
        int rand;
        rand = (int)(Math.random() * 3) + 1;
        for(int i = 0; i<rand; i++){
            setValor((int)(Math.random() * faces) +1);
            System.out.println("\nRodando dado: " + getValor());
        }
        System.out.println("\nParou em :" + getValor());
    };
    
}