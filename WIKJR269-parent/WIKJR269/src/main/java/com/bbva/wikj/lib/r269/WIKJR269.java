package com.bbva.wikj.lib.r269;

import java.util.Map;


public interface WIKJR269 {


	Map<String, Object> executeSelect(String id);
	int executeInsert(Map<String, Object> args);

}
