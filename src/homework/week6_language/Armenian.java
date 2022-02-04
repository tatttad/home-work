package homework.week6_language;

public class Armenian implements Language {
    @Override
    public void vowels() {
        System.out.println("Հայերենի ձայնավորներն են՝ ա, ի, ու, է, օ, ը:");
    }

    @Override
    public int alphabet() {
        return 36;
    }
}
