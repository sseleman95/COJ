<%@include file="/WEB-INF/jsp/include/include.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page buffer="16kb" autoFlush="true"%>
<display:table id="user" name="users" class="volume" requestURI=""
	defaultsort="0" defaultorder="ascending"
	decorator="cu.uci.coj.utils.tabledecorator.usersrankTableDecorator">
	<display:column titleKey="tablehdr.rank" headerClass="headrk">
		<c:url value="${user.rank}" />
	</display:column>
	<display:column titleKey="tablehdr.country" headerClass="headcountry">
		<img src="/images/countries/<c:url value="${user.country}"/>.png"
			data-toggle="tooltip" title="<c:url value="${user.country_desc}"/>"
			alt="<c:url value="${user.country}"/>" />
	</display:column>
	<display:column titleKey="tablehdr.user" style="text-transform:none">
		<a title="<c:out value="${user.nick}"/>" data-toggle="tooltip"
			href="<c:url value="/user/useraccount.xhtml?username=${user.username}"/>">
			<c:out value="${user.username}" />
		</a>
		<c:if test="${user.online == true}">&nbsp;
					<a alt="logged" data-toggle="tooltip" title="<spring:message code="altval.logged"/>"><i
				class="fa fa-plug"></i></a>
		</c:if>
		<span class="pull-right"> <i title="${user.status}" data-toggle="tooltip"
			class="fa fa-circle user${user.status}"> </i>
		</span>
	</display:column>

	<display:column property="total" titleKey="tablehdr.sub"
		sortable="true" sortProperty="sub" sortName="sub"
		headerClass="headsub" href="status.xhtml" paramId="username"
		paramProperty="username" />
	<display:column property="accu" titleKey="tablehdr.ac" sortable="true"
		sortProperty="acc" sortName="accu" headerClass="headacc"
		href="status.xhtml?status=ac" paramId="username"
		paramProperty="username" />
	<display:column property="percent" titleKey="tablehdr.accpercent"
		sortable="true" sortProperty="accp" sortName="percent"
		headerClass="headpercent" />
	<display:column property="points" titleKey="tablehdr.score"
		sortable="true" sortProperty="points" sortName="score"
		headerClass="headpoint" />
</display:table>
<script>    
$(function(){
		$("[data-toggle='tooltip']").tooltip();	
	});
</script>  