module Homework2.app.main {
    requires javafx.controls;
    requires com.google.gson;
    requires com.google.common;
    exports Homework2;
    opens Homework2 to com.google.gson;
}