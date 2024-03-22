package CoreJava;

public class StringBuilderTest {
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("adsdfdfdf");
        builder.append("efgh");
        builder.insert(1, "opfjpbcklsdsdsdsd", 5, 7);
        builder.delete(4,11);
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
