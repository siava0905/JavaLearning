public class Employee {

   private int salary = 100000;
   private int experience;
   private String name;
   private String position;
   private boolean isMarried;

    public int getSalary (){
        return this.salary;
    }

    public boolean isMarried () {
        return this.isMarried;
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setMarried (boolean married) {
        this.isMarried = married;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void setExperience(int experience) {
        this.experience = experience;
    }
}

