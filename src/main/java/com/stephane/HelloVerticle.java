package com.stephane;
import io.vertx.core.AbstractVerticle;

public class HelloVerticle extends AbstractVerticle {
  public void start() {
   vertx.createHttpServer().requestHandler(req -> {
      req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x from Java!");
    }).listen(8085);  
  }
}
