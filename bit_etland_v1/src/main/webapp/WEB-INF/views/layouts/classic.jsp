<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
	<head>
			<meta charset="UTF-8">
	    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Nak-Uhh</title>
			<link rel="stylesheet" href="${css}/home/reset.css" />
			<link rel="stylesheet" href="${css}/home/main.css" />
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	</head>
	<body>

		<div id="wrapper" class="grid-full-container container-fluid">
	       <div class="grid-top">
	       		  <tiles:insertAttribute name="top" />
		 	</div>
		 	<div id="grid" class="grid-full-container container-fluid">
			    <div class="grid-item">
			          <tiles:insertAttribute name="nav" />
			  	</div>
			      <div class="grid">
			        	 <div class="grid-item">
			        		  <tiles:insertAttribute name="content" />
			        	</div>
			      </div>
			  </div>
			      <div class="grid">
					<div class="grid-bottom">
			          <tiles:insertAttribute name="bottom" />
			          </div>
				  </div>
		</div>

	</body>
</html>