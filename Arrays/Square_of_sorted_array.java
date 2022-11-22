package Arrays;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

class Holder{

    public void run() throws IOException{
        Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = sc.nextInt();
        String inputString= br.readLine();
        String[] array= inputString.split(" ");
        int[] inputArray= new int[N];
        int[] resultArray= new int[N];

        for(int i=0;i<N;i++){
            inputArray[i]=Integer.parseInt(array[i]);
        }

        int start=0,end=N-1,pos=N-1;

        while(start<=end){
            if(Math.abs(inputArray[start]) > Math.abs(inputArray[end])){
                resultArray[pos--]= (int)Math.pow(inputArray[start++],2);
            }
            else{
                resultArray[pos--]= (int)Math.pow(inputArray[end--],2);
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(resultArray[i]+" ");
        }

    }
}


public class Square_of_sorted_array{
    public static void main(String[] args) throws Exception{
        Holder obj=new Holder();
        obj.run();
    }
}