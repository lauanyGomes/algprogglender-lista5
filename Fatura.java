
import java.util.ArrayList;

public class Fatura {

    private ArrayList<Item> itens;

   
    public Fatura() {
        itens = new ArrayList<>();
    }


    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).getValorTotal();
        }

        return total;
    }

    public void exibirFatura() {

        if (itens.size() == 0) {
            System.out.println("Nenhum produto foi comprado.");
        } else {

            System.out.println("\n FATURA ");

            for (int i = 0; i < itens.size(); i++) {
                itens.get(i).exibirItem();
            }

            System.out.println("VALOR TOTAL: R$ " + calcularTotal());
        }
    }
}
