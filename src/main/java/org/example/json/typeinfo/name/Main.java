package org.example.json.typeinfo.name;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    private static final String json1 = "{\"name\": \"autoMobile\", \"vehicle\": {\"type\": \"bus\", \"firmware\": \"Volvo\"}}";
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        AutoMobile auto = mapper.readValue(json1, AutoMobile.class);
        System.out.println(auto);
    }

}
