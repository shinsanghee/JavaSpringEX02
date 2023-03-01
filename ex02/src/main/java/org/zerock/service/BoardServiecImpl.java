package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiecImpl implements BoardService{
	
	//spring 4.3 이상에서 자동 처리
	@Setter(onMethod_ @Autowired)
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		
		log.info("register......" + board);
		
		mapper.insertSelectKey(board);
	}
	
	@Override
	public BoardVO get(Long bno) {
		
		log.info("get......." + bno);
		
		return mapper.read(bno);
	}
	
	@Override
	public boolean remove(Long bno) {
		
		log.info("remove...." + bno);
		
		return mapper.delete(bno) == 1;
	}

}
