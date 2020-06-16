
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class Stream {

	public static void main(String[] args) {
	
		List<Integer>naturals=Arrays.asList(3,9,8);
		//naturals struttura dati, mentre faccio stream lo genero in base alla lista di naturals
		//generato stream in base alla lista li lego ai metodi.
	    //il metodo map si aspetta dempre un'azione, come output ho sempre uno stream
		//con metodo map posso convertire un flusso di dati in un'altro
		//collect
   		List<Integer>result= naturals.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(result);	
		
		
		System.out.println("**************************************");
		
		//esempio con le strighe di numeri e method reference conoscendo la classe e quindi i suoi metodi
		
		
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        
        List<Integer> listOfIntegers = listOfStrings.stream()
                                        .map(Integer::valueOf)
                                        .collect(Collectors.toList());
        System.out.println(listOfIntegers);	
        
        System.out.println("**************************************");
        System.out.println("**************************************");
        
        //Abbiamo una classe impiegato e una lista di impiegati
        
      
		
        List<Employee> employeesList = Arrays.asList(
                new Employee(1, "Alex", 100,"female"),
                new Employee(2, "Brian", 300,"male"),
                new Employee(3, "Charles", 200,"female"),
                new Employee(4, "David", 500,"male"),
                new Employee(5, "Edward", 400, "female"),
                new Employee(6, "Frank", 700, "male")
            );
        
//distinct definisce i tipi di salari.
List<Double> distinctSalaries = employeesList.stream().map(e->e.getSalary()).distinct()
                                                          .collect(Collectors.toList());
        
//List<Double> distinctSalaries = employeesList.stream().map(e->e.getSalary())
                                             //.collect(Collectors.toList());
				
        
        
System.out.println(distinctSalaries);	

System.out.println("**************************************");
System.out.println("**************************************");

Map<String, String> vehicle = new HashMap<>();
vehicle.put("CAR", "Audi");
vehicle.put("BIKE", "Harley Davidson");

Map<String, String> mappa=vehicle.entrySet().stream().collect(Collectors.toMap(
		Map.Entry::getKey,
		Map.Entry::getValue));

System.out.println(mappa);



System.out.println("**************************************");
System.out.println("**************************************");

//Use Arrays.stream to create an IntStream.
int[] array = { 10, 20, 30 };
IntStream stream = Arrays.stream(array);
// ... Call anyMatch on the IntStream.
boolean result2 = stream.anyMatch(number -> number >= 25);
System.out.println(result2);




System.out.println("**************************************");
System.out.println("**************************************");

    // Create list of birds.

    java.util.ArrayList<String> lista = new java.util.ArrayList<>();
    lista.add("parrot");
    lista.add("sparrow");
    lista.add("finch");
    lista.add("canary");
    lista.stream().filter(l->l.startsWith("s"));

    System.out.println("ciao");
    System.out.println( lista.stream().filter(l->l.startsWith("s")).toString());
    
    
// Get the stream and call sorted on it.
//Stream sorted = (Stream) lista.stream().sorted();
// ((Stream<String>) sorted).forEach(x -> display(x));
// ... Call display method on each element in sorted order.
    System.out.println("**************************************");
    System.out.println("**************************************");

 // Finding words starts with vowel
    List<String> words = Arrays.asList("apple", "mango", "orange","strowbarry", "uva", "avocado","banana");
    List<String> wordstring= words.stream()
                                       .filter(s -> s.matches("^[aeiou].*"))
                                       .collect(Collectors.toList());
    
    System.out.println(wordstring);
    
    System.out.println("**************************************");
    System.out.println("**************************************");

    
    //Metodi per lavorare con una parte di stream
    
    //Signature Stream<T> limit(long maxSize);

    //Stream<T> skip(long n);
    List<Integer> listaInteri =Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,15,16,17,18,19,30,40,60);
    //limit due gli dico di prendere i primi due elementi che si trovano nella lista
    List<Integer>lista_pari=  listaInteri.stream().filter(i -> i%2 == 0).limit(4).collect(Collectors.toList());
    //skip(1) significa saltare il primo elemento del filtro
    List<Integer>lista_pari1= listaInteri.stream().filter(i -> i%2 == 0).skip(2).collect(Collectors.toList());
    System.out.println(lista_pari);
    System.out.println(lista_pari1);
    
    
    System.out.println("**************************************");
    System.out.println("**************************************");

   /* Stream fornisce due metodi peek e forOach che accetta un consumatore come argomento ed esegue l'azione
    su ogni elemento.
    Peek stream <T> (azione consumer <? Super T>)
    void forEach (azione Consumer <? super T>)
    La sbirciatina è un'operazione intermedia che restituisce il nuovo flusso dove per ogni operazione di terminale
    restituisce nulla.
    Stream di consumo
    Stream fornisce due metodi peek e forOach che accetta un consumatore come argomento ed esegue l'azione
    su ogni elemento.
    Peek stream <T> (azione consumer <? Super T>)
    void forEach (azione Consumer <? super T>)
    La sbirciatina è un'operazione intermedia che restituisce il nuovo flusso dove per ogni operazione di terminale
    restituisce nulla.
    */
    
    //no assegnazione 
    listaInteri.stream().filter(i -> i%2 == 0).peek(System.out::println).toArray();
    //toArray per stampare tutti gli elementi
    System.out.println("**************************************");
   listaInteri.stream().filter(i -> i%2 != 0).forEach(System.out::print);
   

   System.out.println("**************************************");
   System.out.println("**************************************");
   
   
   
   
   /*L'API Stream fornisce operazioni di cortocircuito sui terminali anyMatch, allMatch e noneMatch che richiedono un
Predicato come argomento e restituisce un risultato booleano applicando il Predicato agli elementi del flusso. Predicato
potrebbe non essere applicato a tutti gli elementi se non è richiesta un'ulteriore esecuzione.
• anyMatch: restituisce true se un elemento viene trovato corrispondente al predicato. Il premio non verrà applicato ad altri
elementi se sono state trovate corrispondenze.
• allMatch: restituisce true se tutti gli elementi corrispondono al predicato specificato.
• noneMatch: restituisce true se nessuno degli elementi corrisponde al predicato.
  */ 
   
   Boolean x=listaInteri.stream().anyMatch(i -> i % 10 == 0);
   System.out.println(x);
   Boolean y=listaInteri.stream().allMatch(i -> i % 5 == 0);
   System.out.println(y);
   Boolean z=listaInteri.stream().noneMatch(i -> i % 3 == 0);
   System.out.println(z);
   
   System.out.println("**************************************");
   System.out.println("**************************************");
   
   /*Trovare l'elemento
L'interfaccia del flusso ha un metodo findAny che restituisce un elemento arbitrario dal flusso. Il comportamento di questo
l'operazione non è deterministica; è libero di selezionare qualsiasi elemento nel flusso perché in caso di flusso di parallelizzazione
l'origine verrà divisa in più blocchi in cui è possibile restituire qualsiasi elemento. Ha anche il metodo findFirst che
restituisce il primo elemento del flusso.
Firma Facoltativo <T> findFirst ()
<T> facoltativo findAny ()
Se vedi la firma di due metodi precedenti, restituiscono un oggetto Opzionale che è un wrapper che descrive l'assenza
o presenza dell'elemento perché potrebbe esserci la possibilità che queste operazioni siano state chiamate su un flusso vuoto. non
preoccupati per Opzionale ora, usa i metodi get () o orElse () per ottenere valore dall'opzionale.
    */
  Integer t=  listaInteri.stream().filter(i -> i % 20 == 0).findAny().orElse(0);
  Integer h=  listaInteri.stream().map(i -> i * 2).findFirst().get();
  
  System.out.println("lettera t"+t);
  System.out.println(h);
  
  System.out.println("**************************************");
  System.out.println("**************************************");
  
  
    /*
Riduzione del flusso
L'interfaccia del flusso supporta operazioni di riduzione sovraccariche che combinano continuamente elementi del flusso fino al
ridotto al singolo valore di uscita.
Supponiamo che ti abbia chiesto di calcolare la somma della matrice di numeri, quindi se non sbaglio la tua risposta sarebbe qualcosa
come sotto.
     */
  int[] arr = { 1, 2, 3, 4, 5, 6 };
  int result1 = 0;
  for (int num : arr) {
  result1 += num;
  }
  int somma=Arrays.stream(arr).reduce(0, Integer::sum);
  int prodotto=Arrays.stream(arr).reduce(1, (i1, i2) -> i1 * i2);
  System.out.println("somma"+somma);
  System.out.println(prodotto);
  
  System.out.println("**************************************");
  System.out.println("**************************************");
  //prendo solo quelli con gender male
  Employee[] empmale = employeesList.stream().filter(e -> e.getGender() == "male")
		  .toArray(Employee[]::new);

  int i;
  for(i=0;i<empmale.length;i++) {
  System.out.println(empmale[i]);
  }
  
  System.out.println("**************************************");
  System.out.println("**************************************");
  
  //comparator con java 8 c'è un update (aggiornamento)
 
  
  //sorted è un metodo che ordina a cui si passa il Comparator
employeesList.stream().sorted(Comparator.comparing(Employee::getSalary).
thenComparing(Employee::getName)).forEach(System.out::println);
  
System.out.println("**************************************");
System.out.println("**************************************");

employeesList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
System.out.println("**************************************");
System.out.println("**************************************");

//ordinare i numeri interi negativi positivi
List<Integer>posneglist=Arrays.asList(-10, 31, 16, -5, 2);
//mathabs funzione matematica "valore assoluto"
posneglist.stream().sorted(Comparator.comparingInt(j -> Math.abs(j)))
.forEach(System.out::println);
System.out.println("**************************************");
System.out.println("**************************************");

	}
}