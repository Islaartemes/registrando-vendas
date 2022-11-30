package entities;

public class Venda {
    //Atributos
    private Produto produto;
    private Vendedor vendedor;
    private Double desconto; //em reais
    private Integer quantidadeDeItens;
    private Double valor;

    //Construtor



    //Métodos Get e Set
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(Integer quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    //Métodos
    public double calcularValor(){
        valor = (produto.getValorVenda() - desconto) *quantidadeDeItens;
        return valor;
    }

    public double calcularComissao(){
        double comissao = (produto.getValorVenda() * vendedor.getComissao()) / 100;
        if(produto.getPromocao() == 'S'){
            comissao /= 2;
        }
        return comissao;
    }

    public double efetuarDesconto(double porcentagemDeDesconto){
        desconto = produto.getValorVenda() * porcentagemDeDesconto / 100;
        if(produto.getValorVenda() - desconto < produto.getValorCusto()){
            System.out.println("O desconto não poderá ser realizado!");
        }
        return desconto;

    }

    public void imprimir(){
        System.out.println("Código do Vendedor: " + vendedor.getCodigo());
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Comissão pela venda: " + vendedor.getComissao());
        System.out.println("Quantidade de itens vendidos: " + quantidadeDeItens);
        System.out.println("Código do Produto: " + produto.getCodigo());
        System.out.println("Descrição do produto: " + produto.getDescricao());
        System.out.println("Promoção: " + produto.getPromocao());
        System.out.println("Valor do desconto sobre o produto: " + desconto);
        System.out.println("Valor total da venda: " + calcularValor());
    }
}
