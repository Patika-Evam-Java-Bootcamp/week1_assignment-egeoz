import java.util.Scanner;
/*
Aşağıdaki kod satırlarına göre kaç tane obje yaratılacaktır ?

    String s1="Welcome";
    String s2="Welcome";
    String s3="Welcome";

Cevap: s1, s2 ve s3 değişkenleri new ile oluşturulmadıkları ve değerleri aynı olduğu için bu kod satırlarıyla sadece 1 obje oluşturulur.
 */

class Cevaplar {


    public static String pattern = "<<code>>";

    public static String searchPattern (String[] arr, String pattern){
        for (String s : arr){
            if (s.contains(pattern)){ return s; }
        }

        return "No match has been found.";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        String[] arr;
        int arrSize = 0;
        try{
            do {
                System.out.print("Dizi boyutunu girin (minimum 5): ");
                arrSize = sc.nextInt();
            } while (arrSize < 5);
        
            sc.nextLine();
            arr = new String[arrSize];
        
            for (int i = 0; i < arrSize; i++){
                System.out.printf("Dizinin %d. öğesi: ", i + 1);
                input = sc.nextLine();            
                arr[i] = input;
            }
            
            System.out.println(searchPattern(arr, pattern));

        } catch (Exception e){
            System.err.println(e);
        }

        sc.close();
    }

}