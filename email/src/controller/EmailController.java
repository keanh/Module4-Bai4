package controller;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.EmailService;
import service.EmailServiceImpl;

@Controller
public class EmailController {
    EmailService emailService = new EmailServiceImpl();
    @GetMapping("/create")
    public String createForm(){
        return "create";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @PostMapping("/create")
    public ModelAndView createEmail(@ModelAttribute("email")Email email){
        emailService.addEmail(email);
        ModelAndView modelAndView = new ModelAndView("information");
        modelAndView.addObject("email",email);
        return modelAndView;
    }

    @GetMapping("/update")
    public ModelAndView updateEmailAndView(@RequestParam ("name") String name){
        Email email = emailService.showInformation(name);
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("email",email);
        return modelAndView;
    }

    @PostMapping("/update")
    public String updateInfomationEmail(@ModelAttribute("email") Email email){
        emailService.updateInformation(email.getName(),email);
        return "home";
    }

    @GetMapping("/info")
    public ModelAndView showInformation(@RequestParam("name") String name){
        Email email = emailService.showInformation(name);
        ModelAndView modelAndView = new ModelAndView("information");
        modelAndView.addObject("email",email);
        return modelAndView;
    }
}
