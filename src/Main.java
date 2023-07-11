public class Main {
    public static void main(String[] args)  {


            Account account = new Account(
                    123,
                    "Samuel",
                    600.00,
                    600.00
            );


        try {
            account.withdraw(600.00);
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(account.toString());


    }
}