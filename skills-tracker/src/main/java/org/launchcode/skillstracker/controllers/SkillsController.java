package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    //You need to have an h1 with the title “Skills Tracker”,
    //an h2, and an ol containing three programming languages of your choosing.
    @GetMapping
    public String createHomePage(){
        return "<html>" +
                "<body>" +
                "<h1>Skill Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String createForm(){
        return "<html><body>" +
                "<form action='results' method='post'>" +
                "<label>Name:<br /><input type='text' name='name' /></label><br />" +
                "<label>My favorite language:<br />" +
                "  <select name=\"firstlang\" id=\"firstlang\">" +
                "    <option value=\"Java\">Java</option>" +
                "    <option value=\"Javascript\">JavaScript</option>" +
                "    <option value=\"Python\">Python</option>" +
                "  </select></label>" +
                "<label><br />My second favorite language:<br />" +
                "  <select name=\"secondlang\" id=\"firstlang\">" +
                "    <option value=\"Java\">Java</option>" +
                "    <option value=\"Javascript\">JavaScript</option>" +
                "    <option value=\"Python\">Python</option>" +
                "  </select></label>" +
                "<label><br />My third favorite language:<br />" +
                "  <select name=\"thirdlang\" id=\"firstlang\">" +
                "    <option value=\"Java\">Java</option>" +
                "    <option value=\"Javascript\">JavaScript</option>" +
                "    <option value=\"Python\">Python</option>" +
                "  </select></label><br />" +
                "<input type='submit' value='Submit'/>" +
                "</html></body>";
    }

    @PostMapping("/results")
    public String respondToFormSubmission(@RequestParam String name,
                                          @RequestParam String firstlang,
                                          @RequestParam String secondlang,
                                          @RequestParam String thirdlang){
//        return "<html>" +
//                "<body>" +
//                "<h1>" + name + "</h1>" +
//                "<ol>" +
//                "<li>" + firstlang + "</li>" +
//                "<li>" + secondlang + "</li>" +
//                "<li>" + thirdlang + "</li>" +
//                "</body>" +
//                "</html>";
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr>" +
                "    <th>Favorite Language</th>\n" +
                "    <th>Second Favorite Language</th>\n" +
                "    <th>Third Favorite Language</th>\n" +
                "</tr>" +
                "<tr>" +
                "<td>" + firstlang + "</td>" +
                "<td>" + secondlang + "</td>" +
                "<td>" + thirdlang + "</td>" +
                "</tr></table>" +
                "</body>" +
                "</html>";
    }
}
