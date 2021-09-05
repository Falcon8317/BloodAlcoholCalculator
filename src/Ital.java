public class Ital {
    String nev;
    double szazalek;
    int ml;

    double getAlkoholGramm()
    {
        return 0.8 * ml * szazalek / 100.0;
    }
}
