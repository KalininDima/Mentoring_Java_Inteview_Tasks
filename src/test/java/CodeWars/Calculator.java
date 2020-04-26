package CodeWars;

public class Calculator {

    public static Double calculate(final double numberOne, final String operation, final double numberTwo)
    {
        Double Result = null;

        switch (operation){
            case "+":
                Result=numberOne+numberTwo;
                break;
            case "-":
                Result=numberOne-numberTwo;
                break;
            case "*":
                Result=numberOne*numberTwo;
                if(numberOne==0||numberTwo==0){
                   Result = Math.abs(Result);
                }
                break;
            case "/":
                if(numberOne!=0&&numberTwo!=0) {
                    Result = numberOne / numberTwo;

                } else {
                    System.out.println("you cannot divide on zero");
                }
                break;
            default:
                System.out.println("Wrong operator");

        }

        return Result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(-3.0, "*", 0));
    }

}
