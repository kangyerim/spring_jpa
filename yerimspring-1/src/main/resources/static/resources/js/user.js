"use strict"
var user = user || {}
user = (()=>{
	const WHEN_ERROR = '호출하는 JS파일을 찾지 못했습니다앗'
	let admin_vue
	
	let init = () => {
		admin_vue = `/resources/vue/admin_vue.js`
		onCreate()
	}
	
	let onCreate = () => {
		$.when(
				$.getScript(admin_vue)
		).done(()=>{
			setContentView()
			$('#register_a').click(e => {
				$('#bigbanner').empty()
				$('#bigbanner').html(adminVue.join())
				
				$(`<input type="button" value="등록하기"/>`)
				.attr({'value' :  '등록하기'})
				.css({width : '80px', height : '30px'})
				.appendTo('#button_box')
				.click(e=>{
					alert('등록버튼 클릭')
				})
				$(`<input type="button" value="취소"/>`)
				.attr({value : '취소하기'})
				.css({width : '80px', height : '30px'})
				.appendTo('#button_box')
				.click(e => {
					alert('취소버튼 클ㄹ기')
				})
			})
			$('#access_a').click(e=>{
				e.preventDefault()
				$('#bigbanner').empty()
				$('#bigbanner').html(adminVue.login())
					$(`<input type="button">`)
					.attr({ value : "로그인"})
					.appendTo('#login_box')
					.click(e => {
						e.preventDefault()
						location.href = '/admin'
					/*	$.ajax({
							url : ``,
							type : ``,
							data : JSON.stringify({
								
							}),
							dataType : `json`,
							contentType : `application/json`,
							success : d => {
								
							},
							erro : (r,x,q) => {
								alert(r.status)
							}
						})
						
					*/	
					})
					$(`<input type="button" >`)
					.attr({value : "취소"})
					.appendTo('#login_box')
					.click(e => {
						e.preventDefault()
						alert('취소')
					})
			})
		}).fail(()=>{
			alert(WHEN_ERROR)
		})
	
	} 
	
	let setContentView = () => {
		$('#home').addClass('center')
		$('#head').css({width :'180px', height : '100px'})
		$('#naviBar').css({border : '3px solid #cc0e74', width : '250px'}).addClass('center')
		$('#go').css({background : '#cc0e74'}).css('cursor','pointer')
		$('#login_a').css('cursor','pointer')
		$('#join_a').css('cursor','pointer')
		$('#register_a').css('cursor','pointer')
		$('#access_a').css('cursor','pointer')
		$('#nav').css({height : '50px'}).addClass('center')
		$('#pics').css({height : '200px'})
		$('#home').addClass('center')
		
	}
	return {init}
})()