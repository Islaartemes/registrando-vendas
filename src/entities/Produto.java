package entities;

public class Produto {

    //Atributos
    private String codigo;
    private String descricao;
    private Double valorVenda;
    private Double valorCusto;
    private char promocao;

    //Construtor
    public Produto(){

    }
    public Produto(String codigo, String descricao, Double valorVenda, Double valorCusto, char promocao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }

    //Métodos Get e Set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public char getPromocao() {
        return promocao;
    }

    public void setPromocao(char promocao) {
        this.promocao = promocao;
    }
}
