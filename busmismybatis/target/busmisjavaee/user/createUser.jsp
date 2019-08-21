<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>AdminLTE 2 | Dashboard</title>
		
		

	<%@ include file="../include/jsTop.jsp" %>


	</head>
	<body class="hold-transition skin-blue sidebar-mini">
		<div class="wrapper">


			<%@ include file="../include/head.jsp" %>



			<%@ include file="../include/left.jsp" %>




			<!-- Content Wrapper. Contains page content -->
			<div class="content-wrapper">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">创建用户</h3>
					</div>
					<!-- /.box-header -->
					<!-- form start -->
					<form role="form" action=tocreateUser.do method="get">
						<div class="box-body">
							<div class="form-group">
								<label for="exampleInputEmail1">用户ID</label>
								<input type="text" class="form-control" id="exampleInputEmail1" placeholder="输入ID" name="userid">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">用户名</label>
								<input type="text" class="form-control" id="exampleInputEmail1" placeholder="输入用户名" name="username">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">密码</label>
								<input type="password" class="form-control" id="exampleInputPassword1" placeholder="输入密码" name="userpassword">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">用户Role</label>
								<input type="text" class="form-control" id="exampleInputEmail1" placeholder="输入Role" name="userrole">
							</div>

						</div>
						<!-- /.box-body -->

						<div class="box-footer">
							<button type="submit" class="btn btn-primary">确认</button>
						</div>
					</form>
				</div>
			</div>
			<!-- /.content-wrapper -->
			<footer class="main-footer">
				<div class="pull-right hidden-xs">
					<b>Version</b> 2.4.0
				</div>
				<strong>Copyright &copy; 2014-2016 <a href="https://adminlte.io">Almsaeed Studio</a>.</strong> All rights
				reserved.
			</footer>

			<!-- Control Sidebar -->
			<aside class="control-sidebar control-sidebar-dark">
				<!-- Create the tabs -->
				<ul class="nav nav-tabs nav-justified control-sidebar-tabs">
					<li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
					<li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
				</ul>
				<!-- Tab panes -->
				<div class="tab-content">
					<!-- Home tab content -->
					<div class="tab-pane" id="control-sidebar-home-tab">
						<h3 class="control-sidebar-heading">Recent Activity</h3>
						<ul class="control-sidebar-menu">
							<li>
								<a href="javascript:void(0)">
									<i class="menu-icon fa fa-birthday-cake bg-red"></i>

									<div class="menu-info">
										<h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

										<p>Will be 23 on April 24th</p>
									</div>
								</a>
							</li>
							<li>
								<a href="javascript:void(0)">
									<i class="menu-icon fa fa-user bg-yellow"></i>

									<div class="menu-info">
										<h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>

										<p>New phone +1(800)555-1234</p>
									</div>
								</a>
							</li>
							<li>
								<a href="javascript:void(0)">
									<i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

									<div class="menu-info">
										<h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>

										<p>nora@example.com</p>
									</div>
								</a>
							</li>
							<li>
								<a href="javascript:void(0)">
									<i class="menu-icon fa fa-file-code-o bg-green"></i>

									<div class="menu-info">
										<h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>

										<p>Execution time 5 seconds</p>
									</div>
								</a>
							</li>
						</ul>
						<!-- /.control-sidebar-menu -->

						<h3 class="control-sidebar-heading">Tasks Progress</h3>
						<ul class="control-sidebar-menu">
							<li>
								<a href="javascript:void(0)">
									<h4 class="control-sidebar-subheading">
										Custom Template Design
										<span class="label label-danger pull-right">70%</span>
									</h4>

									<div class="progress progress-xxs">
										<div class="progress-bar progress-bar-danger" style="width: 70%"></div>
									</div>
								</a>
							</li>
							<li>
								<a href="javascript:void(0)">
									<h4 class="control-sidebar-subheading">
										Update Resume
										<span class="label label-success pull-right">95%</span>
									</h4>

									<div class="progress progress-xxs">
										<div class="progress-bar progress-bar-success" style="width: 95%"></div>
									</div>
								</a>
							</li>
							<li>
								<a href="javascript:void(0)">
									<h4 class="control-sidebar-subheading">
										Laravel Integration
										<span class="label label-warning pull-right">50%</span>
									</h4>

									<div class="progress progress-xxs">
										<div class="progress-bar progress-bar-warning" style="width: 50%"></div>
									</div>
								</a>
							</li>
							<li>
								<a href="javascript:void(0)">
									<h4 class="control-sidebar-subheading">
										Back End Framework
										<span class="label label-primary pull-right">68%</span>
									</h4>

									<div class="progress progress-xxs">
										<div class="progress-bar progress-bar-primary" style="width: 68%"></div>
									</div>
								</a>
							</li>
						</ul>
						<!-- /.control-sidebar-menu -->

					</div>
					<!-- /.tab-pane -->
					<!-- Stats tab content -->
					<div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
					<!-- /.tab-pane -->
					<!-- Settings tab content -->
					<div class="tab-pane" id="control-sidebar-settings-tab">
						<form method="post">
							<h3 class="control-sidebar-heading">General Settings</h3>

							<div class="form-group">
								<label class="control-sidebar-subheading">
									Report panel usage
									<input type="checkbox" class="pull-right" checked>
								</label>

								<p>
									Some information about this general settings option
								</p>
							</div>
							<!-- /.form-group -->

							<div class="form-group">
								<label class="control-sidebar-subheading">
									Allow mail redirect
									<input type="checkbox" class="pull-right" checked>
								</label>

								<p>
									Other sets of options are available
								</p>
							</div>
							<!-- /.form-group -->

							<div class="form-group">
								<label class="control-sidebar-subheading">
									Expose author name in posts
									<input type="checkbox" class="pull-right" checked>
								</label>

								<p>
									Allow the user to show his name in blog posts
								</p>
							</div>
							<!-- /.form-group -->

							<h3 class="control-sidebar-heading">Chat Settings</h3>

							<div class="form-group">
								<label class="control-sidebar-subheading">
									Show me as online
									<input type="checkbox" class="pull-right" checked>
								</label>
							</div>
							<!-- /.form-group -->

							<div class="form-group">
								<label class="control-sidebar-subheading">
									Turn off notifications
									<input type="checkbox" class="pull-right">
								</label>
							</div>
							<!-- /.form-group -->

							<div class="form-group">
								<label class="control-sidebar-subheading">
									Delete chat history
									<a href="javascript:void(0)" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
								</label>
							</div>
							<!-- /.form-group -->
						</form>
					</div>
					<!-- /.tab-pane -->
				</div>
			</aside>
			<!-- /.control-sidebar -->
			<!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
			<div class="control-sidebar-bg"></div>
		</div>
		<!-- ./wrapper -->

		<%@ include file="../include/jsBottom.jsp" %>
		
	</body>
</html>
</html>
