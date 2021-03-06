package org.jboss.jbossset.bugclerk.cli;

import org.jboss.set.aphrodite.config.TrackerType;

import com.beust.jcommander.Parameter;

public class CommonArguments {

    @Parameter(names = { "-?", "--help" }, description = "print help text", required = false)
    private boolean help = false;

    @Parameter(names = { "-d", "--debug" }, description = "debug mode", required = false)
    private boolean debug = false;

    @Parameter(names = { "-x", "--xml-file" }, description = "Filepath to store the report as XML - no report is generated if option omitted", required = false)
    private String xmlReportFilename;

    @Parameter(names = { "-h", "--html-report" }, description = "Create an html report, on top of the XML one", required = false)
    private String htmlReportFilename;

    @Parameter(names = { "-u", "--bugzilla-username" }, description = "username for tracker's authentification", required = true)
    private String username;

    @Parameter(names = { "-p", "--bugzilla-password" }, description = "password for tracker's authentification", required = true)
    private String password;

    @Parameter(names = { "-c", "--comment-on-bz" }, description = "add a comment to a BZ featuring violations, default is false", required = false)
    private boolean reportToBz = false;

    @Parameter(names = { "-F", "--fail-on-violation" }, description = "exit program with status equals to number of violations", required = false)
    private boolean failOnViolation = false;

    @Parameter(names = { "-t", "--tracker-type" }, description = "Tracker type (true for bugzilla, false for JIRA)", converter = TrackerTypeConverter.class)
    private TrackerType trackerType = TrackerType.BUGZILLA;

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public String getXmlReportFilename() {
        return xmlReportFilename;
    }

    public void setXmlReportFilename(String xmlReportFilename) {
        this.xmlReportFilename = xmlReportFilename;
    }

    public String getHtmlReportFilename() {
        return htmlReportFilename;
    }

    public void setHtmlReportFilename(String htmlReportFilename) {
        this.htmlReportFilename = htmlReportFilename;
    }

    public boolean isXMLReport() {
        return !(this.xmlReportFilename == null || "".equals(this.xmlReportFilename));
    }

    public boolean isHtmlReport() {
        return !(this.htmlReportFilename == null || "".equals(this.htmlReportFilename));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isReportToBz() {
        return reportToBz;
    }

    public void setReportToBz(boolean reportToBz) {
        this.reportToBz = reportToBz;
    }

    public boolean isFailOnViolation() {
        return failOnViolation;
    }

    public void setFailOnViolation(boolean isFailOnViolation) {
        this.failOnViolation = isFailOnViolation;
    }

    public TrackerType getTrackerType() {
        return trackerType;
    }

    public void setTrackerType(TrackerType trackerType) {
        this.trackerType = trackerType;
    }

    @Override
    public String toString() {
        return "AbstractCommonArguments [help=" + help + ", debug=" + debug + ", xmlReportFilename=" + xmlReportFilename
                + ", htmlReportFilename=" + htmlReportFilename + ", username=" + username + ", password=" + password
                + ", reportToBz=" + reportToBz + ", failOnViolation=" + failOnViolation + ", trackerType=" + trackerType + "]";
    }
}
