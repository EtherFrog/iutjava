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
		/* Initialisation des attributs*/
		optionType = OptionType.NONE;
		key="";
		description="aucune description";
		defaultValue=null;
		value = null;
			
	}
	
	public CommandLineOption(final OptionType optionType, final String key, final String description, final ValueType defaultValue) {
		/* Affectation des attributs*/
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
	}
	/**
	 * Procdure qui initialise les attributs en effectuant des affectations
	 * @param optionType
	 * @param key
	 * @param description
	 * @param defaultValue
	 */
	public void setOption(OptionType optionType, String key, String description, ValueType defaultValue) {
		/* Initialisation des attributs*/
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
	}
	public  void setValue(ValueType value) {
		/* affectation de l'attribut value*/
		this.value = value;
	}
	/**
	 * 	Accesseur pour recuperer l'attribut key qui est de type chaine
	 * @return key
	 */
	public String getKey() {
		return this.key;
	}
	/**
	 * Accesseur pour recuperer l'attribut description qui est de type chaine
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * Accesseur qui recupere value qui est de type ValueType
	 * Si value n'est pas vide, la fonction retourne value
	 * @return value
	 * Si value est vide, la fonction retourne defaultValue
	 * @return defaultValue
	 */
	public ValueType getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	/**
	 * Accesseur qui recupere optionType qui est de type OptionType
	 * @return optionType
	 */
	public OptionType getOptionType() {
		return optionType;
	}
	
}
