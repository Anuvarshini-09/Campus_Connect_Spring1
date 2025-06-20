package com.campus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controller_Hire {
	
	
	//main page index
	@GetMapping("/index")
	public String Main_Page() {
		return "index";
	}
	
	@GetMapping("/interview")
	public String Interview_Page() {
		return "interviews";
	}
	
	@GetMapping("/companies")
	public String Company_Page(){
		return "companies";
	}
	
	@GetMapping("/recruiter")
	public String Recruiter() {
		return "recruiter-portal";
	}
	
	@GetMapping("/student")
	public String Student_portal() {
		return "student-portal";
	}
	
	@GetMapping("/tests")
	public String Test_Page() {
		return "tests";
	}
	
	@GetMapping("/student-reg")
    public String studentForm() {
        return "student-reg";
    }
    @Autowired
    private StudentRepository studentRepository;
	
	@PostMapping("/student-reg/register")
    public String registerStudent(@ModelAttribute Student_Reg student) {
        studentRepository.save(student);
        return "redirect:/student?success=true";
    }
	
	@GetMapping("/recruiter-reg")
    public String recruiterForm() {
        return "recruiter-reg";
    }
	
	@Autowired
    private RecruiterRepository recruiterRepository;

    @PostMapping("/recruiter-reg/register1")
    public String registerRecruiter(@ModelAttribute Recruiter_Reg recruiter) {
        recruiterRepository.save(recruiter);
        return "redirect:/recruiter?success=true";
    }
    
    @GetMapping("/micro-test")
    public String Micro_Test() {
    	return "micro_test";
    }
    
    
	

}
