** I came across this challenge of handling Shadow DOM WebElements in test automation using Selenium WebDriver. There is no direct support for handling Shadow DOM elements with Selenium API. But there is a workaround to handle them using JavascriptExecutor executeScript() function with the WebDriver.

>> you will find "io.github.sukgu" this dependency at the "pom.xml" file that let it easier for you in a more readable way.

Now let’s see what Shadow DOM is at first, Checkout the attached diagram below:

 

 

** So the usual way of finding an element with Selenium WebDriver using Locators won’t work here,  it will throw 'NoSuchElementException'. And if you look at the DOM structure, every element that has ShadowDOM also has a ShadowRoot property which describes the underlying element. Shadow DOM provides encapsulation for the JavaScript, CSS, and templating in a Web Component.

 

Shadow DOM: Allows hidden DOM trees to be attached to elements in the regular DOM tree. PFB for the DOM terminology to be aware of:

Shadow host: The regular DOM node that the shadow DOM is attached to.

Shadow tree: The DOM tree inside the shadow DOM.

Shadow boundary: The place where the shadow DOM ends, and the regular DOM begins.

Shadow Root: 

The root node of the shadow tree.
![image](https://user-images.githubusercontent.com/38625749/230884079-29dccc27-8114-46a9-9393-134a7c579fcd.png)
