package com.transflower;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.transflower.Entity.Question;

public class FileIoManager {
     public String fileName="question.dat";


    public void SaveToFile(List<Question>questions){
        try {

            FileOutputStream fout=new FileOutputStream(fileName);
            ObjectOutputStream  ObjectOutputStream = new ObjectOutputStream(fout);
            ObjectOutputStream.writeObject(questions);
            ObjectOutputStream. close();
            fout.close();
            System.out.println("question saves to file");

            
        } catch (Exception e) {
            System.out.println(e);
        }



    }
    public List<Question> loadFromFile(){

        List<Question> questions=new ArrayList<Question>();

        try {

            FileInputStream fin=new FileInputStream(fileName);
            ObjectInputStream objectInputStream=new ObjectInputStream(fin);
            questions=(List<Question>)objectInputStream.readObject();
            objectInputStream.close();
            fin.close();

            
        } catch (Exception e) {
            System.out.println(e);
        }
        return questions;
    }

}
