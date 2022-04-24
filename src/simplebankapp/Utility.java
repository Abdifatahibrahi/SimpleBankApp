
package simplebankapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Utility {
    
   
    
    public void ArrayList<Account> ReadFile (String filename){
         ArrayList<account> accounts = new ArrayList<>();
        try {
            FileReader fr =new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line =br.readLine()) != null ){
                String[] currentAccount = line.split("<>");
                String accNumber = new currentAccount[0];
                String accholder = new currentAccount[1];
                String openDate = new currentAccount[2];
                Double balance = Double.parseDouble(currentAccount[3]);
                
                Account acc = new Account(accNumber,accholder,openDate,balance);
                accounts.add(acc);
            }
        catch(Exception e){
                System.out.println(e);
                }
        return accounts;
    }
    
    
    
}
