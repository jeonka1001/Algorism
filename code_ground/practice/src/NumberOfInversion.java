/*
You should use the standard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.io.FileInputStream;
import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class NumberOfInversion {
    static long Answer;

    public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new FileInputStream("data.txt"));

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {

            Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] tmp = new int[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            sort(arr,tmp,0,n-1);
            /////////////////////////////////////////////////////////////////////////////////////////////

            // Print the answer to standard output(screen).
            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
    public static void sort(int[] arr,int[] tmp, int start,int end){
        if(start == end)return;
        int mid = (start+end)/2;
        sort(arr,tmp,start,mid);
        sort(arr,tmp,mid+1,end);
        merge(arr,tmp,start,end);
    }
    public static void merge(int[] arr,int[] tmp, int start,int end){
        int mid = (start+end)/2;
        int i = start;
        int j = mid +1;
        int k = 0 ;
        while(i <= mid && j <= end){
            if(arr[i] > arr[j]){
                tmp[k++] = arr[j++];
                Answer+= (mid-i+1);
            }
            else{
                tmp[k++] = arr[i++];
            }
        }
        while(i <= mid){
            tmp[k++] = arr[i++];
        }
        while(j <= end){
            tmp[k++] = arr[j++];
        }
        for(int ii = start; ii <= end; ii++){
            arr[ii] = tmp[ii-start];
        }
    }
}