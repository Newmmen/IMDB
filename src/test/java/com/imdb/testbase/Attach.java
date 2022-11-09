package com.imdb.testbase;

    public class Attach extends AttachHelper {
        public static void addAttachments() {
            takeScreenShot();
            addPageSource();
            if(System.getProperty("selenide.remote") != null) {
                addVideo();
            }
            browserConsoleLog();
        }
}
