package com.sura.cotizador.usersinterfaces.enums;

public enum Urls {
	
	COTIZADOR("https://cotizadoreslab.sura.com/"),
	POLICY("https://labcoreseguros.suramericana.com/pc/PolicyCenter.do");

	private String url;
	
	Urls(String url){
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

}
