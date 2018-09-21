<%-- 
    Document   : viewnote
    Created on : Sep 21, 2018, 3:39:36 PM
    Author     : 766375
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <div>
            <h3>View Note</h3>
            <div>
                Title: ${noteTitle}
            </div>
            <div>
                Contents:<br>
                ${noteContent}
            </div>
            <a href="note?edit">Edit</a>
        </div>
    </body>
</html>
