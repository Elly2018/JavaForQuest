# Java For Quest (J4Q) Project
Digital Arts & Sciences Programs | Digital Worlds Institute | University of Florida

The J4Q project demonstrates how to create Virtual Reality apps for Meta Quest headsets as Native Android applications using Java in Android Studio. This project can be used as a setup for learning how to develop from scratch a basic game engine for Virtual Reality in Java. It can also be used along with a structured curriculum for teaching various topics related to game engine development such as: 3D Transformations using Matrices and Vectors, 3D geometry using triangular mesh, Animation loop, Shaders using GLSL, Controller input, Vibration feedback, and many other topics.   

## How to setup and run J4Q:

The following instructions will guide you step by step on how to setup and run J4Q in your system. The instructions include details for the following steps:

- Install all the required software. 
- Configure your headset.
- Open in Android studio the project file: `J4Q_46.0/JavaForQuest_Demo/Projects/Android/build.gradle`

### 1. Prerequisites

You need to install the following software to be able to compile Android software for Meta Quest headsets:

- The latest version of Android Studio: https://developer.android.com/studio
- From the SDK Manager of Android Studio install the SDK Platform 8.0 (Oreo) API Level 26
- From the SDK Manager of Android Studio install the SDK Tools: 1) NDK (21.0.6113669), 2) CMake (3.22.1)

### 2. Configure your Meta Quest headset

- Update the headset to the latest firmware and software by going to Quick Settings (where the time and battery status is shown) -> Settings -> Software Update
- Enable Developer Mode by using the Meta Quest app

### 3. Run the Java For Quest (J4Q) Project

- Open in Android studio the project file: `J4Q_46.0/JavaForQuest_Demo/Projects/Android/build.gradle`
- Connect your Quest headset to your development computer using the charging cable.
- In Quest accept the pop-up permission dialog.
- When your device appears in the device list in Android Studio, click on the Run button to compile the project and install it in your headset.
- Test the J4Q Demo app in your headset.
- You can find and start the app in your Quest headset in your Library and select 'Unknown Sources'. 

## Tested with the following system configuration:

- Android Studio Dolphin 2021.3.1 Patch 1
- Android SDK Platform 8.0 (Oreo) API Level 26
- Gradle 6.1.1
- NDK 21.0.6113669
- CMake 3.22.1
- MacOS 12.5 Monterey (Development system)
- Meta Quest 1 & 2 (Testing systems)

## Troubleshooting

### Gradle sync failed: NDK Not Configured

Go to File -> Project Structure -> SDK Location and download NDK or select one from the list (if any). After that a file `local.properties` with the parameters `sdk.dir` and `ndk.dir` will automatically be generated inside the folder `JavaForQuest_Demo\Projects\Android`. If the file does not contain the `ndk.dir` you can edit the text and append a line after the `sdk.dir=...` with the path to your NDK. For example: `ndk.dir=...some path.../Android/sdk/ndk/21.0.6113669`. Finally, copy the `local.properties` file and paste it in the `J4Q_46.0` folder. Then build again the project by clicking on the "try again" button on top of the text editor, when viewing the local.properties file.

### Execution failed for task ':JavaForQuest_Demo:Projects:Android:genDebugKeystore'. Process 'command 'python3'' finished with non-zero exit value 1

In terminal go to the folder `JavaForQuest_Demo\Projects\Android` and run `python3 ../../../bin/scripts/build/ovrbuild_keystore.py`. This step requires prior installation of python as well as setting the system variables `ANDROID_NDK_HOME` and `ANDROID_HOME`.

### Setting Android Studio as a Developer Tool in Mac

In MacOS it is helpful if you set Android Studio as a Developer Tool. First, enable Developer Mode by opening the Terminal and typing `spctl developer-mode enable-terminal`. Then in System Preferences go to Security & Privacy and in the Privacy Tab, go to the option Developer Tools and add Android Studio.
