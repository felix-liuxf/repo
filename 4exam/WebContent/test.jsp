<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<script>
function img(){
var location1 = prompt("请输入图片的地址：","http://");
if(location1){
selImg(location1);
}
}
function selImg(s){
if(!s){return false;}
var h=s.substr(s.lastIndexOf(".")+1,3);
if(h=="gif"||h=="jpg" || h=="GIF" || h=="JPG"){
Edit=document.getElementById("idEdit")
Edit.innerHTML+='<img src='+s+'>'
}
else{
}
}
</script>
<div NAME=EditCtrl id=idEdit contentEditable=true style="width:100%;height:200px;border:1px solid #666666"> <b>hubro</b>
</div>
<input type="button" name="Submit" value="插入图片" onclick="img()">
</body>
</html>