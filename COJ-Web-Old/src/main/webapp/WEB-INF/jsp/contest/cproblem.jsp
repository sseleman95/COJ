<%@include file="/WEB-INF/jsp/include/include.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="FileUtils" class="org.apache.commons.io.FileUtils" />

<h2 class="postheader" style="clear: both">
    <a class="linkheader"
       href="<c:url value="contestview.xhtml?cid=${contest.cid}"/>" />${contest.name}</a>
<br />
<spring:message code="pagehdr.problem" />
</h2>

<div class="row postcontent">
    <div class="panel panel-primary text-center">
        <authz:authorize ifNotGranted="ROLE_ANONYMOUS">
            <c:if test="${contest.running == true}">
                &nbsp;&nbsp;<a
                    href="<c:url value="csubmit.xhtml?pid=${problem.pid}&cid=${contest.cid}"/>"><spring:message
                        code="link.submit" /></a>
                </c:if>               
            &nbsp;&nbsp;<a
                href="<c:url value="cstatus.xhtml?pid=${problem.pid}&cid=${contest.cid}&username="/><authz:authentication property="principal.username" />"><spring:message
                    code="link.mysubmissions" /></a>
            </authz:authorize>
        &nbsp;&nbsp;<a
            href="<c:url value="cstatus.xhtml?pid=${problem.pid}&cid=${contest.cid}"/>"><spring:message
                code="link.submissions" /></a>
    </div>
    <div class="col-xs-12">
        <h3 class="text-center">
            <b><c:out value=" ${problem.pid}" /> - <c:out
                    value="${problem.title}" /></b>
                <c:if test="${problem.special_judge}">
                <a data-toggle="tooltip"
                   title="<spring:message code="titval.special.judge"/>"><span
                        class="text-danger"><i class="fa fa-gavel"></i></span></a>
                    </c:if>
        </h3>
    </div>
    <div class="row">
        <div class="col-xs-12">
            <table class="pinfo">
                <tbody>
                    <c:if test="${contest.past == true}">
                        <tr>
                            <td><spring:message code="fieldhdr.createdby" /></td>
                            <td><c:out value="${problem.author}" /></td>
                        </tr>
                        <tr>
                            <td width="20%"><spring:message code="fieldhdr.addedby" /></td>
                            <td><a
                                    href="<c:url value="/user/useraccount.xhtml?username=${problem.username}"/>"><c:out
                                        value="${problem.username}" /></a>&nbsp;(<c:out
                                    value="${problem.date}" />)</td>
                        </tr>
                    </c:if>
                    <tr>
                        <td><spring:message code="fieldhdr.limits" /></td>
                        <td><c:forEach items="${problem.limits}"
                                   var="limit" varStatus="status">
                                <div class="limit lang${limit.languageId} <c:if test="${(userLanguage == null && limit.languageId != 2 )||(userLanguage != null && limit.languageId != userLanguage.lid)}">hidden</c:if>">
                                    <b><spring:message code="fieldhdr.timelimit" />:</b> <c:out
                                        value="${limit.maxTotalExecutionTime}" /> MS <c:choose>
                                        <c:when test="${problem.multidata}">
                                            <c:out value="|" />
                                            <b><spring:message
                                                    code="fieldhdr.testlimit" />:</b>
                                            <c:out value="${limit.maxCaseExecutionTime}" /> MS
                                        </c:when>
                                    </c:choose> <c:out value="|" /><b><spring:message
                                            code="fieldhdr.memorylimit" />:</b> <c:out
                                        value="${FileUtils.byteCountToDisplaySize(limit.maxMemory)}" /> <c:out value=" | " /> <span
                                        style="font-weight: bold;"><spring:message
                                            code="fieldhdr.outputlimit" />:</span> <c:out value="64" /> MB<c:out
                                        value=" | " /><b><spring:message code="fieldhdr.sizelimit" />:</b>
                                    <c:out value="${FileUtils.byteCountToDisplaySize(limit.maxSourceCodeLenght)}" />
                                </div>
                            </c:forEach>
                        </td>
                    </tr>					
                    <tr>
                        <td><spring:message code="fieldhdr.enabledlanguages" /></td>
                        <td>
                            <select style="height: auto;padding: 0" id="language-select" class="form-control">
                                <c:forEach items="${problem.languages}" var="language"
                                           varStatus="status">
                                    <option  <c:if test="${language.lid == userLanguage.lid || (userLanguage == null && language.lid == 2)}">selected</c:if> value="${language.lid}">${language.language}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>		
                    <tr>
                        <td><spring:message code="fieldhdr.availablein" /></td>
                        <td><c:if test="${problem.availableInEn}">
                                <a href="#"><img data-toggle="tooltip"
                                                 data-placement="bottom" class="image change-language"
                                                 data-language="en" title="<spring:message code="titval.en"/>"
                                                 src="/images/i18n/en.png" /></a>
                                </c:if> 
                                <c:if test="${problem.availableInEs}">
                                <a href="#"><img data-toggle="tooltip"
                                                 data-placement="bottom" class="image change-language"
                                                 data-language="es" title="<spring:message code="titval.es"/>"
                                                 src="/images/i18n/es.png" /></a>
                                </c:if> 
                                <c:if test="${problem.availableInPt}">
                                <a href="#"><img data-toggle="tooltip"
                                                 data-placement="bottom" class="image change-language"
                                                 data-language="pt" title="<spring:message code="titval.pt"/>"
                                                 src="/images/i18n/pt.png" /></a>
                            </c:if></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
  <div class="row">
		<div class="col-xs-12">
			<h4 class="text-primary">
				<spring:message code="fieldhdr.description" />
			</h4>
			<div class="ex row">
				<div class="col-xs-12 text" data-language="en">
					<c:url value="${problem.descriptionEN}" />
				</div>
				<div class="col-xs-12 text" data-language="es">
					<c:url value="${problem.defaultDescriptionEs}" />
				</div>
				<div class="col-xs-12 text" data-language="pt">
					<c:url value="${problem.defaultDescriptionPt}" />
				</div>
			</div>
		</div>
	</div>
  <div class="row">
		<div class="col-xs-12">
			<h4 class="text-primary">
				<spring:message code="fieldhdr.inputspec" />
			</h4>
			<div class="ex row">
				<div class="col-xs-12 text" data-language="en">
					<c:url value="${problem.inputEN}" />
				</div>
				<div class="col-xs-12 text" data-language="es">
					<c:url value="${problem.defaultInputEs}" />
				</div>
				<div class="col-xs-12 text" data-language="pt">
					<c:url value="${problem.defaultInputPt}" />
				</div>
			</div>
		</div>
	</div>
    <div class="row">
		<div class="col-xs-12">
			<h4 class="text-primary">
				<spring:message code="fieldhdr.outputspec" />
			</h4>
			<div class="row">
				<div class="col-xs-12 text" data-language="en">
					<c:url value="${problem.outputEN}" />
				</div>
				<div class="col-xs-12 text" data-language="es">
					<c:url value="${problem.defaultOutputEs}" />
				</div>
				<div class="col-xs-12 text" data-language="pt">
					<c:url value="${problem.defaultOutputPt}" />
				</div>
			</div>
		</div>
	</div>
    <div class="row">
        <div class="col-xs-12">
            <h4 class="text-primary">
                <spring:message code="fieldhdr.sampleinput" />
            </h4>
            <code>${problem.inputex}</code>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-12">
            <h4 class="text-primary">
                <spring:message code="fieldhdr.sampleoutput" />
            </h4>
            <code>${problem.outputex}</code>
        </div>
    </div>
  <div class="row">
		<div class="col-xs-12">
			<h4 class="text-primary">
				<spring:message code="fieldhdr.hint" />
			</h4>
			<div class="ex row">
				<div class="col-xs-12 text" data-language="en">
					<c:url value="${problem.commentsEN}" />
				</div>
				<div class="col-xs-12 text" data-language="es">
					<c:url value="${problem.defaultCommentsEs}" />
				</div>
				<div class="col-xs-12 text" data-language="pt">
					<c:url value="${problem.defaultCommentsPt}" />
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
    $(function() {
		$("[data-toggle='tooltip']").tooltip();

		$(".text").each(function() {
			if ("${locale}" == $(this).data("language")) {
				$(this).removeClass("hide");
			} else {
				$(this).addClass("hide");
			}
		});

		$(".change-language").click(function() {
			lang = $(this).data("language");
			$(".text").each(function() {
				if (lang == $(this).data("language")) {
					$(this).removeClass("hide");
				} else {
					$(this).addClass("hide");
				}
			});
		});
	});
    $("#language-select").change(function() {
        $(".limit").addClass("hidden");
        $(".limit.lang" + $(this).val()).removeClass("hidden");

    });
</script>