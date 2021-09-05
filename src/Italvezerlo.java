import java.util.Scanner;

public class Italvezerlo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ital pia = new Ital();
        Ember pias = new Ember();
        System.out.print("Hogy hívnak? ");
        pias.nev = sc.next();
        System.out.print("Hány kiló vagy? ");
        pias.kilogramm = sc.nextInt();
        int mitCsinalsz;

        do {
            System.out.println("Mit csinálsz?");
            System.out.println("1 - iszol");
            System.out.println("2 - pihensz");
            System.out.println("3 - kilépsz");
            double pihenOra;
            mitCsinalsz = sc.nextInt();


            switch (mitCsinalsz) {
                case 1:
                    System.out.print("Mit iszol? ");
                    pia.nev = sc.next();
                    System.out.print("Hány százalékos alkoholtartalmú? ");
                    pia.szazalek = sc.nextDouble();
                    System.out.print("Mennyit iszol belőle? ");
                    pia.ml = sc.nextInt();
                    pias.megiszik(pia);
                    System.out.printf(pias.nev+" véralkoholszintje: "+"%.2f gramm, azaz %.2f ezrelék.%n",pias.alkoholGramm,
                            pias.veralkoholEzrelek());
                    System.out.printf("A teljes józansághoz %.2f óra pihenésre van szükséged.",pias.getJozanIdo());
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Mennyit pihensz? ");
                    pihenOra = sc.nextDouble();
                    pias.pihen(pihenOra);
                    System.out.printf(pias.nev+" véralkoholszintje: "+"%.2f gramm, azaz %.2f ezrelék.%n",pias.alkoholGramm,
                            pias.veralkoholEzrelek());
                    System.out.printf("A teljes józansághoz %.2f óra pihenésre van szükséged.",pias.getJozanIdo());
                    System.out.println();
                    break;
            }


        } while (mitCsinalsz!=3);
        System.out.printf(pias.nev+" véralkoholszintje: "+"%.2f gramm, azaz %.2f ezrelék.%n",pias.alkoholGramm,
                pias.veralkoholEzrelek());
        System.out.printf("A teljes józansághoz %.2f óra pihenésre van szükséged.",pias.getJozanIdo());
    }
}
