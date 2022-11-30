package entities;

public class Vendedor {

    //Atributos
    private String nome;
    private String codigo;
    private Double comissao;
    private String endereco;

    //Construtor
    public Vendedor(){

    }
    public Vendedor(String nome, String codigo, String endereco, Double comissao) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
        this.comissao = comissao;
    }

    //Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
