public class Main {

    public static void main(String[] args) {

        //HDFC Bank
        try {
            float interest;
            interest = Util.calculateInterestNew(1000, 5, 8.4f);
            System.out.println("interest = " + interest);
            interest = Util.calculateInterestNew(1000, -5, 8.4f);
            System.out.println("interest = " + interest);
        }
        catch (BankingException be) {
            System.out.println("HDFC Way of Exception Handling");
            System.out.println(be);
        }



    }


    public static void main3(String[] args) {
        try {
            int sal = 0;
            if(sal <= 0) {
                //throw new ArithmeticException("Negative or 0 salary");
                throw new NegativeSalException(
                        "Sal is negative or 0...",
                        "Vishal Jagtap",
                        -90000,
                        System.currentTimeMillis()
                );
            }
            System.out.println("Sal = " + sal);
        }
        catch (NegativeSalException nse) {
            System.out.println(nse.getMessage());
            System.out.println(nse);
        }
        catch (ArithmeticException ae) {
            System.out.println("Sal can not be negative or 0...");
            System.out.println(ae.getMessage());
        }
    }

    public static void main2(String[] args) {
        try {
            int res = 100 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by 0 problem...");
        }
        finally {
            System.out.println("finally executed");
        }
    }



    public static void main1(String[] args) {
        try {
            //Object obj = "Vishal";
            Object obj = new Integer(100);
            int i = ((Integer) obj);
            System.out.println("i = " + i);

            try {
                int[] arr = {10, 20, 30, 40, 50};
                System.out.println(arr[5]);
            }
            catch (NullPointerException npe) {
                System.out.println("Null pointer exception");
            }
            /*catch(ArrayIndexOutOfBoundsException aie) {
                System.out.println("Invalid index access...");
            }*/

            int num1 = 100, num2 = 2;
            System.out.println("res = " + (num1 / num2));
        }
        catch (ClassCastException cce) {
            System.out.println("Invalid type casting");
            System.out.println(cce.getMessage());
            System.out.println();
            cce.printStackTrace();
        }
        catch (ArithmeticException ae) {
            System.out.println("Can not divide by 0...");
        }
        catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Invalid index accessed....");
        }
        catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        System.out.println("End of main");
    }


}
