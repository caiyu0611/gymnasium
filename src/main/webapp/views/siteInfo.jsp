<%--
  Created by IntelliJ IDEA.
  User: ${蔡宇}
  Date: 2022/10/14
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>场地信息</title>
    <script type="text/javascript" src="../js/jquery-3.6.1.js"></script>
    <script type="text/javascript">
        $(function (){
            //发送ajax的请求
            $.ajax({
                url:"/SiteInfo/selectSiteInfoAll",
                success:function (result){
                    console.log(result)
                    let str="";
                    $(result).each(function (){
                        str+=
                            "<tr>"+
                            "<td>"+this.id+"</td>"+
                            "<td>"+this.siteDetails+"</td>"+
                            "<td>"+this.siteLocation +"</td>"+
                            "<td>"+this.siteName +"</td>"+
                            "<td>"+this.siteStatus+"</td>"+
                            "<td><span onclick=\"window.location.href='views/="+this.id+"'\">申请场地</span></td>"+
                            "</tr>"
                    })
                    $("tbody").empty().append(str);
                }
            })
        })


    </script>
</head>
<body>
<div>
    <div class="top">
        场地分类：
        <select>

        </select>
    </div>
    <div>
        <table border="1px">
            <thead>
            <tr>
                <td colspan="6">
                    <h3>场地信息列表</h3>
                </td>
            </tr>
            <tr>
                <th>场地编号</th>
                <th>场地名称</th>
                <th>场地位置</th>
                <th>场地状态</th>
                <th>场地详情</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>
