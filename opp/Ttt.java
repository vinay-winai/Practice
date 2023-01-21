import java.util.Arrays;
import java.util.Scanner;

public class Ttt {
    private static final int[][] winStates = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    private static final char[] runningState = new char[9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<9;i++){
            int in = sc.nextInt();
            if (i%2==0) runningState[in] = 'x';
            else    runningState[in] = 'o';
            if (i>3){
                for (int[] single:winStates){
                    int zero = runningState[single[0]];
                    int one = runningState[single[1]];
                    int two = runningState[single[2]];
                    if ((!Arrays.asList(zero,one,two).contains(0)) && zero==one && one==two){
                        System.out.println("Winner"); 
                        return;
                    }
                }
            }
        }
    }
}