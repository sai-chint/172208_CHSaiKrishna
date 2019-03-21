package com.springrest.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.springrest.messenger.model.Message;
import com.springrest.messenger.model.Profiles;

public class DatabaseClass {

	private static Map<Long, Message> message = new HashMap<>();
	private static Map<Long, Profiles> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessage() {
		return message;
	}
	public static Map<Long, Profiles> getProfiles() {
		return profiles;
	}
	
	
}
