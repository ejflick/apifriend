package com.featherlight.af.models;

import java.net.http.HttpHeaders;
import java.net.http.HttpResponse;

public interface Request {

  HttpHeaders headers();

  HttpResponse<?> send();

}
