package application;

import entities.Produto;
import entities.Venda;
import entities.Vendedor;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        while (true){
            try {
                System.out.println("--------------------- BEM VINDO(A) ---------------------");
                System.out.println("DIGITE (1) PARA CADASTRAR VENDEDOR  E REALIZAR UMA VENDA");
                System.out.println("DIGITE (0) PARA ENCERRAR O PROGRAMA");
                String escolha = sc.nextLine();

                if(escolha.equals("1")){
                    System.out.print("Digite o nome do vendedor: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o endereço do vendedor: ");
                    String endereco = sc.nextLine();
                    System.out.print("Digite o código do vendedor: ");
                    String codigoVendedor = sc.nextLine();
                    System.out.print("Digite a comissão do vendedor: ");
                    Double comissao = sc.nextDouble();
                    sc.nextLine();
                    Vendedor vendedor = new Vendedor(nome,codigoVendedor, endereco, comissao);

                    System.out.print("Informe o código do produto: ");
                    String codigoProduto = sc.nextLine();
                    System.out.print("Informe o produto: ");
                    String descricao = sc.nextLine();
                    System.out.print("Informe a quantidade de itens: ");
                    int quantidadeDeItens = sc.nextInt();
                    System.out.print("Informe o preço da venda: ");
                    double valorVenda = sc.nextDouble();
                    System.out.print("Informe o preço da compra: ");
                    double valorCusto = sc.nextDouble();
                    System.out.print("O produto está em promoção? S / N - ");
                    char promocao = Character.toUpperCase(sc.next().charAt(0));
                    System.out.print("Informe a porcentagem de desconto: ");
                    double desconto = sc.nextDouble();
                    sc.nextLine();


                    Produto produto = new Produto(codigoProduto, descricao, valorVenda, valorCusto, promocao);


                    System.out.println();
                    System.out.println();

                    Venda venda = new Venda();
                    venda.setVendedor(vendedor);
                    venda.setProduto(produto);
                    venda.setQuantidadeDeItens(quantidadeDeItens);
                    venda.efetuarDesconto(vendedor.getComissao());
                    venda.calcularValor();
                    venda.calcularComissao();



                    System.out.println("----- REGISTRO DE VENDA -----");
                    venda.imprimir();


                    System.out.println();
                    System.out.println();

                } else if (escolha.equals("0")) {
                    System.out.println("Programa encerrado!");
                    break;
                }else{
                    System.out.println("Digite um valor válido!");
                    System.out.println();
                }
            }catch (InputMismatchException e){
                System.out.println("Error - O valor digitado não foi válido! O programa será reiniciado!");
                sc.nextLine();
            }

        }

    }
}
