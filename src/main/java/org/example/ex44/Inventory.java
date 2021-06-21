package org.example.ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.example.ex42.Base.EmployeesInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Inventory
{
    public static void readJSONInfo(String path) {
        File input = new File(path);
        JsonObject product = new JsonObject();
        try(FileWriter file = new FileWriter(path)) {
            JsonElement e = JsonParser.parseReader(new FileReader(path));
            JsonObject obj = e.getAsJsonObject();
            String name = obj.get("name").getAsString();
            double price = obj.get("price").getAsDouble();
            int quantity = obj.get("quantity").getAsInt();
            JsonArray products = obj.get("products").getAsJsonArray();
            for (JsonElement p: products) {
                JsonObject pObj = products.getAsJsonObject();

            }
        }
        catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
