package pg_ex21;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;

import org.junit.Test;


public class BillamountTest {

	Billamount billamount = new Billamount();

	@Test
	public void receiveRecordTest() {

		ArrayList<String> recordListTest = new ArrayList<String>();
		JTextArea area = new JTextArea("1 090-1234-0001\n2 C1 090-1234-0002\n2 C1 090-1234-0003\n5 2004/06/04 03:34 003 090-1234-0002\n5 2004/06/04 13:50 010 090-1234-9999");
	//	assertEquals("[1 090-1234-0001\n2 C1 090-1234-0002]", billamount.receiveRecord(area));

//		for(String recordCheck :billamount.receiveRecord(area)){
//		assertEquals("[1,090-1234-0001\n2,C1,090-1234-0002]", billamount.recordline(recordCheck));
//		}
	}

	@Test
	public void recordlinejudgeTest() {
		List<String> recordlinejudgeTest = new ArrayList<String>();
		JTextArea area = new JTextArea("1 090-1234-0001\n2 C1 090-1234-0002\n2 C1 090-1234-0003\n5 2004/06/04 03:34 003 090-1234-0002\n5 2004/06/04 13:50 010 090-1234-9999");
		recordlinejudgeTest = billamount.receiveRecord(area);
		assertEquals("[1, 090-1234-0001\n2, C1, 090-1234-0002]", billamount.recordlinejudge(recordlinejudgeTest));
	}

	@Test
	public void billmath()

	}

}