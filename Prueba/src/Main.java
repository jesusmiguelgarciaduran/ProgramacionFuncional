import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Main {
	static List<String> colores= new ArrayList<>(Arrays.asList("red","green","blue"));
	static List<Integer> numeros= new ArrayList<>(Arrays.asList(1,2,3,4,5));
	static List<Integer> numerosIterados= Stream.iterate(1,n->n+1).limit(10).collect(Collectors.toList());
	static  List<String> list = Arrays.asList("3", "6", "8","14", "15");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Comprueba si eres capaz que la funcion contains funciona, vamos introduce una palabra");
		contains("hola");
		mapToInt();
		
	}
	public static void contains(String sPalabra) {
		
        // In If-else statements you can use the contains() method
 
        if (colores.contains(sPalabra)) {
            System.out.println("Pues si que existe en el texto");
        } else {
            System.out.println("Nop te equivocastes");
        }
	}
	public static void mapToInt() {

		/*
		 * Uso stream().mapToInt que parsea todos los numeros de la lista
		 * y luego los filtro por lo que sean multiplos de 3
		 * */
		list.stream().mapToInt(num -> Integer.parseInt(num)).filter(num -> num % 3 == 0).forEach(System.out::println);
	}
	
	
	
	
	
}
