class Arithmetic{

    public static void main(String[] args) {
        

        String operator = "+";
        double num1 = 20;
        double num2 = 10;
        double result;
        result = switch(operator){
            case "+"->(num1+num2);
            case "-"->(num1-num2);
            case "/"->(num1/num2);
            case "*"->(num1*num2);
            case "%"->(num1%num2);
            default->(-1);
        };

        if(result==-1){
            System.out.println("Invalid operator");
        }else{
            System.err.println("Result: " + result);
        }
    
    
    
    
    
    }
}