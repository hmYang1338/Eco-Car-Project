<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>ECO EV</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/font-awesome/css/font-awesome.css" rel="stylesheet"
	type="text/css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>

<!-- Plugin CSS -->
<link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/creative.css" rel="stylesheet">
<style>
.img {
	position: relative;
	background-image: url(./img/newspaper.jpg);
	height: 100vh;
	background-size: cover;
}

.img-cover {
	position: absolute;
	height: 100%;
	width: 100%;
	background-color: rgba(0, 0, 0, 0.4);
	z-index: 1;
}

.img .content2 {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	font-size: 15px;
	color: white;
	z-index: 2;
	text-align: center;
}

.textBlack>h2, p {
	color: black;
}

.newsColor {
	color: black;
}
</style>

</head>

<body id="page-top">

	<!-- Navigation -->
	<jsp:include page="nav.jsp" />

	<!-- 메인 이미지 -->
	<header class="masthead">
		<div class="header-content">
			<div class="header-content-inner">
				<br>
				<br>
				<br>
				<br>
				<h1 id="homeHeading">전국 전기차 충전소 운영현황</h1>
				<hr>
				<h5>전기차 이용고객을 위하여 전국에 설치된 전기차 충전소 정보를 제공합니다.</h5>
				<h5>지역과 해당 충전소를 선택하시면, 더 자세한 정보를 확인하실 수 있습니다</h5>
				<!-- <a class="btn btn-primary btn-xl js-scroll-trigger" href="#about">Find Out More</a> -->
			</div>
		</div>
	</header>

	<!-- 이미지 3장 섹션 부분 -->
	<section class="p-0">
		<div class="container-fluid">
			<div class="row no-gutter popup-gallery">
				<!-- 첫번째 이미지 -->
				<div class="col-lg-4 col-sm-6">
					<a class="portfolio-box" href="img/main_2.jpg"> <img
						class="img-fluid" src="img/main_2.jpg" alt="">
						<div class="portfolio-box-caption">
							<div class="portfolio-box-caption-content">
								<div class="project-name">간편하고 빠르게</div>
								<div class="project-category text-faded">전국의 전기차 충전소 정보를
									확인하세요</div>
							</div>
						</div>
					</a>
				</div>
				<!-- 두번째 이미지 -->
				<div class="col-lg-4 col-sm-6">
					<a class="portfolio-box" href="img/main_3.jpg"> <img
						class="img-fluid" src="img/main_3.jpg" alt="">
						<div class="portfolio-box-caption">
							<div class="portfolio-box-caption-content">
								<div class="project-name">충전 타입</div>
								<div class="project-category text-faded">충전 속도에 따라 급속,
									완속으로 분류됩니다</div>
							</div>
						</div>
					</a>
				</div>
				<!-- 세번째 이미지 -->
				<div class="col-lg-4 col-sm-6">
					<a class="portfolio-box" href="img/main_4.jpg"> <img
						class="img-fluid" src="img/main_4.jpg" alt="">
						<div class="portfolio-box-caption">
							<div class="portfolio-box-caption-content">
								<div class="project-name">환경부</div>
								<div class="project-category text-faded">전기차 충전소 운영은 환경부와
									함께합니다</div>
							</div>
						</div>
					</a>
				</div>

			</div>
		</div>
	</section>


	<!-- Modal -->
	<div class="modal fade" id="myModal1" role="dialog">
		<div class="container img">
			<div class="mx-auto text-center content2 textBlack">
				<h2 class="section-heading"></h2>
				<br>
				<br>
				<br>
				<hr class="primary">
				<!-- <p style="font-size: 20px">전기차 또는 ECO EV에 대해 궁금하신 소식을 둘러보세요</p> -->
				<div class="portfolio-box-caption">
					<div class="portfolio-box-caption-content">
						<div class="project-name" id="title1" style="font-size: 20px;"></div>
						<div class="" id="des1" style="font-style: italic;"></div>
					</div>
				</div>
				<hr>
				<div class="portfolio-box-caption">
					<div class="portfolio-box-caption-content">
						<div class="project-name" id="title2" style="font-size: 20px;"></div>
						<div class="project-category text-faded" id="des2"
							style="font-style: italic;"></div>
					</div>
				</div>
				<hr>
				<div class="portfolio-box-caption">
					<div class="portfolio-box-caption-content">
						<div class="project-name" id="title3" style="font-size: 20px;"></div>
						<div class="project-category text-faded" id="des3"
							style="font-style: italic;"></div>
					</div>
				</div>
				<hr>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default close" id="myBtn" data-dismiss="modal">Close</button>
			</div>
		</div>

	</div>

	<section id="contact">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto text-center">
					<h2 class="section-heading">CONTACT</h2>
					<hr class="primary">
					<p>전기차 또는 ECO EV에 대해 궁금하신 점 물어봐주세요</p>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 ml-auto text-center">
					<i class="fa fa-copyright fa-3x sr-contact"></i>
					<p>양현모</p>
				</div>
				<div class="col-lg-4 ml-auto text-center">
					<i class="fa fa-phone fa-3x sr-contact"></i>
					<p>010-6357-8306</p>
				</div>
				<div class="col-lg-4 mr-auto text-center">
					<i class="fa fa-envelope-o fa-3x sr-contact"></i>
					<p>
						<a href="#">moo1338@naver.com</a>
					</p>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 ml-auto text-center">
					<i class="fa fa-copyright fa-3x sr-contact"></i>
					<p>공선진</p>
				</div>
				<div class="col-lg-4 ml-auto text-center">
					<i class="fa fa-phone fa-3x sr-contact"></i>
					<p>010-7488-9972</p>
				</div>
				<div class="col-lg-4 mr-auto text-center">
					<i class="fa fa-envelope-o fa-3x sr-contact"></i>
					<p>
						<a href="#">aodrnekd123@naver.com</a>
					</p>
				</div>
			</div>
		</div>
	</section>

	<!-- Logout Modal -->
	<jsp:include page="logoutModal.jsp" />


	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.js"></script>
	<script src="vendor/popper/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.js"></script>

	<!-- Plugin JavaScript -->
	<script src="vendor/jquery-easing/jquery.easing.js"></script>
	<script src="vendor/scrollreveal/scrollreveal.js"></script>
	<script src="vendor/magnific-popup/jquery.magnific-popup.js"></script>

	<!-- Custom scripts for this template -->
	<script src="js/creative.js"></script>
	<script type="text/javascript" src="js/httpRequest.js"></script>
	<script>
		selectNews();
		function selectNews() {
			sendRequest("NewsServlet", null, viewNews, "POST");
		}
		function viewNews() {
			if (httpRequest.readyState == 4 && httpRequest.status == 200) {
				var json = httpRequest.responseText;
				var jsonData = JSON.parse(json);
				var ran = [];
				var j = 0;
				for (j = 0; j < 5; j++) {
					ran[j] = Math.floor(Math.random() * 20);
					if (ran[j] == ran[j + 1]) {
						ran[j] = Math.floor(Math.random() * 20);''
					}
				}
				var j = 1;
				for (j; j < 6; j++) {
					var title = "<a class='newsColor' href='" + jsonData[ran[j]].linkUrl + "'>" + jsonData[ran[j]].title + "</a>";
					var des = "<a class='newsColor' href='" + jsonData[ran[j]].linkUrl + "'>" + jsonData[ran[j]].des + "</a>";
					document.getElementById("title" + j).innerHTML = title;
					document.getElementById("des" + j).innerHTML = des;
				}
			}
		}
		function modalHide() {
			$(document).ready(function() {
				$("#myBtn").click(function() {
					$("#myModal1").modal("hide");
				});
			});
		}
	</script>

</body>
</html>
