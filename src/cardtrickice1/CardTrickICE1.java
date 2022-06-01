/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import java.util.Random;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 * @author bindram,May 31st
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Random random = new Random();
            Card c1 = new Card();
            int c = random.nextInt(1,13);
            int s= random.nextInt(4);
            c1.setValue(c);
            c1.setSuits(Card.SUITS[s]);
            magicHand[i]=c1;
        }
        //step 2:take input
        Card c1 = new Card();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick A card");
        System.out.print("Enter Value: ");
        int value= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a suit: ");
        String suit = sc.nextLine();

        //step 3: match with array
        boolean found= false;
        for (int i = 0; i < magicHand.length; i++) {
            if(magicHand[i].getValue()==value && magicHand[i].getSuits().toLowerCase().equals(suit.toLowerCase())){
                System.out.println("The card you have selected is in the magic hand");
                found=true;
            }
        }
        if(!found){
            System.out.println("The card you selected is not in the magic hand");
        }
        Card luckyCard= new Card();
        luckyCard.setValue(10);
        luckyCard.setSuits("hearts");
    }
    
}
