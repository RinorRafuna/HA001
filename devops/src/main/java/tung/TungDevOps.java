package tung; 

import org.joda.time.LocalTime;
 
public class TungDevOps {
   public static void main(String[] args) {
	LocalTime kohaAktuale = new LocalTime();     
	System.out.println("Koha aktuale eshte: " + kohaAktuale);
     Pershendetje pershendet = new Pershendetje();
     System.out.println(pershendet.thuajTung());
   }
}
