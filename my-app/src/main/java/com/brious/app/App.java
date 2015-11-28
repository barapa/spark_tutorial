package com.brious.app;

import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 * Hello world
 */
public class App {
	public static void main(String[] args) {
		get("other", (req, res) -> "other route");
		get("hello/:name", (req, res) -> {
			return "Hello, " + req.params("name");
		});
		get("details", (req, res) -> {
			res.redirect("http://www.google.com");
			return res;
			//return req.contentType();
		});
    }
}
