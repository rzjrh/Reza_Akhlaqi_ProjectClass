
package project.pkgclass;


class Project {                          //not the public class. Create a class project
    private String name;                 //declare the field name
    private String description;          //declare the field description
    private double initialCost = 0;      //declare the initial cost
    
    
//Create an instance method called elevatorPitch that will return the name and description separated by a colon.

 
     // if theere is no Name and Description (Case1).
    public Project(){
        this.name = "Project Name:    ";
        this.description = "    Description:  ";
        
    }
    
    
    // if there is a Name but no Description (Case2)
    public Project(String name){
        this.name = name;
        this.description = "  ";
    }
    
    
    
    // if we have Name and Description (Case3)
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    
    // we have the name, description, and initial cost (case4)
    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    
    
    
    // Set Name String
    public void setName(String name){
        this.name = name;
    }
    
    //get name String
    public String getName(){
        return this.name;
    }
    
    
    // Set Description String
    public void setDescription(String description){
        this.description = description;
    }

    //get Description String
    public String getDescription(){
        return this.description;
    }
   
    
    // Set initial cost (void, double for the numbers here)
    public void setinitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    //get the initial cost (double)
    public double getinitialCost(){
        return this.initialCost;
    }
    
    
    
    
    // Method for the Elevator Pitch
    public String elevatorPitch(){
        return "Project Name: " + this.name + " " + "     Description:   " + this.description + " " + "Initial Cost: " + this.initialCost;


    
    }    
    
}
