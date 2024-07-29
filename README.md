
# Scala Chisel Learning Journey


[![Join the chat at https://gitter.im/merledu/scala-chisel-learning-journey](https://badges.gitter.im/merledu/scala-chisel-learning-journey.svg)](https://gitter.im/merledu/scala-chisel-learning-journey?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Welcome to my Scala Chisel learning journey repository. This repository is dedicated to my functional programming assignments and experiments with Scala and Chisel.

## Dependencies

### JDK 8 or newer
To run Scala and Chisel, you need JDK 8 or newer. You can install OpenJDK with the following commands:

```bash
sudo apt-get install openjdk-11-jdk
sudo apt-get install openjdk-11-jre
```

### SBT
SBT is the most common build tool in the Scala community. You can download it [here](https://www.scala-sbt.org/download.html).

### VERILATOR
Verilator is a Verilog simulator that you can install with the following command:

```bash
sudo apt-get install verilator
```

## How to Get Started

1. **Fork this repository**: Fork this repository to your own individual profile.
2. **Clone the repository**: Clone the forked repository to your local machine.
3. **Run tests**: Navigate to the repository directory and run:

   ```sh
   sbt test
   ```

   You should see a whole bunch of output that ends with something like the following lines:

   ```
   [info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
   [info] All tests passed.
   [success] Total time: 5 s, completed Dec 16, 2020 12:18:44 PM
   ```

   If you see the above, then...

## It Worked!

You are ready to go. The next step is to go inside the `docs/` folder where you will find the labs to perform.
