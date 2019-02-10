import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai : ");
        int nilai = userInput.nextInt();
        printNilai(nilai);
        int jmlh = jmlhNilai(nilai); //kita buat 1 variable jmlh utk tau brp hasil penjumlahan fungsi rekursifnya
        System.out.println("Hasil penjumlahan = " + jmlh);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil faktorial " + faktorial);
    }

    private static void printNilai(int parameter){
        System.out.println("Nilai " + parameter);
        if(parameter == 0){
            return; //ketika return, akan keluar dari fungsi yg paling akhir dipanggil, yaitu printNilai(parameter) dan akhirnya keluar dari fungsi printNilai
        }
        parameter--;
        printNilai(parameter);
    }

    private static int jmlhNilai(int parameter){
        System.out.println("Parameter = " + parameter);
        if(parameter == 0){
            return parameter;
        }
        return parameter + jmlhNilai(parameter - 1);
    }

    private static int hitungFaktorial(int parameter){
        System.out.println("Parameter = " + parameter);
        if(parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }
}
