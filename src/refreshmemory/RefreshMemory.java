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
        mathematicalOp();
    }
    
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
    
    public static void mathematicalOp(){
        String inputCheck;
        String answer = null;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("enter the char you want to refresh memory about specific arithmetic operator \n i.e.(+; -; *; /; %):");
            inputCheck = sc.next();
            
            if(inputCheck == "+"){
                HR();
                System.out.println("Adds values on either side of the operator. \n A + B will give 30.");
                System.out.println("Do you want to look at something else?");
            }if(inputCheck == "-"){
                HR();
                System.out.println("Subtracts right-hand operand from left-hand operand. \n A - B will give -10");
                System.out.println("Do you want to look at something else?");
            }if(inputCheck == "*"){
                HR();
                System.out.println("Multiplies values on either side of the operator. \n A * B will give 200");
                System.out.println("Do you want to look at something else?");
            }if(inputCheck == "/"){
                HR();
                System.out.println("Divides left-hand operand by right-hand operand. \n B/A will give 2");
                System.out.println("Do you want to look at something else?");
            }if(inputCheck == "%"){
                HR();
                System.out.println("Divides left-hand operand by right-hand operand and returns remainder. \n B % A will give 0"); 
                System.out.println("Do you want to look at something else?");
            }if(inputCheck == "++"){
                HR();
                System.out.println("Increases the value of operand by 1. \n so B++ gives 21");
                System.out.println("Do you want to look at something else?");
            }if(inputCheck == "--"){
                HR();
                System.out.println("Decreases the value of operand by 1. \n so B-- gives 19");
                System.out.println("Do you want to look at something else?");
            }
            
            answer = sc.next();
        }
        while(answer.toLowerCase().equals("yes"));
    }
    //else{
    //            System.out.println("what is that? Do (+; -; *; /; %)");
    //        }
    public static void HR(){
        System.out.println("--------------------------------------------------");
    }
}

/*
this 
*/