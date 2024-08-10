Here’s a README file for your JEE project:

---

# Word Occurrence Web App

## Overview

The Word Occurrence Web App is a Java EE (JEE) web application designed to count the occurrences of words in a given text. The application is built using servlets, JSP, and an EJB session bean. It includes functionalities for starting a session, entering text, and displaying the number of occurrences of each word.

## Project Structure

- **`StartSessionServlet.java`**: Initializes a session and redirects to the start page.
- **`OccurrentServlet.java`**: Processes the input text, counts word occurrences using an EJB session bean, and forwards the results to the output JSP page.
- **`start.html`**: The start page where users can initiate a session.
- **`output.jsp`**: Displays the count of each word in the input text.
- **`textInput.html`**: Provides a form for users to enter text and submit for processing.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- Apache Tomcat or any compatible JEE application server
- Java EE libraries (for servlets, JSP, EJB)

## Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/NkgopolengGift/WordOccurentWenApp.git
   cd WordOccurentWenApp
   ```

2. **Compile and Package:**
   Use your build tool (e.g., Maven or Gradle) to compile and package the application.
   ```bash
   mvn clean package
   ```

3. **Deploy to Application Server:**
   - Copy the generated WAR file from the `target` directory.
   - Deploy it to your application server (e.g., Apache Tomcat) by placing it in the `webapps` directory or using the server's deployment manager.

4. **Start the Application Server:**
   - Start your application server if it is not already running.

5. **Access the Application:**
   Open your web browser and navigate to:
   ```text
   http://localhost:8080/WordOccurentWenApp
   ```

## How to Use

1. **Start the Session:**
   - Navigate to `start.html` and click the "START" button to initiate a new session.

2. **Enter Text:**
   - After starting the session, you will be redirected to a page where you can enter the text you want to analyze.
   - Submit the text by clicking "CHECK NUMBER OF OCCURENT."

3. **View Results:**
   - The application will display the number of occurrences for each word in the input text on the `output.jsp` page.

## EJB Session Bean

- **`WordOccurentSBLocal`**: A stateless session bean used to count word occurrences.

## Known Issues

- Ensure the application server and JEE libraries are properly configured.
- Check for any deployment issues if the application does not start as expected.

## Future Enhancements

- Add more detailed error handling.
- Improve the user interface with additional styling and features.
- Optimize the word counting logic for large texts.

Feel free to modify the content to better fit your project's specific details and your contact information!
