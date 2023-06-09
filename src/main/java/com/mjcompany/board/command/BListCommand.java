package com.mjcompany.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.mjcompany.board.dao.BDao;
import com.mjcompany.board.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		BDao dao = new BDao();
		
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);
	}

}
