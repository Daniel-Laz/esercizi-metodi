import java.util.Scanner;
public class Es3{
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    System.out.println("inserisci base e altezza");
	    double base=in.nextDouble();
	    double altezza=in.nextDouble();
	    System.out.println("perimetro: "+perimetro(base, altezza));
	}
	
	private static double perimetro(double x, double y){
	    double perimetro=(x+y)*2.00;
	    return perimetro;
	}


}
