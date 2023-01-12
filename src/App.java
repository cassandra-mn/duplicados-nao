import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> frutas = new Frutas(new String[]{"Banana", "Manga", "Abacaxi", "Abacate", "Carambola", "Limao"}).frutas;
        List<String> sucos = new Frutas(new String[]{"Caju", "Morango", "Goiaba", "Manga", "Abacaxi", "Limao"}).frutas;
        List<String> duplicadas = new ArrayList<>();

        for (int i = 0; i < frutas.size(); i++) {
            if (sucos.contains(frutas.get(i))) {
                duplicadas.add(frutas.get(i));
            }
        }

        System.out.println(duplicadas);
    }
}
