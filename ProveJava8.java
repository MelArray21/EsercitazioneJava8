import java.util.ArrayList;
import java.util.stream.Stream;

public class ProveJava8 {

	public static void main(String[] args) {
		
		
		
	//dichiarazione inizializzazione di una lista di interi come tipo Arraylist
		ArrayList<Integer> mialista = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            mialista.add(i);
       }
        
    //uso del ciclo forEach() che è un metodo che accetta come argomento un action
   //l'action è un'operazione un metodo che può fare in lambda expression 
        System.out.println("ciao");
        mialista.forEach(pippo->System.out.println(pippo));
       
        
        System.out.println("Arrivederci");
     //METHOD REFERENCE
    //Java fornisce una nuova funzionalità chiamata metodo di riferimento in Java 8.
    //Il metodo di riferimento viene utilizzato per fare riferimento al metodo dell'interfaccia funzionale.
    //È una forma compatta e semplice di espressione lambda
    //NOTAZIONE (sintassi)      "Object :: methodName" 
        
        
 
        
        mialista.forEach(System.out::println);
        
        //Esistono quattro tipi di riferimenti al metodo:
        
  //1.Un metodo di riferimento a un metodo statico.
 //2.Un metodo di riferimento a un metodo di istanza di un oggetto di un tipo particolare.
//3.Un metodo di riferimento a un metodo di istanza di un oggetto esistente.
// 4.Un metodo di riferimento a un costruttore.
        
 //In un riferimento al metodo, si posiziona l'oggetto (o la classe) che contiene il metodo prima dell'operatore ::
 //e il nome del metodo dopo di esso senza argomenti.
        
        
        
        //DICHIARAZIONE STATIC METHOD
        //Class::staticMethod
        
        
        
        
        
        
  
     
	}
	
	
	
        
	}
	
