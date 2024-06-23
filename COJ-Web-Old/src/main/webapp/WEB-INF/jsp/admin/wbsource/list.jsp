<%--
  User: alison
  Date: 13/01/16
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/jsp/include/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<link rel="stylesheet" href="<c:url value="/css/confirm-message.css"/>"
      type="text/css" media="screen"/>

<h2 class="postheader">
    <spring:message code="page.general.admin.header"/>: <spring:message code="psource.title"/>
</h2>

<div class="postcontent">
    <c:if test="${message != null}">
        <div class="alert alert-success alert-dismissable fade in">
            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
            <i class="fa fa-check"></i><spring:message code="${message}"/>
        </div>
    </c:if>

    <a class="btn btn-primary"
       href='<c:url value="/admin/addsource.xhtml"/>'> <spring:message
            code="pagehdr.create.source"/>
    </a>


    <br/>

    <div id="display-table-container"
         data-reload-url="/admin/tables/managesources.xhtml">
    </div>
    <div class="coj_float_rigth">
        <a href="/admin/index.xhtml" class="btn btn-primary">
            <spring:message code="button.close" />
        </a>
    </div>
    <div class="clearfix"></div>
</div>
<script>
    $(document).ready(displayTableReload(" "));
</script>

<link href="/css/bootstrap-dialog.min.css" rel="stylesheet" type="text/css"/>
<script src="/js/bootstrap-dialog.min.js"></script>
<script src="/js/admin/utility.js"></script>

<script>
    $("[data-toggle='tooltip']").tooltip();
    var i18n = {};
    i18n.title = "<spring:message code="message.confirm.delete.hdr.entry"/>";
    i18n.message = "<spring:message code="message.confirm.delete.entry"/>";
    i18n.btn_cancel = "<spring:message code="btn.text.cancel"/>";
    i18n.btn_accept = "<spring:message code="btn.text.accept"/>";
</script>