public class RgbColour
{
    private final ByteValue red;
    private final ByteValue green;
    private final ByteValue blue;

    public RgbColour(ByteValue red, ByteValue green, ByteValue blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public ByteValue getRed()
    {
        return red;
    }

    public ByteValue getGreen()
    {
        return green;
    }

    public ByteValue getBlue()
    {
        return blue;
    }
}