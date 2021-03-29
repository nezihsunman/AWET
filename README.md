# AWET

AWET (Automated Web application testing based on Exploratory Testing) is a tool that takes a set of recorded test cases as input to generate further test cases for Web applications. Test cases should be provided in the form of JUnit tests that can be executed by Selenium. AWET crawls the application to explore it and to create a test model for generating test cases automatically. It exploits the input test cases to steer this process rather than just randomly crawling the application.

AWET uses [Selenium](https://www.selenium.dev/) as well as an extended version of [Crawljax](https://github.com/crawljax/).

The runtime platform and the experimental setup are adopted from another open source project, [DANTE](https://github.com/matteobiagiola/ICST20-submission-material-DANTE). Some of the setup instructions that are listed below are the same as those listed for the DANTE project. Nevertheless, we share (repeat) these instructions together with those specific for AWET for the sake of completeness.

Note that the generated test cases depend on the set of recorded test cases, which are provided as input. This repository also includes a set of sample test cases recorded for 5 Web applications and the corresponding results.

## 1. Ready-to-use Setup

A virtual machine running Ubuntu 18.04 LTS is available for download [here](https://drive.google.com/file/d/1PAbpgt1Atx6GpTwRZRM0heNLs8IDfbwo/view?usp=sharing) . The virtual machine contains this repository and all the dependencies needed to run the system.

The virtual machine was created with VirtualBox and was exported in the `.ova` format, a platform-independent distribution format for virtual machines. It can be imported by any virtualization software although it was tested only on VirtualBox. Instructions on how to import an `.ova` format virtual machine in VirtualBox are listed below:
https://www.techjunkie.com/ova-virtualbox/

The project should be cloned to the workspace folder of virtual box and absolute paths in the docker scripts must be updated.

Like
private static final String BASE_FILE_FOLDER_PATH = "/home/nezihsunman/Desktop/Tests";
to
private static final String BASE_FILE_FOLDER_PATH = "/home/icst20-dante/Desktop/Tests";

Hints:
With using Intellij idea shortcut CTRL + Shift + R  and replace nezihsunman to  icst20-dante.

## 2. Crawling
Project running script [run-crawling.sh](https://github.com/nezihsunman/AWET/blob/master/awet/run-crawling.sh).

The first argument is the `application_name`. The available values are:
- `phoenix|dimeshift|splittypie|retroboard|petclinic`

The second argument is the `headless` flag which determines if the browser starts headless or with the GUI. The available values are:
- `true|false`

The third argument is a number, `crawling_max_runtime` which determines a timeout for the crawler.

- `./run-crawling.sh dimeshift false 5` (the crawler terminates the exploration in ~3 min)

After the crawling the folder `awet/applications/dimeshift/localhost/crawl-with-inputs` is created, which contains the results of the crawling. In the folder `awet/applications/dimeshift` there is a file called `selenium-actions-dimeshift-fired.txt` which lists the test cases created by the crawler while it was exploring the application. The crawling generates around 18 tests.

## 3. Generating test cases

In this step the `awet/applications/dimeshift/seletion-actions-dimeshift-fired.txt` is used to generate the test suite. The script to create the test suite and run it is [generate-java-project-from-crawling.sh](https://github.com/nezihsunman/AWET/blob/master/awet/generate-java-project-from-crawling.sh).

The first argument is `application_name` and the second argument is `headless`. Following with the `dimeshift` example the command to run is:
- `./generate-java-project-from-crawling.sh dimeshift false`

The command generates the java project with the test suite and runs it. It also collects the coverage of all tests.

However, there may still be errors in run time due to the system's own dynamics. This is due to the change in the codes of the java project according to the environment used.

## 4. Fixing flakiness in created JUnit test cases
In the running example with the `dimeshift` application, the test suite is not flaky. In general, AWET does not fix flakiness automatically, therefore the generated test suite needs to be fixed. In particular the applications `splittypie` and `phoenix` are challenging in terms of flakiness since in `splittypie` there are many notifications that hide Web elements and the menu in `phoenix` is not deterministic (the order of the items in the menu keeps changing).

Another task that has to be performed manually is the implementation of the reset state class, which is called both by the validation script (i.e. `tedd`) and when the tests are run in isolation (i.e. `atusa` and `crawljax`). An example is the [ResetAppState](https://github.com/anon-icst2020/ICST20-submission-material-DANTE/blob/master/dante/applications/dimeshift/testsuite-dimeshift/src/main/java/utils/ResetAppState.java) class of the `dimeshift` application. 

However, with the `dimeshift` application, it is not needed to implement the reset state class, since closing the browser after each test case execution is enough to completely clean up the state of the web application.

## 5. Comparing results with other tools
The script to execute the tests and measure coverage is [run-tests-and-measure-coverage.sh](https://github.com/nezihsunman/AWET/blob/master/awet/run-tests-and-measure-coverage.sh). The first argument is the `application_name`, the second argument is the `headless` flag and the third argument is the `tool ` like `dante` and `crawljax`. The fourth argument is the `extraction_strategy` but it is required only when the `tool` is `dante`.
AWET employs an extended version of Crawljax. Hence, the `headless` and `tool ` arguments should be set as `true` and `crawljax`, respectively for using AWET.

To run the tests and measure coverage for the `dimeshift` application we execute the following command for instance:
- `./run-tests-and-measure-coverage.sh dimeshift true crawljax`

The log files `logs_RunTests_[technique]_dimeshift.txt` in the `Desktop` folder report the tests that passed as well as the tests that broke. The log files `logs_MeasureCoverageOfTests_[technique]_dimeshift.txt` in the `Desktop` folder report the code coverage achieved by the non-broken tests.


