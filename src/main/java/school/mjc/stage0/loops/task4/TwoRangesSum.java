package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative" );
        } else {
            int sumSkip = 0;
            int sumNotSkip = 0;

            for (int i = 1; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    sumSkip += i;
                    continue;
                }
                sumNotSkip += i;
            }
            System.out.printf("skipped sum is %d\n", sumSkip);
            System.out.printf("counted sum is %d\n", sumNotSkip);
        }
    }
}
