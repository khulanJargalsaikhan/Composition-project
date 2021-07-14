public class Person {
    // composition, person has name, and job
    private String name;
    private String role;

    public Person(){

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }

    // Additional methods


}