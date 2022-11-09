public class Player{
   private String name;
   private int age;
    public static void main(String[] args){
        Player p = new Player();

        p.shoot();
        p.run();
        p.setAge(20);
        p.setName("salam");
        
    }

    void shoot(){
        System.out.println("Shhhotttt!");
    }
    void run(){
        System.out.println("Run");
    }

    void setAge(int num){
         age = num;
    }
    void setName(String n){
        name = n;
    }

}