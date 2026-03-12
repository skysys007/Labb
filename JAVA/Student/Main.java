

class Students{
    public int id;
    public String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("ID: " + id + "\tNAME: " + name);        
    }  
}

public class Main{
    public static void main(String[] args) {
        Students s[] = new Students[3];
        s[0] = new Students(1, "Anish");
        s[1] = new Students(2, "Gagan");
        s[2] = new Students(3, "RAJU");

        for (int i = 0; i < 3; i++) {
            s[i].display();
        }



    }
}