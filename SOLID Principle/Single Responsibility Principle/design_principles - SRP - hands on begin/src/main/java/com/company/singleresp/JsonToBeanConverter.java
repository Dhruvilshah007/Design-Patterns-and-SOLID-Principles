package com.company.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToBeanConverter {
	
	private final ObjectMapper mapper;
	
	public JsonToBeanConverter() {
        mapper = new ObjectMapper();
    }
	
	
    public <T> T convertJsonToBean(String json, Class<T> clazz) throws Exception {
        return mapper.readValue(json, clazz);
    }

}
