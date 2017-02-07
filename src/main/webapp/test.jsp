<%--
  Created by IntelliJ IDEA.
  User: wuhao1
  Date: 2016/10/17
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tbody>
            <tr>
                <th><span onclick="deleteOneItem('123');">删除</span></th>
            </tr>
        </tbody>
    </table>
</body>

<script type="text/javascript" language="javascript">
    function deleteOneItem(passId){
        if(window.confirm("您确定要删除该信息吗?")){
            alert("123");
        }
    }
</script>
</html>
