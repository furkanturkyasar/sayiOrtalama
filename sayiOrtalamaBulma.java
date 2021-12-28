import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int k,i=1,total=0,count = 0,result;


        System.out.print("Bir sayi giriniz: ");
        k=input.nextInt();

        while (i<=k){
            if (i%3==0&&i%4==0){
                total+=i;
                count++;
                System.out.println(i);




            }

            i++;
        }
        result=(total/count);
        System.out.println("Ortalamalari: "+result);


    }

}
