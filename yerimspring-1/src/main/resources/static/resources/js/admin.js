"use strict"
var admin = admin || {}
admin = (()=>{
	let init = ()=>{
		onCreate()
	}
	let onCreate = ()=>{
		setContentView()
	}
	let setContentView = () => {
		alert('3')
	}
	return {init}
})()