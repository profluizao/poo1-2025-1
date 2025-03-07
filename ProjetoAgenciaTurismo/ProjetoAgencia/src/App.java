import java.time.LocalDate;

import dominio.pessoa.Passageiro;

public class App {
    public static void main(String[] args) throws Exception {
        Passageiro p1 = 
            new Passageiro(1, 
            LocalDate.now(), 
            null, 
            "Naruto Uzumaki", 
            "321654987", 
            "uzumaki.naruto@anime.com", 
            "321.456.789-98", 
            "123456789");
            System.out.println(p1.toString());
    }
}
