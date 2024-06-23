<%@include file="/WEB-INF/jsp/include/include.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page buffer="16kb" autoFlush="true"%>


<h2 class="postheader">
	<spring:message code="pagehdr.admin" />
</h2>
<div class="postcontent">
	<authz:authorize ifAnyGranted="ROLE_ADMIN">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<spring:message code="tableval.users" />
						<div class="badge pull-right">
							<a data-toggle="collapse" href="#gUsers"><i data-toggle="tooltip"
								class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div id="gUsers" class="panel-body collapse in">
						<div>

							<authz:authorize ifAnyGranted="ROLE_ADMIN">
								<div id="userStatus" class="panel-body collapse in">
									<ul class="list-inline">
										<c:if test="${not empty userStatus[0]['status']}">
											<li><label class="label bg${userStatus[0]['status']}"><spring:message code="status.${userStatus[0]['status']}" />&nbsp;${userStatus[0]['count']}</label></li>
										</c:if>
										<c:if test="${not empty userStatus[1]['status']}">
											<li><label class="label bg${userStatus[1]['status']}"><spring:message code="status.${userStatus[1]['status']}" />&nbsp;${userStatus[1]['count']}</label></li>
										</c:if>
										<c:if test="${not empty userStatus[2]['status']}">
											<li><label class="label bg${userStatus[2]['status']}"><spring:message code="status.${userStatus[2]['status']}" />&nbsp;${userStatus[2]['count']}</label></li>
										</c:if>
										<c:if test="${not empty userStatus[3]['status']}">
											<li><label class="label bg${userStatus[3]['status']}"><a
													class="white status"
													data-status="${userStatus[3]['status']}"><i data-toggle="tooltip"
														class="fa fa-bell"></i></a></label>&nbsp;<label
												class="label bg${userStatus[3]['status']}"><spring:message code="status.${userStatus[3]['status']}" />&nbsp;${userStatus[3]['count']}</label></li>
										</c:if>
										<c:if test="${not empty userStatus[4]['status']}">
											<li><label class="label bg${userStatus[4]['status']}"><a
													class="white status"
													data-status="${userStatus[4]['status']}"><i data-toggle="tooltip"
														class="fa fa-bell"></i></a></label>&nbsp;<label
												class="label bg${userStatus[4]['status']}"><spring:message code="status.${userStatus[4]['status']}" />&nbsp;${userStatus[4]['count']}</label></li>
										</c:if>
									</ul>
								</div>

								<div class="col-xs-4">
									<a href="<c:url value="manageactivations.xhtml" />"
										title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
										class="fa fa-gear"></i>&nbsp;<spring:message
											code="tableval.activations" /></a>
								</div>
								<div class="col-xs-4">
									<a href="<c:url value="manageusers.xhtml" />"
										title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
										class="fa fa-gear"></i>&nbsp;<spring:message
											code="tableval.users" /></a>
								</div>
								<div class="col-xs-4">
									<a href="<c:url value="sessions.xhtml" />"
										title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
										class="fa fa-gear"></i>&nbsp;<spring:message
											code="tableval.systemsessions" /></a>
								</div>
							</authz:authorize>
						</div>
					</div>
				</div>
			</div>
		</div>
	</authz:authorize>
	<authz:authorize
		ifAnyGranted="ROLE_ADMIN,ROLE_PSETTER,ROLE_SUPER_PSETTER">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<spring:message code="tableval.problems" />
						<div class="badge pull-right">
							<a data-toggle="collapse" href="#gProblems"><i
								class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div id="gProblems" class="panel-body collapse in">
						<authz:authorize
							ifAnyGranted="ROLE_ADMIN,ROLE_PSETTER,ROLE_SUPER_PSETTER">
							<div class="col-xs-4">
								<a href="<c:url value="adminproblems.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.problems" /></a>
							</div>
							<div class="col-xs-4">
								<a href="<c:url value="manageproblemclassification.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.probclassif" /></a>
							</div>
							<div class="col-xs-4">
								<a href="<c:url value="managesources.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.sources" /></a>
							</div>
						</authz:authorize>
						<authz:authorize ifAnyGranted="ROLE_ADMIN,ROLE_SUPER_PSETTER">
							<div class="col-xs-4">
								<a href="<c:url value="manageclassifications.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.tags" /></a>
							</div>
						</authz:authorize>
						<authz:authorize ifAnyGranted="ROLE_ADMIN,ROLE_TRANSLATOR">
							<div class="col-xs-4">
								<a href="<c:url value="managetranslations.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.translations" /></a>
							</div>
						</authz:authorize>
					</div>
				</div>
			</div>
		</div>
	</authz:authorize>
	<authz:authorize ifAnyGranted="ROLE_ADMIN">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<spring:message code="tableval.contests" />
						<div class="badge pull-right">
							<a data-toggle="collapse" href="#gContests"><i data-toggle="tooltip"
								class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div id="gContests" class="panel-body collapse in">
						<authz:authorize ifAnyGranted="ROLE_ADMIN">
							<div class="col-xs-4">
								<a href="<c:url value="admincontests.xhtml?access=all" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.rcontests" /></a>
							</div>

							<%--<div class="col-xs-4">
								<a href="<c:url value="virtualcontests.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.vcontests" /></a>
							</div>--%>

							<div class="col-xs-4">
								<a href="<c:url value="manageteams.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.teams"/></a>
							</div>
						</authz:authorize>
					</div>
				</div>
			</div>
		</div>
	</authz:authorize>
	<authz:authorize ifAnyGranted="ROLE_ADMIN">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<spring:message code="tableval.submits" />
						<div class="badge pull-right">
							<a data-toggle="collapse" href="#gSubmits"><i data-toggle="tooltip"
								class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div id="gSubmits" class="panel-body collapse in">
						<authz:authorize ifAnyGranted="ROLE_ADMIN">
							<div class="col-xs-4">
								<a href="<c:url value="managesubmissions.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.submissions" /></a>
							</div>
						</authz:authorize>

					</div>
				</div>
			</div>
		</div>
	</authz:authorize>
	<authz:authorize ifAnyGranted="ROLE_ADMIN,ROLE_FILE_MANAGER">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<spring:message code="tableval.misc" />
						<div class="badge pull-right">
							<a data-toggle="collapse" href="#gMisc"><i data-toggle="tooltip"
								class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div id="gMisc" class="panel-body collapse in">
						<authz:authorize ifAnyGranted="ROLE_ADMIN">
							<div class="col-xs-4">
								<a href="<c:url value="listann.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.announcements" /></a>
							</div>
						</authz:authorize>
						<authz:authorize ifAnyGranted="ROLE_ADMIN">
							<div class="col-xs-4">
								<a href="<c:url value="notify.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.mailnotify" /></a>
							</div>
						</authz:authorize>

						<authz:authorize ifAnyGranted="ROLE_ADMIN,ROLE_FILE_MANAGER">
							<div class="col-xs-4">
								<a href="<c:url value="files/list.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.files" /></a>
							</div>
						</authz:authorize>
						<authz:authorize ifAnyGranted="ROLE_ADMIN">
							<div class="col-xs-4">
								<a href="<c:url value="programminglanguages.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.proglanguages" /></a>
							</div>
							<div class="col-xs-4">
								<a href="<c:url value="faqs.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.faq" /></a>
							</div>
						</authz:authorize>
						<authz:authorize ifAnyGranted="ROLE_ADMIN">

							<div class="col-xs-4">
								<a href="<c:url value="manageinstitutions.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.institutions" /></a>
							</div>

							<div class="col-xs-4">
								<a href="<c:url value="managecountries.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.countries" /></a>
							</div>

							<%--<div class="col-xs-4">
								<a href="<c:url value="manageplagicoj.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.plagicoj" /></a>
							</div>--%>

							<div class="col-xs-4">
								<a href="<c:url value="correct/managecorrections.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.corrections" /></a>
							</div>
						</authz:authorize>
						<authz:authorize ifAnyGranted="ROLE_ADMIN">
							<div class="col-xs-4">
								<a href="<c:url value="poll/list.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.polls" /></a>
							</div>
						</authz:authorize>
						<authz:authorize ifAnyGranted="ROLE_ADMIN,ROLE_ENTRIES_MANAGER">
							<div class="col-xs-4">
								<a href="<c:url value="/admin/manageentries.xhtml" />"
									title="<spring:message code="titval.entries"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.entries" /></a>
							</div>
						</authz:authorize>
					</div>
				</div>
			</div>
		</div>
	</authz:authorize>
	<authz:authorize ifAnyGranted="ROLE_ADMIN">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<spring:message code="tableval.configuration" />
						<div class="badge pull-right">
							<a data-toggle="collapse" href="#gConfiguration"><i data-toggle="tooltip"
								class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div id="gConfiguration" class="panel-body collapse in">
						<authz:authorize ifAnyGranted="ROLE_ADMIN">
							<div class="col-xs-4">
								<a href="<c:url value="listlog.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.systemlogs" /></a>
							</div>
							<div class="col-xs-4">
								<a href="<c:url value="globalflags.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.globflags" /></a>
							</div>
							<div class="col-xs-4">
								<a href="<c:url value="globalaccessrules.xhtml" />"
									title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
									class="fa fa-gear"></i>&nbsp;<spring:message
										code="tableval.gar" /></a>
							</div>
						</authz:authorize>
					</div>
				</div>
			</div>
		</div>
	</authz:authorize>
	<authz:authorize ifAnyGranted="ROLE_ADMIN">
		<div class="row">
			<div class="col-xs-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<spring:message code="text.admin.wboard" />
						<div class="badge pull-right">
							<a data-toggle="collapse" href="#gWebBoard"><i data-toggle="tooltip"
								class="fa fa-chevron-up"></i></a>
						</div>
					</div>
					<div id="gWebBoard" class="panel-body collapse in">
						<div class="col-xs-4">
							<a href="<c:url value="manageparsers.xhtml" />"
								><i data-toggle="tooltip" title="<spring:message code="titval.manage"/>"
								class="fa fa-gear"></i>&nbsp;<spring:message
									code="tableval.parsers" /></a>
						</div>
						<div class="col-xs-4">
							<a href="<c:url value="/admin/wboard/site/list.xhtml" />"
								title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
								class="fa fa-gear"></i>&nbsp;<spring:message
									code="tableval.sites" /></a>
						</div>
						<div class="col-xs-4">
							<a href="<c:url value="/admin/wboard/contest/list.xhtml" />"
								title="<spring:message code="titval.manage"/>"><i data-toggle="tooltip"
								class="fa fa-gear"></i>&nbsp;<spring:message
									code="tableval.contests" /></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</authz:authorize>
</div>

<script>
	$("[data-toggle='tooltip']").tooltip();
</script>

<script>
	$("a.status").on("click", function(event) {
		var caller = $(this);
		var status = $(this).data("status");
		$.ajax({
			type : "POST",
			url : "/admin/wakeup.json",
			data : {
				"status" : status
			},
			beforeSend : function() {
				caller.html('<i class="fa fa-circle-o-notch fa-spin" data-toggle="tooltip"></i>');
			},
			success : function(data) {
				caller.html('<i class="fa fa-bell" data-toggle="tooltip"></i>');
			}
		});
		event.preventDefault();

	});
	$("[data-toggle='tooltip']").tooltip();
</script>
