<%-- 
    Document   : editnote
    Created on : Sep 21, 2018, 3:40:24 PM
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
            <h3>Edit Note</h3>
            <form action="note" method="POST" id="noteEdit">
                Title: <input type="text" name="Title" value="${noteTitle}"><br>
                Contents: <textarea name="Content" form="noteEdit">${noteContent}</textarea><br>
                <input type="submit" value="Save" name="submit">
            </form>
        </div>
    </body>
</html>
