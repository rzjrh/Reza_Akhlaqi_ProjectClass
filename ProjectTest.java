//Author: Reza Akhlaqi      6-20-2019

package project.pkgclass;


public class ProjectTest {

   
    public static void main(String[] args) {

        
        
        //Cases
        
        //No name and description
        Project Case1 = new Project();
        
        //Only name provided. No Description
        Project Case2 = new Project("Coder");
        
        //with name and description but no initial value 
        Project Case3 = new Project("Reza1", " Top Secret project. need permission!     ");
        
        //we have name, description, and initioal cost here to be displayed
        Project Case4 = new Project("Prison Break", "Michael wants to leave here! Common! ", 25000);
        
        
        
        
        //Print Cases
        System.out.println((Case1.getName())+"    "+(Case1.getDescription()));
        System.out.println("");
        
        System.out.println(Case2.elevatorPitch());
        System.out.println("");
        
        System.out.println(Case3.elevatorPitch());
        System.out.println("");
        
        System.out.println(Case4.elevatorPitch());




//end
    }
    
}
