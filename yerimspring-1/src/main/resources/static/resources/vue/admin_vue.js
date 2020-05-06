"use strict"
var adminVue = {
		join : () => {
			return `<table>
			<table id="table" style = "margin: 0 auto">
				<tr><td  rowspan="5"><img id="profile" style ="width : 300px; height : 200px;" src="https://emojipedia-us.s3.amazonaws.com/content/2018/02/01/bear-animoji-emojipedia.gif"></td>
				<td><label>이름 </label></td><td><input id ="name" type="text"/></td></tr>
				<tr><td><label>직책</label></td><td><input id='position' type="text"/></td></tr>
				<tr><td><label>핸드폰 번호</label></td><td><input id="phoneNumber" type="text"/></td></tr>
				<tr><td><label>이메일 주소</label></td><td><input id='email' type="text"/></td></tr>
				<tr><td><label>등록한 날짜</label></td><td><input id ='regiterDate' type="text"/></td></tr>
			</table>
			<table style = "margin: 0 auto">
				<tr id = "button_box"><td><td></td></td> </tr>
			</table>`
		},
		login : ()=>{
			return `<article>
				<form id = "login_box" style = "margin: 0 auto">
					<label>ID </label><br> <input id="userid" type="text"><br> 
					<label>PassWord</label><br> <input id="password" type="text"><br>
				</form>
			</article>`
		},
		listHead : () => {
			return `<table id = 'listHead'>
			<tr><td>no.</td><td>분실물id</td><td>분류</td><td>습득물품명</td><td>습득일자</td><td>습득 위치</td></tr>
			</table>`
		}
}
	
