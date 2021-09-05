public class Ember {
    String nev;
    int kilogramm;
    double alkoholGramm;

    void megiszik(Ital ital)
    {
        alkoholGramm = alkoholGramm + ital.getAlkoholGramm();
    }

    void pihen(double Ora)
    {
        if (this.alkoholGramm - 9.0 * Ora < 0)
        {
            this.alkoholGramm = 0;
        }
        else
            this.alkoholGramm = this.alkoholGramm - 9.0 * Ora;
    }

    double veralkoholEzrelek()
    {

        return (alkoholGramm) / kilogramm;
    }

    double getJozanIdo()
    {

        return alkoholGramm / 9.0;
    }

}
