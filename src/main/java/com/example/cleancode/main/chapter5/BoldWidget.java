package com.example.cleancode.main.chapter5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoldWidget {
    public static final String REGEXP = "'''.+?'''";
    private static final Pattern pattern = Pattern.compile("'''(.+?)'''", Pattern.MULTILINE + Pattern.DOTALL);

   /* public BoldWidget(ParentWiget parent, String text) throws Exception {
        super(parent);
        Matcher match = pattern.matcher(text);
        match.find();
        addChildWidgets(match.group(1));
    }

    public String render() throws Exception {
        StringBuffer html = new StringBuffer("<b>");
        html.append(childHtml()).append("<b>");
        return html.toString();
    }*/
}
