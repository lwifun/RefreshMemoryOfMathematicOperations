//это пакет c которым мы работаем
//в пакет мы закидываем всей файлы с которыми мы работаем
package refreshmemory;
import java.util.Scanner;

/**
 * Этот Джава файл был создан для того 
 * чтобы вспомнить как пользоваться Java.
 * 
 * @author lwifu
 */

//создаем класс refresh memory
public class RefreshMemory {
    
    // это основный метод для старта программы и тут все обрабатывается
    public static void main(String[] args) {
        int temp = testMethod(25, 25);
        System.out.println(temp);
    }
    
    // here is the types variables
    public static void nums(){
        // целые числа 
        byte byteNum = 2;
        int integerNum = 444444444;
        long longNum = 444444444;
        
        // у дабл переменных больше чем в флоат
        float floatNum = 234.5f;
        double doubleNum = 235.235;
        
        // хранит в себе символ, картинку
        char symbol = 'A';
        
        // истина или ложь
        boolean trueOrFalse = true;
    }
    
    // doing some Scanner Thing
    public void userInput(){
        Scanner sc = new Scanner(System.in);
        byte byteNum = 5;
        int integerNum;
        long longNum;
        
        float floatNum;
        double doubleNum;
        
        char symbol;

        
        byteNum = sc.nextByte();
        integerNum = sc.nextInt();
        longNum = sc.nextLong();
        
        floatNum = sc.nextFloat();
        doubleNum = sc.nextDouble();
        
        //You could take the first character from
        symbol = sc.next().charAt(0);
        
        //To consume exactly one character you could use
        symbol = sc.findInLine(".").charAt(0);
        
        //To consume strictly one character you could use
        symbol = sc.next(".").charAt(0);
        
        System.out.println("my num is: " );
    }
    
    // a little application that can be ran and you can play with
    public static void mathematicalOp(){
        String inputCheck;
        String answer = null;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter the char you want to refresh memory about specific ARITHMETIC OPERATORS \n i.e.(+; -; *; /; %):");
            inputCheck = sc.next();
            
            if(inputCheck.equals("+")){
                HR();
                System.out.println("Adds values on either side of the operator. \n A + B will give 30.");
                HR();
                System.out.println("Do you want to look at something else?");
            }else if(inputCheck.equals("-")){
                HR();
                System.out.println("Subtracts right-hand operand from left-hand operand. \n A - B will give -10");
                HR();
                System.out.println("Do you want to look at something else?");
            }else if(inputCheck.equals("*")){
                HR();
                System.out.println("Multiplies values on either side of the operator. \n A * B will give 200");
                HR();
                System.out.println("Do you want to look at something else?");
            }else if(inputCheck.equals("/")){
                HR();
                System.out.println("Divides left-hand operand by right-hand operand. \n B/A will give 2");
                HR();
                System.out.println("Do you want to look at something else?");
            }else if(inputCheck.equals("%")){
                HR();
                System.out.println("Divides left-hand operand by right-hand operand and returns remainder. \n B % A will give 0");
                HR();
                System.out.println("Do you want to look at something else?");
            }else if(inputCheck.equals("++")){
                HR();
                System.out.println("Increases the value of operand by 1. \n so B++ gives 21");
                HR();
                System.out.println("Do you want to look at something else?");
            }else if(inputCheck.equals("--")){
                HR();
                System.out.println("Decreases the value of operand by 1. \n so B-- gives 19");
                HR();
                System.out.println("Do you want to look at something else?");
            }else{
                System.out.println("nonono this not work. \n Only this is work (+; -; *; /; %)");
                System.out.println("Do you want to look at something else?");
            }
            
            answer = sc.next();
        }
        while(answer.toLowerCase().equals("yes"));
        System.out.println("Goodbye Sweetie");
    }
    
    // unicodes that changes a lot
    public void unicodes(){
        // \u000d System.out.println("The unicode '/u000d' ");
    }
    
    // just an horizontal line to make the code more user friendly
    public static void HR(){
        System.out.println("--------------------------------------------------");
    }
    
    // if statement and how it can be used
    public static void ifStatements(){
        int oneHun, twoHun, threeHun;
        
        oneHun = 100;
        twoHun = 200;
        threeHun = 300;
        
        if(oneHun == 100)
            System.out.println("yoo its a 100");
        
        
        if(oneHun != 200)
            System.out.println("this is not 200");
        
        
        if(oneHun == 100 && twoHun == 200)
            System.out.println("yee oneHun is 100 AND twoHun is 200");
        
        
        if(oneHun == 100 || twoHun == 500){
            System.out.println("yoo only ONE OF YOU got it right!");
            System.out.println("just for example");
            System.out.println("you have to have curly brackets if there are "
                    + "more than one line");
        }
    }
    
    // switch case examples
    public static void switchCase(){
        int oneHun = 100;
        
        switch(oneHun){
            case 1:
                System.out.println("yoo its one");
                break;
            case 100:
                System.out.println("yoo its a hundred");
                if(oneHun == 100){
                    System.out.println("The security says that everything is okay");
                }
                break;
        }
    }
    
    // for loop examples and cool features
    public static void forLoop(){
        
        int thisIsFive = 5;
        
        System.out.println("adding 1 untill it gets 5");
        for(int i = 1; i <= thisIsFive; i++){
            System.out.println("this is line number: " + i);
        }
        
        HR();
        System.out.println("substracting by 20 untill it gets to 10");
        for(int i = 100; i >= 10; i -= 20){
            System.out.println("this is line number: " + i);
        }
        
        HR();
        System.out.println("multiplying by 2");
        for(int i = 1; i <= 10; i *= 2){
            System.out.println("this is line number: " + i);
        }
    }
    
    //do(something) while(this running)
    public static void doWhile(){
        int zero = 0;
        boolean isValid = true;
        String nothing = null;
        Scanner sc = new Scanner(System.in);
        
        while(zero <= 2){
            System.out.println("element i is: " + zero);
            zero++;
        }
        
        HR();
        
        do{
            System.out.println("Hello this is the loop! \n In order to quit you have to enter letter 'q'");
            nothing = sc.nextLine();
            if(nothing.equals("q")){
                isValid = false;
            }
        }while(isValid);
    }
    
    // little arrays explaination and some cool tricks
    public static void arraysPr(){
        //int [] arrInt = new int[3];
        //arrInt[0] = 0;
        //arrInt[1] = 1;
        //arrInt[2] = 2;
        //System.out.println(arrInt[2]);
        
        String [] hello;
        hello = new String[]{"hello", "this is", "array", "of Strings"};
        
        //to print all of the arrays itll be easier to use for loop, Check it out
        for (int i = 0; i <= 3; i++) {
            System.out.println(hello[i]);
        }
        
        HR();
        //2 dimensional arrays
        
        int[][] arr = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println("");
        }
    }
    
    // this is a test method on how method can be used 
    public static int testMethod(int numA, int numB){
        int result;
        result = numA + numB;
        return result;
    }
    
    
}

/*
this 
*/