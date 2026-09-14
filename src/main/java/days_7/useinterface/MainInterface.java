package days_7.useinterface;

public class MainInterface {

    static void main() {

        Seo seo = new Seo();
        Developer dev = new Developer();
        Security sec = new Security();
        HR hr = new HR();

        call(seo);
        call(dev);
        call(sec);
        call(hr);
    }

    static void call(IPerson person) {
        System.out.println(person.getName() + " " + person.getWorkTime() + " " + person.getSalary());
    }

}
