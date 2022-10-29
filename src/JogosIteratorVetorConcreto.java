public class JogosIteratorVetorConcreto implements IteratorInterf {

    private Jogos jogos[];
    private int current_position = 0;

    public JogosIteratorVetorConcreto(Jogos[] jogos) {
        this.jogos = jogos;
    }

    @Override
    public Jogos next() {
        Jogos jogo = jogos[current_position];
        current_position+=1;
        return jogo;
    }

    @Override
    public boolean hasNext() {
        if(current_position < jogos.length && jogos[current_position] != null)
            return true;
        return false;
    }
}
