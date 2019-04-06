import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        TombGeneral tombGeneralas = new TombGeneral();
        int[] tomb_10_0_100 = tombGeneralas.tombVissza(10, 0, 100);
        System.out.println("Tömb: 10 elemű, 0-100:");
        System.out.println(Arrays.toString(tomb_10_0_100));
        System.out.println();

        System.out.println("Első öt szám:");
        for (int i = 0; i < 5; i++) {
            System.out.println(tomb_10_0_100[i]);
        }
        System.out.println();

        System.out.println("Utolsó öt szám:");
        for (int i = 0; i < 5; i++) {
            System.out.println(tomb_10_0_100[i+5]);
        }
        System.out.println();

        int tmpOsszeg = tomb_10_0_100[0] + tomb_10_0_100[tomb_10_0_100.length-1];
        System.out.println("Első és utolsó összege: " + tmpOsszeg);
        System.out.println();

        System.out.println("Fordított sorrendben:");
        for (int i = tomb_10_0_100.length-1; i >= 0; i--){
            System.out.println(tomb_10_0_100[i]);
        }
        System.out.println();

        int tmpDb = 0;
        for (int i = 0; i < tomb_10_0_100.length; i++){
            if (i < (tomb_10_0_100.length-1) && tomb_10_0_100[i] < tomb_10_0_100[i+1]){
                tmpDb++;
            }
        }
        System.out.println(tmpDb + " darab olyan elem van amit egy tőle nagyobb követ.");
        System.out.println();

        int[] tomb_10_0_20 = tombGeneralas.tombVissza(10, 0, 20);
        System.out.println("Tömb: 10 elemű, 0-20:");
        System.out.println(Arrays.toString(tomb_10_0_20));
        System.out.println();

        boolean egyenloek = false;
        for (int i = 0; i < tomb_10_0_20.length; i++){
            if (i < (tomb_10_0_20.length-1) && tomb_10_0_20[i] == tomb_10_0_20[i+1]){
                egyenloek = true;
            }
        }
        if (egyenloek){
            System.out.println("Van egymás mellett két egyforma szám.");
            System.out.println();
        }

        int[] tomb_20_0_10 = tombGeneralas.tombVissza(20, 0, 10);
        System.out.println("Tömb: 20 elemű, 0-10:");
        System.out.println(Arrays.toString(tomb_20_0_10));
        System.out.println();

        egyenloek = false;
        for (int i = 0; i < tomb_20_0_10.length; i++){
            if (i < (tomb_20_0_10.length-2) && tomb_20_0_10[i] == tomb_20_0_10[i+1] && tomb_20_0_10[i] == tomb_20_0_10[i+2]){
                egyenloek = true;
            }
        }
        if (egyenloek){
            System.out.println("Van egymás mellett három egyforma szám.");
            System.out.println();
        }

        for (int i = 0; i < tomb_10_0_20.length; i++) {
            if (i < (tomb_10_0_20.length-1) && (tomb_10_0_20[i]*2) == tomb_10_0_20[i+1]){
                System.out.println("A " + (i+1) + "-ik elem (" + tomb_10_0_20[i+1] + ") kétszerese az előte következőnek (" + tomb_10_0_20[i] + ")");
            }
        }
        System.out.println();

        int[] tomb_5_0_1000 = tombGeneralas.tombVissza(5, 0, 1000);
        System.out.println("Tömb: 5 elemű, 0-1000:");
        System.out.println(Arrays.toString(tomb_5_0_1000));
        System.out.println();

        boolean novekvo = true;
        for (int i = 0; i < tomb_5_0_1000.length; i++) {
            if (i < tomb_5_0_1000.length-1 && tomb_5_0_1000[i] >= tomb_5_0_1000[i+1]){
                novekvo = false;
            }
        }
        if (!novekvo) {
            System.out.println("A tömb nem növekvő sorrendbe generálódott.");
            System.out.println();
        }

        for (int i = 0; i < tomb_10_0_20.length; i++) {
            if (i < tomb_10_0_20.length-2 && tomb_10_0_20[i+1] == (tomb_10_0_20[i] + tomb_10_0_20[i+2])){
                System.out.println("A " + (i+1) + ".-ik (" + tomb_10_0_20[i+1] + ") elem a szomszédai összegével egyenlő. (" + tomb_10_0_20[i] + " és " + tomb_10_0_20[i+2] + ")");
            }
        }
        System.out.println();

        int[] tombOt_0_5 = new int[5];
        System.out.println("5 elemű: 0-5");
        for (int i = 0; i < tombOt_0_5.length; i++) {
            tombOt_0_5[i] = (int) (Math.random()*6);
            System.out.print(tombOt_0_5[i] + " ");
        }

        int[] tomb_5_0_5 = tombGeneralas.tombVissza(5, 0, 5);
        System.out.println("Tömb: 5 elemű, 0-5:");
        System.out.println(Arrays.toString(tomb_5_0_5));
        System.out.println();

        egyenloek = true;
        for (int i = 0; i < tomb_5_0_5.length; i++) {
            if (tomb_5_0_5[i] != tomb_5_0_5[(tomb_5_0_5.length-1) - i]){
                egyenloek = false;
            }
        }
        System.out.println(egyenloek ? "A tömb előlről és hátulról is ugyanaz." : "A tömb előlről és hátulról nem ugyanaz.");
        System.out.println();

        int segedSzam = (int)(Math.random()*5+1);
        System.out.print("SegédSzám: " + segedSzam + " | Tömb: " + Arrays.toString(tomb_10_0_20) + " | Kiválogatás: { ");
        for (int i = 0; i < tomb_10_0_20.length; i++) {
            if (i < segedSzam || i >= (tomb_10_0_20.length-segedSzam)){
                System.out.print(tomb_10_0_20[i] + " ");
            }
        }
        System.out.print("}");
        System.out.println();

        System.out.print("SegédSzám: " + segedSzam + " | Tömb: " + Arrays.toString(tomb_10_0_20) + " | Kiválogatás: { ");
        for (int i = 0; i < segedSzam; i++) {
            System.out.print(tomb_10_0_20[i] + " ");
        }
        for (int i = tomb_10_0_20.length-1; i >= (tomb_10_0_20.length-segedSzam); i--) {
            System.out.print(tomb_10_0_20[i] + " ");
        }
        System.out.print("}");
        System.out.println();
        System.out.println();

        segedSzam = (int)(Math.random()*4+4);
        int[] tomb_random_0_20 = tombGeneralas.tombVissza(segedSzam, 0, 20);
        int eleje = 0, vege, cMag = 0;
        boolean lehetTorni = false;

        for (int i = 0; i < tomb_random_0_20.length-1; i++) {
            eleje += tomb_random_0_20[i];
            vege = 0; cMag = 0;
            for (int j = i+1; j < tomb_random_0_20.length; j++) {
                vege += tomb_random_0_20[j];
            }
            //System.out.println("Segéd: " + segedSzam + " | Tömb: " + Arrays.toString(tomb_random_0_20) + " | Eleje: " + eleje + " | Vege: " + vege);
            if (eleje == vege) {
                lehetTorni = true;
                cMag = i;
                break;
            }
        }
        System.out.print(Arrays.toString(tomb_random_0_20) + " --> ");
        if (lehetTorni){
            System.out.print("igen: { ");

            for (int i = 0; i <= cMag; i++) {
                System.out.print(tomb_random_0_20[i] + " ");
            }
            System.out.print("} { ");

            for (int i = cMag+1; i < tomb_random_0_20.length; i++) {
                System.out.print(tomb_random_0_20[i] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
        else {
            System.out.print("nem");
        }
        System.out.println();
    }
}
