package com.yeimy.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertPiece implements  IConvertPiece{
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> close) {
        try {
            return objectMapper.readValue(json, close);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException(e);
        }
    }

}
