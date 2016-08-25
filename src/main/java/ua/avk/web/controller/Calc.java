package ua.avk.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import ua.avk.web.domain.MyData;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alexander Kononenko
 * @version 1.0.0
 *
 * The controller class. He has get request and send response
 */
@RestController
public class Calc {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(Throwable.class)
    public String handleAnyException(Throwable ex, HttpServletRequest request) {
        return ClassUtils.getShortName(ex.getClass());
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/calc/{a}/{b}",
            method = RequestMethod.GET,
            headers = {"Accept=application/json"}
    )
    @ResponseBody
    public MyData getData(@PathVariable("a") long a,
                          @PathVariable("b") long b) {

        return new MyData(a, b);
    }


}
