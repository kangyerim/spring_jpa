"use strict"
var lost = lost || {}
lost = (()=>{
	const WHEN_ERROR = `MISSING JS FILE :(`
	let lost_vue
	
	let init = () => {
		lost_vue = `/resources/vue/lost_vue.js`
		onCreate()
	}
	let onCreate = () => {
		$.when(
			$.getScript(lost_vue)	
		).done(()=>{
			setContentView()
			$('#lostList_b').click( e => {
				e.preventDefault()
				$('#content').empty()
				$('#content').html(lostVue.listHead())
				$.getJSON('/losts', d => {
					$('#totalCount').text('분실물 총 갯 수 : ' + d.length)
					$.each(d, (i, j) => {
						$(`<tr>
								<td><span>${i+1}</span></td>
								<td><span>${j.idNum}</span></td>
								<td><span>${j.goodsName}</span></td>
								<td><span>${j.inventory}</span></td>
								<td><span>${j.date}</span></td>
								<td><span>${j.location}</span></td>
						</tr>`).appendTo('#listHeadFORid')
						
						$(`<a>${j.goodsName}</a>`)
							.css({cursor : 'pointer', color : '#fab7b7'})
							
					})
				})
			})

		}).fail(()=>{
			alert(`WHEN_ERROR`)
		})
	}
	let setContentView = () => {
		
	}
	return {init}
})()