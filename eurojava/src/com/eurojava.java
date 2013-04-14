/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.FileNotFoundException;

/**
 *
 * @author domik
 */
public class eurojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        //System.out.print("czesc");
        nbp nbp1 = new nbp();
        nbp1.readFile();
    }
}
