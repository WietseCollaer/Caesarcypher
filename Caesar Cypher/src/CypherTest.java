/**
 * Created by Wiets on 7/02/2017.
 */
public class CypherTest {
    private CypherApp app = new CypherApp(13);
    public static void main(String[] args) {
        CypherTest testApp = new CypherTest();
        testApp.aToN();
        testApp.emptyString();
        testApp.AbToNo();
        testApp.testHallo();
        testApp.yToL();
        testApp.sentence();
        testApp.exclamation();
        testApp.lowerCase();
    }

    private void exclamation() {
        System.out.print("Exclamation: ");
        System.out.println(app.encode("HELLO!").equals("URYYB!"));
    }

    private void lowerCase() {
        System.out.print("Lowercase: ");
        System.out.println(app.encode("Hello").equals("Uryyb") + app.encode("Hello"));
    }

    private void sentence() {
        System.out.print("Sentence HELLO WORLD: ");
        System.out.println(app.encode("HELLO WORLD").equals("URYYB JBEYQ") + " ");
    }

    private void yToL() {
        System.out.print("ytoL: ");
        System.out.println(app.encode("Y").equals("L"));
    }

    private void testHallo() {
        System.out.print("Invoer HELLO: ");
        System.out.println(app.encode("HELLO").equals("URYYB") + " " );
    }

    private void aToN(){
        System.out.print("a to n: ");
    System.out.println(app.encode("A").equals("N"));
    }

    private void emptyString(){
        System.out.print("Empty String: ");
        System.out.println(app.encode("").equals(""));
    }

    private void AbToNo(){
        System.out.print("AbToNo: ");
        System.out.println(app.encode("AB").equals("NO"));
    }
}
