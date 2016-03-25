<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>4exam</title>
<link rel="stylesheet" href="css/styles.css" type="text/css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/print.css"
	media="print" />
<script src="js/jquery-2.2.2.js"></script>
<!--[if IE]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->

<script type="text/javascript">
	function js_showQuetionList() {
		var qNumber = $("#questionNumber").val();

		var questionHTML = "<ul>";

		for (var i = 1; i <= qNumber; i++) {
			questionHTML += "<li>第"
					+ i
					+ "题答案: <input type=\"checkbox\" name=\"question"+i+"\" value=\"A\" />A \
			<input type=\"checkbox\" name=\"question"+i+"\" value=\"B\" />B  \
			<input	type=\"checkbox\" name=\"question"+i+"\" value=\"C\" />C \
			<input	type=\"checkbox\" name=\"question"+i+"\" value=\"D\" />D</li>";
		}
		questionHTML += "</ul>";
		//alert(questionHTML);
		$("#div_question").html(questionHTML);
	}

	
	function js_createAnswerSheet() {
		// json data 
		var jsonData = {};
		//question number 

		var qNumber = $("#questionNumber").val();

		for (var i = 1; i <= qNumber; i++) {

			var chk_value = "";
			$("input[name='question" + i + "']:checked").each(function(i) {
				if (i > 0) {
					chk_value += ",";
				}

				chk_value += $(this).val();

			});

			jsonData["q" + i + ""] = chk_value;

		}
		console.dir(jsonData);

	}
</script>

</head>
<body>
	<div id="wrapper">
		<!-- #wrapper -->

		<header>
			<!-- header -->
			<h1>
				<a href="#">4exam</a>
			</h1>
			<h2>为了考试而努力拼搏 死考试我怎么对付你</h2>
			<img src="images/headerimg.jpg" width="940" height="60" alt="">
			<!-- header image -->
		</header>
		<!-- end of header -->

		<nav>
			<!-- top nav -->
			<div class="menu">
				<ul>
					<li><a href="#">Home</a></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Products</a></li>
					<li><a href="#">Services</a></li>
					<li><a href="#">Support</a></li>
					<li><a href="#">Contact Us</a></li>
				</ul>
			</div>
		</nav>
		<!-- end of top nav -->

		<section id="main">
			<!-- #main content and sidebar area -->
			<section id="content">
				<!-- #content -->

				<article>
					<h2>新建答题卡</h2>
					<ul>
						<li>答题卡名称:<input type="text" id="answerSheetName"
							value="默认答题卡" /></li>
						<li>选择题数量:<input type="text" id="questionNumber" value="10" /></li>
						<li>学生的人数:<input type="text" id="studentNumber" value="2" /></li>
					</ul>
					<input type="button" value=" 下 一 步 " onclick="js_showQuetionList()">
					<br /> <br />
				</article>
				<article>
					<h2>设置参考答案</h2>
					<div id="div_question"></div>
					<input type="button" value="生成答题卡 "
						onclick="js_createAnswerSheet()">
				</article>


			</section>
			<!-- end of #content -->

			<aside id="sidebar">
				<!-- sidebar -->
				<br /> <br /> <br /> <br /> <br />
			</aside>
			<!-- end of sidebar -->

		</section>
		<!-- end of #main content and sidebar-->

		<footer>
			<section id="footer-area">

				<section id="footer-outer-block">
					<aside class="footer-segment">
						<h4>Friends</h4>
						<ul>
							<li><a href="#">one linkylink</a></li>

						</ul>
					</aside>
					<!-- end of #first footer segment -->

					<aside class="footer-segment">
						<h4>Awesome Stuff</h4>
						<ul>
							<li><a href="#">one linkylink</a></li>
						</ul>
					</aside>
					<!-- end of #second footer segment -->

					<aside class="footer-segment">
						<h4>Coolness</h4>
						<ul>
							<li><a href="#">one linkylink</a></li>

						</ul>
					</aside>
					<!-- end of #third footer segment -->

					<aside class="footer-segment">
						<h4>Blahdyblah</h4>
						<p>
							&copy; 2016 <a href="#">4exam.cn</a>
						</p>
					</aside>
					<!-- end of #fourth footer segment -->

				</section>
				<!-- end of footer-outer-block -->

			</section>
			<!-- end of footer-area -->
		</footer>

	</div>
	<!-- #wrapper -->

</body>
</html>
