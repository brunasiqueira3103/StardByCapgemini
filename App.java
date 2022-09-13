
package Heranca;

import java.util.Date;

public class App {


    public static void main(String[] args) {
        System.out.println();
        
        Vendedor v = new Vendedor();
        v.setNome("marcio");
        v.setCpf("7512457");
        v.getDataDeNascimento(new Date());
        v.setSalario(1000.0f);
    
        Motorista m = new Motorista();
        
    }
}
