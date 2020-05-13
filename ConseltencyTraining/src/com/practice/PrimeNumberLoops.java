package com.practice;
/*Print all prime numbers between 1-10 */

public class PrimeNumberLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Prime numbers are :");
//		int i=2;
//		while(i<=100) {
//			if(((i/2==1)&&(i%2==0))||((i/3==1)&&(i%3==0))) {
//					System.out.print(" "+i);
//			}
//			if(!((i%2==0)||(i%3==0))) {
//				System.out.print(" "+i);
//			}
//			
//			i++;
//		}

//		for (int i = 2; i <= 100; i++) {
//			if (((i / 2 == 1) && (i % 2 == 0)) || ((i / 3 == 1) && (i % 3 == 0))) {
//				System.out.print(" " + i);
//			}
//			if (!((i % 2 == 0) || (i % 3 == 0))) {
//				System.out.print(" " + i);
//			}
//
//		}
		 
		

         System.out.println("Prime numbers between 1 and 100");

         //loop through the numbers one by one
         for(int i=2; i <=100; i++){
                 boolean isPrime = true;
                 //check to see if the number is prime
                 for(int j=2; j < i ; j++){
                         if(i % j == 0){
                                 isPrime = false;
                                 break;
                         }
                 }
                 // print the number
                 if(isPrime)
                         System.out.print(i + " ");
         }
	}

}
