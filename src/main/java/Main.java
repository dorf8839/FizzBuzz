import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.boot();
    }

    public void boot(){
        System.out.println("/* ===== Fizz Buzz ===== */");
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a number: ");
        int n = input.nextInt();
        fizzBuzzProcessor(n);
    }

    public void fizzBuzzProcessor(int data){
        for(int i = 1; i <= data; i++){
            String result = fizzBuzzResult(i);
            System.out.println(result);
        }
    }

    public String fizzBuzzResult(Integer data){
        if(data%3 == 0 && data%5 == 0){
            return "FizzBuzz";
        }else if(data%3 == 0){
            return "Fizz";
        }else if(data%5 == 0){
            return "Buzz";
        }else{
            return data.toString();
        }
    }
}
