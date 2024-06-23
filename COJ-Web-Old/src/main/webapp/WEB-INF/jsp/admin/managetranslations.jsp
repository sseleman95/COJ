<%@include file="/WEB-INF/jsp/include/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<link rel="stylesheet" href="<c:url value="/css/confirm-message.css"/>" type="text/css" media="screen"/>

<h2 class="postheader">
    <fmt:message key="page.general.admin.header"/>: <fmt:message key="tablehdr.translations"/>
</h2>

<div class="postcontent">
    <!-- article-content -->
    <div class="row">
        <div class="col-xs-12">
            <form:form action="/admin/tables/managetranslations.xhtml" method="get" id="filter-form"
                       class="form-inline">
                <div class="form-group coj_float_rigth">
                    <input class="form-control" placeholder="<spring:message code="fieldhdr.user" />"
                           type="text" name="username" value="${username}" size="12"/>
                    <input id="pid" class="form-control" placeholder="<spring:message code="fieldhdr.prob" />"
                           type="text" name="pid" maxlength="9" size="10"/>
                    <select class="form-control" name="locale" title="<spring:message code="fieldhdr.idioma" />"
                            data-toggle="tooltip">
                        <option value="all"><spring:message code="fieldhdr.all"/></option>
                        <option value="en">en</option>
                        <option value="es">es</option>
                        <option value="pt">pt</option>
                    </select>
                    <input class="btn btn-primary" type="submit" id="filter-button"
                           value="<spring:message code="button.filter"/>"/>
                </div>

            </form:form>
        </div>
    </div>
    <br/>
    <c:if test="${message != null}">
        <div class="alert alert-success alert-dismissable fade in">
            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
            <i class="fa fa-check"></i><spring:message code="${message}"/>
        </div>
    </c:if>
    <div id="display-table-container" data-reload-url="/admin/tables/managetranslations.xhtml"></div>
    <!-- /article-content -->
    <div class="coj_float_rigth">
        <a href="/admin/index.xhtml" class="btn btn-primary">
            <spring:message code="button.close"/>
        </a>
    </div>
    <div class="clearfix"></div>
</div>

<script>
    $(document).ready(function () {
        $('#pid').numeric();
    });
    $(initStandardFilterForm);

    $("[data-toggle='tooltip']").tooltip();
</script>