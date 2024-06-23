<%@page import="cu.uci.coj.utils.Utils" %>
<%@include file="/WEB-INF/jsp/include/include.jsp" %>

<div class="row header">

    <div class="headercss">

        <a href="/index.xhtml">
            <div class="headerlf">
                <div class="headerleft">
                    <div class="logoc">C</div>
                    <div class="logoo">O</div>
                    <div class="logoj">J</div>
                </div>

                <div class="slogan"><spring:message code="header.thinkingbetter"/></div>
            </div>
            <div class="headerrigth">
                <span class="bannername">Caribbean Online Judge</span>
            </div>
        </a>

        <div class="i18n">
            <%
                String url = null;
                if (request.getQueryString() == null) {
                    url = request.getAttribute("javax.servlet.forward.request_uri")
                            .toString();
                } else {
                    url = request.getAttribute("javax.servlet.forward.request_uri")
                            .toString() + "?" + request.getQueryString();
                }
                String url_en = Utils.addParameter(url, "lang=en");
                String url_es = Utils.addParameter(url, "lang=es");
                String url_pt = Utils.addParameter(url, "lang=pt");
            %>
            <a href="<%=url_en%>"><img data-toggle="tooltip" data-placement="bottom"
                                       src="<c:url value="/images/i18n/en.png"/>"
                                       alt="<spring:message code="altval.en"/>"
                                       title="<spring:message code="titval.en"/>" class="image"/></a>
            <a href="<%=url_es%>"><img data-toggle="tooltip" data-placement="bottom"
                                        src="<c:url value="/images/i18n/es.png"/>"
                                        alt="<spring:message code="altval.es"/>"
                                        title="<spring:message code="titval.es"/>" class="image"/></a>
			<a href="<%=url_pt%>"><img data-toggle="tooltip" data-placement="bottom"
                                        src="<c:url value="/images/i18n/pt.png"/>"
                                        alt="<spring:message code="altval.pt"/>"
                                        title="<spring:message code="titval.pt"/>" class="image"/></a>
<%--             <a href="<%=url_pt%>"><img src="<c:url value="/images/i18n/pt.png"/>" alt="<spring:message code="altval.pt"/>" title="<spring:message code="titval.pt"/>" class="image" /></a> --%>
        </div>

        <div class="zoom">
            <a target="_blank" href="/downloads/COJ_Manual_Usuario.pdf" title="<spring:message code="text.tools.5"/>" data-toggle="tooltip"><i class="fa fa-question"></i></a>
            <a href="<c:url value="/general/mapsite.xhtml"/>" title="<spring:message code="text.tools.6"/>" data-toggle="tooltip"><i class="fa fa-sitemap"></i></a>
          <%--  <a href="#" onclick="subzoom();"><i class="fa fa-search-minus"></i></a>
            <a href="#" onclick="addzoom();"><i class="fa fa-search-plus"></i></a>--%>
        </div>
    </div>
</div>


</div>
<c:if test="${maintenanceMode}">
    <div class="panel panel-info">
        <h5>&nbsp;<span class="red"> <i class="fa fa-2x fa-warning"></i></span>&nbsp;<spring:message
                code="maintenance.announcement"/></h5>
    </div>
</c:if>
<c:if test="${hasann == true}">
    <div class="panel panel-info">
        <c:forEach items="${ann}" var="an">
            &nbsp;<span class="red"> <i class="fa fa-info-circle"></i></span>&nbsp;${an}
        </c:forEach>
    </div>
</c:if>

<div class="nav-menu">
    <div class="col-xs-12">
        <div class="pull-right servertime">

            <fmt:formatDate value="${now}" dateStyle="long"/>
            -
            <fmt:formatDate value="${now}" pattern="HH:mm:ss" type="time"/>
        </div>



        <div class="pull-left">
            <ul class="menu" id="${idpage}">

                <li <c:if test="${idpage == 'home'}"> class="item-menu-selected" </c:if>>
                    <a href="<c:url value="/index.xhtml"/>">
                        <span class="t"><i class="fa fa-home"></i>
                            &nbsp;<fmt:message key="link.home"/>
                        </span>
                    </a>
                </li>
                <li <c:if test="${idpage == 'downloads'}"> class="item-menu-selected" </c:if>>
                    <a href="<c:url value="/general/downloads.xhtml"/>">
                        <span class="t"><i class="fa fa-download"></i>
                            &nbsp;<fmt:message key="link.downloads"/>
                        </span>
                    </a>
                </li>
                <li <c:if test="${idpage == 'tools'}"> class="item-menu-selected" </c:if>>
                    <a href="<c:url value="/general/tools.xhtml"/>">
                        <span class="t"><i class="fa fa-wrench"></i>
                            &nbsp;<fmt:message key="link.tools"/>
                        </span>
                    </a>
                </li>
                <li <c:if test="${idpage == 'cojforum'}"> class="item-menu-selected" </c:if>>
                    <a href="http://coj-forum.uci.cu" target="new">
                        <span class="t"><i class="fa fa-comments"></i>
                            &nbsp;<fmt:message key="link.forum"/>
                        </span>
                    </a>
                </li>
                <li <c:if test="${idpage == 'faqs'}"> class="item-menu-selected" </c:if>>
                    <a href="<c:url value="/general/faqs.xhtml"/>">
                        <span class="t"><i class="fa fa-question-circle"></i>
                            &nbsp;<fmt:message key="link.faq"/>
                        </span>
                    </a>
                </li>
                <li <c:if test="${idpage == 'links'}"> class="item-menu-selected" </c:if>>
                    <a href="<c:url value="/general/links.xhtml"/>">
                        <span class="t"><i class="fa fa-link"></i>
                            &nbsp;<fmt:message key="link.links"/>
                        </span>
                    </a>
                </li>
                <li <c:if test="${idpage == 'about'}"> class="item-menu-selected" </c:if>>
                    <a href="<c:url value="/general/about.xhtml"/>">
                        <span class="t"><i class="fa fa-info-circle"></i>
                            &nbsp;<fmt:message key="link.about"/>
                        </span>
                    </a>
                </li>
                <li <c:if test="${idpage == 'contact'}"> class="item-menu-selected" </c:if>>
                    <a href="<c:url value="/general/contact.xhtml"/>">
                        <span class="t"><i class="fa fa-envelope"></i>
                            &nbsp;<fmt:message key="link.contactus"/>
                        </span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</div>


<script>
    $("[data-toggle='tooltip']").tooltip();
</script>
