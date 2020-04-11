import java.time.ZonedDateTime;

/**
 * @author jk-thy
 * @date 20/4/11 16:48
 */
public class T2 {
    public static void main(String[] args) {
        // 默认时区
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }
}