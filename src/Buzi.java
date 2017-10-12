
public class Buzi{
    public static void main(String[] args) {




        for (int counter = 1; counter <= 100; counter++)
        {

if((counter%3==0)&& (counter%5==0)){
    System.out.println("fizzbuzz");
        }

            else if (counter % 3 == 0)
            {
                System.out.println("fizz");
            }

            else if (counter % 5 == 0)
            {
                System.out.println("buzz");
            }

            else{
                System.out.println(counter);
            }
        }
    }
}




