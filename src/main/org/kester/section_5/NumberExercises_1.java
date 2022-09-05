package org.kester.section_5;

public class NumberExercises_1 {


    public static void main(String[] args) {

        //If you could receive up to eight different types of radio signals simultaneously (into your
        //computer & a program you wrote) and you needed to be able to record which of those eight
        //you received at any given time, what would be a highly compact (or compressed - using
        //the least amount of memory or storage) way to record them (using what you learned in this
        //module)? For example, you could receive signals A + B + C simultaneously, or A + D, or just
        //G, etc.

        //I would store that information in a Char variable (which is same as Byte, but unsigned). 1 for signal, 0 for no signal:
        // A signal would be 0b00000001 = 1
        // B signal would be 0b00000010 = 2
        // C signal would be 0b00000100 = 4
        // D signal would be 0b00001000 = 8
        // E signal would be 0b00010000 = 16
        // F signal would be 0b00100000 = 32
        // G signal would be 0b01000000 = 64
        // H signal would be 0b10000000 = 128
        //If all signals will be received at the same time, it would be all ones:

        char signalReg = 0b11111111;
        System.out.println((int) signalReg);

        //1. If you received signals A + D + C simultaneously, how could you efficiently determine
        //that D was one of the signals you received - based on your solution above?

        //I would simply see if the fourth from the right position is 1 or 0.
        //Signals A + C + D would give us 0b00001101 or 13.


        char signalReg2 = 0b00001101;
        int a = signalReg2;
        System.out.println(Integer.toBinaryString(a));

//       2. What’s an alternative way you could add 2 + 4 without using “+” symbol?
        //Using pipe symbol (or)

        System.out.println(2 | 4);

    }
}
