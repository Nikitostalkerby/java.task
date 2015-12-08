package com.github.union.one.gson;

import java.io.IOException;

/**
 * Created by Vaas on 18.11.2015.
 */

public interface Serializer {
    <T> void Serialize(T employee, String path) throws IOException;

    <T> T Deserialize(String path, Class<T> type) throws IOException;
}
