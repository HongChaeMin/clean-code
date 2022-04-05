package com.example.cleancode.main.chapter5;

import org.apache.coyote.Request;
import org.apache.coyote.Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Ex {

    public int countTestCases() {
        int count = 0;
        /*for (Test each : Tests)
            count += each.countTestCases();*/
        return count;
    }

    public static String page;

    private String makeResponse() {
        String pageName = getPageNameOrDefault();
        loadPage(pageName);
        return this.page == null ? notFoundResponse() : makePageResponse();
    }

    private String getPageNameOrDefault() {
        return "test";
    }

    private void loadPage(String pageName) {
        this.page = pageName;
    }

    private String notFoundResponse() {
        return "notFoundResponse";
    }

    private String makePageResponse() {
        return "makePageResponse";
    }

    private void measureLine(String line) {
        /*lineCount++;
        int lineSize = line.length();
        totalChars += lineSize;
        lineWidthHistogram.addLine(lineSize, lineCount);
        recordWidestLine(lineSize);*/
    }

    public static double root1(double a, double b, double c) {
        double determinant = determinant(a, b, c);
        return ((-b) + Math.sqrt(determinant)) / (2 * a);
    }

    public static double root2(int a, int b,  int c) {
        double determinant = determinant(a, b, c);
        return ((-b) - Math.sqrt(determinant)) / (2 * a);
    }

    private static double determinant(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private Request request;
    private Response response;
    private String context;
    protected long requestParsingTimeLimit;
    private long requestProgress;
    private long requestParsingDeadline;

}
