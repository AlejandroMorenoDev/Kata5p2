/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5p2.main;

import kata5p2.model.Histogram;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import java.util.*;
import static kata5p2.view.MailListReader.read;

/**
 *
 * @author amct2
 */
public class Kata5p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kata5p2 kata4 = new Kata5p2();
        kata4.execute();
        
        //String FILENAME = "C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata4\\dominios.txt";
    }
    
    Histogram <String> histograma = new Histogram();
    HistogramDisplay histo;
    
    private void execute(){
        input();
        process();
        output();
    }
    
    private void input(){
      //System.out.println("Introduzca la ruta del (.txt):");
      //Scanner scanner = new Scanner(System.in);
      String FILENAME = "C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata4\\dominios.txt";
      histograma = MailHistogramBuilder.build(read(FILENAME));
      
    }
    
    private void output(){
        histo.execute();
    }
    
    private void process(){
        histo = new HistogramDisplay(histograma);
    }
    
}
