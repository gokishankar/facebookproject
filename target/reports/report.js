$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/eclipse-workspace/cucumberface/src/test/resources/Feature/face.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User should type invalid \"\u003cusername\u003e\" and invalid \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user have to get current url",
  "keyword": "And "
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.step({
  "name": "Validate user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "dhruv@123",
        "2345"
      ]
    },
    {
      "cells": [
        "Shankar@123",
        "456"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User should type invalid \"dhruv@123\" and invalid \"2345\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.user_should_type_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to get current url",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.user_have_to_get_current_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.validate_user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User should type invalid \"Shankar@123\" and invalid \"456\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.user_should_type_invalid_and_invalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to get current url",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.user_have_to_get_current_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.validate_user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/admin/eclipse-workspace/cucumberface/src/test/resources/Feature/forgotton.feature");
formatter.feature({
  "name": "To validate the Forgotten password in facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the valid email for forgotten password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@morning"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the forgotten password",
  "keyword": "When "
});
formatter.match({
  "location": "stepforgotten.user_have_to_click_the_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to Enter valid email",
  "rows": [
    {
      "cells": [
        "name",
        "variety1",
        "variety2"
      ]
    },
    {
      "cells": [
        "fruits",
        "apple",
        "Mango"
      ]
    },
    {
      "cells": [
        "flower",
        "jasmine",
        "lilly"
      ]
    },
    {
      "cells": [
        "vegetables",
        "carrot",
        "beetroot"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepforgotten.user_have_to_Enter_valid_email(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepforgotten.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
});