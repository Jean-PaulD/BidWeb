package services.Impl;

import domain.Item;
import repositories.ItemRepository;
import services.ItemService;

/**
 * Created by Jean-Paul D on 2017-08-13.
 */
public class ItemServiceImpl  implements ItemService {

    private static ItemServiceImpl service = null;

    ItemRepository repository; // = ItemRepository.getInstance();


    public static ItemServiceImpl getInstance() {
        if (service == null)
            service = new ItemServiceImpl();
        return service;
    }

    public Item create(Item obj) {
        return repository.create(obj);
    }

    public Item read(String id) {
        return repository.read(id);
    }

    public Item update(Item obj) {
        return repository.update(obj);
    }

    public void delete(String id) {
        repository.delete(id);

    }
    @Override
    public String findById(String s) {
        return repository.read(s).getid();
    }


}