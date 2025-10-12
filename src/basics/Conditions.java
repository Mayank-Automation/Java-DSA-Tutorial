package basics;

public class Conditions {

    static void main() {

        int salary=42500;

        if(salary > 10000 && salary <20000)
        {
            System.out.println("Employee is eligible for bonus");
        }else if(salary >20000){
            System.out.println("Employee is eligible for mega bonus");
        }else {
            System.out.println("Employee is mot eligible for bonus");
        }
    }
}
