package EnumPack;

import java.util.Scanner;

public class EnumClass {

    enum eBrowser
    {
        CHROME(1),
        FIREFOX(2),
        SAFARI(3);

        private int browserptr;

        eBrowser(int ptr) {
            browserptr = ptr;
        }

        public int getBrowserptr()
        {
            return browserptr;
        }
    };

    public static void main(String[] args) {

        //eBrowser ebrowser = eBrowser.CHROME;
        System.out.println(eBrowser.CHROME.getBrowserptr());
        System.out.println(eBrowser.CHROME.toString());

        Scanner scan = new Scanner(System.in);
        eBrowser browser = eBrowser.valueOf(scan.nextLine().toUpperCase());

        switch (browser)
        {
            case CHROME:
                System.out.println("Chrome browser");
                break;
            case FIREFOX:
                System.out.println("Firefox browser");
                break;
            case SAFARI:
                System.out.println("Safari browser");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browser);
        }

    }
}
