package moe.emilia.learn.pojo;

public class SystemInfo {
    private String version;
    private String intro;

    public SystemInfo(String version,String intro) {
        this.version = version;
        this.intro = intro;
    }

    public String getVersion() {
        return version;
    }

    public String getIntro() {
        return intro;
    }
}
