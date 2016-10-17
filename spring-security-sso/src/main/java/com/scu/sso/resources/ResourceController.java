package com.scu.sso.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResourceController {

  @RequestMapping(value = "/rest/resource", method = RequestMethod.GET)
  @ResponseBody
  public String getResource() {

    return "{data: resource}";
  }
}
