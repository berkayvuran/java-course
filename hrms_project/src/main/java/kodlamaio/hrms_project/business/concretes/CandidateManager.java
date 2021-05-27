package kodlamaio.hrms_project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms_project.business.abstracts.CandidateService;
import kodlamaio.hrms_project.core.utilities.results.DataResult;
import kodlamaio.hrms_project.core.utilities.results.Result;
import kodlamaio.hrms_project.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms_project.core.utilities.results.SuccessResult;
import kodlamaio.hrms_project.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms_project.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate has been added");
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

	@Override
	public DataResult<Candidate> getCandidateByNationalId(String nationalId) {
		return new SuccessDataResult<Candidate>(this.candidateDao.findCandidateByNationalId(nationalId));
	}
	
}
