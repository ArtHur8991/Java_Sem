package homework_1;

import java.util.Random;

public class Java_Sem_1_DZ {
    public static void main(String[] args) {
        int i = getRandom(0, 2000);
        int n = getMostSignBit(i);
        int[] m1 = getMultiples(i, Short.MAX_VALUE, n);
        int[] m2 = getNonMultiples(Short.MIN_VALUE, i, n);
    }

    public static int getRandom(int min, int max) {
        return new Random().nextInt(min, max + 1);
    }

    static int getMostSignBit(int number) {
        int n = 0;
        for (; number > 1; number >>= 1) n++;
        return n;
    }

    static int[] getMultiples(int lowerLimit, int upperLimit, int divider) {
        int arraySize = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if ((i % divider) == 0) arraySize++;
        }
        int[] m1 = new int[arraySize];
        for (int i = lowerLimit, j = 0; i <= upperLimit; i++) {
            if ((i % divider) == 0) {
                m1[j] = i;
                j++;
            }
        }
        return m1;
    }

    static int[] getNonMultiples(int lowerLimit, int upperLimit, int divider) {
        int arraySize = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if ((i % divider) != 0) arraySize++;
        }
        int[] m2 = new int[arraySize];
        for (int i = lowerLimit, j = 0; i <= upperLimit; i++) {
            if ((i % divider) != 0) {
                m2[j] = i;
                j++;
            }
        }
        return m2;
    }
}