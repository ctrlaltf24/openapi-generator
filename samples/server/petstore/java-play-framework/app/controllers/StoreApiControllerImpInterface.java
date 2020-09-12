package controllers;

import java.util.Map;
import apimodels.Order;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface StoreApiControllerImpInterface {
    void deleteOrder(Http.Request request, String orderId) throws Exception;

    Map<String, Integer> getInventory(Http.Request request) throws Exception;

    Order getOrderById(Http.Request request,  @Min(1) @Max(5)Long orderId) throws Exception;

    Order placeOrder(Http.Request request, Order body) throws Exception;

}
