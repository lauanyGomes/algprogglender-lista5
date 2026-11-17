
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

  Scanner usuario = new Scanner(System.in);
 
   Produto p1 = new Produto("Mouse", 1, 50.00);
   Produto p2 = new Produto("Teclado", 2, 100.00);
   Produto p3 = new Produto("Monitor", 3, 800.00);
        
   Fatura fatura = new Fatura();

  int opcao;

  do {

     System.out.println("\n LOJA DE SUPRIMENTOS ");
     System.out.println("1 - Comprar");
      System.out.println("2 - Ver Fatura");
      System.out.println("3 - Encerrar Programa");
      System.out.print("Escolha uma opção: ");

      opcao = usuario.nextInt();

       switch (opcao) {

        case 1:
   
         System.out.println("\n PRODUTOS ");

         p1.exibirProduto();
           p2.exibirProduto();
            p3.exibirProduto();

      System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade: ");
         int quantidade = sc.nextInt();

          Produto produtoEscolhido = null;
                    
     if (codigo == 1) {
      } else if (codigo == 2) {
       produtoEscolhido = p2;
    } else if (codigo == 3) {
     produtoEscolhido = p3;
      }

     if (produtoEscolhido != null && quantidade > 0) {

        Item item = new Item(produtoEscolhido, quantidade);

         fatura.adicionarItem(item);

         System.out.println("Produto adicionado à fatura!");

          } else {
               System.out.println("Código inválido ou quantidade incorreta!");
          }
            break;
        case 2:
                  
    fatura.exibirFatura();

          break;
      case 3:

        System.out.println("Programa encerrado!");

        break;
          default:

           System.out.println("Opção inválida!");
         }

    } while (opcao != 3);

     usuario.close();
    }
}
