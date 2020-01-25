public class FunctionalInterfacesMain {

    public static void main(String[] args) {

        ISalutation salutation = (user) -> System.out.println("Hello " + user);
        salutation.Salutation("Emi");

        ISalutation salutation1 = user -> {
            if (user.equals("Emi")) {
                System.out.println("You have the name of Emi");
            } else {
                System.out.println("You are " + user);
            }
        };
        salutation1.Salutation("Emi");
        salutation1.Salutation("Paco");

        ISum sum = (val1, val2, val3) -> val1 + val2 + val3;

        int result = sum.sum(1, 3, 2);
        System.out.println(result);


    }

}
