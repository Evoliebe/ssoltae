<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../module/top.jsp" />

<div class="wrapper row3">
		<div class="hoc container clear">
			<jsp:include page="../module/community_sidebar.jsp" />
    	<div class="content three_quarter"> 
		  <h1>수강후기</h1><hr>
			<table class="table table-bordered">
		      <tr>
		        <td>번호</td>
		        <td>제목</td>
		        <td>작성일</td>
		        <td>작성자</td>
		        <td>조회수</td>
		      </tr>
		 
	  		<c:forEach var="communityLectureReviewList" items="${communityLectureReviewList}">
	  			<tr>
			        <td>${communityLectureReviewList.boardArticleNum}</td>
			        <td>
			        <a href="/smedu/community/communityLectureReviewDetail?boardArticleCode=${communityLectureReviewList.boardArticleCode}">
			        ${communityLectureReviewList.boardArticleTitle}
			        </a>
			        </td>
			        <td>${communityLectureReviewList.boardArticleDate}</td>
			        <td>${communityLectureReviewList.boardArticleWriter}</td>
			        <td>${communityLectureReviewList.boardArticleReadCount}</td>
			     </tr>
	  		</c:forEach>
		  	</table>
	   

      <div class="fl_right">
	   		<a href=""><input type="button" value="목록" class="btn btn-default"></a>
	   		</div>
	   		
		   <nav class="pagination">
	        <ul>
			<c:if test="${page>1}">
				<li><a href="/smedu/community/communityLectureReviewList?page=${page-1}">◀</a></li>
			</c:if>
			
			<c:forEach var="pageIndex" begin="${startPage}" end="${lastPage}" >
				<c:if test="${page==pageIndex}">
				<li class="current"><strong>${pageIndex}</strong></li>
				</c:if>
				<c:if test="${page!=pageIndex}">
				<li><a href="/smedu/community/communityLectureReviewList?page=${pageIndex}">${pageIndex}</a></li>
				</c:if>
			</c:forEach>
			
			<c:if test="${page<lastPage}">
			<li><a href="/smedu/community/communityLectureReviewList?page=${page+1}">▶</a></li>
			</c:if>
			 </ul>
	      </nav>
	     
	   		
			<div class="container">
				<div class="row">
					<div class="col-sm-4 col-sm-offset-2">
						<div id="imaginary_container"> 
							<form action="/smedu/community/communityLectureReviewList">
								<div class="input-group stylish-input-group">
									<input type="text" class="form-control"  placeholder="Search" name="word">
									<span class="input-group-addon">
										<button type="submit"><span class="glyphicon glyphicon-search"></span></button>  
									</span>  
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
      
      
      
		</div>
	</div>
</div>

<jsp:include page="../module/foot.jsp" />
</body>
</html>