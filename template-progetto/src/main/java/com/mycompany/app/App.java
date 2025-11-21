import com.mycompany.app.Auto;
import com.mycompany.app.Concessionaria;
import com.mycompany.app.Moto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Auto a = new Auto(700, 2000000, "elettrica", "BMW", "sportiva", "M1", 2024);
        Moto m = new Moto(600, 400000, "benzina", "honda", "sportiva", "rs", 2022);
        Concessionaria c = new Concessionaria("Matteo");
        c.addinventario(a);
        c.addinventario(m);
        System.out.println("il prezzo del veicolo:"+a.valoreFinale());
        System.out.println("il prezzo del veicolo:"+m.valoreFinale());
        System.out.println("l'assicurazione del veicolo:"+a.calcoloAssicurazione());
        System.out.println("l'inventario è:"+ c.getInventario());

    }
}