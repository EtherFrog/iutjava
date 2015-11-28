package edu.iut.app;

import java.io.File;

public class CommandLineOption<ValueType> {
	
	protected String key;
	protected String description;
	protected ValueType defaultValue;
	protected ValueType value;
	protected OptionType optionType;
	
	public enum OptionType{
		NONE("None"),
		FILE("File"),
		STRING("String"),
		INTEGER("Integer"),
		DOUBLE("Double"),
		NOVALUE("NoValue");
		private String optionType;
		
		OptionType(String optionType) {
			this.optionType = optionType;
		}
		
		public String toString() {
			return optionType;
		}		
	}
	
	public CommandLineOption() {		
		/* EX1: Initializer les attributs */
		 //Variable d'instance
		ValueType value;
		
	}
	public CommandLineOption(final OptionType optionType, final String key, final String description, final File file) {
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		
	}
	public void setOption(OptionType optionType, String key, String description, ValueType defaultValue) {
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
	}
	public  void setValue(ValueType value) {
		this.value = value;
	}
		
	public String getKey() {
		return this.key;
	}
	public String getDescription() {
		return this.description;
	}
	public ValueType getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	public OptionType getOptionType() {
		return optionType;
	}
	
}
