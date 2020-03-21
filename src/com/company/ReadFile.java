package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Logger;

public class ReadFile {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    private String text;
    private String filename;
    public ReadFile(String[] args){
        if(args.length == 0){
            InputStreamReader r= new InputStreamReader(System.in);
            this.text = r.toString();
        }else {
            try (FileReader fr = new FileReader(args[0]);
                 Scanner scan = new Scanner(fr)) {
                StringBuilder texttmp = new StringBuilder();
                this.filename = filename;
                while (scan.hasNextLine()) {
                    texttmp.append(scan.nextLine() + "\n");
                }
                this.text = new String(texttmp);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getText(){
        return text;
    }

    public String getFilename(){
        return filename;
    }
}
