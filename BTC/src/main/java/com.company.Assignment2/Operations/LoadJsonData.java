package com.company.Assignment2.Operations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class LoadJsonData  {
    public void traverseJsonObjects(JSONArray cryptoData) {
        for (Object data : cryptoData) {
            String type = (String) ((JSONObject) data).get("type");
            JSONObject ob = (JSONObject) ((JSONObject) data).get("data");
            String walletAddress = "";
            long quantity = 0, volume = 0;
            double price = 0.0;
            String coinCode = (String) ob.get("coin");
            if (type.equals("BUY") ) {
                quantity = (long) ob.get("quantity");
                walletAddress = (String) ob.get("wallet_address");
            new Buy(coinCode,walletAddress,quantity).start();
            }
            else if (type.equals("SELL")) {
                quantity = (long) ob.get("quantity");
                walletAddress = (String) ob.get("wallet_address");
                new Sell(coinCode,walletAddress,quantity).start();
            }
            else if (type.equals("ADD_VOLUME")) {
                volume = (long) ob.get("volume");
                new  AddVolume(coinCode,volume).start();
            } else {
                price = (double) ob.get("price");
                new  UpdatePrice(coinCode,price).start();
            }
        }
    }

    public LoadJsonData() {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("/home/saptadeepa/KDU-2022-backend/BTC/Resources/Example.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray cryptoData = (JSONArray) obj;
            traverseJsonObjects(cryptoData);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
