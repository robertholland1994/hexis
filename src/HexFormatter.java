public class HexFormatter
{
    private final String HEXADECIMAL_DIGITS = "0123456789ABCDEF";

    public HexFormatter(){}

    public String getHexadecimalTable()
    {
        return HEXADECIMAL_DIGITS;
    }

    public String getHighHexDigit(ByteValue value)
    {
        return "" + HEXADECIMAL_DIGITS.charAt(value.getHighNibble());
    }

    public String getLowHexDigit(ByteValue value)
    {
        return "" + HEXADECIMAL_DIGITS.charAt(value.getLowNibble());
    }

    public String getJavaHexadecimal(ByteValue value)
    {
        return Integer.toHexString(value.getDecimal()).toUpperCase();
    }

    public String getManualHexadecimal(ByteValue value)
    {
        return getHighHexDigit(value) + getLowHexDigit(value);
    }

    public String getRGBHexadecimal(RgbColour rgb)
    {
        return "#" + getManualHexadecimal(rgb.getRed()) + getManualHexadecimal(rgb.getGreen()) + getManualHexadecimal(rgb.getBlue()); 
    }
}