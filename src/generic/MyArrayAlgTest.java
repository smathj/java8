package generic;

public class MyArrayAlgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] language = {"Ű����","�Ϻ���","������"};
		
		// �ϺϾ�, Ű���� ������ ����
		MyArrayAlg.swap(language, 0, 1);
		
		for(String value : language) {
			System.out.println(value);
		}
	}

}
