import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Entre com o valor do cabeçalho: ");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        entrada.close();
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < valor; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.println("Seja bem vindo ao COMEX!");
        for (int i = 0; i < valor; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.println(">>>> Listagem dos Clientes:");

        Cliente cliente1 = new Cliente("Fulano", 1980);
        Cliente cliente2 = new Cliente("Sicrano", 2000);

        System.out.println("_____________________________");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Ano de Nascimento: " + cliente1.getAnoDeNascimento());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Faixa Etária: " + cliente1.getFaixaEtaria());

        System.out.println("_____________________________");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoDeNascimento());
        System.out.println("Idade: " + cliente2.getIdade());
        System.out.println("Faixa Etária: " + cliente2.getFaixaEtaria());

        System.out.println("_____________________________");
        System.out.println("_____________________________");
        System.out.println(">>>> Listagem dos Produtos:");
        System.out.println("_____________________________");

        Produtos produto = new Produtos();
        produto.setNome("Livro");
        produto.setPreco(49.95);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: R$ " + produto.getPreco());

        produto.setNome("Celular");
        produto.setPreco(1470.76);

        System.out.println("_____________________________");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: R$ " + produto.getPreco());

        System.out.println("Fim do sistema");
    }
}
