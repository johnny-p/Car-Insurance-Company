package cicSrc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioannis Papakostas
 */
import java.util.ArrayList;
import java.util.*;

public class Claimant extends User{
    
    //Insurance details
    public int costOfInsurance;
    public String expiringDateOfInsurance;
    public String plateNumber;
    public int priceOfCar;
    
    //Accident History
    public List<String> AccidentDate = new ArrayList<String>();
    public List<String> AccidentTime = new ArrayList<String>();
    public List<String> AccidentLocation = new ArrayList<String>();
    public List<String> AccidentDamage = new ArrayList<String>();
    public List AccidentCost = new ArrayList();
    
    
    
    
    public Claimant(){}
    
    public Claimant(String name, String surname, String username, String password,String plate,String expDateOfIns){
                this.name = name;
                this.surname = surname;
		this.username = username;
		this.password = password;
                this.plateNumber = plate;
                this.expiringDateOfInsurance=expDateOfIns;
                this.role = "Claimant";
    }
    
    
     public void getDmgHistory(){  
            //printing the the lists for Damage History
         for(String s:this.AccidentDate){
            System.out.println(s);
         }
         
          for(String s:this.AccidentTime){
            System.out.println(s);
         }
          
           for(String s:this.AccidentLocation){
            System.out.println(s);
         }
           
            for(String s:this.AccidentDamage){
            System.out.println(s);
         }
            
             for(int s=0; s < this.AccidentCost.size(); s++)
             {
            System.out.println(this.AccidentCost.get(s));
         }
         
        }
    
     public String getExpiringDateOfInsurance(){
         return this.expiringDateOfInsurance;
            
         }
     public int getCostOfInsurance() {
            return this.costOfInsurance;
         }
     public String getPlateNumber(){
         return this.plateNumber;
      }
     public int getPriceOfCar(){
         return this.priceOfCar;
     }
     
     public Claim reportClaim(String name,String surname,String location,String date,int cost){
         
         
         
         Claim claim=new Claim(name,surname,location,date,cost);
         
         claim.claimStatus="Reported";
         
         return claim;
         
         
    }
     
    public void fillinSimpleForm(Form form, String name,String surname,String date,String location,String plate) {
        
            
            form.formName=name;
            form.formSurname=surname;
            form.formDateOfAccident=date;
            form.formLocationOfAccident=location;
            form.formInsuredPersonPlate=plate;
            
            form.formStatus = "Filled in-Needs to be checked!";
    }
    
     public void fillinComplexForm(Form form, String name,String surname,String date,String location,String plate,String answer) {
        
            
            form.formName=name;
            form.formSurname=surname;
            form.formDateOfAccident=date;
            form.formLocationOfAccident=location;
            form.formInsuredPersonPlate=plate;
            form.formAgreementOnIncrease=answer;
            
            form.formStatus = "Filled in-Needs to be checked!";
    }
    
            
            
            
            
            
            
        
        
    

}
