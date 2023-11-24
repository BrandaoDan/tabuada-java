import java.util.Scanner;

public class tabuada{
    public static void main(String[] args) {
        
    
    int valor;
    int rsult;
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um valor para gerar a tabuada: ");
    valor = sc.nextInt();

    for(int i = 0; i<11; i++){
        rsult = valor*i;
        System.out.println(valor + "x" + i + "=" + rsult);
    }
}}