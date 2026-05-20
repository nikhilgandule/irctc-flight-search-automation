
Markdown# ✈️ IRCTC Flight Search Automation## 📌 Project OverviewThis project automates the flight search functionality of the IRCTC Air website using Selenium WebDriver. It simulates a real user journey by entering travel details, selecting options, performing a search, validating results, and capturing screenshots.🔗 Website: https://www.air.irctc.co.in/---## 🚀 Features- ✅ Multi-browser testing (Chrome & Firefox)- ✅ Dynamic city selection using auto-suggestions- ✅ Date picker handling (select current date)- ✅ Dropdown handling (Business class selection)- ✅ Flight search automation- ✅ Result validation (city & date verification)- ✅ Extraction of flight names and counts- ✅ Screenshot capture of results- ✅ Console logging for output- ✅ Proper test flow (open & close application)---## 🛠️ Tech Stack- **Language:** Java / Python  - **Automation Tool:** Selenium WebDriver  - **Test Framework:** TestNG / JUnit  - **Build Tool:** Maven / Gradle  - **Browsers Supported:** Chrome, Firefox  ---## 📂 Project StructureShow less
IRCTC-Flight-Search-Automation/
│
├── src/
│   ├── main/
│   └── test/
│
├── screenshots/
│   └── (Captured result images)
│
├── drivers/
│   └── (Browser drivers)
│
├── test-output/
│
├── pom.xml / requirements.txt
└── README.md

---

## ⚙️ Test Scenario
1. Launch IRCTC Air website  
2. Maximize browser window  
3. Enter **From city → Hyderabad (HYD)**  
4. Enter **To city → Pune (PNQ)**  
5. Select current date  
6. Choose **Business class**  
7. Click **Search**  
8. Validate result page (city & date)  
9. Extract:  
   - Flight names  
   - Total number of flights  
10. Capture screenshot  
11. Close browser  

---

## ▶️ How to Run

### 1. Clone the repository
```bash
git clone https://github.com/your-username/irctc-flight-search-automation.git

2. Navigate to project folder
Shellcd irctc-flight-search-automationShow more lines
3. Install dependencies

For Maven:

Shellmvn clean installShow more lines

For Python:

Shellpip install -r requirements.txtShow more lines
4. Run tests
Shellmvn testShow more lines

📸 Screenshots
Screenshots of search results are stored in the screenshots/ folder after execution.

✅ Validation Points

Correct website launch
Correct city selection (HYD → PNQ)
Date selection = current date
Class selection = Business
Matching search results
Accurate flight data extraction


💡 Key Learnings

Handling dynamic web elements
Working with auto-suggestions
Managing dropdowns (Bootstrap elements)
Selenium waits (implicit & explicit)
Cross-browser testing


👤 Author
Nikhil Gandule

---

## ✅ What was fixed
- Proper headings (`#`, `##`)
- Bullet points instead of inline text
- Removed `&amp;` errors
- Fixed spacing & alignment
- Added proper code blocks (```bash)
- Clean GitHub-friendly structure

---

If you want next level 🔥:
- Add **GitHub badges**
- Add **execution screenshots preview**
- Add **GIF demo of automation**

Just tell me 👍
