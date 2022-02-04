package homework.week6_language;

public class Main {
    public static void main(String[] args) {
        Language armenian = new Armenian();
        armenian.vowels();
        System.out.println("Հայերենի այբուբենը ունի " + armenian.alphabet() + " տառ։");

        Language english = new English();
        english.vowels();
        System.out.println("The English consists of " + english.alphabet() + " letters.");
    }
}
