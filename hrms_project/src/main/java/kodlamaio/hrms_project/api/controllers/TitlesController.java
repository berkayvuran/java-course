package kodlamaio.hrms_project.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms_project.business.abstracts.TitleService;
import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.entities.concretes.Title;

@RestController
@RequestMapping("/api/titles")
public class TitlesController {
	private TitleService titleService;

	@Autowired
	public TitlesController(TitleService titleService) {
		super();
		this.titleService = titleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Title>> getAll(){
		return this.titleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody Title title) {
		return this.titleService.add(title);
	}

}