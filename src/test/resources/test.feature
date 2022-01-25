Feature: I want open the web-site

  Scenario Outline: Open page
    When I open the <url> site page
    Then Page opened
    And Enter "Poco x3 pro" in search field
    And Click on Найти
    Then Navigate to the neededProduct
    And Select neededProduct on item page
    Then Scroll to Добавить в корзину button
    And Exit pop-up
    And Click on Добавить в корзину button

    Examples:
      | url                       |
      | "https://www.mvideo.ru/"  |






