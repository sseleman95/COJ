<%--
  User: alison
  Date: 13/01/16
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/jsp/include/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<div class="row">
    <div class="col-xs-10">

        <form:form method="post"
                   commandName="problemSource" cssClass="form-horizontal">

            <legend>
                <h2><spring:message code="page.general.admin.header"/>: <spring:message
                        code="page.header.admin.source.create"/></h2>
            </legend>

            <tiles:insertAttribute name="form"/>

            <div class="form-actions pull-right">
                <input class="btn btn-primary" type="submit" name="submit"
                       id="submit" value="<spring:message code="button.create"/>"/> <input
                    class="btn btn-primary" type="reset" name="reset" id="reset"
                    value="<spring:message code="button.reset"/>"/>
                <a class="btn btn-primary" href="<c:url value="/admin/managesources.xhtml"/>"><spring:message
                        code="button.close"/></a>
            </div>
        </form:form>

    </div>
</div>