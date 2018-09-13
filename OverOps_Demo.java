import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class OverOps_Demo {


    private static void ArithmeticException() {
        try {
            int a = 30, b = 0;
            int c = a / b;  // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }
    }

    private static void NullPointer() {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }

    private static void StringIndexOutOfBound() {
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }

    private static void File_notFound() {
        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }

    private static void NumberFormat() {
        try {
            // "akki" is not a number
            int num = Integer.parseInt("akki");

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }

    private static void ArrayIndexOutOfBound() {
        try {
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
    }

    public static void main(String args[]) {

        boolean continueInput;
        continueInput = true;

        while(continueInput) {

            try {
                System.out.print("Choose a Number 1-6 to throw exception, 0 for exit:");
                Integer errorIndex = Integer.parseInt(System.console().readLine());

                switch(errorIndex) {
                    case 1: ArithmeticException();
                        break;
                    case 2: NullPointer();
                        break;
                    case 3: StringIndexOutOfBound();
                        break;
                    case 4: File_notFound();
                        break;
                    case 5: NumberFormat();
                        break;
                    case 6:  ArrayIndexOutOfBound();
                        break;
                    case 0:  continueInput = false;
                }

            }
            catch (NumberFormatException e) {
                System.out.println("Number format exception- Please input a valid number");
            }
        }






    }
}