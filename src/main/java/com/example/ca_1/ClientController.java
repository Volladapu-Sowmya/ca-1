
package com.example.ca_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientController {

    private final List<Client> clients = new ArrayList<>();

    @GetMapping("/clients")
    public String showClients(Model model) {
        model.addAttribute("clients", clients);
        model.addAttribute("client", new Client());
        return "clients";
    }

    @PostMapping("/clients")
    public String addClient(@ModelAttribute Client client) {
        clients.add(client);
        return "redirect:/clients";
    }
}
