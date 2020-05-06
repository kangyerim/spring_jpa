"use strict"
var admin = admin || {}
admin = (()=>{
	const WHEN_ERROR = `missing js file :(`
	let user_vue
	
	let init = ()=>{
		user_vue = `/resources/vue/user_vue.js`
		onCreate()
	}
	let onCreate = ()=>{
		$.when(
			$.getScript(user_vue)
		).done(()=>{
			setContentView()
			$.getJSON('/users', d => {
				$('#totalCount').text('총 회원 수 : '+d.length)
				$.each(d, (i, j)=>{
					$(`<tr><td><span>${i+1}</span></td>
						<td><span>${j.userid}</span></td>
						<td><span id = "user_`+(i+1)+`"></span></td>
						<td><span>${j.ssn}</span></td>
						<td><span>${j.email}</span></td>
						<td><span>${j.phoneNumber}</span></td>
						<td><span>${j.regiterDate}</span></td>
						</tr>`).appendTo('#memberList')
						
						$(`<a>${j.name}</a>`)
						.css({cursor : 'pointer', color : '#4CAF50'})
						.appendTo("#user_"+(i+1))
						.click(e =>{
							$('#content').empty()
							$(userVue.detail()).appendTo('#content')
							$.getJSON(`/users/${j.userid}`, d =>{
								$('#name').text(d.name)
								$('#userid').text(d.userid)
								$('#ssn').text(d.ssn)
								$('#email').text(d.email)
								$('#phoneNumber').text(d.phoneNumber)
								$('#regiterDate').text(d.regiterDate)
							})
						})
				})
			})
			$('#userList_b').click(e => {
				e.preventDefault()
				$('#content').empty()
			})
				
			
			
		}).fail(()=>{
			alert(`WHEN_ERROR`)
		})
	}
	let setContentView = () => {
		$('#memberList tr td')
			.css({ height :'50px', border : '1px solid #e2e2e2'})
		$('#memberList tr').first().css({background : '#4CAF50'})
		
	}
	return {init}
})()