<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><spring:message code="product.detail.title" text="产品参数管理明细" /></title>
<!-- 引入css样式和部分js -->
<%@ include file="/common/head.jsp"%>
</head>
<!-- 整体皮肤样式 -->
<body class="${param.skin}">
				<form:form cssClass="form-horizontal" cssStyle="padding-top: 40px" modelAttribute="product">
					<div class="form-group row">
						<!-- 产品代码 -->
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 control-label">
							<spring:message code="product.productCode" text="产品代码" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 detailStyle"> &nbsp;${product.productCode } </label>
						<!-- 产品描述 -->
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 control-label">
							<spring:message code="product.description" text="产品描述" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 detailStyle"> &nbsp;${product.description } </label>
						<!-- BIN -->
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 control-label">
							<spring:message code="product.bin" text="BIN" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 detailStyle"> &nbsp;${product.bin } </label>
						<!-- 产品类型 -->
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 control-label">
							<spring:message code="product.productType" text="产品类型" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 detailStyle"> &nbsp;${productType} </label>
						<!--  电子账号长度 -->
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 control-label">
							<spring:message code="product.accountLen" text="电子账号长度" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 detailStyle"> &nbsp;${product.cardnoLen } </label>
						<!--  电子账号上限 -->
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 control-label">
							<spring:message code="product.accountRangeCeil" text="电子账号上限" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 detailStyle"> &nbsp;${product.cardnoRangeCeil } </label>
						<!--  电子账号下限 -->
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 control-label">
							<spring:message code="product.accountRangeFlr" text="电子账号下限" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 detailStyle"> &nbsp;${product.cardnoRangeFlr } </label>
						<!--基准货币 -->
						<label class="col-lg-3 col-md-3 col-sm-6 col-xs-6 control-label">
							<spring:message code="product.currency" text="基准货币" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-12 col-xs-12 detailStyle"> &nbsp;${currency } </label>
						<!-- 人行记录是否合并 -->
						<label class="col-lg-3 col-md-3 col-sm-12 col-xs-12 control-label">
							<spring:message code="product.isPbocInfoMerged" text="人行记录是否合并" />
							:
						</label>
						<label class="col-lg-3 col-md-3 col-sm-12 col-xs-12 detailStyle">
								 &nbsp;${isPbocInfoMerged}
						</label>
						<!-- 人行记录是否合并描述 -->
					</div>
				</form:form>
	</div>
	
	<%@ include file="/common/foot.jsp"%>
	<script type="text/javascript">
	//开启表单验证 
/* 	$("#productUpdForm").validate();
	$(".product-config").each(function(i,view){
		var paramKey=$(this).data("param-key");
		var index=$(this).data("config-index");
		if(paramKey){
		    var divCont=$(this).parents(".stats-container");
		    divCont.css("border","1px solid rgba(208, 216, 230,0.52)");
		    var relationUnitCodes=$(this).data("relation-untis");//iframe关联 需要关联的iframe的id
		    //判断该iframe是否需要联动其他的iframe
			if(relationUnitCodes){
				var codes=relationUnitCodes.split(",");
				for(var i=0;i<codes.length;i++){
					var	 iframeRelObj=$('#iframe_'+codes[i]);
					var productCode=iframeRelObj.attr("src").split("?")[1];
					var params = [];
					params.push(productCode);
					params.push("parentProductCode="+paramKey);
					iframeRelObj.attr('src', iframeRelObj.data("oldbase-url")+"?"+params.join("&"));
				}
			}
		} 
	}) */
	</script>
</body>
</html>