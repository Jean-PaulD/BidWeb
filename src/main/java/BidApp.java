import com.google.gson.Gson;
import domain.Item;
import factories.ItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import services.Impl.ItemServiceImpl;

/**
 * Created by Jean-Paul D on 2017-08-16.
 */
@Controller
@RequestMapping(path="/Item")
public class BidApp {

    @Autowired
    private ItemServiceImpl itemServiceImpl;

    @GetMapping(path="/add/{ItemName}")
    public @ResponseBody
    String addItem(@PathVariable String itemName){
        Item item = ItemFactory.getItem(1000, "description", "this is comment",
                "username", "this is bid owner");

        itemServiceImpl.create(item);
        return new Gson().toJson(item);
    }
}
