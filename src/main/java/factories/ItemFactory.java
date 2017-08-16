package factories;

import domain.Item;
import utility.KeyGenerator;

/**
 * Created by Jean-Paul D on 2017-08-12.
 */
public class ItemFactory {

    public static Item getItem(double valueOfItem, String description, String comment,
                               String userName, String bidOwner) {


        Item items = new Item.Builder()
                .id(KeyGenerator.getEntityId())
                .description(description)
                .comment(comment)
                .currentBidOwner(bidOwner)
                .username(userName)
                .itemValue(valueOfItem)
                .build();

        return items;
    }
}
