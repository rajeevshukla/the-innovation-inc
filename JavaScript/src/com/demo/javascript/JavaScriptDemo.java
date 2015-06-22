package com.demo.javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptDemo {
public static void main(String[] args) {
	
	 ScriptEngineManager factory = new ScriptEngineManager();
	    ScriptEngine engine = factory.getEngineByName("JavaScript");
	    try {
	    	String javascriptCode="print('hello')";
	    	
			engine.eval(javascriptCode);
			
			
		} catch (ScriptException e) {
			e.printStackTrace();
		}
}


}
