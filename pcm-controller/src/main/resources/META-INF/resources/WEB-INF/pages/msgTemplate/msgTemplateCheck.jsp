<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><spring:message code="msgTemplate.detail.title" text="短信模板明细" /></title>
<!-- 引入css样式和部分js -->
<%@ include file="/common/head.jsp"%>
</head>
<!-- 整体皮肤样式 -->
<body class="${param.skin}">
	<form:form cssClass="form-horizontal" cssStyle="padding-top: 40px" modelAttribute="bMPMessageTemplate">
		<div class="form-group row">
			<!-- 信息代码 -->
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label">
				<spring:message code="bMPMessageTemplate.code" text="信息代码" />
				:
			</label>
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3  detailStyle">
				${bMPMessageTemplate.code }	
			</label>
			<!-- 系统类型 -->
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label">
				<spring:message code="bMPMessageTemplate.systemType" text="系统类型" />
				:
			</label>
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3  detailStyle"> 
				${systemType}
			</label>
		</div>				
		<div class="form-group row">
			<!-- 信息分类 -->
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label">
				<spring:message code="bMPMessageTemplate.msgCategory" text="信息分类" />
				:
			</label>
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3  detailStyle">
				${msgCategory}
			</label>
			<!-- 发送方法 -->
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label">
				<spring:message code="bMPMessageTemplate.sendingMethod" text="发送方法" />
				:
			</label>
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3  detailStyle"> 
				${sendingMethod}
			</label>
		</div>				
		<div class="form-group row">
			<!-- 信息描述 -->
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label">
				<spring:message code="bMPMessageTemplate.desc" text="信息描述" />
				:
			</label>
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3  detailStyle">
				${bMPMessageTemplate.desc }	
			</label>
			<!-- 内容模版 -->
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label">
				<spring:message code="bMPMessageTemplate.contentTemplate" text="内容模版" />
				:
			</label>
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3  detailStyle"> 
				${bMPMessageTemplate.contentTemplate }	
			</label>
		</div>				
		<div class="form-group row">
			<!-- 发送起始时间 -->
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label">
				<spring:message code="bMPMessageTemplate.startTime" text="发送起始时间" />
				:
			</label>
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3  detailStyle">
				<fmt:formatDate var="startTimeFmt" value="${bMPMessageTemplate.startTime }" type="date" pattern="yyyy-MM-dd" />
				${startTimeFmt }
			</label>
			<!-- 发送结束时间 -->
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label">
				<spring:message code="bMPMessageTemplate.endTime" text="发送结束时间" />
				:
			</label>
			<label class="col-lg-3 col-md-3 col-sm-3 col-xs-3  detailStyle"> 
				<fmt:formatDate var="endTimeFmt" value="${bMPMessageTemplate.endTime }" type="date" pattern="yyyy-MM-dd" />
				${endTimeFmt }
			</label>
		</div>				
		<div class="form-controls">
			<div class="btn-group-sm">
			<%-- <k:access code="BMPMesDetail">
				<!--修改 -->
				<input type="button" class="btn-info btn" id="updateBMPMessageTemplate" value="<spring:message code='kite.web.common.btnUpd' text='修改' />" />
				<script type="text/javascript">
					$("#updateBMPMessageTemplate").click(function(){
						var params = [];
						params.push("code=${bMPMessageTemplate.code }");
						$K.frame.reloadSlideInner("${ctx}/msgTemplate/msgTemplateEditPage.in?" + params.join("&"));
					})
				</script>
			</k:access> --%>
				<!-- 返回 -->
				<input type="button" class="btn-default btn only-slide-out" value="<spring:message code='kite.web.common.btnBack' text='返回' />" />
			</div>
		</div>
	</form:form>
	<%@ include file="/common/foot.jsp"%>
</body>
</html>