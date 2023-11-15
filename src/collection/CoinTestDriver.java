/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.HashSet;

/**
 *
 * @author joko
 */
public class CoinTestDriver {
 public static void main(String[] args){
     HashSet<Coin> bagOfCoins = new HashSet<Coin>();
     
     Coin coin1 = new Coin(1);
     Coin coin2 = new Coin(2);
     Coin coin5 = new Coin(5);
     Coin coin10 = new Coin(10);
     Coin coin20 = new Coin(20);
     Coin coin50 = new Coin(50);
     Coin coin100 = new Coin(100);
     
     bagOfCoins.add(coin1);
     bagOfCoins.add(coin2);
     bagOfCoins.add(coin5);
     bagOfCoins.add(coin10);
     bagOfCoins.add(coin20);
     bagOfCoins.add(coin50);
     bagOfCoins.add(coin100);
     
     findCoin(bagOfCoins, coin100);
     displayBagContents(bagOfCoins);
     displayBagDetails(bagOfCoins);
     bagOfCoins.clear();
     displayBagDetails(bagOfCoins);
 }
 
 static void findCoin(HashSet<Coin> bagOfCoins, Coin coin){
     if(bagOfCoins.contains(coin))
         System.out.println("There is a coin" + coin.getDenomination() + " in the bag");
     else
         System.out.println("There is no coin " + coin.getDenomination() + " in the bag");
 }
 
 static void displayBagContents(HashSet<Coin> bagOfCoins){
     for(Coin coin: bagOfCoins)
         System.out.println(coin.getDenomination());
 }
 
 static void displayBagDetails(HashSet<Coin> bagOfCoins){
     if(bagOfCoins.isEmpty())
         System.out.println("There are no coins in the bag");
     else
         System.out.println("There are " + bagOfCoins.size() + "coins is the bag");
 }
}
