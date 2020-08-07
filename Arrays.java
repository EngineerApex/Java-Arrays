import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
      // 1)  Declaration:      data-type arrayname[]; / data-type[] arrayname;
      // 2)  Allocate memory:  arrayname = new data-type[size];
      // 3)  Initialisation:   arrayname[index] = value;

    int arr[] = new int[5];

        System.out.println("Enter array elements");
    Scanner sc = new Scanner(System.in); //For input
    for(int i = 0; i<5; i++){
        arr[i] = sc.nextInt();
    }


    for(int i =0; i<5 ; i++){
        System.out.println(arr[i]);
    }

    }
}
