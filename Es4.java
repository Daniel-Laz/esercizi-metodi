import java.util.Scanner;
public class Es4{
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    System.out.println("inserisci un anno");
	    int anno=in.nextInt();
	    System.out.println(isBisestile(anno));
	}
	
	private static String isBisestile(int x){
	    if ((x%100)==0){
	        if ((x%400)==0){
	            return "bisestile";
	        }
	        else{
	            return "non bisestile";
	        }
	    }
	    else{
	        if ((x%4)==0){
	            return "bisestile";
	        }
	        else{
	            return "non bisestile";
	        }
	    }
	}

}
