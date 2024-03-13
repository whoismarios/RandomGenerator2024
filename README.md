# RandomGenerator2024

## Application Overview

The application features two distinct fragments, each serving a unique purpose within the user interface.

### Fragment One:

This fragment hosts a total of four interactive buttons, each with its own functionality:

- **Toast Button:** Initiates a brief message (Toast) displaying a predetermined text to the user.
- **Counter Button:** Increases a visible numerical value by one with each tap.
- **Reset Button:** Reverts the displayed numerical value to its initial state.
- **Random Button:** Generates a random number ranging from 0 up to the current displayed value. Upon generation, the application transitions to the second fragment to showcase the result.

### Fragment Two:

The second fragment is dedicated to displaying the outcome of the random number generation and provides further interaction:

- **Back Button:** Allows the user to return to the first fragment. This action also resets the counter to its original value, ensuring a fresh start upon return.
- A descriptive text explaining the range of the random number (e.g., "Number between 0 and X").
- The randomly generated number itself is prominently displayed for the user.

This structured approach allows users to navigate seamlessly between generating random numbers and reviewing the outcomes, with clear, concise functionalities assigned to each button.


## Getting Started

These instructions will get your copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before you begin, ensure you have the following installed:
- Android Studio Arctic Fox | 2020.3.1 or newer
- JDK 1.8

### Setting Up

1. **Clone the repository:**

```bash
git clone https://github.com/whoismarios/RandomGenerator2024.git
```

2. **Open Android Studio and import the project:**
   
Navigate to File > Open and select the project directory.


3. **Sync Gradle:**
After opening the project, allow Android Studio to automatically sync the project with Gradle files.
If it doesn't start automatically, you can trigger it manually by clicking on


***File > Sync Project with Gradle Files.***


4. **Run the application:**
   
Select an Android device or an emulator and run the application.


## Configuration
The project uses the following main configurations:

*Namespace:* com.example.randomgenerator2024
*Compile SDK Version:* 34
*Min SDK Version:* 24
*Target SDK Version:* 34
*Java Version:* 1.8


## Screenshots/ App UI and Functionality Demo

1. Startscreen
<img width="294" alt="Bildschirmfoto 2024-03-13 um 11 45 10" src="https://github.com/whoismarios/RandomGenerator2024/assets/103110817/e1ba2c1b-196f-46d3-9707-783a8a4dc0e0">

2. Toast Demo with onClick Eventlistener
<img width="279" alt="Bildschirmfoto 2024-03-13 um 11 45 30" src="https://github.com/whoismarios/RandomGenerator2024/assets/103110817/af1bb403-4d71-42e5-ace1-8d82f6f7a9b7">

3. Counter with number
<img width="290" alt="Bildschirmfoto 2024-03-13 um 11 45 51" src="https://github.com/whoismarios/RandomGenerator2024/assets/103110817/ad8d3af9-8156-4704-9e40-74b8245beb3e">

4. Random generated number on Second Fragment
<img width="280" alt="Bildschirmfoto 2024-03-13 um 11 46 02" src="https://github.com/whoismarios/RandomGenerator2024/assets/103110817/1bd4531e-fb03-46c6-b4c8-0a237170a4d5">

## Contributors

- **Marios Tzialidis** - [Marios Tzialidis](https://dft-it.com)
- **Jianbang Zhuang** - [Jianbang Zhuang](https://github.com/taylororz)



