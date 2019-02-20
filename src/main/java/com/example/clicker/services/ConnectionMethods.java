package com.example.clicker.services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class  ConnectionMethods{
    public Document getDocument (String url){
        Document d = new Document("");
        try {
            d = Jsoup.connect(url).get();

        }
        catch (Exception ex){
        ex.printStackTrace();
        }
    return d;
    }
}

