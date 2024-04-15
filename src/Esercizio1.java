import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Esercizio1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero da moltiplicare");
        int a = scanner.nextInt();

        System.out.println("Inserisci un altro numero da moltiplicare");
        int b = scanner.nextInt();

        int risultato = moltiplica(a,b);

        System.out.println("Il risultato è: " + risultato);

        scanner.nextLine();

        System.out.println("inserisci una frase");
        String s = scanner.nextLine();

        System.out.println("Inserisci un numero");
        int x = scanner.nextInt();

        String str = concatena(s,x);

        System.out.println("La stringa concatenata è: " + str);

        String[] parole = {"java", "javascript", "html", "spring", "css"};

        String[] newArray =inserisciInArray(parole, str);

        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
        System.out.println(newArray[2]);
        System.out.println(newArray[3]);
        System.out.println(newArray[4]);
        System.out.println(newArray[5]);



    }

    public static int moltiplica(int a, int b){
        return a*b;
    }

    public static String concatena(String s, int i){
        return s+i;
    }

    public static String[] inserisciInArray(String[] parole, String s){
        String[] newArray = new String[6];

        newArray[0]=parole[0];
        newArray[1]=parole[1];
        newArray[2]=s;
        newArray[3]=parole[2];
        newArray[4]=parole[3];
        newArray[5]=parole[4];

        return newArray;
    }
}