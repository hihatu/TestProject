<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Test JSP</title>
    </head>
    <body>
    <h1>Test JSP</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Content</th>
        </tr>
        <s:iterator value="testBeans">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="content"/></td>
        </tr>
        </s:iterator>
        </table>
    </body>
</html>