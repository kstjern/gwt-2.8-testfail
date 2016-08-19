package com.code.transcoder;

import java.util.logging.Logger;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class Main implements EntryPoint {
	Logger log = Logger.getLogger("Main entrypoint");
	
	@Override
    public void onModuleLoad() {
		log.info("MAIN");
    }
}