package com.dzr.framework.pojo.dubbo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class PageRequest extends BaseRequest {
//	@Min(value=1, message="当前页最小值为1")
	private Integer currentPage=1;//当前页数
	private Integer pageSize=10;//每页条数
	private Integer totalCount;// 总页数
	
	public Integer getStartItem(){
		return (currentPage-1)*pageSize;
	}
}
