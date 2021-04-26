package com.chimera.news.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.chimera.news.dao.NewsPaperDAO;
import com.chimera.news.dto.NewsPaperDTO;
import com.chimera.news.entity.NewsPaperEntity;
@Service
@Component
public class NewsPaperServiceImpl implements NewsPaperService {

	@Autowired
	private NewsPaperDAO newsPaperDAO;

	public NewsPaperServiceImpl() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public boolean validateNewspaperInfo(NewsPaperDTO dto) {
		if (Objects.nonNull(dto)) {
			NewsPaperEntity entity = new NewsPaperEntity();
			BeanUtils.copyProperties(dto, entity);
			return this.newsPaperDAO.saveNewspaperInfo(entity);
		}
		return false;
	}
}