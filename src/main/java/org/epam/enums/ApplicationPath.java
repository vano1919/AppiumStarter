package org.epam.enums;

public enum ApplicationPath {
    APP("https://github.com/cloudgrey-io/the-app/releases/download/v1.9.0/TheApp-v1.9.0.apk");

    private final String path;

    ApplicationPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
