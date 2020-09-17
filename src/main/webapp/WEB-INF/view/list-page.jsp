<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Student List</title>
        <link rel="stylesheet" href="/css/list-page-style.css"/>
    </head>
   <body>
        <div class="contenier">
            <h3>List Student</h3>
            <div class="content" >
              <table>
                    <tr>
                        <td class="header-table" >First Name</td>
                        <td class="header-table" >Last Name</td>
                        <td class="header-table" >Email</td>
                        <td class="header-table" >Edit / Delete</td>
                    </tr>
                    
                     <c:forEach var="students" items="${student}">
                         
                         <c:url var="editLink" value="/student/showFormForEdit">
                               <c:param name="studentId" value="${students.id}" />
                         </c:url>
                         <c:url var="deleteLink" value="/student/delete">
                               <c:param name="studentId" value="${students.id}" />
                         </c:url>
                         
                         <tr>
                            <td>${students.firstName}</td>
                            <td>${students.lastName}</td>
                            <td>${students.email}</td>
                            <td>
                                <a href="${editLink}">Edit</a>
                                |
                                <a href="${deleteLink}">Delete</a>
                            </td>
                         </tr>
                    </c:forEach>
                    
                   
                </table>
                <a class="add-button" href="addStudent">Add Student</a>
             </div>
        </div>
    </body>
</html>
