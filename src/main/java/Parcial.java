import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
public class Parcial {

	public static void main(String[] args) {
      
	ArrayList alfabeto = new ArrayList();
	alfabeto.add('A');
	alfabeto.add(  'B');
	alfabeto.add(  'C');
	alfabeto.add(  'D');
	alfabeto.add(  'E');
	alfabeto.add( 'F');
	alfabeto.add(  'G');
	alfabeto.add(  'H');
	alfabeto.add(  'I');
	alfabeto.add(  'J');
	alfabeto.add(  'K');
	alfabeto.add(  'L');
	alfabeto.add(  'M');
	alfabeto.add(  'N');
	alfabeto.add(  'O');
	alfabeto.add(  'P');
	alfabeto.add(  'Q');
	alfabeto.add( 'R');
	alfabeto.add( 'S');
	alfabeto.add('T');
	alfabeto.add( 'U');
	alfabeto.add( 'V');
	alfabeto.add( 'W');
	alfabeto.add( 'X');
	alfabeto.add('Y');
	alfabeto.add( 'Z');
	
	Scanner sc= new Scanner(System.in);
    String palabra= sc.next().toUpperCase();  
      
      int p=11;
      int q= 23;
      int n= p*q;
      int indicador= (p-1)*(q-1);
      int e=0;
      double d;
      
      
      
      for (int i=4;i<=(indicador);i++) {
    	 e=mod((indicador),i);
    	 if(e==1 && e<(indicador-2)) {
    		 e=i;
    		
    		 break;
    	 }
      }
    	  
 

      int y=1;
      int comprobante;
      boolean cicle= true;
      do {
    
    	  
    	  d=(double)((y*indicador)+1)/e;
    	  comprobante= (int)Math.floor(d);
    	  y++;
    	 
    	  
    	  if(comprobante==d) {
    		  
    		  break;
    		  
    	  }
    	  
    	
      }while(true);
  
      
      String respuesta="";
      System.out.println("La llave publica es: "+e+" , "+n);
      
      double operable;
	  int proceso;
	  String RAS="";
	 
		ArrayList mode=new ArrayList();
		ArrayList cifrado= new ArrayList();
        
	    for(int i=0; i<palabra.length();i++) {
          
            	 mode.add(alfabeto.indexOf(palabra.charAt(i)));
             
	    }
	    
	    
	   int posicion;
	   for(int i=0; i<mode.size();i++) {
		   posicion= (int)mode.get(i);
		   operable= Math.pow((double)posicion, e);
		   
		   proceso= (int) (operable%n);
		 
		   cifrado.add(proceso);
		   RAS+=proceso+" ";
	   }
	   System.out.println(RAS);
	   String decifrado="";
	   
	   
	   posicion=0;
	   operable=0;
	   proceso=0;
	   
	   
	   for(int l=0;l<cifrado.size();l++) {
		   posicion= (int)cifrado.get(l);
		   proceso= binariaRapida(posicion,n,d);
		   
		   
		   decifrado+=alfabeto.get(proceso);
	   }
	   System.out.println(decifrado);
	   
	   
	   
	   
	    
	    		
	    	
	    	
	    


     
   
    
      
      
      
      
      
      
      
      

	}
	
	
	

	public static Integer mod(int a, int b) {
	    int numerador=a;
	    int divisor=b;
		int residuo=1;
		int respuesta;
		
		while(residuo!=0) {
			
			residuo= numerador%divisor;
			if (residuo==0) {
				break;
			}
			numerador=divisor;
			divisor=residuo;
		}
		respuesta=divisor;
		return respuesta;
		
	}
	public static Integer binariaRapida(int a, int b, double c) {
		int numero=a;
		
		double x=1;
		int mod=b;
		double potencia=c;
		
	
		
		String binario= Integer.toBinaryString((int)potencia);
		
		for (int i=0; i<binario.length() ;i++) {
		    String convert=String.valueOf( binario.charAt(i));
		    int check=Integer.valueOf(convert);
			
			
			if(check==1) {
			x=  Math.pow(x, 2);
			x= x*numero;
			
			x= x%mod;
			
				
				
		      
			}
			else {
				x=  Math.pow(x, 2);
						x= x%mod;
						
				
			}
			
			
		
			
		}
			return (int)x;
		
	}


	
	

}
