package br.com.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.core.Response;

@Controller
@RequestMapping(value = "/api")
public class TestController {

  @ResponseBody
  @RequestMapping(
      value = "/home",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Response home() {
    return Response.ok().build();
  }

  @ResponseBody
  @RequestMapping(
      value = "/users",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Response users() {
    return Response.ok("{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
        "{\"name\":\"Jackie\",\"country\":\"China\"}]}").build();
  }
}
