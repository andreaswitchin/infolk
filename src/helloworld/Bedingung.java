/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

/**
 *
 * @author Andi
 */
public class Bedingung {
    public static void main(String[]args){
        System.out.println(
                20+5==25?"Richtig":"Falsch");
        System.out.println(
                (25+5)*2==61?"Simmt":(25+5)*2==60?"Jetzt stimmts":"Stimmt nicht");
        System.out.println(
                ( 42>0)?1: ((42<0)?-1:0));
    }
    
}
