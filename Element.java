public class Element{
    private int type;
    private int intElement;
    private double doubleElement;
    private String stringElement;

    public static final int typeInt = 0;
    public static final int typeDouble = 1;
    public static final int typeString = 2;

    public Element(int valueType,
                   int intValue,
                   double doubleValue,
                   String stringValue
                  ){

        type = valueType;
        intElement= intValue;
        doubleElement = doubleValue;
        stringElement = stringValue;
    }

    public String toString(){
        String output = "";
        if (type == typeInt)
            output += intElement;
        else if (type == typeDouble)
            output += doubleElement;
        else
            output += stringElement;
        return output;
    }


}
