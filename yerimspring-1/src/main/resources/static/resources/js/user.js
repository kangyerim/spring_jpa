"use strict"
var user = user || {}
user = (()=>{
	let init = () => {
		onCreate()
	}
	let onCreate = () => {
		setContentView()
		$('#register_a').click(e => {
			e.preventDefault()
			location.href = '/admin'
		})
	} 
	let setContentView = () => {
		$('#home').addClass('center')
		$('#head').css({width :'180px', height : '100px'})
		$('#naviBar').css({border : '3px solid #cc0e74', width : '250px'}).addClass('center')
		$('#go').css({background : '#cc0e74'}).css('cursor','pointer')
		$('#login_a').css('cursor','pointer')
		$('#join_a').css('cursor','pointer')
		$('#nav').css({height : '50px'}).addClass('center')
		$('#pics').css({height : '200px'})
		
	}
	return {init}
})()