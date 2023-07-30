import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reto1_2 {
    static List<Integer> numbers;
    private  static  List<Integer> agregarNumerosEnLista(){
        numbers = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            numbers.add(i);
        }
        return numbers;
    }

    private static void mostrarFizzBuzz(List<Integer> listNumbers){
        List<String> numbersStr = listNumbers.stream()
                .map(n -> (n % 3 ==0 && n%5 == 0) ? "fizzbuzz" : (n % 3 == 0) ? "fizz" : (n % 5 == 0) ? "buzz" : n.toString())
                .collect(Collectors.toList());

        numbersStr.forEach(n -> System.out.println("n = " + n));
    }
    public static void main(String[] args) {

        mostrarFizzBuzz(agregarNumerosEnLista());

    }

}
