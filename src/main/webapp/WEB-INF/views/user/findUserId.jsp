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
    <form action="/find/userid" method="post" id="login">
        <table align="center" class="flex-container">
            <tr>
                <td class="hello">
                    가입시 사용했던 핸드폰번호를 입력해주세요
                </td>
            </tr>
            <tr>
                <td>
                    <input type="number" name="phone">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="아이디 찾기"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>