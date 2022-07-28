package sp.senai;

public class Produto {

    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public Produto(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(nome.length() > 1){
            this.nome = nome;
            return true;
        }
        else{
            return false;
        }

    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean setQuantidade(int quantidade) {
        if(quantidade >= 0){
            this.quantidade = quantidade;
            return true;
        }
        else{
            return false;
        }

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString(){
        return nome;
    }

}
