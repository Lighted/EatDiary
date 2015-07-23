package com.ecity.app.model;

public class ConsumeItem {
	private int id;
	private String time;
	private String addTime;
	private double total;
	private String mark;
	/**   
	 * id   
	 *   
	 * @return the id   
	 * @since   CodingExample Ver(±àÂë·¶Àý²é¿´) 1.0   
	 */
	
	public int getId() {
		return id;
	}
	/**   
	 * @param id the id to set   
	 */
	
	public void setId(int id) {
		this.id = id;
	}
	/**   
	 * time   
	 *   
	 * @return the time   
	 * @since   CodingExample Ver(±àÂë·¶Àý²é¿´) 1.0   
	 */
	
	public String getTime() {
		return time;
	}
	/**   
	 * @param time the time to set   
	 */
	
	public void setTime(String time) {
		this.time = time;
	}
	/**   
	 * addTime   
	 *   
	 * @return the addTime   
	 * @since   CodingExample Ver(±àÂë·¶Àý²é¿´) 1.0   
	 */
	
	public String getAddTime() {
		return addTime;
	}
	/**   
	 * @param addTime the addTime to set   
	 */
	
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	/**   
	 * total   
	 *   
	 * @return the total   
	 * @since   CodingExample Ver(±àÂë·¶Àý²é¿´) 1.0   
	 */
	
	public double getTotal() {
		return total;
	}
	/**   
	 * @param total the total to set   
	 */
	
	public void setTotal(double total) {
		this.total = total;
	}
	/**   
	 * mark   
	 *   
	 * @return the mark   
	 * @since   CodingExample Ver(±àÂë·¶Àý²é¿´) 1.0   
	 */
	
	public String getMark() {
		return mark;
	}
	/**   
	 * @param mark the mark to set   
	 */
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	 
	    /**   
	     * ´´½¨Ò»¸öÐÂµÄÊµÀý ConsumeItem.   
	     *   
	     * @param time
	     * @param addTime
	     * @param total
	     * @param mark   
	     */   
	    
	public ConsumeItem(int id,String time, String addTime, double total, String mark) {
		super();
		this.id = id;
		this.time = time;
		this.addTime = addTime;
		this.total = total;
		this.mark = mark;
	}
		public ConsumeItem() {
			// TODO Auto-generated constructor stub
		}
	
	
	

}
