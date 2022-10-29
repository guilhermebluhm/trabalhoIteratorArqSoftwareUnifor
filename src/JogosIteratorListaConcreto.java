import java.util.ArrayList;
import java.util.List;

public class JogosIteratorListaConcreto implements IteratorInterf{

    private List<Jogos> xbox = new ArrayList<>(3);
    private int current_position = 0;

    public JogosIteratorListaConcreto(List<Jogos> xbox) {
        this.xbox = xbox;
    }

    @Override
    public Jogos next() {
        Jogos jogos = xbox.get(current_position);
        current_position+=1;
        return jogos;
    }

    @Override
    public boolean hasNext() {
        if(current_position < xbox.size() && xbox.get(current_position) != null)
            return true;
        return false;
    }
}
