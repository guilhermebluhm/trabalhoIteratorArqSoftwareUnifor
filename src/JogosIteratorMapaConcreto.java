import java.util.HashMap;
import java.util.Map;

public class JogosIteratorMapaConcreto implements IteratorInterf{

    Map<Integer, Jogos> nSwitch;
    private int current_position = 1;

    public JogosIteratorMapaConcreto(Map<Integer, Jogos> nSwitch) {
        this.nSwitch = nSwitch;
    }

    @Override
    public Jogos next() {
        Jogos jogos = nSwitch.get(current_position);
        current_position+=1;
        return jogos;
    }

    @Override
    public boolean hasNext() {
        if(current_position <= nSwitch.size() && nSwitch.get(current_position) != null)
            return true;
        return false;
    }
}
