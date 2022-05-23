import java.util.Scanner;

public class maopao {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<10-1;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]>arr[j]){
                    int t=0;
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
