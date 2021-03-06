package cn.sunline.pcm.definition.enums;

import cn.sunline.common.annotation.enums.EnumInfo;

@EnumInfo({
		//  Approve& Advice
		"A000|通过",
		"A001|VIP通过",
		"A100|通知通过",
		"A101|通知拒绝",
		"A102|通知吞卡",
		"A103|通知挂失",
		"A104|通知被盗",
		"A109|无效的通知确认",
		//  Balance &open to Buy
		"B001|OTB不足",
		"B002|现金额度不足",
		"B003|客户级交易限额不足",
		"B004|客户级取现限额不足",
		"B005|单笔交易超限",
		"B006|单笔取现超限",
		"B007|单笔网银消费超限",
		"B008|费用类造成额度不足",
		"B009|圈存限额",
		"B010|预授权完成超出最大限制",
		"B011|分期交易金额超出限制",
		//  Frequence
		"F001|超出单日交易总笔数", 
		"F002|超出单日交易总金额", 
		"F003|超出单日交易拒绝总笔数",
		"F004|超出单日交易拒绝总金额",
		"F005|超出账单周期交易总笔数",
		"F006|超出账单周期交易总金额", 
		"F007|超出账单周期交易拒绝总笔数", 
		"F008|超出账单周期交易拒接总金额",
		"F009|超出年周期交易总笔数", 
		"F010|超出年周期交易总金额", 
		"F011|超出年周期交易拒绝总笔数", 
		"F012|超出年周期交易拒接总金额",
		"F013|超出单日ATM通过取现笔数",
		"F014|超出单日ATM通过取现金额", 
		"F015|超出单日OTC通过取现笔数", 
		"F016|超出单日OTC通过取现金额",
		"F017|超出单日取现总笔数", 
		"F018|超出单日取现总金额", 
		"F019|超出单日取现拒绝总笔数",
		"F020|超出单日取现拒绝总金额",
		"F021|超出账单周期取现总笔数",
		"F022|超出账单周期取现总金额",
		"F023|超出账单周期取现拒绝总笔数",
		"F024|超出账单周期取现拒绝总金额",
		"F025|超出年周期取现总笔数",
		"F026|超出年周期取现总金额",
		"F027|超出年周期取现拒绝总笔数",
		"F028|超出年周期取现拒绝总金额",
		"F029|单日网银消费总笔数",
		"F030|单日网银消费总金额",
		"F031|单日网银消费拒绝总笔数",
		"F032|单日网银消费拒绝总金额",
		"F033|账单周期网银消费总笔数",
		"F034|账单周期网银消费总金额",
		"F035|账单周期网银消费拒绝总笔数",
		"F036|账单周期网银消费拒绝总金额",
		"F037|账单年网银消费总笔数",
		"F038|账单年网银消费总金额",
		"F039|账单年网银消费拒绝总笔数",
		"F040|账单年网银消费拒绝总金额",
		"F041|超过圈存次数",
		"F042|超出单日消费总笔数", 
		"F043|超出单日消费总金额",
		"F044|超出单日银联境外ATM取现总金额",
		//  IC verification&risk
		"I001|Icvn错",
		"I002|atc错",
		"I005|arqc错",
		"I006|arqc未上送",
		"I007|tvr错",
		"I008|cvr错",
		"I009|上一联机交易未完成",
		"I010|发卡方验证失败",
		"I011|Icvn错误次数超限",
		//  bLock code of acct/logicard/mediumcard
		"L001|关闭账户",
		"L002|待销卡或待销户",
		"L003|冻结账户",
		"L004|潜在高风险",
		"L005|损益类账户",
		"L006|破产死亡账户",
		"L007|被伪冒账户",
		"L008|欺诈账户",
		"L009|银行止付账户",
		"L010|临时止付账户",
		"L011|被盗止付",
		"L012|丢失止付",
		"L013|逾期2期",
		"L014|逾期3期",
		"L015|逾期4期",
		"L016|逾期5期",
		"L017|逾期6期",
		"L018|逾期7期",
		"L019|逾期8期",
		"L020|逾期9期",
		"L021|失去联系",
		"L022|呆账核销",
		"L023|代理催收",
		"L024|属地催收",
		"L025|人工入催",
		"L026|催收",
		"L027|退货过度使用",
		"L028|取现过度使用",
		"L029|消费过度使用",
		"L030|自定义锁定码1",
		"L031|自定义锁定码2",
		"L032|自定义锁定码3",
		"L033|自定义锁定码4",
		"L034|自定义锁定码5",
		"L035|自定义锁定码6",
		"L036|逻辑卡（待）销卡",
		//  Manually operation
		"M000|人工批准",
		"M001|人工拒绝",
		//  Recode nod found
		"R001|无此账户",
		"R002|无此逻辑卡",
		"R003|无此客户限额记",
		"R004|无此客户记录",
		"R005|未找到机构",
		"R006|未找到产品",
		"R007|无效冲正 未匹配",
		"R008|匹配错误",
		"R009|二次匹配错误",
		"R010|三次匹配错误",
		"R011|原交易无效",
		"R012|已确认交易",
		"R013|隔日确认交易不支持",
		"R014|找不到原始交易",
		"R015|故障怀疑",
		"R016|无效交易",
		"R017|当前交易和原始交易金额不一致",
		"R018|没有找到分期注册表信息",
		//  System Error
		"S001|不在交易服务时间",
		"S002|加密机状态异常",
		"S003|无法获得对应汇率",
		"S004|系统参数无法打开",
		"S005|产品参数无法打开",
		"S006|系统日切中",
		"S007|无效冲正",
		"S008|授权模块不可用",
		"S009|系统错误",
		"S010|原因码返回码配置错误",
		//  TXN Country
		"TC01|国家码禁止",
		"TC02|超出特定国家本币限额",
		"TC03|超出特定国家外币限额",
		//  TXN Format
		"TF01|无效bitmap",
		"TF02|报文格式错",
		"TF03|无效金额",
		"TF04|TLV格式tag错",
		"TF05|交叉检验错",
		// 分期交易
		"TL51|报文上送的分期期数不在项目活动分期期数列表中", 
		"TL52|分期活动状态不是[使用中]", 
		"TL53|分期活动有效期过期",
		"TL54|发卡分行不支持",
		"TL55|卡产品不支持",
		"TL56|商户类型不支持",
		"TL57|商户号不支持",
		"TL58|附卡不支持",
		//  TXN IC
		"TI01|不支持ic交易",
		"TI02|不支持fallback交易",
		//  TXN Location
		"TL01|限定本地使用（境内使用）",
		//  TXN Merchant
		"TM01|特定商户禁止",
		"TM02|超出商户指定限额",
		"TM03|无效商户",
		"TM04|商户被锁定",
		//  TXN Merchant category
		"TMC1|MCC码禁止",
		"TMC2|超出mcc码指定限额本币",
		"TMC3|超出mcc指定限额外币",
		//  TXN Other
		"TO01|特定国家/币种/mcc禁止",
		"TO02|超出限额",
		//  TXN inputSource and terminal
		"TS01|不支持的渠道",
		"TS02|指定终端不支持此交易",
		"TS03|不支持此交易",
		//  TXN unsupport type
		"TT01|不支持还款",
		"TT02|不支持地址校验",
		"TT03|不支持账户验证",
		"TT04|不支持贷记调整",
		"TT05|未开通无卡自助",
		"TT06|非待销户账户",
		"TT07|结清金额不正确",
		//  TXN currency
		"TU01|币种码禁止",
		"TU02|超出币种码指定限额",
		"TU03|无效币种",
		//  Verification for security
		"V001|1磁上送磁道错误", 
		"V002|2磁上送磁道错误", 
		"V003|3磁上送磁道错误", 
		"V004|支付密码错",
		"V005|密码错次数超限",
		"V006|Cvv错", 
		"V007|Cvv错误次数超限", 
		"V008|cvv2错", 
		"V009|cavv/aav错", 
		"V010|商户黑名单", 
		"V011|卡片黑名单",
		"V012|需要更改密码", 
		"V013|不安全的密码", 
		"V014|密码错且本次超限", 
		"V015|无效的aav", 
		"V016|无效的dcvv", 
		"V017|禁止改密",
		"V018|cvc2未上送",
		"V019|密文格式错", 
		"V020|查询密码错", 
		"V021|征信局警示",
		"V022|卡管：未发卡",
		"V023|卡管：挂失",
		"V024|卡管：被盗挂失",
		"V025|账户无效地址",
		"V026|账户认证电话失败",
		"V027|账户认证身份证失败", 
		"V028|moto交易商户强制验证cvv2但未上送", 
		"V029|moto手工交易(产品参数)强制验证cvv2但未上送 ", 
		"V030|moto电子交易(产品参数)强制验证cvv2但未上送  ",
		"V031|人工授权强制验证cvv2但未上送  ",
		"V101|介质卡有效期不匹配",
		"V102|介质卡有效期过期",
		"V203|介质卡未激活", 
		"V304|逻辑卡未激活",
		"V033|密码未上送",
		"V034|卡有效期未上送",
		"V035|身份证件未上送",
		"V036|磁道信息未上送",
		"V037|委托关系不支持",
		"V038|CVN2未上送",
		"V039|PVN不支持",
		"V040|姓名未上送",
		"V041|姓名不正确",
		"V042|手机号码未上送",
		"V043|手机号码不正确",
		"V044|动态验证码不支持",
		"V045|身份证不正确",
		"V046|未上送辅助认证信息",
		"V047|未上送CVV2和有效期",
		"V048|cvv2错次数超限",
		"V049|密码未设置",
		"MC01|逾期期数或六个月内逾期达到不允许使用的次数",
		"MC02|超过贷款授信有效期",
		"VC01|V卡无效报文",
		"VC02|非志愿者卡"
		})
public enum AuthReason {
	/**  
	 * 通过
	 */
	A000,
	/**  
	 * VIP通过
	 */
	A001,
	/**  
	 * 通知通过
	 */
	A100,
	/**  
	 * 通知拒绝
	 */
	A101,
	/**  
	 * 通知吞卡
	 */
	A102,
	/**  
	 * 通知挂失
	 */
	A103,
	/**  
	 * 通知被盗
	 */
	A104,
	/**  
	 * 无效的通知确认
	 */
	A109,
	/**  
	 * OTB不足
	 */
	B001,
	/**  
	 * 现金额度不足
	 */
	B002,
	/**  
	 * 客户级交易限额不足
	 */
	B003,
	/**  
	 * 客户级取现限额不足
	 */
	B004,
	/**  
	 * 单笔交易超限
	 */
	B005,
	/**
	 *   单笔取现超限
	 */
	B006,
	/**
	 *   单笔网银消费超限
	 */
	B007,
	/**
	 *   费用类造成额度不足
	 */
	B008,
	/**
	 *   圈存金额
	 */
	B009,
	/**
	 * 预授权完成超出最大限制
	 */
	B010,
	/**
	 * 分期交易金额超出限制
	 */
	B011,
	/**
	 *   超出单日交易总笔数
	 */
	F001,
	/**
	 *   超出单日交易总金额
	 */
	F002,
	/**
	 *   超出单日交易拒绝总笔数
	 */
	F003,
	/**
	 *   超出单日交易拒绝总金额
	 */
	F004,
	/**
	 *   超出账单周期交易总笔数
	 */
	F005,
	/**
	 *   超出账单周期交易总金额
	 */
	F006,
	/**
	 *   超出账单周期交易拒绝总笔数
	 */
	F007,
	/**
	 *   超出账单周期交易拒接总金额
	 */
	F008,
	/**
	 *   超出年周期交易总笔数
	 */
	F009,
	/**
	 *   超出年周期交易总金额
	 */
	F010,
	/**
	 *   超出年周期交易拒绝总笔数
	 */
	F011,
	/**
	 *   超出年周期交易拒接总金额
	 */
	F012,
	/**
	 *   超出单日ATM通过取现笔数
	 */
	F013,
	/**
	 *   超出单日ATM通过取现金额
	 */
	F014,
	/**
	 *   超出单日OTC通过取现笔数
	 */
	F015,
	/**
	 *   超出单日OTC通过取现金额
	 */
	F016,
	/**
	 *   超出单日取现总笔数
	 */
	F017,
	/**
	 *   超出单日取现总金额
	 */
	F018,
	/**
	 *   超出单日取现拒绝总笔数
	 */
	F019,
	/**
	 *   超出单日取现拒绝总金额
	 */
	F020,
	/**
	 *   超出账单周期取现总笔数
	 */
	F021,
	/**
	 *   超出账单周期取现总金额
	 */
	F022,
	/**
	 *   超出账单周期取现拒绝总笔数
	 */
	F023,
	/**
	 *   超出账单周期取现拒绝总金额
	 */
	F024,
	/**
	 *   超出年周期取现总笔数
	 */
	F025,
	/**
	 *   超出年周期取现总金额
	 */
	F026,
	/**
	 *   超出年周期取现拒绝总笔数
	 */
	F027,
	/**
	 *   超出年周期取现拒绝总金额
	 */
	F028,
	/**
	 *   单日网银消费总笔数
	 */
	F029,
	/**
	 *   单日网银消费总金额
	 */
	F030,
	/**
	 *   单日网银消费拒绝总笔数
	 */
	F031,
	/**
	 *   单日网银消费拒绝总金额
	 */
	F032,
	/**
	 *   账单周期网银消费总笔数
	 */
	F033,
	/**
	 *   账单周期网银消费总金额
	 */
	F034,
	/**
	 *   账单周期网银消费拒绝总笔数
	 */
	F035,
	/**
	 *   账单周期网银消费拒绝总金额
	 */
	F036,
	/**
	 *   账单年网银消费总笔数
	 */
	F037,
	/**
	 *   账单年网银消费总金额
	 */
	F038,
	/**
	 *   账单年网银消费拒绝总笔数
	 */
	F039,
	/**
	 *   账单年网银消费拒绝总金额
	 */
	F040,
	/**
	 *   超过圈存次数
	 */
	F041,
	/**
	 *   超出单日消费总笔数
	 */
	F042,
	/**
	 *   超出单日消费总金额
	 */
	F043,
	/**
	 *   超出单日银联境外ATM取现总金额
	 */
	F044,
	/**
	 *   Icvn错
	 */
	I001,
	/**
	 *  atc错
	 */
	I002,
	/**
	 *   arqc错
	 */
	I005,
	/**
	 *   arqc未上送
	 */
	I006,
	/**
	 *   tvr错
	 */
	I007,
	/**
	 *   cvr错
	 */
	I008,
	/**
	 *   上一联机交易未完成
	 */
	I009,
	/**
	 *   发卡方验证失败
	 */
	I010,
	/**
	 *   Icvn错误次数超限
	 */
	I011,
	/**
	 *   关闭账户
	 */
	L001,
	/**
	 *   待销卡或待销户
	 */
	L002,
	/**
	 *   冻结账户
	 */
	L003,
	/**
	 *   潜在高风险
	 */
	L004,
	/**
	 *   损益类账户
	 */
	L005,
	/**
	 *   破产死亡账户
	 */
	L006,
	/**
	 *   被伪冒账户
	 */
	L007,
	/**
	 *   欺诈账户
	 */
	L008,
	/**
	 *   银行止付账户
	 */
	L009,
	/**
	 *   临时止付账户
	 */
	L010,
	/**
	 *   被盗止付
	 */
	L011,
	/**
	 *   丢失止付
	 */
	L012,
	/**
	 *   逾期2期
	 */
	L013,
	/**
	 *   逾期3期
	 */
	L014,
	/**
	 *   逾期4期
	 */
	L015,
	/**
	 *   逾期5期
	 */
	L016,
	/**
	 *   逾期6期
	 */
	L017,
	/**
	 *   逾期7期
	 */
	L018,
	/**
	 *   逾期8期
	 */
	L019,
	/**
	 *   逾期9期
	 */
	L020,
	/**
	 *   失去联系
	 */
	L021,
	/**
	 *   呆账核销
	 */
	L022,
	/**
	 *   代理催收
	 */
	L023,
	/**
	 *   属地催收
	 */
	L024,
	/**
	 *   人工入催
	 */
	L025,
	/**
	 *   催收
	 */
	L026,
	/**
	 *   退货过度使用
	 */
	L027,
	/**
	 *   取现过度使用
	 */
	L028,
	/**
	 *   消费过度使用
	 */
	L029,
	/**
	 *   自定义锁定码1
	 */
	L030,
	/**
	 *   自定义锁定码2
	 */
	L031,
	/**
	 *   自定义锁定码3
	 */
	L032,
	/**
	 *   自定义锁定码4
	 */
	L033,
	/**
	 *   自定义锁定码5
	 */
	L034,
	/**
	 * 自定义锁定码6
	 */
	L035,
	/**
	 *   逻辑卡（待）销卡
	 */
	L036,
	/**
	 *   人工批准
	 */
	M000,
	/**
	 *   人工拒绝
	 */
	M001,
	/**
	 *   无此账户
	 */
	R001,
	/**
	 *   无此逻辑卡
	 */
	R002,
	/**
	 *   无此客户限额记
	 */
	R003,
	/**
	 *   无此客户记录
	 */
	R004,
	/**
	 *   未找到机构
	 */
	R005,
	/**
	 *   未找到产品
	 */
	R006,
	/**
	 *   无效冲正 未匹配
	 */
	R007,
	/**
	 *   匹配错误
	 */
	R008,
	/**
	 *   二次匹配错误
	 */
	R009,
	/**
	 *   三次匹配错误
	 */
	R010,
	/**
	 *   原交易无效
	 */
	R011,
	/**
	 *   已确认交易
	 */
	R012,
	/**
	 *   隔日确认交易不支持
	 */
	R013,
	/**
	 *   找不到原始交易
	 */
	R014,
	/**
	 *   故障怀疑
	 */
	R015,
	/**
	 *   无效交易
	 */
	R016,
	/**
	 *   当前交易和原始交易金额不一致
	 */
	R017,
	/**
	 *   没有找到分期注册表信息
	 */
	R018,
	
	/**
	 *   不在交易服务时间
	 */
	S001,
	/**
	 *   加密机状态异常
	 */
	S002,
	/**
	 *   无法获得对应汇率
	 */
	S003,
	/**
	 *   系统参数无法打开
	 */
	S004,
	/**
	 *   产品参数无法打开
	 */
	S005,
	/**
	 *   系统日切中
	 */
	S006,
	/**
	 *   无效冲正
	 */
	S007,
	/**
	 *   授权模块不可用
	 */
	S008,
	/**
	 *   系统错误
	 */
	S009,
	/**
	 *   原因吗返回码配置错误
	 */
	S010,
	/**
	 *   国家码禁止
	 */
	TC01,
	/**
	 *   超出特定国家本币限额
	 */
	TC02,
	/**
	 *   超出特定国家外币限额
	 */
	TC03,
	/**
	 *   无效bitmap
	 */
	TF01,
	/**
	 *   报文格式错
	 */
	TF02,
	/**
	 *   无效金额
	 */
	TF03,
	/**
	 *   TLV格式tag错
	 */
	TF04,
	/**
	 *   交叉检验错
	 */
	TF05,
	/**
	 *   不支持ic交易
	 */
	TI01,
	/**
	 *   不支持fallback交易
	 */
	TI02,
	/**
	 *   限定本地使用（境内使用）
	 */
	TL01,
	/**
	 *   报文上送的分期期数不在项目活动分期期数列表中
	 */
	TL51,
	/**
	 *   分期活动状态不是[使用中]
	 */
	TL52,
	/**
	 *   分期活动有效期过期
	 */
	TL53,
	/**
	 *   发卡分行不支持
	 */
	TL54,
	/**
	 *   卡产品不支持
	 */
	TL55,
	/**
	 *   商户类型不支持
	 */
	TL56,
	/**
	 *   商户号不支持
	 */
	TL57,
	/**
	 *   附卡不支持
	 */
	TL58,
	/**
	 *   特定商户禁止
	 */
	TM01,
	/**
	 *   超出商户指定限额
	 */
	TM02,
	/**
	 *   无效商户
	 */
	TM03,
	/**
	 *   商户被锁定
	 */
	TM04,
	/**
	 *   MCC码禁止
	 */
	TMC1,
	/**
	 *   超出MCC码指定限额
	 */
	TMC2,
	/**
	 *   超出mcc码指定限额本币
	 */
	TMC3,
	/**
	 *   超出mcc指定限额外币
	 */
	TO01,
	/**
	 *   重复交易
	 */
	TO02,
	/**
	 *   不支持的渠道
	 */
	TS01,
	/**
	 *   指定渠道不支持此交易
	 */
	TS02,
	/**
	 *   不支持此交易
	 */
	TS03,
	/**
	 *   不支持还款
	 */
	TT01,
	/**
	 *   不支持地址校验
	 */
	TT02,
	/**
	 *   不支持账户验证
	 */
	TT03,
	/**
	 *   不支持贷记调整
	 */
	TT04,
	/**
	 * 未开通无卡自助
	 */
	TT05,
	/**
	 * 非待销户账户
	 */
	TT06,
	/**
	 * 结清金额不正确
	 */
	TT07,
	/**
	 *   币种码禁止
	 */
	TU01,
	/**
	 *   超出币种码指定限额
	 */
	TU02,
	/**
	 *   无效币种
	 */
	TU03,
	/**
	 *   1磁上送磁道错误
	 */
	V001,
	/**
	 *   2磁上送磁道错误
	 */
	V002,
	/**
	 *   3磁上送磁道错误
	 */
	V003,
	/**
	 *   支付密码错
	 */
	V004,
	/**
	 *   密码错次数超限
	 */
	V005,
	/**
	 *   Cvv错
	 */
	V006,
	/**
	 *   Cvv错误次数超限
	 */
	V007,
	/**
	 *   cvv2错
	 */
	V008,
	/**
	 *   cavv/aav错
	 */
	V009,
	/**
	 *   商户黑名单
	 */
	V010,
	/**
	 *   卡片黑名单
	 */
	V011,
	/**
	 *   需要更改密码
	 */
	V012,
	/**
	 *   不安全的密码
	 */
	V013,
	/**
	 *   密码错且本次超限
	 */
	V014,
	/**
	 *   无效的aav
	 */
	V015,
	/**
	 *   无效的dcvv
	 */
	V016,
	/**
	 *   禁止改密
	 */
	V017,
	/**
	 *   cvc2未上送
	 */
	V018,
	/**
	 *   密文格式错
	 */
	V019,
	/**
	 *   查询密码错
	 */
	V020,
	/**
	 *   征信局警示
	 */
	V021,
	/**
	 *   卡管：未发卡
	 */
	V022,
	/**
	 *   卡管：挂失
	 */
	V023,
	/**
	 *   卡管：被盗挂失
	 */
	V024,
	/**
	 *   账户无效地址
	 */
	V025,
	/**
	 *   账户认证电话失败
	 */
	V026,
	/**
	 *   账户认证身份证失败
	 */
	V027,
	/**
	 *   moto交易商户强制验证cvv2但未上送
	 */
	V028,
	/**
	 *   moto手工交易(产品参数)强制验证cvv2但未上送 
	 */
	V029,
	/**
	 *   moto电子交易(产品参数)强制验证cvv2但未上送
	 */
	V030,
	/**
	 *   人工授权强制验证cvv2但未上送
	 */
	V031,
	/**
	 *   介质卡有效期不匹配
	 */
	V101,
	/**
	 *   介质卡有效期过期
	 */
	V102,
	/**
	 *   介质卡未激活
	 */
	V203,
	/**
	 *   逻辑卡未激活
	 */
	V304,
	/**
	 *   辅助验证密码未上送
	 */
	V033,
	/**
	 *   卡有效期未上送
	 */
	V034,
	/**
	 *   身份证件未上送
	 */
	V035,
	/**
	 *   磁道信息未上送
	 */
	V036,
	/**
	 *   委托关系不支持
	 */
	V037,
	/**
	 *   CVN2未上送
	 */
	V038,
	/**
	 *   PVN不支持
	 */
	V039,
	/**
	 *   姓名未上送
	 */
	V040,
	/**
	 *   姓名不正确
	 */
	V041,
	/**
	 *   手机号码未上送
	 */
	V042,
	/**
	 *   手机号码不正确
	 */
	V043,
	/**
	 *   动态验证码不支持
	 */
	V044,
	/**
	 *   身份证不正确
	 */
	V045,
	/**
	 * 未上送辅助认证信息
	 */
	V046,
	/**
	 * 未上送CVV2和有效期
	 */
	V047,
	/**
	 *   cvv2错次数超限
	 */
	V048,
	/**
	 * 密码未设置
	 */
	V049,
	/**
	 * 逾期期数或六个月内逾期达到不允许使用的次数
	 */
	MC01,
	/**
	 * 超过贷款授信有效期
	 */
	MC02,
	/**
	 * V卡无效报文
	 */
	VC01,
	/**
	 * 非志愿者卡
	 */
	VC02
}
