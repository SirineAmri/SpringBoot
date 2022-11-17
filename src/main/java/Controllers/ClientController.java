package Controllers;

import Services.IClientService;
import com.example.test2.Entities.Client;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IClientService iClientService;
    @GetMapping("/retrieveAllClient")
    public List<Client> retrieveAllContrats(){
        return iClientService.getAllClient();
    };



}
