import java.util.Scanner;

class Tabuada {
    	
    public static void main(String arg[]) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número para mostrar a tabuada");
        int num1 = ler.nextInt();
        for(int i = 1; i <= 10; i++) {
        	int res = num1 * i;
        
            System.out.println(num1 + " x " + i + " = " + res);
        
        }
        
    }


}
