/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonmapingproject;

import java.io.BufferedReader;
import processing.core.PApplet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author 679213
 */
public class Sketch {
    File values;

void setup() throws FileNotFoundException{
  testMethod();
}

void testMethod() throws FileNotFoundException{
  BufferedReader reader;
        reader = new BufferedReader(new FileReader("C:/Users/679213/Documents/fy20_adc_data_file_88_degrees.csv"));
  BufferedReader lineCounter;
        lineCounter = new BufferedReader(new FileReader("C:/Users/679213/Documents/fy20_adc_data_file_88_degrees.csv"));
  String line = null;
  int lineCount = 0;
  
  try {
    while ((line = lineCounter.readLine()) != null) {
      lineCount++; 
    }
    System.out.println(lineCount);
    lineCounter.close();
  }
  catch (IOException e){
  e.printStackTrace();
  }
  
  try {
    String[] values = new String[lineCount];
    int place = 0;
    while ((line = reader.readLine()) != null) {
      values[place] = line;
      //println(place);
      place++;
    }
    System.out.println("complete");
    //for(int i = 0; i < values.length; i++){
        //print(values[i] + "\n");
    //}
    reader.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
} 
}
