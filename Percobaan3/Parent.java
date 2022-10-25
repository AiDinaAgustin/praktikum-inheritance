/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

/**
 *
 * @author ASUS
 */
public class Parent {
    //kosong
}

class Child extends Parent {
    int x;
    public Child() {
         x = 5;
    }
    
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.x);
    }
}


