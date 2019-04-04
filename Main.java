import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {

        int[] tomb = new int[10];
        System.out.println("TömbAlap: 10 elemű 0-100");
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int) (Math.random()*101);
            System.out.print(tomb[i] + " ");
        }
        System.out.println();

        System.out.println("Első öt szám:");
        for (int i = 0; i < 5; i++) {
            System.out.println(tomb[i]);
        }
        System.out.println();

        System.out.println("Utolsó öt szám:");
        for (int i = 0; i < 5; i++) {
            System.out.println(tomb[i+5]);
        }
        System.out.println();

        int tmpOsszeg = tomb[0] + tomb[9];
        System.out.println("Első és utolsó összege: " + tmpOsszeg);
        System.out.println();

        System.out.println("Fordított sorrendben:");
        for (int i = tomb.length-1; i >= 0; i--){
            System.out.println(tomb[i]);
        }
        System.out.println();

        int tmpDb = 0;
        for (int i = 0; i < tomb.length; i++){
            if (i < (tomb.length-1) && tomb[i] < tomb[i+1]){
                tmpDb++;
            }
        }
        System.out.println(tmpDb + " darab olyan elem van amit egy tőle nagyobb követ.");
        System.out.println();

        int[] tombHusz = new int[10];
        System.out.println("TömbTíz: 10 elemű 0-20");
        for (int i = 0; i < tombHusz.length; i++) {
            tombHusz[i] = (int) (Math.random()*21);
            System.out.print(tombHusz[i] + " ");
        }
        System.out.println();

        boolean egyenloek = false;
        for (int i = 0; i < tombHusz.length; i++){
            if (i < (tombHusz.length-1) && tombHusz[i] == tombHusz[i+1]){
                egyenloek = true;
            }
        }
        if (egyenloek){
            System.out.println("Van egymás mellett két egyforma szám.");
        }
        System.out.println();

        int[] tombTiz = new int[20];
        System.out.println("TömbHúsz: 20 elemű 0-10");
        for (int i = 0; i < tombTiz.length; i++) {
            tombTiz[i] = (int) (Math.random()*11);
            System.out.print(tombTiz[i] + " ");
        }
        System.out.println();

        egyenloek = false;
        for (int i = 0; i < tombTiz.length; i++){
            if (i < (tombTiz.length-2) && tombTiz[i] == tombTiz[i+1] && tombTiz[i] == tombTiz[i+2]){
                egyenloek = true;
            }
        }
        if (egyenloek){
            System.out.println("Van egymás mellett három egyforma szám.");
        }
        System.out.println();

        for (int i = 0; i < tombHusz.length; i++) {
            if (i < (tombHusz.length-1) && (tombHusz[i]*2) == tombHusz[i+1]){
                System.out.println("A " + (i+1) + "-ik elem (" + tombHusz[i+1] + ") kétszerese az előte következőnek (" + tombHusz[i] + ")");
            }
        }
        System.out.println();

        int[] tombOt_0_1000 = new int[5];
        System.out.println("TömbÖt: 5 elemű 0-1000");
        for (int i = 0; i < tombOt_0_1000.length; i++) {
            tombOt_0_1000[i] = (int) (Math.random()*1001);
            System.out.print(tombOt_0_1000[i] + " ");
        }
        System.out.println();

        boolean novekvo = true;
        for (int i = 0; i < tombOt_0_1000.length; i++) {
            if (i < tombOt_0_1000.length-1 && tombOt_0_1000[i] >= tombOt_0_1000[i+1]){
                novekvo = false;
            }
        }
        if (novekvo == false) {
            System.out.println("A tömb nem növekvő sorrendbe generálódott.");
        }
        System.out.println();

        for (int i = 0; i < tombHusz.length; i++) {
            if (i < tombHusz.length-2 && tombHusz[i+1] == (tombHusz[i] + tombHusz[i+2])){
                System.out.println("A " + (i+1) + ".-ik (" + tombHusz[i+1] + ") elem a szomszédai összegével egyenlő. (" + tombHusz[i] + " és " + tombHusz[i+2] + ")");
            }
        }
        System.out.println();

        int[] tombOt_0_5 = new int[5];
        System.out.println("5 elemű: 0-5");
        for (int i = 0; i < tombOt_0_5.length; i++) {
            tombOt_0_5[i] = (int) (Math.random()*6);
            System.out.print(tombOt_0_5[i] + " ");
        }
        System.out.println();

        int[] segedTombOt_0_5 = new int[5];
        for (int i = tombOt_0_5-1; i > 0 ; i--) {
            segedTombOt_0_5[]
        }
    }
}
