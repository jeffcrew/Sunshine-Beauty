package com.jeffcrew.sunshine.web;

public class ExtJSResponseAdapter<T> {

	private boolean success=true;
	private int total;
	private T data;
	
	public ExtJSResponseAdapter(T data){
		this.data=data;
		this.total=1;
	}
	
	public ExtJSResponseAdapter(T data, int total){
		this.data=data;
		this.total=total;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
