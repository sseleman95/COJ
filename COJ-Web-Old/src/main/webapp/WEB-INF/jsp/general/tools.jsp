<%@include file="/WEB-INF/jsp/include/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page buffer="16kb" autoFlush="true" %>

<h2 class="postheader">
    <spring:message code="pagehdr.tools"/>
</h2>

<div class="postcontent clearfix">
    <!-- article-content -->


    <%-- <li>
         <a href="/datagen/datasets.xhtml?mode=customsol"><spring:message code="text.tools.1"/></a>
     </li>--%>

        <%--  <li>
              <a href="/services/specification.xhtml"><spring:message code="text.tools.2"/></a>
          </li>
  --%>
        <div class="col-xs-3">
            <a class="clearfix" href="/general/docs.xhtml"><i title="<spring:message code="text.tools.2"/>"
                                                              data-toggle="tooltip"
                                                              class="fa fa-exchange fa-5x"></i></a>
            <label><spring:message code="text.tools.2"/></label>
        </div>

           <div class="col-xs-3">
               <a class="clearfix" href="/downloads/COJ_Mobile.apk"><i
                       title="<spring:message code="text.tools.7"/>" data-toggle="tooltip"
                       class="fa fa-mobile fa-5x"></i></a>
               <label><spring:message code="text.tools.7"/></label>
           </div>
        <div class="col-xs-3">
            <a class="clearfix" href="/poll/list.xhtml"> <i title="<spring:message code="text.tools.3"/>"
                                                            data-toggle="tooltip" class="fa fa-pencil fa-5x"></i></a>
            <label><spring:message code="text.tools.3"/></label>
        </div>

           <div class="col-xs-3">
               <a class="clearfix" href="/downloads/COJ_Manual_Usuario.pdf"><i
                       title="<spring:message code="text.tools.5"/>" data-toggle="tooltip"
                       class="fa fa-question fa-5x"></i></a>
               <label><spring:message code="text.tools.5"/></label>
           </div>
           <div class="col-xs-3">
            <a class="clearfix" href="<c:url value="/general/mapsite.xhtml" />"><i
                    title="<spring:message code="text.tools.6"/>" data-toggle="tooltip"
                    class="fa fa-sitemap fa-5x"></i></a>
            <label><spring:message code="text.tools.6"/></label>
           </div>

           <div class="col-xs-3">
               <a href="/wboard/contests.xhtml" class="clearfix">
                   <img alt="COJboard"  style="height: 70px; width: 60px;" title="" data-toggle="tooltip" src="/images/avatars/COJboard"
                        data-original-title="COJboard">
               </a>
               <label>COJboard</label>
           </div>


    <authz:authorize ifAnyGranted="ROLE_ADMIN,ROLE_COACH">
        <div class="col-xs-3">
            <a href="/teamanalyzer/main.xhtml" class="clearfix">
                <i title=" <spring:message code="text.tools.8"/>" data-toggle="tooltip"
                   class="fa fa-users fa-5x"></i>

            </a>
            <label><spring:message code="text.tools.8"/></label>
        </div>
    </authz:authorize>

    <!-- /article-content -->
</div>
<script>
    $(function () {
        $("[data-toggle='tooltip']").tooltip();
    });
</script>
