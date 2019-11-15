package cn.edu.zjut.java.labpdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFInvoiceExtractor {

    /**
     * @param path pdf�ļ���·��
     * @return  pdf�е��ı���Ϣ����������pdf�����ʽ�����⣬�����ı���˳����ܻ���ҡ�
     */
    public  String parsePDF(String path){
    	String result = "";
    	try{
        	PDDocument document = PDDocument.load(new File(path));
            PDFTextStripper stripper = new PDFTextStripper();

            stripper.setSortByPosition(true);

            for (int p = 1; p <= document.getNumberOfPages(); ++p)
            {
                // Set the page interval to extract. If you don't, then all pages would be extracted.
                stripper.setStartPage(p);
                stripper.setEndPage(p);

                // let the magic happen
                String text = stripper.getText(document);
                result += text;

            }   		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	return result;    	
    }
    
    public static void pt(String s) {
    	String check1 = "发票代码";
		String check2 = "发票号码";
		String check3 = "开票日期";
		String check4 = "校验码";
		for(int i=0;i<s.length();i++) {
			
			String b = s.substring(i,i+3);
			String a = s.substring(i,i+4);
			if(a.equals(check1)) {
				String firstLine =	s.substring(i,i+16);
				System.out.println(firstLine);
			}
			if(a.equals(check2)) {
				String secondLine = s.substring(i,i+12);
				System.out.println(secondLine);
			}
			if(a.equals(check3)) {
				String thirdLine  = s.substring(i,i+21);
				System.out.print("开票日期:");
				for(int j=0;j<thirdLine.length();j++) {
					char check = thirdLine.charAt(j);
					int aa = check-'0';
					if(aa>=0 && aa<=9) {
						System.out.print(check);
					}
				}
			System.out.println();	
			}
			if(b.equals(check4)) {
				String fourthLine  = s.substring(i,i+32);
				System.out.print("校验码:");
				for(int j = 18;j<fourthLine.length();j++) {
					char check = fourthLine.charAt(j);
					int aa = check-'0';
					if(aa>=0 && aa<=9) {
						System.out.print(check);
					}
				}
			System.out.println();
			}
		}

    }
	
	public static void main(String[] args) {

		PDFInvoiceExtractor pie = new PDFInvoiceExtractor();
		System.out.println(pie.parsePDF("03300170021133697916 物流.pdf"));
		String s1 = pie.parsePDF("031001800211-84462201 - 图书.pdf").replaceAll(" ","");
//		pt(s1);
//		String s2 = pie.parsePDF("76439508  - 技术服务费 阿里云.pdf").replaceAll(" ","");
//		pt(s2);
//		String s3 = pie.parsePDF("033001800111-66185463 网线.pdf").replaceAll(" ","");
//		pt(s3);
//		String s4 = pie.parsePDF("03300170021133697916 物流.pdf").replaceAll(" ","");
//		pt(s4);		
		
	}

}
