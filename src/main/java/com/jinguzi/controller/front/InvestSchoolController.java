package com.jinguzi.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lhc19
 * @des
 * @date 2017-11-14
 **/
@Controller(value = "investSchool")
public class InvestSchoolController {

    @RequestMapping(value = "investKnowledge")
    public ModelAndView knowledge(){
        return new ModelAndView("front/investSchool/investKnowledge");
    }

    @RequestMapping(value = "investFlow")
    public ModelAndView flow(){
        return new ModelAndView("front/investSchool/investFlow");
    }

    @RequestMapping(value = "exampleShare")
    public ModelAndView example(){
        return new ModelAndView("front/investSchool/exampleShare");
    }
}
