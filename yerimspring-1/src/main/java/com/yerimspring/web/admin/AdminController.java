package com.yerimspring.web.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yerimspring.web.util.Messenger;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired AdminService memberService;

	@PostMapping("/join")
	public Messenger add(@RequestBody Admin member) {
		int current = memberService.count();
		memberService.add(member);
		return (memberService.count() == (current +1))? Messenger.Success : Messenger.FAIL;
	}

	@PostMapping("/login")
	public Messenger login(@RequestBody Admin member) {
		return (memberService.login(member)) ? Messenger.Success : Messenger.FAIL;
	}

	@GetMapping("/list")
	public Admin[] list() {
		Admin[] returnMembers = new Admin[5];
		memberService.list();
		return returnMembers;
	}

	@GetMapping("/detail")
	public Admin detail(@RequestBody Admin member) {
		Admin returnMember = new Admin();
		return returnMember;
	}

	@GetMapping("/count")
	public int count() {
		int count = 0;
		return count;
	}

	@PutMapping("/update")
	public Admin update(@RequestBody Admin member) {
		Admin returnMember = new Admin();
		return returnMember;
	}

	@DeleteMapping("/delete")
	public Admin delete(@RequestBody Admin member) {
		Admin returnMember = new Admin();
		return returnMember;
	}
}
