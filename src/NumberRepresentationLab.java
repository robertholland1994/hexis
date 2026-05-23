import java.util.Scanner;

public class NumberRepresentationLab
{
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printHeader()
    {
        System.out.println("=============================");
        System.out.println("        HEXIS v0.0.1         ");
        System.out.println("  Number Representation Lab  ");
        System.out.println("=============================");

        System.out.print("\n\n");
    }

    public static void printInput(ByteValue value)
    {
        System.out.print("\n");
        System.out.println("=========== INPUT ===========");
        System.out.print("\n");

        System.out.println("Decimal Value\t\t\t:" + value.getDecimal());
        System.out.print("\n");
    }

    public static void printRepresentations(ByteValue value, HexFormatter formatter)
    {
        System.out.println("====== REPRESENTATIONS ======");
        System.out.print("\n");

        System.out.println("Binary Value\t\t\t:" + value.getBinary());
        System.out.println("Hex Value (Java)\t\t:" + formatter.getJavaHexadecimal(value));
        System.out.println("Hex Value (Manual)\t\t:" + formatter.getManualHexadecimal(value));
        System.out.print("\n");
    }

    public static void printByteAnalysis(ByteValue value)
    {
        System.out.println("======= BYTE ANALYSIS =======");
        System.out.print("\n");

        System.out.println("Unsigned Byte\t\t\t:" + value.getDecimal());
        System.out.println("Signed Byte\t\t\t:" + value.getSignedByte());
        System.out.print("\n");
        System.out.println("Low Nibble\t\t\t:" + value.getLowNibble());
        System.out.println("High Nibble\t\t\t:" + value.getHighNibble());
        System.out.print("\n");
    }

    public static void printDivisionAnalysis(ByteValue value)
    {
        System.out.println("===== DIVISION ANALYSIS =====");
        System.out.print("\n");

        System.out.println(value.getDecimal() + " / 16\t\t\t:" + value.getDivisionResult(16));
        System.out.println(value.getDecimal() + " % 16\t\t\t:" + value.getModulusResult(16));
        System.out.print("\n");

        System.out.println(value.getDecimal() + " / 2\t\t\t\t:" + value.getDivisionResult(2));
        System.out.println(value.getDecimal() + " % 2\t\t\t\t:" + value.getModulusResult(2));
        System.out.print("\n");
    }

    public static void printHexBreakdown(ByteValue value, HexFormatter formatter)
    {
        System.out.println("======= HEX BREAKDOWN =======");
        System.out.print("\n");

        System.out.println("Hex Digits Table\t\t:" + formatter.getHexadecimalTable());
        System.out.print("\n");
        System.out.println("High Hex Digit\t\t\t:" + formatter.getHighHexDigit(value));
        System.out.println("Low Hex Digit\t\t\t:" + formatter.getLowHexDigit(value));
        System.out.print("\n");
        System.out.println("Combined Hex\t\t\t:" + formatter.getManualHexadecimal(value));
        System.out.print("\n");
    }

    public static void printRGBMode(RgbColour rgb, HexFormatter formatter)
    {
        System.out.println("====== RGB MODE (DEMO) ======");
        System.out.print("\n");

        System.out.println("Red Value\t\t\t:" + rgb.getRed().getDecimal());
        System.out.println("Green Value\t\t\t:" + rgb.getGreen().getDecimal());
        System.out.println("Blue Value\t\t\t:" + rgb.getBlue().getDecimal());
        System.out.print("\n");
        System.out.println("RGB Hex Colour\t\t\t:" + formatter.getRGBHexadecimal(rgb));
        System.out.print("\n");
    }

    public static void printFooter()
    {
        System.out.println("========= END REPORT ========");   
    }

    public static void main(String[] args)
    {
        clearScreen();
        printHeader();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a byte value (0-255)\t:");
        ByteValue value = new ByteValue(in.nextInt());

        RgbColour rgb = new RgbColour(new ByteValue(128), new ByteValue(64), new ByteValue(255));
        HexFormatter formatter = new HexFormatter();

        printInput(value);
        printRepresentations(value, formatter);
        printByteAnalysis(value);
        printDivisionAnalysis(value);
        printHexBreakdown(value, formatter);
        printRGBMode(rgb, formatter);
        printFooter();
    }
}