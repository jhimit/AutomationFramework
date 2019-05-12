$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "first test case",
  "description": "",
  "id": "test;first-test-case",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "two numbers to add",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I perfomr add operation",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "result should show the additon of numbers",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationTest.two_numbers_to_add()"
});
formatter.result({
  "duration": 316305467,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationTest.i_perfomr_add_operation()"
});
formatter.result({
  "duration": 29829,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationTest.result_should_show_the_additon_of_numbers()"
});
formatter.result({
  "duration": 188412,
  "status": "passed"
});
formatter.uri("UITesting.feature");
formatter.feature({
  "line": 1,
  "name": "Search testing on google.com",
  "description": "",
  "id": "search-testing-on-google.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify the search operarion on google",
  "description": "",
  "id": "search-testing-on-google.com;verify-the-search-operarion-on-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Google Url \"https://www.google.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search \"apple\" to the page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "It should show search result page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com",
      "offset": 12
    }
  ],
  "location": "ApplicationTest.google_Url(String)"
});
formatter.result({
  "duration": 8024044694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "apple",
      "offset": 10
    }
  ],
  "location": "ApplicationTest.i_search_to_the_page(String)"
});
formatter.result({
  "duration": 4387641343,
  "status": "passed"
});
formatter.match({
  "location": "ApplicationTest.it_should_show_search_result_page()"
});
formatter.result({
  "duration": 13254957,
  "status": "passed"
});
});