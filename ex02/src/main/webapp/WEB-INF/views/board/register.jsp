<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="..//includes/header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
		
			<div class="panel-heading">Board List Page</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
			
			<form role="form" action="/board/register" method="post">
				<div class="form-group">
					<label>Title</label> <input class="form-control" name='tilte'>
					</div>
					
				<div class="form-group">
					<label>Text area</label> 
					<textarea class="form-control" rows="3" name='content'></textarea>
				</div>
				
				<div class="form-group">
					<label>Writer</label> <input class="form-control" name='writer'>
				</div>
				<button type="submit" class="btn btn-default">Submit Button</button>
				<button type="reset" class="btn btn-default">Reset Button</button>
			</form>
			
			</div>
			
		</div>
	
	</div>
	
	<%@include file="..//includes/footer.jsp" %>
	
</body>
</html>