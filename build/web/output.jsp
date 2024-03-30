<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output Page</title>
    </head>
    <body>
        <center>
            <h1>Output</h1>
            <p>
                Below are the output of the sentence you provided:
            </p>
            <table border="1">
                <tr>
                    <th>Word</th>
                    <th>Number of occurrence</th>
                </tr>
                <%
                    Map<String, Integer> occurents= (Map<String, Integer>)request.getAttribute("occurents");
                    
                    for (Map.Entry<String, Integer> en : occurents.entrySet()) {
                            Object key = en.getKey();
                            Object val = en.getValue();
                %>
                <tr>
                    <td><%=key%></td>
                    <td><%=val%></td>
                </tr>
                <%
                        }
                %>
            </table>
        </center>
    </body>
</html>
