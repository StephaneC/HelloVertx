package com.stephane;
import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {
  public void start() {
    vertx.deployVerticle("com.stephane.HelloVerticle");
    // Deploy a JavaScript verticle
    vertx.deployVerticle("../../../JSVerticle.js");
  }
}
