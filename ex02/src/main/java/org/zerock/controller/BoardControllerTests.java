package org.zerock.controller;

@Test
public void testRegister()throws Exception{
	
	String resultPage = mockMvc
		.perform(MockMvcRequestBuilders.post("/board/register")
			.param("title","테스트 새글 제목")
			.param("content", "테스트 새글 내용")
			.param("writer", "user00")
		).andReturn().getModelAndView().getViewName();
		
	log.info(resultPage);
}	
	String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
			.param("bno","1")
			.param("title", "수정된 테스트 새글 내용")
			.param("content", "수정된 테스트 새글 내용")
			.param("writer", "user00"))
		.andReturn().getModelAndView().getViewName();
		
	log.info(resultPage);


//public class BoardControllerTests {

}

@Test
public void testGet() throws Exception {
	
	log.info(mockMvc.perform(MockMvcRequestBuilders
			.get("/board/get")
			.param("bno", "2"))
			.andReturn()
			.getModelAndView().getModelMap());
}

@Test
public void testRemove() throws Exception {
	//삭제전 데이터베이스에 게시물 번호 확인할 것
	String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
			.param("bno", "25")
			).andReturn().getModelAndView().getViewName();
	
			log.info(resultPage);
			
	// log.info(mockMvc.perform(MockMvcRequestBuilders
	//		.get("/board/get")
	//		.param("bno", "2"))
	//		.andReturn()
	//		.getModelAndView().getModelMap());
}
