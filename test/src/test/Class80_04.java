package test;

public class Class80_04 {

    private static final boolean TRUE = true;

    public static void main(String[] args) {
        
        int age = 8;
        int height = 110;
        boolean parent = TRUE;
        boolean hearingDisease = TRUE;
        
        boolean result = (age >= 6 && height >= 120) || (height >= 120 && parent) && !hearingDisease;
        
        result = height >= 120 && (age >= 6 || parent) && !hearingDisease;
        System.out.println(result);
    }
}
