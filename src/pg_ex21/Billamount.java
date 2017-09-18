package pg_ex21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextArea;

public class Billamount {

	public static void main(String[] args) {

		Billamount billamount = new Billamount();
		ArrayList<String> recordList0 = new ArrayList<String>();
		JTextArea record0 = new JTextArea("1 090-1234-0001\n2 C1 090-1234-0002");

		ArrayList<String> recordlinejudgeTest = new ArrayList<String>();
		 billamount.recordlinejudge(recordlinejudgeTest);

//		ArrayList<String> recordjudgeData = new ArrayList<String>();
//		 billamount.recordlinedivide(recordjudgeData);


	}
	//行ごとに分轄してrecordBeanに格納するメソッド
	public List<String> receiveRecord(JTextArea record1) {
		List<String> recordList = new ArrayList<String>();

		String str = record1.getText();
		recordList = Arrays.asList(str.split("\n"));
		for (int i = 0 ; i < recordList.size() ; i++){
		}

		//確認用
		for(String recordCheck :recordList){
		}

		return recordList;
	}

	//まとまりごとに分轄してcustomerBeanに格納するメソッド
	public CustomerBean recordlinejudge(List<String> recordlinejudgeTest) {
		ArrayList<String> judgeList = new ArrayList<String>();
//		ArrayList<CustomerBean> customerBean = new ArrayList<CustomerBean>();
		CustomerBean customerBean = new CustomerBean();
		for(int i = 0; i < recordlinejudgeTest.size(); i++){

			int frirst = Integer.parseInt(recordlinejudgeTest.get(i).substring(0,1));

				if(frirst == 0){

				}else if(frirst == 1){
					customerBean.setPhoneNumber(recordlinejudgeTest.get(i).substring(2));
					System.out.println(customerBean.getPhoneNumber());
				}else if(frirst == 2){
				customerBean.setValueCampaignInfoList(recordlinejudgeTest.get(i).substring(2));
				System.out.println(customerBean.getValueCampaignInfoList(0));
				}else if(frirst == 5){
				customerBean.setValueCallInfoList(recordlinejudgeTest.get(i).substring(2));
				System.out.println(customerBean.getValueCallInfoList(0));
			}
		}
		return customerBean;
	}





	//スペースごとに分轄してにwrodList配列に格納するメソッド
//	public ArrayList<String> recordlinedivide(ArrayList<String> recordjudgeData) {
//		ArrayList<String> wordList = new ArrayList<String>();
//		for(String line : recordjudgeData){
//			String[] words = line.split(" ");
//			for (int i = 0 ; i < words.length ; i++){
//				wordList.add(words[i]);
//			}
//			//確認用
//			for(String wrodCheck :wordList){
//			//	System.out.print(wrodCheck);
//			}
//
//		}
//		return wordList;
//	}
}