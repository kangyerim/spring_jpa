"use strict"
const userVue = {
		detail : () => {
			return `<table>
			<table id="table" style = "margin: 0 auto, border : 1px solid black">
				<tr><td  rowspan="6"><img id="profile" style ="width : 300px; height : 200px;" src="https://emojipedia-us.s3.amazonaws.com/content/2018/02/01/bear-animoji-emojipedia.gif"></td>
				<td><label>이름 </label></td><td><h5 id ="name"></h5></td></tr>
				<tr><td><label>아이디</label></td><td><h5 id='userid'></h5></td></tr>
				<tr><td><label>주민등록번호</label></td><td><h5 id='ssn'></h5></td></tr>
				<tr><td><label>이메일 주소</label></td><td><h5 id='email'></h5></td></tr>
				<tr><td><label>핸드폰 번호</label></td><td><h5 id="phoneNumber"></h5></td></tr>
				<tr><td><label>등록한 날짜</label></td><td><h5 id ='regiterDate'></h5></td></tr>
			</table>
			<table style = "margin: 0 auto">
				<tr id = "button_box"><td><td></td></td> </tr>
			</table>`
		}
}
	
