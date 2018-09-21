/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 766375
 */
public class Note implements Serializable {
    
    // Attritbutes
    public String title;
    public String content;
    
    public Note(){

    }
    
    public Note(String path) {
        try {
            // to read files
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
                    
            title = br.readLine();
            content = br.readLine();
            
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
   
    public void setContent(String content){
        this.content = content;
    }
    
    public String getContent(){
        return content;
    }
    
    public void save(String path){
        try {
            // to write to a file
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
            
            pw.write(title);
            pw.write(content);
            
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
