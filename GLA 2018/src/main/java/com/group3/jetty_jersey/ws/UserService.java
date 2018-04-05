package com.group3.jetty_jersey.ws;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.group3.jetty_jersey.dao.UserDao;
import com.group3.jetty_jersey.dao.BasicDao;
import com.group3.jetty_jersey.entity.User;

@Path("/user")
public class UserService {
	
	
}