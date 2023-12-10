package com.multi.test100;

public class PageVO {
	private int start;
	private int end;
	private int page;
	
	public void setStartEnd() {
		start = 1 + (page -1) * 5;
		end = page * 5;
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	
	
}