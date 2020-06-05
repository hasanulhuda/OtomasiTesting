package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Date;

public class ExtentReportsDemo {
    public WebDriver driver;
    public ExtentReports extent;
    public ExtentHtmlReporter htmlReporter;
    public ExtentTest log;

    @BeforeSuite
    public void reportSetup() {

//      htmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir"+"C:/AutomationReports.html")));
        Date d=new Date();
        String File = "Automation";
        String fileName=d.toString().replace(":", "_").replace(" ", "_")+".html";
//        htmlReporter =new ExtentHtmlReporter("D:/Test/OtomasiTesting/target/extent-reports/"+File+"_"+fileName);
        htmlReporter =new ExtentHtmlReporter("D:/Test/OtomasiTesting/target/extent-reports/"+File+".html");
        htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/src/extent-config.xml"));

        // initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.setSystemInfo("Environment","QA");
        extent.attachReporter(htmlReporter);

        //Configuration
        htmlReporter.config().setTheme(Theme.DARK);
    }

    @BeforeMethod
    public void register(Method method){
        String testname = method.getName();
        log = extent.createTest(testname);
    }

    @AfterMethod
    public void captureStatus(ITestResult result){
        if(result.getStatus()==ITestResult.SUCCESS){
            log.log(Status.PASS,"The Test Named As: "+result.getName()+"Is Passed");

        }else if(result.getStatus()==ITestResult.FAILURE){
            log.log(Status.PASS,"The Test Named As: "+result.getName()+"Is FAILED");
            log.log(Status.FAIL,"Test Failure:"+result.getThrowable());
        }else if(result.getStatus()==ITestResult.SKIP){
            log.log(Status.PASS,"The Test Named As: "+result.getName()+"is Passed");
        }
    }

    @AfterSuite
    public void reportTeardown() {
        extent.flush();
    }

//    public String captureScreen() throws IOException {
//        TakesScreenshot screen = (TakesScreenshot) driver;
//        File src = screen.getScreenshotAs(OutputType.FILE);
//        String dest = "D://Automation_Reports//screenshots//" + getcurrentdateandtime() + ".png";
//        File target = new File(dest);
//        FileUtils.copyFile(src, target);
//        return dest;
//    }
//    public String getcurrentdateandtime(){
//        String str = null;
//        try{
//            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
//            Date date = new Date();
//            str= dateFormat.format(date);
//            str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
//        }
//        catch(Exception e){
//
//        }
//        return str;
//    }

}
