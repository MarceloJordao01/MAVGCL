#! /bin/bash

jlink --no-header-files --no-man-pages --compress=2 --strip-debug --add-modules java.se,jdk.httpserver,javafx.controls,javafx.fxml --output ./target --module-path ./jmods

jpackage --input target/deploy/ --name MAVGAnalysis --main-jar MAVGCL-0.0.1.jar --main-class com.comino.flight.MainApp --type msi --icon target/deploy/MAVGAnalysis.icns --runtime-image ./target/custom_jre --java-options '-Djava.library.path=./native --add-opens javafx.base/com.sun.javafx.collections=ALL-UNNAMED -XX:+UnlockExperimentalVMOptions  '