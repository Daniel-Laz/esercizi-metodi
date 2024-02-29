import java.util.Scanner;
public class Es2
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("inserisci base e altezza");
        double base=in.nextDouble();
        double altezza=in.nextDouble();
        System.out.println("area: "+area(base,altezza));
	}
	
	private static double area(double x, double y){
	    double z=(x*y)/2.00;
	    return z;
	}
	

}
