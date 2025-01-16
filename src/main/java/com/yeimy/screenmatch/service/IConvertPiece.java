package com.yeimy.screenmatch.service;

public interface IConvertPiece {
    <T> T getData(String json, Class<T> close);
}
