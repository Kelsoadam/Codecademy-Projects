public class Calculator{

int result = 0;

  public static void main(String[] args){
   Calculator myCalculator = new Calculator(); // Creating the calculator object

   System.out.println(myCalculator.add(5,7));
   System.out.println(myCalculator.subtract(45,11));
   System.out.println(myCalculator.divide(5,7));
  }

  public int add(int a, int b){ // Adds the numbers
    
    result = a + b;
    
    return result;
  }

  public int subtract(int a, int b){ // Subtacts the numbers
    
    result = a - b;
    
    return result;
  }

  public int multiply(int a, int b){ // Multiplies the numbers

    result = a * b;

    return result;
  }

  public double divide(int a, long b){ // Divides the numbers

    return ((double) a / b); // Casting our result as a double before division as int can only hold whole numbers
  }

  public int modulo(int a, int b){ //Divides the numbers and gives the remainder

    result = a % b;

    return result;
  }

}