/**
 * Calculator 
 */
public class Calculator  {
    static void CalculatorInteger(String operation , int number1 , int number2){
        if(number2 <= 0 ){
            System.out.println("Khong the chia het cho 0  ");
        }else {
            switch (operation) {
                case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            default:
                break;
        }
        }
        
    }
}