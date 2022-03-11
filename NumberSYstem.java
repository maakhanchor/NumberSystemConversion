
        
package numbersystem;

import java.util.Scanner;
import java.lang.Math;

public class NumberSYstem {
    //declarations
            //variables and arrays for 5th line 
        static long input = 0;    
         static long intout=0;
         static String hexin;
        static String from = new String();
        static String to = new String();
        
       static int[] bin= new int[50];
        
    //booleans

    
    
    //main function
    public static void main(String[] args) {
                
        
Scanner sc = new Scanner(System.in);
    
        
        
    //first line begins here
        System.out.print("Convert ");
        delay05();
        System.out.print("From ");
        delay05();
        System.out.print(". ");  
        delay03();
        System.out.print(". ");
        delay03();
        System.out.print(". ");
        
        
        from=sc.next();
        
        
        
        
        
     //second line starts here
     
        switch(from.charAt(0)){
            case 'b' : {
                System.out.print("Binary ");
                break;
            }
            case 'B' : {
                System.out.print("Binary ");
                break;
            }
            
            case 'd' : {
                System.out.print("Decimal ");
                break;
            }
            case 'D' : {
                System.out.print("Decimal ");
                break;
            }
            
            case 'h' : {
                System.out.print("Hexadecimal ");
                break;
            }
            case 'H' : {
                System.out.print("Hexadecimal ");
                break;
            }
            
            default : {
                System.out.println("");
                System.out.print("       Invalid Input");
            delay05();
            System.out.print(".");
            delay05();
            System.out.print(".");
            delay05();
            System.out.print(".");
            delay05();
            System.out.print("!");
            delay05();
            System.out.print("!");
            delay05();
            System.out.print("!");
            
        delay1();

        System.out.println("");
        System.out.println("");
        System.exit(0);
            }
        }
    
        
        delay05();
        System.out.print("To ");
        delay03();
        System.out.print(". ");
        delay03();
        System.out.print(". ");
        delay03();
        System.out.print(". ");
        delay03();
        System.out.print(".");
        
        to = sc.next();
        
        
        
    //Third line begins here

     boolean  iffrombinary = from.charAt(0)=='b'||from.charAt(0)=='B';
     boolean  iftobinary = to.charAt(0)=='b'||to.charAt(0)=='B';
     
   boolean iffromdecimal = from.charAt(0)=='d'||from.charAt(0)=='D';
    boolean iftodecimal = to.charAt(0)=='d'||to.charAt(0)=='D';
    
   boolean iffromhex = from.charAt(0)=='h'||from.charAt(0)=='H';
   boolean iftohex = to.charAt(0)=='h'||to.charAt(0)=='H';

    
    
        System.out.println("");
        System.out.print("      ");

        
        if(iffrombinary && iftodecimal)
        {
           System.out.print("BINARY ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("DECIMAL ");
           delay05();
           System.out.println("CONVERSION ");
        }
        else if(iffrombinary && iftohex)
        {
            System.out.print("BINARY ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("HEXADECIMAL ");
           delay05();
           System.out.println("CONVERSION ");
        }
        else if(iffrombinary && iftobinary)
        {
            System.out.print("BINARY ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("BINARY ");
           delay05();
           System.out.println("CONVERSION ");
        }
       else if(iffromdecimal && iftobinary)
        {
            System.out.print("DECIMAL ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("BINARY ");
           delay05();
           System.out.println("CONVERSION ");
        }
        else if(iffromdecimal && iftohex)
        {
             System.out.print("DECIMAL ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("HEXADECIMAL ");
           delay05();
           System.out.println("CONVERSION ");
        }
        else if(iffromdecimal && iftodecimal)
         {
             System.out.print("DECIMAL ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("DECIMAL ");
           delay05();
           System.out.println("CONVERSION ");
        }
        else if(iffromhex && iftobinary)
         {
             System.out.print("HEXADECIMAL ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("BINARY ");
           delay05();
           System.out.println("CONVERSION ");
        }
        else if(iffromhex && iftodecimal)
         {
             System.out.print("HEXADECIMAL ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("DECIMAL ");
           delay05();
           System.out.println("CONVERSION ");
        }
        else if(iffromhex && iftohex)
         {
              System.out.print("HEXADECIMAL ");
           delay05();
           System.out.print("To ");
           delay05();
           System.out.print("HEXADECIMAL ");
           delay05();
           System.out.println("CONVERSION ");
        }
        else
        {
            System.out.print("Invalid Input");
            delay05();
            System.out.print(".");
            delay05();
            System.out.print(".");
            delay05();
            System.out.print(".");
            delay05();
            System.out.print("!");
            delay05();
            System.out.print("!");
            delay05();
            System.out.println("!");
        
            delay1();

        System.out.println("");
        System.out.println("");
        System.exit(0);
            
        }
      
        
        
        
    


   
        
    //4th line, input & conversion and 5th line
        if(iffrombinary)
        {  takeInput();
            if(isbinaryinputinvalid()== true)
            {
                System.out.println("");
                System.out.print("     Invalid ");
                transition2(iffrombinary, iffromdecimal, iffromhex);
            System.out.print(" Input");
            delay05();
            System.out.print("!");
            delay05();
            System.out.print("!");
            delay05();
            System.out.print("!");
                
            }           
                
            
            
            else
            {
            if(iftodecimal)
            { 
                
            bintodeci();
            transition1();
            transition2(iftobinary, iftodecimal, iftohex);
            transition3();
            System.out.println(intout);

            
            }
            
            else if(iftobinary)
            {   transition1();
                transition2(iftobinary,iftodecimal,iftohex);
                sametosame();
            }
            else if(iftohex) 
            {
                bintodeci();
                transition1();
                transition2(iftobinary, iftodecimal, iftohex);
                decitohex(intout);
            }
        }
            
    }
        else if(iffromdecimal)
        {
          takeInput();

            if(iftodecimal)
            { 
              transition1();
              transition2(iftobinary,iftodecimal,iftohex);
              sametosame();
            
            }
            
            else if(iftobinary)
            {
                transition1();
                transition2(iftobinary,iftodecimal,iftohex);
                decitobin();
            }
            else if(iftohex) 
            {
                transition1();
                transition2(iftobinary, iftodecimal, iftohex);
                decitohex(input);
            }
       }
        
        
        else if (iffromhex)
        {
            takeInput();
          
           
             if(iftodecimal)
            { 
              transition1();
              transition2(iftobinary,iftodecimal,iftohex);
                System.out.println(": " + input);
              
            
            }
            
            else if(iftobinary)
            {
                transition1();
                transition2(iftobinary,iftodecimal,iftohex);
                hextodeci();
                decitobin();
            }
            else if(iftohex) 
            {
                transition1();
                transition2(iftobinary, iftodecimal, iftohex);
                System.out.print(": " + hexin);

            }
           
        }
        
        delay1();
        delay1();
        delay1();
        System.out.println("");
        System.out.println("");

      }

    
 
    
    //conversion functions
    public static void sametosame()
    {

        
         System.out.print(input);

        
    }
    
    
    public static void bintodeci()
    {
        
       
        int index=0;
         
        long n =input;
            while(n!=0)
            {   
                bin[index]=(int)n%10;
                n= n/10;
                index++;
            }   
        
        for(int j=0;j<index;j++)
        {
            intout = intout + bin[j]* (int)Math.pow(2,j);
        }
            
            
        }
    
    
    public static void decitohex(long intout)
    {   if(intout==0)
    {
        delay03();
            System.out.print("0");
            
             System.out.println("");
        System.out.println("");
    }
        else
    {
        String[] hexout = new String[10];
        int index =0;
        while(intout!=0)
        {
            hexout[index] = Long.toString(intout%16);
            intout = intout/16;
            index++;
        }
        System.out.print(" : ");
        for(int j=index-1; j>=0; j--)
        {
            switch (hexout[j])
            {
                case "10" : 
                {hexout[j]="a";
                break;
                    
                } 
                case "11" : 
                {hexout[j]="b";
                break;
                    
                } 
                case "12" : 
                {hexout[j]="c";
                break;
                    
                } 
                case "13" : 
                {hexout[j]="d";
                break;
                    
                } 
                case "14" : 
                {hexout[j]="e";
                break;
                    
                } 
                case "15" : 
                {hexout[j]="f";
                break;
                    
                } 
            }
        
            System.out.print(hexout[j]);
        }
        
        }
        
    }
    
    public static void decitobin()
    { if(input==0)
    {
        delay03();
            System.out.print("0");
            
             System.out.println("");
        System.out.println("");
    }
        else
    {
        int index = 0;
        long n = input;
        while(n!=0)
        {
            bin[index] = (int)(n%2);
            n = n/2;
            index++;
        }
        System.out.print(" : ");
        for(int j = index-1; j>=0; j--)
        {
            System.out.print(bin[j]);
            
        }
    }
    }
    
    
    
    public static void hextodeci()
    {
       
        for(int i = 0; i<hexin.length(); i++)
        {  
            switch (hexin.charAt(i)) {
                case 'a' : { input = input * 16 + 10;
                            break;
                           }          
                
                
                case 'b' : { input = input * 16 + 11;
                              break;
                }
                
                case 'c' : { input = input * 16 + 12;
                             break;          
                }
                                   
                case 'd' : { input = input * 16 + 13;
                           break;
                }
              
                case 'e' : { input = input * 16 + 14;
                             break;
                }
                
                
                case 'f' : { input = input * 16 + 15;
                             break;
                }
                case 'A' : { input = input * 16 + 10;
                            break;
                           }          
                
                
                case 'B' : { input = input * 16 + 11;
                              break;
                }
                
                case 'C' : { input = input * 16 + 12;
                             break;          
                }
                                   
                case 'D' : { input = input * 16 + 13;
                           break;
                }
              
                case 'E' : { input = input * 16 + 14;
                             break;
                }
                
                
                case 'F' : { input = input * 16 + 15;
                             break;
                }

                
                default :   input = input * 16 + Character.getNumericValue(hexin.charAt(i));
            }
            
        }
      
      }
    
    

    
    
    //Take Input Function
         static  public void takeInput()
           {
            System.out.println("");
            System.out.print("Enter ");
            delay03();
            System.out.print("The ");
            delay03();
            if(from.charAt(0)=='b'){
                System.out.print("Binary ");
            }
            else
            {
            delay03();
            System.out.print("Number ");
            }
            delay03();
            System.out.print("< ");
            delay03();
            System.out.print("< ");
            delay03();
            System.out.print("< ");
            delay03();
            System.out.print(": ");
            Scanner sc = new Scanner(System.in);
            
            try {
                if(from.charAt(0)=='h'||from.charAt(0)=='H')
                {
                    hexin=sc.next();
                    String hexchecker = "0123456789aAbBcCdDeEfF";
                    boolean flag = true;
                  for(int i = 0; i < hexin.length(); i++)
                  {
                      for (int j = 0; j <= 22; j++)
                      {
                          if(hexin.charAt(i) == hexchecker.charAt(j))
                                  {  flag = false;
                                     break;
                                  }
                         
                      }
                      if(flag)
                      {
                          throw new Exception();
                      }
                  }
                }
                else
                {
                input=sc.nextLong();
                }
            }
            catch(Exception e)
            {
                System.out.println("");
                System.out.print("     Invalid ");
                if(from.charAt(0)=='b' || from.charAt(0)=='B')
                System.out.print("Binary Input !!!");
                else if(from.charAt(0)=='d'||from.charAt(0)=='D')
                {
                System.out.print("Decimal Input !!!");
                }
                else
                {
                System.out.print("Hexadecimal Input !!!");
                }
        delay1();
        delay1();
        delay1();
        System.out.println("");
        System.out.println("");
        System.exit(0);
            
             }
           }
           
           
    
    //invalidinput checker funtion
    public static boolean isbinaryinputinvalid()
    {
    
        
        long n = input;
        while(n!=0)
        {
            if(n%10 == 1 || n%10 == 0)
            {   
        
            }
          else
          return true;
        n = n/10;
        }
        
        return false;
    }
    
    //transition functions
    public static void transition1()
    { //transsition part 1
        
        System.out.println("⎀");
        delay03();
         System.out.println("⎀");
         delay03();
         System.out.println("⎀");
         
    }
    
    public static void transition2(boolean b, boolean d, boolean h)
    {
         //transition part 2

    
         if(b)
         { System.out.print("B");
         delay03();
         System.out.print("I");
         delay03();
         System.out.print("N");
         delay03();
         System.out.print("A");
         delay03();
         System.out.print("R");
         delay03();
         System.out.print("Y ");
         
         }
         else if(d)
         {
         System.out.print("D");
         delay03();
         System.out.print("E");
         delay03();
         System.out.print("C");
         delay03();
         System.out.print("I");
         delay03();
         System.out.print("M");
         delay03();
          System.out.print("A");
         delay03();
         System.out.print("L ");
         
         }
         else if(h)
         {
         System.out.print("H");
         delay03();
         System.out.print("E");
         delay03();
         System.out.print("X");
         delay03();
         System.out.print("A");
         delay03();
         System.out.print("D");
         delay03();
         System.out.print("E");
         delay03();
         System.out.print("C");
         delay03();
         System.out.print("I");
         delay03();
         System.out.print("M");
         delay03();
          System.out.print("A");
         delay03();
         System.out.print("L ");
         }
    }
    
    public static void transition3()
    {
         //transition part 3
         delay03();
         System.out.print("> ");
         delay03();
         System.out.print("> ");
         delay03();
         System.out.print("> ");
         delay03();
         System.out.print("> ");
         delay03();
         System.out.print(": ");
         delay1();
         
        
    }
    
    
    //delay functions start
    public static void delay01(){
   
        try{
        Thread.sleep(100);
        }
        
        catch(InterruptedException e) {
            
        }
     }
    
        public static void delay02(){
   
        try{
        Thread.sleep(200);
        }
        
        catch(InterruptedException e) {
            
        }
        }
        
                public static void delay03(){
   
        try{
        Thread.sleep(300);
        }
        
        catch(InterruptedException e) {
            
        }
        }
                
                
     public static void delay05(){
   
        try{
        Thread.sleep(500);
        }
        
        catch(InterruptedException e) {
            
        }
        }
     
     
    public static void delay1(){
   
        try{
        Thread.sleep(1000);
        }
        
        catch(InterruptedException e) {
            
        }
        }
    //delay functions limit

}
    
