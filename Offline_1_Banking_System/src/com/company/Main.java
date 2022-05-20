package com.company;

import com.company.accounts.AccountType;

import java.io.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*try(BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"))){

        }catch (IOException e){

        }*/

        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            Bank bank = new Bank();
            String line;
            while ((line = reader.readLine()) != null){
                String[] inputs = line.split(" ");
                System.out.print(line+ "--");
                switch (inputs[0].toLowerCase()){
                    case "create":
                        bank.createAccount(inputs[1], AccountType.valueOf(inputs[2].toUpperCase()), Double.parseDouble(inputs[3]));
                        break;
                    case "deposit":
                        bank.deposit(Double.parseDouble(inputs[1]));
                        break;
                    case "withdraw":
                        bank.withdraw(Double.parseDouble(inputs[1]));
                        break;
                    case "query":
                        bank.checkBalance();
                        break;
                    case "request":
                        bank.reqLoan(Double.parseDouble(inputs[1]));
                        break;
                    case "close":
                        bank.logout();
                        break;
                    case "open":
                        switch (inputs[1].toLowerCase()){
                            case "o":
                                bank.loginAsOfficer(Integer.parseInt(inputs[2]));
                                break;
                            case "c":
                                bank.loginAsCashier(Integer.parseInt(inputs[2]));
                                break;
                            case "d":
                                bank.loginAsMD();
                                break;
                            default:
                                bank.loginAsCustomer(inputs[1]);
                                break;
                        }
                        break;
                    case "approve":
                        bank.approveLoan();
                        break;
                    case "lookup":
                        bank.lookupCustomer(inputs[1]);
                        break;
                    case "change":
                        bank.changeInterest(AccountType.valueOf(inputs[1].toUpperCase()), Double.parseDouble(inputs[2]));
                        break;
                    case "see":
                        bank.seeFund();
                        break;
                    case "inc":
                        bank.incrementYear();
                        break;
                    default:
                        // do nothing
                        break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
