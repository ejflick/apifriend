package com.featherlight.af.models;

import java.util.Iterator;

public interface Requests extends Iterable<Request> {

  void add(Request request);

  void remove(Request request);

}
