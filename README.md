✈️ IRCTC Flight Search Automation 📌 Project Overview This project automates the flight search functionality of the IRCTC Air website using Selenium WebDriver. It simulates a real user journey by entering travel details, selecting options, performing a search, validating results, and capturing screenshots. 🔗 Website: https://www.air.irctc.co.in/

🚀 Features

✅ Multi-browser testing (Chrome & Firefox) ✅ Dynamic city selection using auto-suggestions ✅ Date picker handling (select current date) ✅ Dropdown handling (Business class selection) ✅ Flight search automation ✅ Result validation (city & date verification) ✅ Extraction of flight names and counts ✅ Screenshot capture of results ✅ Console logging for output ✅ Proper test flow with application open & close steps

🛠️ Tech Stack

Language: Java / Python (update according to your implementation) Automation Tool: Selenium WebDriver Test Framework: TestNG / JUnit (if used) Build Tool: Maven / Gradle (if applicable) Browsers Supported: Chrome, Firefox

📂 Project Structure IRCTC-Flight-Search-Automation/ │ ├── src/ │ ├── main/ │ └── test/ │ ├── screenshots/ │ └── (Captured result images) │ ├── drivers/ │ └── (Browser drivers) │ ├── test-output/ │ ├── pom.xml / requirements.txt └── README.md

⚙️ Test Scenario

Launch IRCTC Air website Maximize browser window Enter From city → Hyderabad (HYD) Enter To city → Pune (PNQ) Select current date Choose Business class Click Search Validate result page (city & date) Extract:

Flight names Total number of flights

Capture screenshot Close browser

▶️ How to Run

Clone the repository: Shellgit clone https://github.com/your-username/irctc-flight-search-automation.gitShow more lines

Navigate to project folder: Shellcd irctc-flight-search-automation``Show more lines

Install dependencies:

For Maven: Shellmvn clean installShow more lines

For Python: Shellpip install -r requirements.txtShow more lines

Run tests:

TestNG / JUnit via IDE or: Shellmvn testShow more lines

📸 Screenshots Screenshots of search results are stored in the screenshots/ folder after execution.

✅ Validation Points

Correct website launch Correct city selection (HYD → PNQ) Date selection = current date Class selection = Business Matching search results Accurate flight data extraction

💡 Key Learnings

Handling dynamic web elements Working with auto-suggestions Managing dropdowns (Bootstrap elements) Selenium waits (implicit/explicit) Cross-browser testing

👤 Author Nikhil Gandule
