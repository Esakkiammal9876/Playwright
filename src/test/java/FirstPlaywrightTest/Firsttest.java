package FirstPlaywrightTest;

import java.nio.file.Paths;
import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Firsttest {
	
	public static void main(String[] args) {
		/*Playwright pw = Playwright.create();
		//BrowserType bt = pw.chromium();
		//Browser bw = bt.launch();
	   Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(Arrays.asList("--start-maximized")));
	   BrowserContext context = bw.newContext(
	            new Browser.NewContextOptions()
	                .setViewportSize(null)
	        );
		Page pg = context.newPage();
		pg.navigate("https://stage.ostaapp.com/user/login");
		System.out.println(pg.title());
		//pg.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("demo.png")));
		//pg.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("test.png")));
		pg.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));*/
		Playwright pw =  Playwright.create();
		Browser bs = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(Arrays.asList("--start-maximized")));
		BrowserContext context = bs.newContext(new Browser.NewContextOptions().setViewportSize(null));
		Page pg = context.newPage();
		pg.navigate("https://stage.ostaapp.com/user/login");
		System.out.println(pg.title());
		
		}
}