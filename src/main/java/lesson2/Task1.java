package lesson2;

public class Task1 {
    private static String one = "c1";
    private static String two= "c2";
    public static String repiatStr(int number){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < number; i++) {
            if((i %2)==0) {
            builder.append(one);
        }
        if((i % 2) != 0){
            builder.append(two);
            }
        }
        return builder.toString();
    }

}
