package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.User;
import web.services.UserService;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "hello";
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String printUsers(ModelMap model) {
        model.addAttribute("users", userService.listUsers());
        return "users";
    }

    @RequestMapping(value = "createUser", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user) {
        userService.add(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
    public String deleteUser(@ModelAttribute("id") Long id) {
        User userDelete = userService.getUserById(id);
        userService.deleteUser(userDelete);
        return "redirect:/users";
    }

    @RequestMapping(value = "updateUser", method = RequestMethod.GET)
    public String updateUserShow(ModelMap model, @ModelAttribute("id") Long id) {
        User userUpdate = userService.getUserById(id);
        model.addAttribute("user", userUpdate);
        return "updateUser";
    }

    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/users";
    }

}