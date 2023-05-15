/*
 * package generic;
 * 
 * import java.io.File; import java.io.IOException;
 * 
 * import javax.swing.text.Document; import javax.xml.parsers.DocumentBuilder;
 * import javax.xml.parsers.DocumentBuilderFactory; import
 * javax.xml.parsers.ParserConfigurationException; import
 * org.xml.sax.SAXException;
 * 
 * import net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList;
 * 
 * public class ExcelReportGenerator { public void GenerateExcelReport(String
 * destFIleName) throws ParserConfigurationException, SAXException, IOException{
 * 
 * 
 * String path=
 * ExcelReportGenerator.class.getClassLoader().getResource("./").getPath(); path
 * = path.replace("bin","src");
 * 
 * File xmlFile = new File(path + "../test-output/AutomationReport.xml");
 * 
 * DocumentBuilderFactory fact= DocumentBuilderFactory.newDefaultInstance();
 * DocumentBuilder Build = fact.newDocumentBuilder(); Document doc = (Document)
 * Build.parse(xmlFile); doc.getDocumentElement().normalize();
 * 
 * XSSFWorkbook book = New XSSFWorkbook();
 * 
 * ((Object) doc).getElemetByTagName("") ;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * public static void name(String[] args) throws ParserConfigurationException,
 * SAXException, IOException { new
 * ExcelReportGenerator().GenerateExcelReport("");
 * 
 * } {
 * 
 * } } //(new File(System.getProperty("user.dir")+
 * "../test-output/AutomationReport.xml"));
 */