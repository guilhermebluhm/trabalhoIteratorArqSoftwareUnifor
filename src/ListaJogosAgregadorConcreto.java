import java.util.ArrayList;
import java.util.List;

public class ListaJogosAgregadorConcreto implements Agregador{

    List<Jogos> xbox = new ArrayList<>(3);

    public ListaJogosAgregadorConcreto(){}

    @Override
    public IteratorInterf getInstance() {

        xbox.add(new Jogos("Diablo IV", "339.90"));
        xbox.add(new Jogos("Forza", "219.95"));
        xbox.add(new Jogos("Halo", "119.90"));

        return new JogosIteratorListaConcreto(this.xbox);
    }
}
