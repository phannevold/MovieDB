package com.franknavarsete.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Frank
 * Date: 08.08.13
 * Time: 19:27
 */
@Controller
public class LinkController {

    @RequestMapping(value="/")
    public ModelAndView mainPage() {
        return new ModelAndView("home");
    }

    @RequestMapping(value="/index")
    public ModelAndView indexPage() {
        return new ModelAndView("home");
    }
}
