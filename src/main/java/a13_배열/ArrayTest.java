package a13_배열;

public class ArrayTest {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "C";
        String str3 = "python";
        String str4 = "html";
        String str5 = "javascript";

        String[] strArray = new String[10];
        strArray[0] = "java";
        strArray[1] = "C";
        strArray[2] = "python";
        strArray[3] = "html";
        strArray[4] = "javascript";

        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("-----------");

        int[] numArray = new int[100];
        for(int i = 0; i< numArray.length; i++) {
            numArray[i] = i + 1;
            System.out.println(numArray[i]);
        }
    }
}
