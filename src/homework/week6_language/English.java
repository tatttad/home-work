package homework.week6_language;

public class English implements Language {
    @Override
    public void vowels() {
        System.out.println("The English alphabet has 6 vowels are a, e, i, o, u, y.");
    }

    @Override
    public int alphabet() {
        return 26;
    }
}
