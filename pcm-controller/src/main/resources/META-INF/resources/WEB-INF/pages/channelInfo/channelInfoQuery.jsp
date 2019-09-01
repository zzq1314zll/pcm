<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<%@ include file="/common/taglib.jsp"%>
<html lang="en">
<head>
<meta charset="utf-8" />
<title><spring:message code="channelInfo.query.title" text="渠道方基本信息查询" /></title>
<!-- 引入css样式和部分js -->
<%@ include file="/common/head.jsp"%>
</head>
<body class="${param.skin}">
	<!-- 整体皮肤样式 -->
	<div class="container">
		<div class="row" style="margin: 0px;">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="padding: 0px;">
				<div class="x_panel">
					<div class="x_content">
						<!-- datatable-target="(table-id)" 配置查询表单关联对应的datatable数据表格 -->
						<form:form class="form-search form-horizontal form-label-left" datatable-target="channelInfo_datatable" modelAttribute="channelInfo">
							<div class="form-group">
								<label class="control-label col-lg-1 col-md-2 col-sm-6 col-xs-12" for="channelCode">
									<spring:message code="channelInfo.channelCode" text="渠道方编码" />
									:
								</label>
								<div class="col-lg-2 col-md-4 col-sm-6 col-xs-12">
									<form:input cssClass="form-control" type="text" path="channelCode"  data-rule-maxlength="32" />
								</div>
							</div>
							<div class="form-controls">
								<div class="btn-group-sm">
									<!-- grid-search,点击该按钮自动查询form[datatable-target]对应的数据 -->
									<button class="btn btn-success grid-search" type="button">
										<!-- 查询 -->
										<i class="fa fa-search"></i>
										<spring:message code="kite.web.common.btnCheck" text="查询" />
									</button>
									<button class="btn btn-primary" type="reset">
										<!-- 重置-->
										<i class="fa fa-refresh"></i>
										<spring:message code="kite.web.common.btnReset" text="重置" />
									</button>
								</div>
							</div>
						</form:form>
						
						<!-- 表格数据展示区域 -->
						<div class="responsive-table">
							<div class="scrollable-area">
								<table id="channelInfo_datatable" class="datatable table table-hover table-striped table-bordered">
								</table>
							</div>
						</div>
					</div><!-- x_content -->
				</div><!-- x_panel-->
			</div><!-- col-12 -->
		</div>
	</div>
	<!-- 引入js -->
	<%@ include file="/common/foot.jsp"%>
	<!-- 权限单元-控制js变量 -->
	<k:access code="channelInfo_add" var="addUrl"/>
	<k:access code="channelInfo_edit" var="editUrl"/>
	<k:access code="channelInfo_delete" var="delUrl"/>
	<!-- 创建datatable表格 -->
	<script type="text/javascript">
		var pkNames = [];
		var columns = [];
		pkNames.push("channelCode");
		columns.push({ title: '<spring:message code="channelInfo.channelCode" text="渠道方编码" />', data: 'channelCode'});
		columns.push({ title: '<spring:message code="channelInfo.channelDesc" text="渠道方描述" />', data: 'channelDesc'});
		columns.push({ title: '<spring:message code="assetSideInfo.companyName" text="名称" />', data: 'companyName'});
		columns.push({ title: '<spring:message code="assetSideInfo.registrationAuthority" text="登记机关" />', data: 'registrationAuthority'});
		columns.push({ title: '<spring:message code="assetSideInfo.registerDate" text="成立时间" />', data: 'registerDate',
			type : 'date',
			render : function(data, type, row, meta) {
				return $K.date.format(data, "date");
			}
		});
		columns.push({ title: '<spring:message code="assetSideInfo.unifySocialCreditCode" text="统一社会信用代码" />', data: 'unifySocialCreditCode'});
		columns.push({ title: '<spring:message code="assetSideInfo.companyType" text="类型" />', data: 'companyType',
			render : function(data, type, row, meta) {
				return ${companyTypeJson}[data];
			}
		});
		columns.push({ title: '<spring:message code="assetSideInfo.businessBeginDate" text="营业期限有限期起始日期" />', data: 'businessBeginDate',
			type : 'date',
			render : function(data, type, row, meta) {
				return $K.date.format(data, "date");
			}
		});
		columns.push({ title: '<spring:message code="assetSideInfo.businessEndDate" text="营业期限有限期截止日期" />', data: 'businessEndDate',
			type : 'date',
			render : function(data, type, row, meta) {
				return $K.date.format(data, "date");
			}
		});
		columns.push({ title: '<spring:message code="assetSideInfo.register" text="登记时间" />', data: 'register',
			type : 'date',
			render : function(data, type, row, meta) {
				return $K.date.format(data, "date");
			}
		});
		var grid = $("#channelInfo_datatable").grid({
			datatable : {
	          	ajax: {
	  				url: "${ctx}/channelInfo/queryChannelInfoList.in",
	  				method: "post",
	  				data: function(d) {
						d.channelCode = $("#channelCode").val();
	  				}
	  			},
	  			columns: columns
			},
			addUrl:addUrl,//新增页面url
			updateUrl:editUrl,//修改页面url
			deleteUrl:delUrl,//删除数据url
			pkNames:pkNames//表格数据主键字段名称
		});
	    var dbclick = function(rowIndex, rowData, rowObj) {
	    	var params = [];
	    	for(var i in pkNames){
	    		if(pkNames[i] && rowData[pkNames[i]]){
	    			params.push(pkNames[i] + "=" + rowData[pkNames[i]]);
	    		}
	    	}
			$K.frame.loadPage("${ctx}/channelInfo/channelInfoDetailPage.in?" + params.join("&"), grid);
		}
		grid.dbClick(dbclick);
	</script>
	<!-- 权限单元-控制代码块 -->
</body>
</html>