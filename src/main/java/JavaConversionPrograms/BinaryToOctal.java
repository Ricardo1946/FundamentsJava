package JavaConversionPrograms;

/**
 * Converte the binary number a decimal number.
 * Convert this decimal number to a string of octal numbers usinng the toOctalString() method.
 * Convert this string again to an Integer.
 */

public class BinaryToOctal {

    int binaryToDecimal(long binary){
        int decimalNumber = 0, i = 0;

        while (binary > 0) {
            decimalNumber += Math.pow(2, i++) * (binary % 10);
            binary /= 10;
        }
        return decimalNumber;
    }

    int decimalToOctal(long binary) {
        int decimalNumber = binaryToDecimal(binary);

        String octalString = Integer.toOctalString(decimalNumber);
        int octalNumber = Integer.parseInt(octalString);

        return  octalNumber;

    }

    public static void main(String[] args) {
        BinaryToOctal obj = new BinaryToOctal();

        System.out.println("Octal number: " + obj.decimalToOctal(100100));
    }
}
