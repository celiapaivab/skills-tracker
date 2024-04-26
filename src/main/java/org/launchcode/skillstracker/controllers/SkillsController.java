package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String skills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>"+
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<p><a href='/form'>Click here</a></p>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form method = 'post' action = '/results'>" +
                "<label>Name:</label><br />" +
                "<input type = 'text' name = 'name' /><br/>" +
                "<label>My favorite language:</label><br/>" +
                "<select name = 'favorite1'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br/>" +
                "<label>My second favorite language:</label><br/>" +
                "<select name = 'favorite2'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br/>" +
                "<label>My third favorite language:</label><br/>" +
                "<select name = 'favorite3'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br/>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/results")
    public String submit (@RequestParam String name, String favorite1, String favorite2, String favorite3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>"+
                "<li>" + favorite1 + "</li>" +
                "<li>" + favorite2 + "</li>" +
                "<li>" + favorite3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
