import java.util.ArrayList;
import java.util.List;

import dominio.pessoa.fisica.Colaborador;

public class App {
    public static void main(String[] args) throws Exception {
        //List<Colaborador> grupo = new ArrayList<>();
        List<Integer> valores = new ArrayList<>();
        valores.add(1000);
        valores.add(352);
        valores.add(54);
        valores.add(652);
        valores.add(987);
        valores.add(65);
        valores.add(981);
        for(int x=0; x < valores.size(); x++){
            System.out.println(valores.get(x));
        }
        for (Integer x : valores) {
            System.out.println(x);
        }
    }
}
