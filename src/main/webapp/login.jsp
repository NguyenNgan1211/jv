<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.js"></script>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<style>
.divider:after, .divider:before {
	content: "";
	flex: 1;
	height: 1px;
	background: #eee;
}

.h-custom {
	height: calc(100% - 73px);
}

@media ( max-width : 450px) {
	.h-custom {
		height: 100%;
	}
}
</style>
</head>
<body>
	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-md-9 col-lg-6 col-xl-5">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
						class="img-fluid" alt="Sample image">
				</div>
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<form action="login" method="post">
						<div
							class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
<<<<<<< HEAD
							<p class="lead fw-normal mb-0 me-3">Sign in with asdf</p>
=======
							<p class="lead fw-normal mb-0 me-3">Sign in with</p>
>>>>>>> 39d0ee0 (aa)
							<button type="button" data-mdb-button-init data-mdb-ripple-init
								class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-facebook-f"></i>
							</button>

							<button type="button" data-mdb-button-init data-mdb-ripple-init
								class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-twitter"></i>
							</button>

							<button type="button" data-mdb-button-init data-mdb-ripple-init
								class="btn btn-primary btn-floating mx-1">
								<i class="fab fa-linkedin-in"></i>
							</button>
						</div>

						<div class="divider d-flex align-items-center my-4">
							<p class="text-center fw-bold mx-3 mb-0">Or</p>
						</div>

						<!-- Email input -->
						<div data-mdb-input-init class="form-outline mb-4">
							<input name="user" type="text" id="inputEmail"
								class="form-control form-control-lg"
								placeholder="Enter a valid user" /> <label class="form-label"
								for="form3Example3">User</label>
						</div>

						<!-- Password input -->
						<div data-mdb-input-init class="form-outline mb-3">
							<input name="pass" type="password" id="inputPassword"
								class="form-control form-control-lg"
								placeholder="Enter password" /> <label class="form-label"
								for="form3Example4">Password</label>
						</div>
						<c:if test="${not empty error}">
							<p style="color: red">${error}</p>
						</c:if>
						<div class="d-flex justify-content-between align-items-center">
							<!-- Checkbox -->
							<div class="form-check mb-0">
								<input class="form-check-input me-2" type="checkbox" value=""
									id="form2Example3" /> <label class="form-check-label"
									for="form2Example3"> Remember me </label>
							</div>
							<a href="#!" class="text-body">Forgot password?</a>
						</div>

						<div class="text-center text-lg-start mt-4 pt-2">
							<button type="submit" data-mdb-button-init data-mdb-ripple-init
								class="btn btn-primary btn-lg"
								style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>
							<p class="small fw-bold mt-2 pt-1 mb-0">
								Don't have an account? <a href="#!" class="link-danger">Register</a>
							</p>
						</div>

					</form>
				</div>
			</div>
		</div>
		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
			<!-- Copyright -->
			<div class="text-white mb-3 mb-md-0">Copyright © 2020. All
				rights reserved.</div>
			<!-- Copyright -->

			<!-- Right -->
			<div>
				<a href="#!" class="text-white me-4"> <i
					class="fab fa-facebook-f"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-twitter"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-google"></i>
				</a> <a href="#!" class="text-white"> <i class="fab fa-linkedin-in"></i>
				</a>
			</div>
			<!-- Right -->
		</div>
	</section>
</body>
</html>