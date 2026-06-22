package com.transflower.Managers;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.transflower.publishers.Account;
import java.util.List;
import java.io.File;


public class FileIoManager{

    public boolean saveToFile(String fileName,List<Account> accounts){
        try{
        ObjectMapper mapper=new ObjectMapper();
        mapper.WriteValue(new File(fileName),accounts);
        System.out.println("writing to json file");
        return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Account> LoadFromFile(String fileName){
       try{
      
        ObjectMapper mapper=new ObjectMapper();
        List<Account> accounts=mapper.readValue(new File(fileName),new TypeReference<List<Account>>() {});
        return accounts;
       }catch(Exception e){
        e.printStackTrace();
        return null;
       }
   
    }
}

