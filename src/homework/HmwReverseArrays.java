package homework;

import java.util.Arrays;

public class HmwReverseArrays {
    public static void main(String[] args) {
        int[] sourceArray = {3, 5, 6, 50, 8, 8, 9, 9, 5};

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        //ar lyginis skaicius array
        //jei nelyginis
        //pryliginam pirmo skaicius reiksme paskutiniams
        //ilgis yra devyni, o elementu pagal viska 8 -1



        //reikia issaugoti paskut.skaciaus reiksme nes ji dingsta
        //sukeiciam tuo paciu metu 2 skaicius, tai keisim keturis kartus, ne 8 darysim
        //kadangi int dalinant pvz 9/2 gausim 4, o ne 4.5, nes dingsta skaiciai po kablelio
        for(int i = 0; i < sourceArray.length/2; i++){
            //laikinai issaugom reiksmes
            int temp = sourceArray[i];
            sourceArray[i] = sourceArray[sourceArray.length-1 - i];
            //assign paskutini elementa su pirmu
            sourceArray[sourceArray.length-1 - i] = temp;


        }
        System.out.println("Reverse array: " + Arrays.toString(sourceArray));

    }
}
