package ba.unsa.etf.rpr;

public class UniverzitetskiGrad extends Grad {
    private String nazivUniverziteta;

    public UniverzitetskiGrad() {

    }

    public UniverzitetskiGrad(int id, String naziv, int brojStanovnika, Drzava drzava, String nazivUniverziteta) {
        super(id, naziv, brojStanovnika, drzava);
        this.nazivUniverziteta = nazivUniverziteta;
    }

    public String getNazivUniverziteta() {
        return nazivUniverziteta;
    }

    public void setNazivUniverziteta(String nazivUniverziteta) {
        this.nazivUniverziteta = nazivUniverziteta;
    }
}
