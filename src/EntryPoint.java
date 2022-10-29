import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntryPoint {

    public static void main(String[] args) {

        List<IteratorInterf> agregadores = new ArrayList<>();

        VetorJogosAgregadorConcreto ps5 = new VetorJogosAgregadorConcreto();
        IteratorInterf instancePs5 = ps5.getInstance();
        ListaJogosAgregadorConcreto xbox = new ListaJogosAgregadorConcreto();
        IteratorInterf instanceXbox = xbox.getInstance();
        MapaJogosAgregadorConcreto nintendoSwitch = new MapaJogosAgregadorConcreto();
        IteratorInterf instanceSwitch = nintendoSwitch.getInstance();

        agregadores.add(instanceXbox);
        agregadores.add(instancePs5);
        agregadores.add(instanceSwitch);

        for (var x : agregadores){
            while(x.hasNext())
                System.out.println(x.next());
        }
    }
}