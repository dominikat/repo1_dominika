/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author domik
 */
public class nbp {

    public nbp() throws FileNotFoundException{
        this.loadFile(this.fileName);
    }

    public void loadFile(String fileName) throws FileNotFoundException {
        this.fileReader = new FileReader(fileName);
    }

    public void readFile() {
        try {
            this.bufReader = new BufferedReader(this.fileReader);
            String oneLine;
            while ((oneLine = this.bufReader.readLine()) != null) {
                System.out.println(oneLine);
            }
        } catch (IOException e) {
            System.err.println("Błąd: " + e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        nbp nbp1 = new nbp();
        nbp1.readFile();
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String s) {
        this.fileName = s;
    }
    private FileReader fileReader;
    private BufferedReader bufReader;
    private String fileName = "C:\\temp\\test.txt";
}
