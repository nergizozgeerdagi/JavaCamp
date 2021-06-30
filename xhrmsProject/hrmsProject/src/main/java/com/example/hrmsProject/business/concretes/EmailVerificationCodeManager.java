package com.example.hrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrmsProject.business.abstracts.EmailVerificationCodeService;
import com.example.hrmsProject.core.utilities.RandomCodeGenerator;
import com.example.hrmsProject.core.utilities.results.ErrorResult;
import com.example.hrmsProject.core.utilities.results.Result;
import com.example.hrmsProject.core.utilities.results.SuccessResult;
import com.example.hrmsProject.dataAccess.abstracts.EmailVerificationCodeDao;
import com.example.hrmsProject.entities.concretes.EmailVerificationCode;

@Service
public class EmailVerificationCodeManager implements EmailVerificationCodeService
{

	private EmailVerificationCodeDao emailVerificationCodeDao;
	
	@Autowired
	public EmailVerificationCodeManager(EmailVerificationCodeDao emailVerificationCodeDao) 
	{
		super();
		this.emailVerificationCodeDao = emailVerificationCodeDao;
	}

	public void createCode(EmailVerificationCode verificationCode, int userId)
	{
		EmailVerificationCode _code = verificationCode;
		_code.setVerificationCode(null);
		_code.setVerified(false);
		
		if (_code.isVerified() == false) {
			RandomCodeGenerator randomCodeGenerator = new RandomCodeGenerator();
			_code.setVerified(true);
			_code.setVerificationCode(randomCodeGenerator.createRandomCode());
			_code.setUserId(userId);
			this.emailVerificationCodeDao.save(_code);
		}
		
		return;
	}

	public Result verifyCode(String verificationCode, int id) 
	{
		EmailVerificationCode refrence = this.emailVerificationCodeDao.findByUserId(id);
		if (refrence.getVerificationCode().equals(verificationCode) && refrence.isVerified() == false) 
		{
		 refrence.setVerified(true);
		 return new SuccessResult("E-posta doğrulandı.");
		}
		else if (refrence.isVerified() == true) 
		{
			return new ErrorResult("E-posta zaten doğrulanmış.");
		}
		
		return new ErrorResult("Doğrulama geçersiz!!");
	}

}