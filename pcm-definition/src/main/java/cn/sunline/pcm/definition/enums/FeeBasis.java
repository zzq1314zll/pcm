package cn.sunline.pcm.definition.enums;

import cn.sunline.common.annotation.enums.EnumInfo;

/**
 * 
 * @author zzq
 * @date 2019年7月15日
 * 费用收取基础
 * 
 */
@EnumInfo({
    "A|基于本金" ,
    "B|基于剩余本金" ,
	"C|基于保费"
})	
public enum FeeBasis {

	/**
	 * 基于本金
	 */
	A,
	/**
	 * 基于剩余本金
	 */
	B,
	/**
	 * 基于保费
	 */
	
	C 
	
}
