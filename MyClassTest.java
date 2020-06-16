
public class MyClassTest implements TestInterface, Interface1,Interface2{

	public static void main(String[] args) {
	
	MyClassTest obj=new MyClassTest();
	obj.square(4);
	obj.show();

	}
	
//mi fa implementare il metodo astratto ma non il metodo defoult
	@Override
	public void square(int a) {
		int ris;
		ris=a*a;
		System.out.println(ris);
//impletazione del metodo astratto dell'interfaccia		
		
	}

@Override
public void show() {
	 
	Interface1.super.show();
}

}
