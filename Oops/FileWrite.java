package Oops;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
        public static void main(String[] args) {
            try {
                File f =new File("java.txt");
                FileWriter fw=new FileWriter(f);
                fw.write("welcome");
                fw.close();
            }
            catch (Exception E){
                System.out.println(E);
            }
        }
    }


