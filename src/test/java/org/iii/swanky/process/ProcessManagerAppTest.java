package org.iii.swanky.process;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProcessManagerApp.class)
@WebAppConfiguration
public class ProcessManagerAppTest {

	@Test
	@Ignore
	public void contextLoads() {
	}
}