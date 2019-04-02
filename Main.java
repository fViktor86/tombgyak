import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {

        int[] tomb = new int[10];
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
    }
}
