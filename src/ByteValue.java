public class ByteValue
{
    private final int value;

    public ByteValue(int value)
    {
        this.value = value;
    }

    public int getDecimal()
    {
        return value;
    }

    public String getBinary()
    {
        return Integer.toBinaryString(value);
    }

    public int getDivisionResult(int divisor)
    {
        return value / divisor;
    }

    public int getModulusResult(int divisor)
    {
        return value % divisor;
    }

    public int getLowNibble()
    {
        return getModulusResult(16);
    }

    public int getHighNibble()
    {
        return getDivisionResult(16);
    }

    public byte getSignedByte()
    {
        byte signedValue = 0;
        signedValue += value;
        return signedValue; 
    }
}