package com.mouse.moon.pojo;

import java.util.Map;

public class ParamBean {
	private String appId;
	private String code;
	private Map<String,Object> headMap;
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Map<String, Object> getHeadMap() {
		return headMap;
	}
	public void setHeadMap(Map<String, Object> headMap) {
		this.headMap = headMap;
	}
	@Override
	public String toString() {
		return "Bean [appId=" + appId + ", code=" + code + ", headMap=" + headMap + "]";
	}
}
