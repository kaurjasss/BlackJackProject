/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author Kristina
 */
public class Card {
    private Suit suit;
    private Value value;
    
    public Card(Suit suit, Value value){
        this.value =value;
        this.suit = suit;
                
    }
    public String toString(){
        return this.suit.toString() + "-" + this.value.toString();
        
    }
    public Value getvalue(){
        return this.value;
    }
}
