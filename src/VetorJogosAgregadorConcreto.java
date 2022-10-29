public class VetorJogosAgregadorConcreto implements Agregador{

    Jogos ps5[] = new Jogos[3];

    public VetorJogosAgregadorConcreto(){

    }

    @Override
    public IteratorInterf getInstance() {
        ps5[0] = new Jogos("Diablo IV", "299.90");
        ps5[1] = new Jogos("God of War", "199.79");
        ps5[2] = new Jogos("Crash Bandicoot", "399.90");
        return new JogosIteratorVetorConcreto(this.ps5);
    }
}
