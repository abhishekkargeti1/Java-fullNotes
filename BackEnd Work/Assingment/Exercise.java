package Assingment;

import java.util.*;

class Exercise {
    public static void main(String[] args) {
        // 1.WAP TO CHECK WHETHER NUMBER IS POSITIVE OR NOT.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int userInput = sc.nextInt();
        // if(userInput>=0){
        // System.out.println("UserInput is postive number "+userInput);
        // }else{
        // System.out.println("UserInput is negative number "+userInput);
        // }

        // 2. WAP TO CHECK WHETHER THE PERSON IS ELIGIBLE TO MARRY OR NOT.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = sc.nextInt();
        // if(age>=21){
        // System.out.println("Eligible to marry");
        // }else{
        // System.out.println("Not eligible to marry");
        // }

        // 3.WAP TO PRINT GOODMORNING WHEN THE NO IS 8.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int userInput=sc.nextInt();
        // if(userInput == 8){
        // System.out.println("GoodMorning");
        // }

        // 4.WAP TO DISPLAY MESSAGE GOOD MORNING WHEN NUMBER IS 8 AND NUMBER EQUALS TO
        // 10 AND
        // NUMBER EQUALS TO 11

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number");
        // int userInput= sc.nextInt();
        // if(userInput == 8 || userInput ==10 ||userInput ==11){
        // System.out.println("Good Morning");
        // }

        // 5.WRITE ONE PROGRAM FOR NESTED IF,else if Ladder->IN CLASS

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number");
        // int num2 = sc.nextInt();
        // System.out.println("Enter third number");
        // int num3 = sc.nextInt();
        // if(num1>num2 && num1>num3){
        // System.out.println("Num1 is greatest "+num1);
        // }else if(num2>num1 && num2>num3){
        // System.out.println("Num2 is greatest "+num2);
        // }else{
        // System.out.println("Num3 is greatest "+num3);
        // }

        // 6.WAP TO PRINT NUMBER BETWEEN 1 TO 10.->IN CLASS

        // for(int i =1;i<=10;i++){
        // System.out.println(i);
        // }

        // 7.WAP TO PRINT NUMBER B/W 20 TO 10

        // for(int i =20;i>=10;i--){
        // System.out.println(i);
        // }

        // 8.WAP TO PRINT EVEN NO B/W 1 TO 10.

        // for(int i=1;i<=10;i++){
        // if(i%2==0){
        // System.out.println(i);
        // }
        // }

        // 9.WAP TO PRINT ODD NO B/W 1 TO 10.

        // for(int i=1;i<=10;i++){
        // if(i%2!=0){
        // System.out.println(i);
        // }
        // }

        // 10.WAP TO PRINT EVEN NO B/W 19 TO 9.

        // for(int i =9; i<=19;i++){
        // if(i%2 == 0){
        // System.out.println(i);
        // }
        // }

        // 11.WAP TO PRINT ODD NO B/W 20 TO 10.

        // for(int i=10;i<=20;i++){
        // if(i%2!=0){
        // System.out.println(i);
        // }
        // }

        // 12.WAP TO CALCULATE SUM OF NUMBER B/W 1 TO 5.->IN CLASS.

        // int sum=0;
        // for(int i=1;i<=5;i++){
        // sum +=i;
        // }
        // System.out.println(sum);

        // 13.WAP TO CALCULATE SUM OF EVEN NO B/W 1 TO 10 WITH TRACING.

        // int sum=0;
        // for(int i=1;i<=10;i++){
        // if(i%2==0){
        // sum +=i;
        // }
        // }
        // System.out.println(sum);

        // 14.WAPT PRINT SUM OF ODD NO B/W 1 TO 10 WITH TRACING.

        // int sum=0;
        // for(int i=1;i<=10;i++){
        // if(i%2!=0){
        // sum +=i;
        // }
        // }
        // System.out.println(sum);

        // 15.WAP TO PRINT SUM OF EVEN NO B/W 20 TO 10.

        // int sum =0;
        // for(int i =10;i<=20;i++){
        // if(i%2==0){
        // sum +=i;
        // }
        // }
        // System.out.println(sum);

        // 16.WAP TO PRINT SUM OF ODD NO B/W 35 TO 11

        // int sum=0;
        // for(int i=11;i<=35;i++){
        // if(i%2!=0){
        // sum+=i;
        // }
        // }
        // System.out.println(sum);

        // 17.WAP TO PRINT EACH DIGIT IN A NUMBER(IN REVERSE ORDER).->IN CLASS

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int userInput = sc.nextInt();
        // while(userInput>0){
        // int a= userInput%10;
        // System.out.print(a);
        // userInput /=10;
        // }

        // 18.WAP TO PRINT EVEN DIGITS IN A NUMBER

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int userInput = sc.nextInt();
        // while(userInput>0){
        // int a =userInput%10;
        // if(a%2==0){
        // System.out.println(a);
        // }
        // userInput /=10;
        // }

        // 19.WAP TO PRINT ODD DIGITS IN A NUMBER.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int userInput=sc.nextInt();
        // while(userInput>0){
        // int a = userInput%10;
        // if(a%2!=0){
        // System.out.println(a);
        // }
        // userInput /=10;
        // }

        // 20.WAP TO CALCULATE SUM OF ALL DIGITS IN A NUMBER

        // Scanner sc = new Scanner(System.in);
        // int sum=0;
        // System.out.println("Enter a number");
        // int userInput = sc.nextInt();
        // while(userInput>0){
        // int num=userInput%10;
        // sum +=num;
        // userInput /=10;
        // }
        // System.out.println(sum);

        // 21.WAP TO CALCULATE SUM OF EVEN DIGITS IN A NUMBER.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int userInput = sc.nextInt();
        // int sum=0;
        // while(userInput>0){
        // int a = userInput%10;
        // if(a%2==0){
        // sum +=a;
        // }
        // userInput /=10;
        // }
        // System.out.println(sum);

        // 22.WAP TO CALCULATE SUM OF ODD DIGITS IN A NUMBER.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int userInput = sc.nextInt();
        // int sum=0;
        // while(userInput>0){
        // int a = userInput%10;
        // if(a%2!=0){
        // sum +=a;
        // }
        // userInput /=10;
        // }
        // System.out.println(sum);

        // 23.WAP TO FIND LOGIC FOR SWAPPING OF TWO NUMBER.->IN CLASS

        // Scanner sc = new Scanner(System.in);
        // int a,b,temp;
        // System.out.println("Enter number for a");
        // a = sc.nextInt();
        // System.out.println("Enter number for b");
        // b =sc.nextInt();
        // System.out.println("Before Swapping a = "+a+" b = "+b);
        // temp=a;
        // a =b;
        // b=temp;
        // System.out.println("After Swapping a = "+a +" b = "+ b);

        // 24.WAP TO SWAP TWO NUMBERS WITHOUT USING TEMP VARIABLE.->IN CLASS

        // Scanner sc = new Scanner(System.in);
        // int a,b;
        // System.out.println("Enter number for a");
        // a = sc.nextInt();
        // System.out.println("Enter number for b");
        // b =sc.nextInt();
        // System.out.println("Before Swapping a = "+a+" b = "+b);
        // a=(a^b);
        // b=(a^b);
        // a=(a^b);
        // System.out.println("After Swapping a = "+a +" b = "+ b);

        // 25.WAP TO COUNT HOW MANY DIGITS ARE PRESENT IN A NUMBER.->IN CLASS

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int counter=0;
        // int num = sc.nextInt();
        // while(num>0){
        // int a = num%10;
        // counter++;
        // num /=10;

        // }
        // System.out.println(counter);

        // 26.WAP TO COUNT EVEN DIGITS IN A NUMBER.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num=sc.nextInt();
        // int counter =0;
        // while(num>0){
        // int a =num%10;
        // if(a%2==0){
        // counter ++;
        // }
        // num /=10;
        // }
        // System.out.println(counter);

        // 27.WAP TO COUNT ODD DIGITS IN A NUMBER.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // int counter =0;
        // while(num>0){
        // int a = num%10;
        // if(a%2!=0){
        // counter++;
        // }
        // num /=10;
        // }
        // System.out.println(counter);

        // 28.WAP TO REVERSE THE NUMBER.->IN CLASS

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // while(num>0){
        // int a=num%10;
        // System.out.print(a);
        // num /=10;
        // }

        // 29.WAP TO CHECK WHETHER THE NUMBER IS PALINDROME OR NOT.->IN CLASS

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // int orignalnum = num;
        // int output=0;
        // while(num>0){
        // int a = num%10;
        // output =output*10+a;
        // num /=10;
        // }

        // if(orignalnum == output){
        // System.out.println("Number is palindrome");
        // }else{
        // System.out.println("Number is not palindrome ");
        // }

        // 30.WAP TO PRINT PALINDROME NUMBER B/W 10 TO 200.

        // int palindromeNum=0;
        // for(int i=10;i<=200;i++){
        // int orignalNum = i;
        // palindromeNum=0;
        // while(orignalNum>0){
        // int a = orignalNum%10;
        // palindromeNum= palindromeNum*10+a;
        // orignalNum /=10;
        // }

        // if(i == palindromeNum){
        // System.out.println(i);
        // }
        // }

        // 31.WAP TO CALCULATE POWER OF A NUMBER.->IN CLASS

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // double num = sc.nextDouble();
        // System.out.println("Enter the power");
        // double power = sc.nextDouble();
        // double result = Math.pow( num, power);
        // System.out.println(result);

        // 32.WAP TO CALCULATE SQUARE OF THE DIGIT IN A NUMBER.IF THE DIGIT IS EVEN THEN
        // ONLY FIND THE SQUARE.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // String result="";
        // while(num>0){
        // int digit = num%10;
        // if(digit%2==0){
        // result=(digit*digit)+result;

        // }
        // num /=10;
        // }
        // if(!result.isEmpty()){
        // System.out.println(result);
        // }else{
        // System.out.println("No even digits found");
        // }

        // 33. WAP TO CALCULATE CUBE OF EVERY DIGIT IF DIGIT IS ODD IN A NUMBER.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // String result="";
        // while(num>0){
        // int digit = num%10;
        // num /=10;
        // if(digit%2 !=0){
        // result=(digit*digit*digit)+" "+result;
        // }

        // }
        // if(!result.isEmpty()){
        // System.out.println(result);
        // }else{
        // System.out.println("No odd digits found");
        // }

        // 34.CALCULATE THE SUM OF SQUARE OF EACH DIGIT IF DIGIT IS EVEN IN A NUMBER.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // boolean found =false;
        // int result=0;
        // while(num>0){
        // int digits = num%10;
        // if(digits%2 ==0){
        // result +=(digits*digits);
        // found=true;
        // }
        // num /=10;
        // }
        // if(!found){
        // System.out.println("No even digits found");
        // }else{
        // System.out.println(result);
        // }

        // 35.CALCULATE SUM OF CUBE OF EACH DIGIT IF DIGIT IS ODD.

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // int result=0;
        // boolean found=false;
        // while(num>0){
        // int digits = num%10;
        // if(digits%2 !=0){
        // result +=(digits*digits*digits);
        // found = true;
        // }
        // num /=10;
        // }
        // if(!found){
        // System.out.println("No odd digits are found");
        // }else{
        // System.out.println(result);
        // }

        // 36.WAP TO PRINT DIVISORS OF 10.->IN CLASS

        // for(int i=1;i<=100;i++){
        // if(10%i==0){
        // System.out.println(i);
        // }
        // }

        // 37.WAP TO PRINT THE NO B/W 1 TO 30 WHICH IS DIVISIBLE BY 3 AND 9.

            // for(int i=1;i<=30;i++){
            //     if(i%3 == 0 && i%9 == 0){
            //         System.out.println(i);
            //     }
            // }

        // 38.WAP TO PRINT THE NO B/W 1 TO 100 WHICH IS DIVISIBLE BY ONLY 9

        // for(int i =1;i<=100;i++){
        //     if(i%9==0){
        //         System.out.println(i);
        //     }
        // }

        // 39.WAP TO PRINT THE NO B/W 1 TO 20 WHICH IS DIVISIBLE BY 2 AND 4.

        // for(int i=1;i<=20;i++){
        //     if(i%2==0 &i%4==0){
        //         System.out.println(i);
        //     }
        // }

        // 40.WAP TO CALCULATE SUM OF ALL THE NOS WHICH IS PRESENT IN 20 TO 60 AND NO SHOULD BE DIVISIBLE BY ONLY 11.

        // int sum =0;
        // for(int i=20;i<=60;i++){
        //     if(i%11==0){
        //         sum +=i;
        //     }
        // }
        // System.out.println(sum);

        //41.CHECK WHETHER THE NO IS PERFECT NO OR NOT.->IN CLASS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        

    }
}
