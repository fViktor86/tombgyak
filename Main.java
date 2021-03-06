import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Feladatok: https://www.webotlet.hu/?p=993");
        System.out.println();

        TombGeneral tombGeneralas = new TombGeneral();
        int[] tomb_10_0_100 = tombGeneralas.tombVissza(10, 0, 100);
        System.out.println("Tömb: 10 elemű, 0-100:");
        System.out.println(Arrays.toString(tomb_10_0_100));
        System.out.println();

        System.out.println("1. feladat");
        System.out.println("Első öt szám:");
        for (int i = 0; i < 5; i++) {
            System.out.println(tomb_10_0_100[i]);
        }
        System.out.println();

        System.out.println("2. feladat");
        System.out.println("Utolsó öt szám:");
        for (int i = 0; i < 5; i++) {
            System.out.println(tomb_10_0_100[i+5]);
        }
        System.out.println();

        System.out.println("3. feladat");
        int tmpOsszeg = tomb_10_0_100[0] + tomb_10_0_100[tomb_10_0_100.length-1];
        System.out.println("Első és utolsó összege: " + tmpOsszeg);
        System.out.println();

        System.out.println("4. feladat");
        System.out.println("Fordított sorrendben:");
        for (int i = tomb_10_0_100.length-1; i >= 0; i--){
            System.out.println(tomb_10_0_100[i]);
        }
        System.out.println();

        System.out.println("5. feladat");
        int tmpDb = 0;
        for (int i = 0; i < tomb_10_0_100.length; i++){
            if (i < (tomb_10_0_100.length-1) && tomb_10_0_100[i] < tomb_10_0_100[i+1]){
                tmpDb++;
            }
        }
        System.out.println(tmpDb + " darab olyan elem van amit egy tőle nagyobb követ.");
        System.out.println();

        System.out.println("6. feladat");
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

        System.out.println("7. feladat");
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

        System.out.println("8. feladat");
        for (int i = 0; i < tomb_10_0_20.length; i++) {
            if (i < (tomb_10_0_20.length-1) && (tomb_10_0_20[i]*2) == tomb_10_0_20[i+1]){
                System.out.println("A " + (i+1) + "-ik elem (" + tomb_10_0_20[i+1] + ") kétszerese az előte következőnek (" + tomb_10_0_20[i] + ")");
            }
        }
        System.out.println();

        System.out.println("9. feladat");
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
        System.out.println(novekvo ? "A tömb növekvő sorrendbe generálódott." : "A tömb nem növekvő sorrendbe generálódott.");
        System.out.println();

        System.out.println("10. feladat");
        for (int i = 0; i < tomb_10_0_20.length; i++) {
            if (i < tomb_10_0_20.length-2 && tomb_10_0_20[i+1] == (tomb_10_0_20[i] + tomb_10_0_20[i+2])){
                System.out.println("A " + (i+1) + ".-ik (" + tomb_10_0_20[i+1] + ") elem a szomszédai összegével egyenlő. (" + tomb_10_0_20[i] + " és " + tomb_10_0_20[i+2] + ")");
            }
        }
        System.out.println();

        System.out.println("11. feladat és 14. feladat");
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

        System.out.println("12. feladat");
        int segedSzam = (int)(Math.random()*5+1);
        System.out.print("SegédSzám: " + segedSzam + " | Tömb: " + Arrays.toString(tomb_10_0_20) + " | Kiválogatás: { ");
        for (int i = 0; i < tomb_10_0_20.length; i++) {
            if (i < segedSzam || i >= (tomb_10_0_20.length-segedSzam)){
                System.out.print(tomb_10_0_20[i] + " ");
            }
        }
        System.out.print("}");
        System.out.println();

        System.out.println("13. feladat");
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

        System.out.println("15. feladat");
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
        System.out.println();

        System.out.println("16. feladat");
        int[] tomb_10__30_100 = new int[10];
        int tmpErtek = 0;
        for (int i = 0; i < tomb_10__30_100.length; i++) {
            do{
                tmpErtek = (int)(Math.random()*131-30);
            }
            while (tmpErtek % 2 == 0);
            tomb_10__30_100[i] = tmpErtek;
        }
        System.out.println(Arrays.toString(tomb_10__30_100));
        System.out.println();

        System.out.println("17. feladat");
        ArrayList<Integer> lottoSzamok = new ArrayList<>();
        int db = 0, csere;
        do {
            tmpErtek = (int) (Math.random()*90+1);
            if (!lottoSzamok.contains(tmpErtek)){
                lottoSzamok.add(tmpErtek);
                db++;
            }
        }
        while (db != 5);
        for (int i = 0; i < lottoSzamok.size()-1; i++) {
            for (int j = i+1; j < lottoSzamok.size(); j++) {
                if( lottoSzamok.get(i) > lottoSzamok.get(j) ){
                    csere = lottoSzamok.get(i);
                    lottoSzamok.set(i, lottoSzamok.get(j));
                    lottoSzamok.set(j, csere);
                }
            }
        }
        System.out.print("Éééés az eheti nyertes lottószámok: ");
        for (Integer i : lottoSzamok){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("18. feladat");
        segedSzam = (int)(Math.random()*4+6);
        int[] tomb_random00_0_9 = tombGeneralas.tombVissza(segedSzam, 0, 9);
        ArrayList<Integer> kiirashoz00ArrList = new ArrayList<>();
        int index = 1;
        boolean vanBenneIsmetlodo = false;

        System.out.println(Arrays.toString(tomb_random00_0_9));

        do {
            ArrayList<Integer> elejeArrList = new ArrayList<>();
            ArrayList<Integer> vegeArrList = new ArrayList<>();

            for (int i = 0; i < index; i++) {
                elejeArrList.add(tomb_random00_0_9[i]);
            }
            for (int i = tomb_random00_0_9.length-index; i < tomb_random00_0_9.length; i++) {
                vegeArrList.add(tomb_random00_0_9[i]);
            }
            vanBenneIsmetlodo = false;

            for (int i = 0; i < index; i++) {
                if (elejeArrList.get(i).equals(vegeArrList.get(i))){
                    vanBenneIsmetlodo = true;
                }
                else {
                    vanBenneIsmetlodo = false;
                    break;
                }
            }
            if (vanBenneIsmetlodo){
                for (int i = 0; i < index; i++) {
                    kiirashoz00ArrList.add(elejeArrList.get(i));
                }
            }
            index++;
        }
        while (!vanBenneIsmetlodo && index < tomb_random00_0_9.length);

        System.out.println(vanBenneIsmetlodo ? "Van benne ismétlődő: " + Arrays.toString(kiirashoz00ArrList.toArray()) : "Nincs benne ismétlődő.");
        System.out.println();

        System.out.println("19. feladat");
        segedSzam = (int)(Math.random()*4+6);
        int[] tomb_random_0_9 = tombGeneralas.tombVissza(segedSzam, 0, 9);
        ArrayList<Integer> kiirashozArrList = new ArrayList<>();
        index = 0;
        vanBenneIsmetlodo = false;

        System.out.println(Arrays.toString(tomb_random_0_9));
        while (tomb_random_0_9[index] == tomb_random_0_9[tomb_random_0_9.length-1-index]){
            kiirashozArrList.add(tomb_random_0_9[index]);
            index++;
            vanBenneIsmetlodo = true;
        }
        System.out.println(vanBenneIsmetlodo ? "Van: " + Arrays.toString(kiirashozArrList.toArray()) : "Nincs benne ismétlődő rész.");
        System.out.println();

        System.out.println("20. feladat");
        int[] tomb_20_0_5 = tombGeneralas.tombVissza(20, 0, 5);
        int[] tombLegTobb = new int[6];

        for (int i = 0; i < tomb_20_0_5.length; i++) {
            System.out.print(tomb_20_0_5[i] + " ");
            tombLegTobb[tomb_20_0_5[i]]++;
        }
        System.out.println();

        System.out.println(Arrays.toString(tombLegTobb));
        int vizsgalathozSeged = 0;
        for (int i = 1; i < tombLegTobb.length; i++) {
            if (tombLegTobb[i] > tombLegTobb[vizsgalathozSeged]){
                vizsgalathozSeged = i;
            }
        }
        System.out.println("A tömbben a '" + vizsgalathozSeged + "' szám szerepel a legtöbbször, mégpedig " + tombLegTobb[vizsgalathozSeged] + " alkalommal.");
        System.out.println();
    }
}
