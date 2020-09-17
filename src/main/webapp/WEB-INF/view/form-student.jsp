<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        
        <title>Add Student</title>
        
        <link rel="stylesheet" href="/css/form-style.css"/>
        
    </head>
    
    <bode>
        <div>
            <form:form action="saveStudent" modelAttribute="student" method="POST">
                
                <form:hidden path="id"/>
                <form:input path="firstName" placeholder="First Name" />
                
               
                <form:input path="lastName"  placeholder="Last Name"/>
                
                
                <form:input path="email"     placeholder="Email"/>
                
                <br>
                <input type="submit" value="Save" class="btn" />
            </form:form>
                
                <a href="${pageContext.request.contextPath}/student/list">Back to List</a>
        </div>
    </bode>
</html>
