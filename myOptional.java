import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;

public class myOptional {

	public static void main(String[] args) {
		//Optional: per la gestione di ua lista che rimane null ho lo stream e mi spacca il codice 
		//per evitarlo hanno creato optional
		//Esiste una classe. Si pu� creare un oggetto Optional, se lista vuota nullPointerExeption.
		//Create an empty Optional
       //An empty Optional Object describes the absence of a value.

		//Optional<Employee> emp = Optional.empty();
		
		
		// Create an Optional with a non-null value -

		//Employee emp = new emp("667290", "Rajeev Kumar Singh");
		//Optional<Employee> empOptional = Optional.of(emp);
		
		//Cosa � OPTIONALE ?
		//Opzionale � un tipo di contenitore per un valore che pu� essere assente. Confuso? Lasciatemi spiegare.
       //Considera la seguente funzione che accetta un ID utente, recupera i dettagli dell'utente con l'id specificato dal database e lo restituisce -


				//User findUserById (String userId) {...};
				//Se userId non � presente nel database, la funzione precedente restituisce null. Consideriamo ora il seguente codice scritto da un client:

				//Utente utente = findUserById ("667290");
				//System.out.println ("Nome utente =" + user.getName ());
				//Una situazione NullPointerException comune, giusto? Lo sviluppatore ha dimenticato di aggiungere il controllo null nel suo codice. Se userId non � presente nel database, lo snippet di codice sopra generer� una NullPointerException.

				/*Ora, comprendiamo come Opzionale ti aiuter� a mitigare il rischio di imbatterti in NullPointerException qui -

				<User> facoltativo findUserById (String userId) {...};
				Restituendo <User> facoltativo dalla funzione, abbiamo chiarito ai client di questa funzione che potrebbe non esserci un utente con l'ID utente specificato. Ora i client di questa funzione sono esplicitamente costretti a gestire questo fatto.

				Il codice client ora pu� essere scritto come -

				Opzionale <User> opzionale = findUserById ("667290");

				optional.ifPresent (utente -> {
				    System.out.println ("Nome utente =" + user.getName ());
				})
				Una volta che hai un oggetto Opzionale, puoi usare vari metodi di utilit� per lavorare con l'Opzionale. Il metodo ifPresent () nell'esempio precedente chiama l'espressione lambda fornita se l'utente � presente, altrimenti non fa nulla.

				Bene! Hai avuto l'idea qui, giusto? Il client � ora obbligato dal sistema di tipi a scrivere il controllo opzionale nel suo codice.

				Creazione di un oggetto opzionale
				1. Creare un facoltativo vuoto

				Un oggetto opzionale vuoto descrive l'assenza di un valore.

				Facoltativo <User> user = Optional.empty ();
				2. Creare un facoltativo con un valore non nullo -

				Utente utente = nuovo utente ("667290", "Rajeev Kumar Singh");
				Opzionale <User> userOptional = Facoltativo.of (utente);
				Se l'argomento fornito a Optional.of () � null, generer� immediatamente una NullPointerException e l'oggetto opzionale non verr� creato.

				3. Creare un Opzionale con un valore che pu� essere o non essere nullo -

				Opzionale <User> userOptional = Optional.ofNullable (utente);
				Se l'argomento passato a Optional.ofNullable () non � null, restituisce un Opzionale contenente il valore specificato, altrimenti restituisce un Opzionale vuoto.*/
		
		/*Verifica della presenza di un valore
		1. isPresent ()

		Il metodo isPresent () restituisce true se l'Opzionale contiene un valore non nullo, altrimenti restituisce false.

		if (optional.isPresent ()) {
		    // Il valore � presente all'interno di Opzionale
		    System.out.println ("Valore trovato -" + optional.get ());
		} altro {
		    // il valore � assente
		    System.out.println ("Opzionale � vuoto");
		}
		2. ifPresent ()

		Il metodo ifPresent () consente di passare una funzione Consumer che viene eseguita se � presente un valore all'interno dell'oggetto Opzionale.

		Non fa nulla se l'Opzionale � vuoto.

		optional.ifPresent (valore -> {
		    System.out.println ("Valore trovato -" + valore);
		});
		Nota che ho fornito un'espressione lambda al metodo ifPresent (). Questo rende il codice pi� leggibile e conciso.

		Recupero del valore utilizzando il metodo get ()
		Il metodo get () facoltativo restituisce un valore se � presente, altrimenti genera NoSuchElementException.

		Utente utente = opzionale.get ()
		Dovresti evitare di usare il metodo get () sui tuoi Optionals senza prima verificare se un valore � presente o meno, perch� genera un'eccezione se il valore � assente.

		Restituzione del valore predefinito utilizzando orElse ()
		orElse () � ottimo quando si desidera restituire un valore predefinito se Opzionale � vuoto. Considera il seguente esempio:

		// restituisce "Utente sconosciuto" se l'utente � nullo
		Utente finalUser = (utente! = Null)? utente: nuovo utente ("0", "Utente sconosciuto");
		Ora vediamo come possiamo scrivere la logica sopra usando il costrutto opzionale 'orElse () -

		// restituisce "Utente sconosciuto" se l'utente � nullo
		User finalUser = optionalUser.orElse (nuovo utente ("0", "Utente sconosciuto"));
		Restituzione del valore predefinito utilizzando orElseGet ()
		A differenza di orElse (), che restituisce direttamente un valore predefinito se Opzionale � vuoto, oElseGet () consente di passare una funzione Fornitore che viene invocata quando Opzionale � vuoto. Il risultato della funzione Fornitore diventa il valore predefinito dell'Opzionale -

		User finalUser = optionalUser.orElseGet (() -> {
		    ritorna nuovo utente ("0", "Utente sconosciuto");
		});





		Scrivi un messaggio*/
		
		ArrayList<Employee> empList = new ArrayList <>();
		Optional<ArrayList<Employee>> optional = Optional.of(empList);
		//se � null il codice non si spacca
		optional.ifPresent(Employee->System.out.println("impiegato trovato: "+ Employee));
		System.out.println("lista impiegati : "+ optional.get());
		

		
	}

}
