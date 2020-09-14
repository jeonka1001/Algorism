import java.io.File;
import java.util.Scanner;

public class app {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("data.txt"));
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for(int i = 0 ; i < N ; i ++){
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        solution sol = new solution();
        int num = sol.sol(numbers, target);
        System.out.println(num);
    }
}
