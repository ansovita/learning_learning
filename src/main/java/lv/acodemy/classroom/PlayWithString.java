package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String firstName = "Tatjana";
        String sourName = "Ansovica";
        int age = 59;
        String city = "Riga";

        //My name is: Tatjana Ansovica

        //Concatination
        String myText = firstName + " " + sourName + " " + "is" + age + " " + city;
        System.out.println(myText);

        System.out.println("My Name is: " + firstName + " " + sourName + " " + age + " " + city);

        //Interpolation
        //%s - for text
        //%d - for numeric values
        String interpolation = String.format("My name is: %s %s %d %s", firstName, sourName, age, city);
        System.out.println(interpolation);
        System.out.println(String.format("My name is: %s %s %d %s", firstName,  sourName, age, city));


    }
}
