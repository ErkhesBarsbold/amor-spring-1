package mn.amor.amor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
		
	@Autowired
	private TestMapper testMapper;
	
	@GetMapping("/test")
	public Integer index() {		
		return testMapper.toolAngilal();
	}
		

}
