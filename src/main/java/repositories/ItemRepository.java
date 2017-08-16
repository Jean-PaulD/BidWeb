package repositories;

import domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jean-Paul D on 2017-08-13.
 */
public interface ItemRepository  extends JpaRepository <Item, String> {
    Item create(Item obj);

    Item read(String id);

    Item update(Item obj);

    void delete(String id);
}
