package com.ust.srs.service;

import java.util.ArrayList;

import com.ust.srs.bean.RouteBean;
import com.ust.srs.bean.ShipBean;

public interface Administrator {
public String addShip(ShipBean shipbean);
public boolean modifyShip(ShipBean shipbean);
public int removeShip(ArrayList<String> ShipId);
public String addRoute(RouteBean routebean);
public boolean modifyRoute(RouteBean routebean);
public int removeRoute(String routeid);
}

