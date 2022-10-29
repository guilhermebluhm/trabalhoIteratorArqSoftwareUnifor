import java.util.HashMap;
import java.util.Map;

public class MapaJogosAgregadorConcreto implements Agregador{

    Map<Integer, Jogos> nSwitch = new HashMap<>(3);

    public MapaJogosAgregadorConcreto(){}

    @Override
    public IteratorInterf getInstance() {

        nSwitch.put(1, new Jogos("Kirby in fucking island","199.90"));
        nSwitch.put(2, new Jogos("Mario bros when save again the princess","99.90"));
        nSwitch.put(3, new Jogos("Zelda is boring","79.90"));

        return new JogosIteratorMapaConcreto(this.nSwitch);
    }
}
