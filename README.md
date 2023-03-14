# The Tic Tac Toe project

------------------------------------------------------------------

## Without JRE

### Build instructions

- Build distributions maven tool:

```bash
mvn -P without-jre clean package
```

- Use the following archives:
  - `target/tic-tac-toe-${project.version}-windows.zip` for Windows
  - `target/tic-tac-toe-${project.version}-unix.tar.gz` for MacOS and Linux

## Run instructions

- Download [OpenJDK 17](https://jdk.java.net/17/);
- Unzip the downloaded OpenJDK archive
- Configure the `PATH` environment variable:
  - Add `%JDK_HOME%\bin` directory for Windows;
  - Add `%JDK_HOME%/bin/` directory for MacOS and Linux;
- Re-login or restart computer;
- Unzip the Tic tac toe distribution:
  - Unzip `tic-tac-toe-${project.version}-windows.zip` for Windows;
  - Unzip `tic-tac-toe-${project.version}-unix.zip` for MacOS and Linux;
- Go to unzip directory;
- Run the game by double-click on the start script:
  - `start.cmd` for Windows;
  - `start.sh` for MacOS and Linux;
    
------------------------------------------------------------------------------------------------------------------------

## With JRE

### Build instructions

- Build distributions maven tool:

```bash
mvn -P with-jre clean package
```

- Use the following archives:
  - `target/tic-tac-toe-${project.version}-windows-with-jre.zip` for Windows
  - `target/tic-tac-toe-${project.version}-linux-with-jre.tar.gz` for Linux
  - `target/tic-tac-toe-${project.version}-macos-with-jre.tar.gz` for MacOS

### Run instructions

- Unzip the Tic tac toe distribution:
  - Unzip `tic-tac-toe-${project.version}-windows-with-jre.zip` for Windows;
  - Unzip `tic-tac-toe-${project.version}-linux-with-jre.tar.gz` for Linux;
  - `tic-tac-toe-${project.version}-macos-with-jre.tar.gz` for MacOS;
- Go to unzip directory;
- Run the game by double-click on the start script:
  - `start.cmd` for Windows;
  - `start.sh` for MacOS and Linux;

------------------------------------------------------------------------------------------------------------------------

## Readme tutorial

- https://guides.github.com/features/mastering-markdown/
- https://help.github.com/categories/writing-on-github/