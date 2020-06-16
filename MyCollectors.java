import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.*;


public class MyCollectors {

	public static void main(String[] args) {
		//COLLECTOR
		// Accumulate names into a List
		//List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());

		// Accumulate names into a TreeSet
		//Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));

		// Convert elements to strings and concatenate them, separated by commas
		//String joined = things.stream()
		                      //.map(Object::toString)
		                      //.collect(Collectors.joining(", "));

		// Compute sum of salaries of employee
		//int total = employeesList.stream().collect(Collectors.summingInt(Employee::getSalary));

		// Group employees by department
		//Map<Department, List<Employee>> byDept= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		// Compute sum of salaries by department
		//Map<Department, Integer> totalByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
		                                              //Collectors.summingInt(Employee::getSalary)));

		// Partition students into passing and failing
		//Map<Boolean, List<Student>> passingFailing =
		    //students.stream()
		            //.collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
		/*Come funziona Collector?
		Collector divide il processo di riduzione completo in quattro attività secondarie che si adattano meglio a qualsiasi tipo di operazione di riduzione.
		Loro sono:
		1. fornire un nuovo contenitore di risultati vuoto all'inizio
		2. accumulo di nuovi elementi di dati nel contenitore dei risultati
		3. combinare due contenitori di risultati in uno in caso di parallelizzazione
		4. Esecuzione di una trasformazione finale facoltativa sul contenitore
		Tutte queste attività secondarie possono essere o non essere necessarie per ogni operazione ma queste sono la forma generalizzata del completo
		processi. I collezionisti hanno anche una serie di caratteristiche, come Characteristics.CONCURRENT, che forniscono suggerimenti
		al processo di riduzione per fornire prestazioni migliori. Collector. Caratteristiche enum contiene tre caratteristiche
		*/

			/*precedente hai avuto un'idea generale su come funziona il collezionista e su come implementare collezionisti personalizzati.
		Java-8 ha introdotto la classe di utilità java.util.stream.Collectors che contiene molti metodi di fabbrica che fornisce
		Implementazioni Collector più comunemente utilizzate. Questi collezionisti offrono principalmente le seguenti funzionalità:
		• Raccolta di elementi in java.util.Collection
		• Unire gli elementi String a una singola stringa
		• Raggruppamento di elementi per chiave di raggruppamento personalizzata
		• Partizionare gli elementi nel gruppo VERO FALSO
		• Operazioni di riduzione
		• Elementi estetizzanti
		Questi metodi di fabbrica possono anche essere combinati per generare un raccoglitore nidificato che vedremo mentre ci muoviamo più in profondità.
			Collezionando come collezioni
La raccolta di elementi stream in java.util.Collection è l'operazione più utilizzata. La classe dei collezionisti fornisce coppia
di metodi che restituisce un raccoglitore che raccoglierà quindi gli elementi di flusso in un contenitore di raccolta specifico. */

			
		//Collector<T, ?, List<T>> toList()
				//Collector<T, ?, Set<T>> toSet()
				//Collector<T, ?, C> toCollection(Supplier<C> collectionFactory)
				//Collector<T, ?, Map<K,U>> toMap(Function<T, K> keyMapper, Function<T, U> valueMapper)

		java.util.ArrayList<String> lista = new java.util.ArrayList<>();
	    lista.add("parrot");
	    lista.add("sparrow");
	    lista.add("finch");
	    lista.add("canary");
	    String joiningStream= lista.stream().collect(Collectors.joining(", ", "Joined String[ ", " ]"));
	    System.out.println(joiningStream);
	    System.out.println("*******************************************************************");
	  
	   List<String> words = Arrays.asList("A", "B", "C", "D");
        String joinedString = words.stream().collect(Collectors.joining());
        System.out.println( joinedString ); 
        System.out.println("*******************************************************************");
        
        // Create a character list 
        List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's', 
                                           'f', 'o', 'r', 
                                           'G', 'e', 'e', 'k', 's'); 
  
        // Convert the character list into String 
        // using Collectors.joining() method 
        String chString = ch.stream() 
                              .map(String::valueOf) 
                              .collect(Collectors.joining()); 
  
        // Print the concatenated String 
        System.out.println(chString); 
        System.out.println("*******************************************************************");
        
        
         //Trade Id Trader Notional Currency Region

Trade t1= new Trade ("T1001" , "John", 540000, "USD", "NA");
Trade t2= new Trade ("T1002", "Mark",10000, "SGD", "APAC");
Trade t3= new Trade("T1003", "David",120000, "USD", "NA");
Trade t4= new Trade("T1004", "Peter",4000, "USD", "NA");
Trade t5= new Trade("T1005", "Mark",30000, "SGD", "APAC");
Trade t6= new Trade ("T1006", "Mark",25000, "CAD", "NA");
Trade t7= new Trade ("T1007", "Lizza",285000, "EUR", "EMEA");
Trade t8= new Trade ("T1008", "Maria",89000, "JPY", "EMEA");
Trade t9= new Trade ("T1009", "Sanit",100000, "INR", "APAC");

ArrayList<Trade>listatrade= new ArrayList<Trade>();

listatrade.add(t1);
listatrade.add(t2);
listatrade.add(t3);
listatrade.add(t4);
listatrade.add(t5);
listatrade.add(t6);
listatrade.add(t7);
listatrade.add(t8);
listatrade.add(t9);

Map<String, List<Trade>> map = listatrade.stream()
                 .collect(Collectors.groupingBy(Trade:: getRegion));
     
 //entrySet() serve per prendere elemento per elemento e in questo metodo devo chiamare chiave e valore    
 //questo è java 8e su
map.entrySet().forEach(entry->{
    	    System.out.println(entry.getKey() + "----->" + entry.getValue());  
    	 });
    //per java under 8 si stampa cosi
for (Entry<String, List<Trade>> entry : map.entrySet()) {
    System.out.println(entry.getKey()+" : "+entry.getValue());
    
}
/*
 * Partizionare un tipo speciale di raggruppamento ma conterrà sempre due gruppi: FALSO e VERO. Restituisce un Collezionista
che suddivide gli elementi di input in base a un determinato Predicato e li organizza in una mappa <Booleana, Elenco <T>>.
L'esempio seguente mostra le offerte di partizionamento in USD e nessuna offerta in USD.
 */
Map<Boolean, List<Trade>> map2 = listatrade.stream()
.collect(Collectors.partitioningBy(t -> "USD".equals(t.getCurrency())));//getCurrency elemento corrente
System.out.println(map2);

Map<String, IntSummaryStatistics> map3=listatrade.stream()
.collect(Collectors.groupingBy(Trade::getRegion,
Collectors.summarizingInt(Trade::getNotional)));

IntSummaryStatistics naData = map3.get("NA");
System.out.printf("No of deals: %d\nLargest deal: %f\nAverage deal cost: %f\nTotal→traded amt: %f",
naData.getCount(), naData.getMax(), naData.getAverage(), naData.getSum());
        
        
   
        
	}
}
