public class TombGeneral {

    public int[] tombVissza(int elemSzam, int tartomanyAlso, int tartomanyFelso){

        int[] tomb = new int[elemSzam];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random()*(tartomanyFelso-tartomanyAlso+1)+tartomanyAlso);
        }
        return tomb;
    }
}
