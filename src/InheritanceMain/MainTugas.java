package InheritanceMain;

import P9.Motor;

public class MainTugas {
    public static void main(String[] args) {
        Motor mtr = new Motor("D 1234 XY", "Genio", "Hitam");
        System.out.println(
        		mtr.getNoPlat() + " - " +
                mtr.getMerk() + " - " +
                mtr.getWarna()
                );
    }
}

