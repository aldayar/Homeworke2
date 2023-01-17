
public class Main {
    public static void main(String[] args) {

        System.out.println(m1(23  ,54 ));

        
        int age=19;
        int temp=27;
        if (age>=45 && temp>=30){
            System.out.println("можно итди гулять!" );
        }
        if (age>20 && temp>=28){
            System.out.println("можно итди гулять!" );
        }
        if (age<=45 && temp>=25){
            System.out.println("можно итди гулять!" );
        }
        else{
            System.out.println("оставайтесь дома в тепле и в комфорте!");
        }

        System.out.println(m1(23  ,23 ));
        System.out.println(m1(78  ,38 ));
        System.out.println(m1(6  ,12 ));
        System.out.println(m1(23  ,32 ));
        System.out.println(m1(23  ,10 ));



        
    }
    public static int m1 (int ageOfHuman,  int tempOfWeather) {
        return ageOfHuman+ +tempOfWeather;


    }
}