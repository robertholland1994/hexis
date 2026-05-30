public class TerminalStyle
{
    public static String clear()
    {
        return "\033[H\033[2J";
    }

    public static String setBackgroundColor()
    {
        return "\033[48;2;252;252;252m";
    }

    public static String setForegroundColor(RgbColour rgb)
    {
        return String.format("\033[38;2;%d;%d;%dm", rgb.getRed().getDecimal(),
            rgb.getGreen().getDecimal(), rgb.getBlue().getDecimal());
    }

    public static String reset()
    {
        return "\033[0m";
    }
}