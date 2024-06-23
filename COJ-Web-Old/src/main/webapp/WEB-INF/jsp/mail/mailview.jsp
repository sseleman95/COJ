<%@include file="/WEB-INF/jsp/include/include.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h2 class="postheader">
    <c:choose>
        <c:when test="${usermail.inmail == true}">
            <spring:message code="pagehdr.mailmsg" />
        </c:when>
        <c:when test="${usermail.send == true}">
            <spring:message code="pagehdr.mailmsg" />
        </c:when>
        <c:otherwise>
            <spring:message code="pagehdr.maildraft" />
        </c:otherwise>
    </c:choose>

</h2>
<div class="postcontent">
    <c:choose>
        <c:when test="${available == true}">
            <c:choose>
                <c:when test="${usermail.inmail == true}">
                    <div class="panel panel-primary">

                        &nbsp;<a
                            href="<c:url value="composemail.xhtml?reply=${usermail.idmail}"/>"
                            class="mailheader"><i class="fa fa-mail-reply"></i> <spring:message
                                code="link.reply" />&nbsp;&nbsp;&nbsp;</a>
                        <a
                            href="<c:url value="composemail.xhtml?reply=${usermail.idmail}&all=true"/>"
                            class="mailheader"><i class="fa fa-mail-reply-all"></i> <spring:message
                                code="link.replyall" />&nbsp;&nbsp;&nbsp;</a>
                        <a
                            href="<c:url value="composemail.xhtml?reply=${usermail.idmail}&fwd=true"/>"
                            class="mailheader"><i class="fa fa-mail-forward"></i> <spring:message
                                code="link.forward" />&nbsp;&nbsp;&nbsp;</a>
                        <a
                            href="<c:url value="markunread.xhtml?idmail=${usermail.idmail}"/>"
                            class="mailheader"><i class="fa fa-envelope-o"></i> <spring:message
                                code="link.markunread" />&nbsp;&nbsp;&nbsp;</a>

                        <a href="#" class="mailheader" onclick="confirm_delete('<c:url value="deletemail.xhtml?idmail=${usermail.idmail}"/>')"><i class="fa fa-trash"></i> <spring:message code="link.delete" />&nbsp;&nbsp;&nbsp;</a>

                        <a href="<c:url value="inbox.xhtml"/>"
                           class="mailheader"><i class="fa fa-close"></i> <spring:message
                                code="link.close" />&nbsp;&nbsp;&nbsp;</a>

                    </div>

                    <table class="msgheader">
                        <tr>
                            <td style="align: right" width="10%"><b><spring:message
                                        code="fieldhdr.from" />:</b></td>
                            <td style="padding-left: 20px; display: inherit;" style="align:left">${usermail.id_from}</td>
                        </tr>
                        <tr>
                            <td style="align: right"><b><spring:message
                                        code="fieldhdr.to" />:</b></td>
                            <td style="padding-left: 20px; display: inherit;" style="align:left">
                                <c:forEach
                                    items="${usermail.to}" var="to">
                                    ${to}
                                </c:forEach></td>
                        </tr>
                        <tr>
                            <td style="align: right"><b><spring:message
                                        code="fieldhdr.received" />:</b></td>
                            <td style="padding-left: 20px; display: inherit;" style="align:left"><fmt:formatDate
                                    pattern="yyyy-MM-dd HH:mm:ss" value="${usermail.date}" /></td>
                        </tr>
                        <tr>
                            <td style="align: right"><b><spring:message
                                        code="fieldhdr.subject" />:</b></td>
                            <td style="padding-left: 20px; display: inherit;" style="align:left"><c:out
                                    value="${usermail.title}" /></td>
                        </tr>
                    </table>
                    <hr />
                    ${usermail.content}
                </c:when>
                <c:when test="${usermail.send == true}">
                    <div class="panel panel-primary">
                        <a
                            href="<c:url value="composemail.xhtml?isend=${usermail.idmail}&all=true"/>"
                            class="mailheader"><i class="fa fa-mail-reply-all"></i>&nbsp;<spring:message
                                code="link.replyall" /></a> <a
                            href="<c:url value="composemail.xhtml?isend=${usermail.idmail}&fwd=true"/>"
                            class="mailheader"><i class="fa fa-mail-forward"></i>&nbsp;<spring:message
                                code="link.forward" /></a> <a
                            href="<c:url value="deletemail.xhtml?send=${usermail.idmail}"/>"
                            class="mailheader"><i class="fa fa-trash"></i>&nbsp;<spring:message
                                code="link.delete" /></a> <a href="<c:url value="outbox.xhtml"/>"
                                class="mailheader"><i class="fa fa-close"></i>&nbsp;<spring:message
                                code="link.close" /></a>
                    </div>
                    <table class="msgheader">
                        <tr>
                            <td style="align: right" width="10%"><b><spring:message
                                        code="fieldhdr.to" />:</b></td>
                            <td style="padding-left: 20px;" style="align:left"><c:forEach
                                    items="${usermail.to}" var="to">
                                    ${to}
                                </c:forEach></td>
                        </tr>
                        <tr>
                            <td style="align: right"><b><spring:message
                                        code="fieldhdr.sent" />:</b></td>
                            <td style="padding-left: 20px;" style="align:left"><fmt:formatDate
                                    pattern="yyyy-MM-dd HH:mm:ss" value="${usermail.date}" /></td>
                        </tr>
                        <tr>
                            <td style="align: right"><b><spring:message
                                        code="fieldhdr.subject" />:</b></td>
                            <td style="padding-left: 20px;" style="align:left"><c:out
                                    value="${usermail.title}" /></td>
                        </tr>
                    </table>
                    <hr />
                    ${usermail.content}
                </c:when>
                <c:otherwise>
                    <div class="panel panel-primary">
                        <%--&nbsp;<a href="<c:url value="composemail.xhtml?draft=${usermail.idmail}"/>" class="mailheader"><i class="fa fa-edit"></i>&nbsp;<spring:message code="link.edit" /></a>--%>
                        &nbsp;<a href="<c:url value="deletemail.xhtml?draft=${usermail.idmail}"/>" class="mailheader"><i class="fa fa-trash"></i>&nbsp;<spring:message code="link.delete" /></a>
                        &nbsp;<a href="<c:url value="draft.xhtml"/>" class="mailheader"><i class="fa fa-close">&nbsp;</i><spring:message code="link.close" /></a>
                    </div>
                    <table class="msgheader">
                        <tr>
                            <td style="align: right"><b><spring:message code="titval.saved" />:</b></td>
                            <td style="padding-left: 20px;" style="align:left"><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${usermail.date}" /></td>
                        </tr>
                        <tr>
                            <td style="align: right"><b><spring:message code="fieldhdr.subject" />:</b></td>
                            <td style="padding-left: 20px;" style="align:left"><c:out value="${usermail.title}" /></td>
                        </tr>
                    </table>
                    <hr />
                    ${usermail.content}

                </div>
            </c:otherwise>
        </c:choose>

            <link href="/css/bootstrap-dialog.min.css" rel="stylesheet" type="text/css" />
            <script src="/js/bootstrap-dialog.min.js"></script>
            <script src="/js/admin/utility.js"></script>

            <script>
                var i18n = {};
                i18n.title = "<spring:message code="message.confirm.delete.hdr.entry"/>";
                i18n.message = "<spring:message code="message.confirm.delete.entry"/>";
                i18n.btn_cancel = "<spring:message code="btn.text.cancel"/>";
                i18n.btn_accept = "<spring:message code="btn.text.accept"/>";
            </script>
    </c:when>
    <c:otherwise>
        <div class="error">The resource is not available or you are not
            allow to see it</div>
        </c:otherwise>
    </c:choose>
</div>