package basic.mountains.and.valleys;
 
public class MountainsAndValleys {
 
    /*
    * |
    * |
    * |
    * |
    * |
    * | @A
    * |UU DD  UDD UU
    * |
    * | / \
    * |/    \ /\    /
    * .------.--.--.---
    * |          \/
    * |
    * |
    * | @B
    * |DD UDUU UD D  UU
    * |
    * |        /\    /
    * .-------.--.--.----
    * | \    /    \/
    * |  \/\/
    * |
    * |
    * |
    * | @C
    * |D UD UUDD UDD
    * |      /\
    * .__.__.__.__._______
    * |\/ \/    \/\
    * |            \
    * |
    * */
 
    public static void main(String... args) {
        String path = "UUDDUDDUU"; // expected 1
        //String path = "DDUDUUUDDUU"; // expected 2
        //String path = "DUDUUDDUDD"; // expected 3
        int valleys = 0;
 
        // put your code here, count number of valleys passed by tourist
        // tourist starts in 0 point. U means "UP" on 1, D - "DOWN" on 1
 
        System.out.println(valleys);
    }
}
