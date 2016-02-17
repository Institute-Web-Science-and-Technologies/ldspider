/**
 * 
 */
package de.unikoblenz.west.koldfish.ldspider.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ontologycentral.ldspider.Main;

/**
 * @author lkastler
 *
 */
public class TestLoadBalanced {

	
	private static final Logger log = LoggerFactory
			.getLogger(TestLoadBalanced.class);
	
	@Ignore
	@Test
	public void testBFS() throws Exception {
		Main.main(new String[] {
				"-s", "run/seeds.txt",
				"-o", "run/data.gz",
				"-b", "1", "5", "1"
		});
	}
	
	@Test
	public void testLoadBalancing() throws Exception {
		Main.main(new String[] {
				"-s", "run/seeds.txt",
				"-o", "run/data.gz",
				"-c", "5"
		});
	}
}
