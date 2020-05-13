package com.design.pattern.request;

public class BaseRequest<T> {
	

	private T payload;

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}
	
	public static void main(String[] args) {
		
		BaseRequest<String> baseRequestString  = new BaseRequest<String>();
		
		baseRequestString.setPayload("Ciao");
		
		System.out.println(baseRequestString.getPayload());
		
		BaseRequest<User> baseRequestUser = new BaseRequest<>();
		
		baseRequestUser.setPayload(new User("stefano@gmail.com", "password"));
		
		User payload = baseRequestUser.getPayload();
		System.out.println(payload);
		
		
	}
}


