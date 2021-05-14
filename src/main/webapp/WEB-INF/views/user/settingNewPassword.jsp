<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        .flex-container{
            width: 100%;
            height: 100vh;
            display: -webkit-box;
            display: -moz-box;
            display: -ms-flexbox;
            display: flex;

            -webkit-box-align: center;
            -moz-box-align: center;
            -ms-flex-align: center;
            align-items: center; /* 수직 정렬 */

            -webkit-box-pack: center;
            -moz-box-pack: center;
            -ms-flex-pack: center;
            justify-content: center; /* 수평 정렬 */
        }

        .hello{
            background-color: #7fffd4;
        }
    </style>
</head>
<body>
<form action="/set/password" method="post">
    <table align="center" class="flex-container">
        <tr>
            <td class="hello">
                새로운 비밀번호를 입력해주세요
            </td>
        </tr>
        <tr>
            <td>
                새로운 비밀번호 :
            </td>
            <td>
                <input type="password" id="password" name="password">
            </td>
        </tr>
        <tr>
            <td>
                새로운 비밀번호 확인 :
            </td>
            <td>
                <input type="password" id="newPassword" name="newPassword">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" id="submitValue" value="비밀번호 재설정"/>
            </td>
        </tr>
    </table>
</form>
<script>

    $('#submitValue').submit(function(){
        if($('#password').val() == $('#newPassword').val()) {
            return true;
        }
        alert("비밀번호가 일치하지 않습니다.");
    })

</script>
</body>
</html>