class model{
    String car1="Audi";
    String car2="BMW";
    String car3="RollsRoys";
    String car4="Ferrari";
    String car5="Lamborghini";

     void availability(String a){
        String c1=car1;
        String c2=car2;
        String c3=car3;
        String c4=car4;
        String c5=car5;
        if(a==c1){
            System.out.println("This Audi car has 4 colour");
        }
    }
}


public class Cars_Project {
    public static void main(String[] args) {
        model m=new model();
        m.availability("c1");
    }
}
