package com.bbva.wikj.lib.r269.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

public class WIKJR269Impl extends WIKJR269Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR269Impl.class);

	@Override
	public Map<String, Object> executeSelect(String id) {
		return this.jdbcUtils.queryForMap("query.query1", id);
	}

	@Override
	public int executeInsert(Map<String, Object> args) {
		return this.jdbcUtils.update("query.query2",args);

	}
}
