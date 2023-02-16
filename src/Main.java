public class Main {

    public static void main(String[] args) {

        System.out.println("Second commit");
        printThirdCommit();

        System.out.println("Commit from Branch 1");
        System.out.println("PR test");

        greeting();
    }

    public static void printThirdCommit(){
        System.out.println("My third commit");
    }

    public static void greeting(){
        System.out.println("Hi Gems");
    }
}
