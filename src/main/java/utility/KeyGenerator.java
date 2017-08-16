package utility;

import java.util.UUID;

/**
 * Created by Jean-Paul D on 2017-08-16.
 */
public class KeyGenerator {
    public static String getEntityId() {
        return UUID.randomUUID().toString();
    }
}
