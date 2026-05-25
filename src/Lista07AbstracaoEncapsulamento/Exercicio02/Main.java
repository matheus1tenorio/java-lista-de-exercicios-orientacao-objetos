package Lista07AbstracaoEncapsulamento.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("PlayStation 5 PRO", 5000, 10);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade no Estoque: " + produto.getQuantidade() + " itens");
        System.out.println(" ");

        produto.comprarProduto();
        System.out.println("Quantidade no Estoque: " + produto.getQuantidade() + " itens");
        produto.comprarProduto();
        System.out.println("Quantidade no Estoque: " + produto.getQuantidade() + " itens");
        produto.comprarProduto();
        produto.comprarProduto();
        produto.comprarProduto();
        produto.comprarProduto();
        produto.comprarProduto();
        produto.comprarProduto();
        produto.comprarProduto();
        produto.comprarProduto();
        produto.comprarProduto();
        System.out.println("Quantidade no Estoque: " + produto.getQuantidade() + " itens");
    }
}
