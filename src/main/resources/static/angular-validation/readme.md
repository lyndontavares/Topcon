#Angular Validation (Directive / Service)
`Version: 1.4.21`
### Form validation after user stop typing (default 1sec).

Forms Validation with Angular made easy! Angular-Validation is an angular directive/service with locales (languages) with a very simple approach of defining your `validation=""` directly within your element to validate (input, textarea, etc) and...that's it!!! The directive/service will take care of the rest!

The base concept is not new, it comes from the easy form input validation approach of Laravel Framework as well as PHP Gump Validation. They both are built in PHP and use a very simple approach, so why not use the same concept over Angular as well? Well now it is available with few more extras.

For a smoother user experience, I also added validation on inactivity (timer/debounce). So validation will not bother the user while he is still typing... though as soon as the user pauses for a certain amount of time, then validation comes into play. It's worth knowing that this inactivity timer is only available while typing, if user focuses away from his input (onBlur) it will then validate instantly.

Supporting AngularJS 1.3/1.4 branch *(current code should work with 1.2.x just the same, but is no more verified)*

Now support <b>Service</b> using the same functionalities as the <b>Directive</b>.
Huge rewrite to have a better code separation and also adding support to Service functionalities. Specifically the `validation-rules` was separated to add rules without affecting the core while `validation-common` is for shared functions (shared by Directive/Service).

[Validation Summary](https://github.com/ghiscoding/angular-validation/wiki/Validation-Summary) was also recently added to easily show all validation errors that are still active on the form and you can also use 2 ways of dealing with the [Submit and Validation](https://github.com/ghiscoding/angular-validation/wiki/Form-Submit-and-Validation) button.

For more reasons to use it, see the answered question of: [Why Use It?](#whyuseit)

If you like the Angular-Validation project and you use it, please click on the **Star** and add it as a favorite. The more star ratings there is, the more chances it could be found by other users inside the popular trend section. That is the only support I ask you... thanks and enjoy it ;)

<a name="plunker"></a>
## Live Demo
[Plunker](http://plnkr.co/jADq7H)

## Tested with Protractor
Angular-validation now has a full set of **End-to-End tests** with **Protractor**, there is over 1800+ assertions, it starts by testing the original live demo page and then goes on with a complete test suite of All Validators in both the Angular-Validation Directive and Service.

<a name="whyuseit"></a>
Why use angular-validation?
-----
Angular-validation was develop with simplicity and DRY (Don't Repeat Yourself) concept in mind.
You can transform this:
```html
<input type="text" name="username" ng-model="user.username" ng-minlength="3" ng-maxlength="8" required />
<div ng-show="form.$submitted || form.user.$touched">
  <span ng-show="userForm.username.$error.minlength" class="help-block">Username is too short.</p>
  <span ng-show="userForm.username.$error.maxlength" class="help-block">Username is too long.</p>
</div>
<input type="text" name="firstname" ng-model="user.firstname" ng-minlength="3" ng-maxlength="50" required />
<div ng-show="form.$submitted || form.user.$touched">
  <span ng-show="userForm.firstname.$error.minlength" class="help-block">Firstname is too short.</p>
  <span ng-show="userForm.firstname.$error.maxlength" class="help-block">Firstname is too long.</p>
</div>
<input type="text" name="lastname" ng-model="user.lastname" ng-minlength="2" ng-maxlength="50" required />
<div ng-show="form.$submitted || form.user.$touched">
  <span ng-show="userForm.lastname.$error.minlength" class="help-block">Lastname is too short.</p>
  <span ng-show="userForm.lastname.$error.maxlength" class="help-block">Lastname is too long.</p>
</div>
```
into the following (errors will automatically be displayed in your chosen locale translation):
```html
<input type="text" name="username" ng-model="user.username" validation="min_len:3|max_len:8|required"  />
<input type="text" name="firstname" ng-model="user.firstname" validation="alpha_dash|min_len:3|max_len:50|required"  />
<input type="text" name="lastname" ng-model="user.lastname" validation="alpha_dash|min_len:2|max_len:50|required"  />
```
The Angular-Validation will create, by itself, the necessary error message. Now imagine your form having 10 inputs, using the documented Angular way will end up being 30 lines of code, while on the other hand `Angular-Validation` will stay with 10 lines of code, no more... so what are you waiting for? Use Angular-Validation!!!  Don't forget to add it to your favorite, click on the **Star** on top :)

Let's not forget the [Validation Summary](https://github.com/ghiscoding/angular-validation/wiki/Validation-Summary) which is also a great and useful way of displaying your errors to the user.

Another awesome feature recently added is the [Wiki - Remote Validation (AJAX)](https://github.com/ghiscoding/angular-validation/wiki/Remote-Validation-(AJAX)) which is useful for backend server validation.

Again another recently added feature, external 3rd party addon validation (like ngTagsInput or Angular Multi-Select), take a look at the [Wiki - 3rd party addon validation](https://github.com/ghiscoding/angular-validation/wiki/3rd-Party-Addons)


## Angular-Validation Wiki
All the documentation has been moved to the Wiki section, see the [github wiki](https://github.com/ghiscoding/angular-validation/wiki) for more explanation. If you just started with the library, then the most important page to read would be the [HOWTO - Step by Step](https://github.com/ghiscoding/angular-validation/wiki/HOWTO---Step-by-Step)

**Wiki Contents**
* [Angular-Validation Wiki](https://github.com/ghiscoding/angular-validation/wiki)
* Installation
    * [HOWTO - Step by Step](https://github.com/ghiscoding/angular-validation/wiki/HOWTO---Step-by-Step)
    * [Bower/NuGet Packages](https://github.com/ghiscoding/angular-validation/wiki/Download-and-Install-it)
    * [Locales (languages)](https://github.com/ghiscoding/angular-validation/wiki/Locales-(languages))
* Code Samples
    * [3rd Party Addon Validation](https://github.com/ghiscoding/angular-validation/wiki/3rd-Party-Addons)
    * [Directive Examples](https://github.com/ghiscoding/angular-validation/wiki/Working-Directive-Examples)
    * [Service Examples](https://github.com/ghiscoding/angular-validation/wiki/Working-Service-Examples)
    * [Bootstrap Decorator (has-error)](https://github.com/ghiscoding/angular-validation/wiki/Bootstrap-Decorator-(has-error))
* Functionalities
    * [Alternate Text on Validators](https://github.com/ghiscoding/angular-validation/wiki/Alternate-Text-on-Validators)
    * [DisplayErrorTo](https://github.com/ghiscoding/angular-validation/wiki/Bootstrap-Input-Groups-Wrapping)
    * [Isolated Scope](https://github.com/ghiscoding/angular-validation/wiki/Isolated-Scope)
    * [PreValidate Form (on load)](https://github.com/ghiscoding/angular-validation/wiki/PreValidate-Form-(on-page-load))
    * [Reset Form](https://github.com/ghiscoding/angular-validation/wiki/Reset-Form)
    * [Revalite an input triggered by another Input](https://github.com/ghiscoding/angular-validation/wiki/Revalidate-Input)
    * [Submit and Validation](https://github.com/ghiscoding/angular-validation/wiki/Form-Submit-and-Validation)
    * [Validation Callback](https://github.com/ghiscoding/angular-validation/wiki/Validation-Callback)
    * [Validator Remove](https://github.com/ghiscoding/angular-validation/wiki/Remove-Validator-from-Element)
    * [Validation Summary](https://github.com/ghiscoding/angular-validation/wiki/Validation-Summary)
* Custom Validations
    * [Custom Validation (JS)](https://github.com/ghiscoding/angular-validation/wiki/Custom-Validation-functions)
    * [Remote Validation (AJAX)](https://github.com/ghiscoding/angular-validation/wiki/Remote-Validation-(AJAX))
* Properties & Options
    * [Attributes (all options)](https://github.com/ghiscoding/angular-validation/wiki/Inputs-(local-options))
    * [Global Options](https://github.com/ghiscoding/angular-validation/wiki/Global-Options)
    * [ControllerAs Syntax](https://github.com/ghiscoding/angular-validation/wiki/ControllerAs-Syntax)
* Validators
    * [Available Validator Rules](https://github.com/ghiscoding/angular-validation/wiki/Available-Validators-(rules))
    * [Custom Regular Expression Pattern](https://github.com/ghiscoding/angular-validation/wiki/Regular-Expression-Pattern)
* Misc
    * [Changelog](https://github.com/ghiscoding/angular-validation/wiki/CHANGELOG)
    * [License](https://github.com/ghiscoding/angular-validation/wiki/License)

<a name="install"></a>
Download and Install it
-----
Install with **Bower**

```javascript
// You can install with
bower install angular-validation-ghiscoding

// or as another alias
bower install ghiscoding.angular-validation
```
Install with **NuGet** (see the [NuGet Package Here](http://www.nuget.org/packages/Angular-Validation-Ghiscoding))
```javascript
PM> Install-Package Angular-Validation-Ghiscoding
```
When used with IIS, you will need to map the JSON type
```html
<staticContent>
    <mimeMap fileExtension=".json" mimeType="application/json" />
</staticContent>
```

###License
[MIT License](http://www.opensource.org/licenses/mit-license.php)

###Available Validator Rules
All validators are written as `snake_case` but it's up to the user's taste and could also be used as `camelCase`. So for example `alpha_dash_spaces` and `alphaDashSpaces` are both equivalent.

##### NOTE: on an `input type="number"`, the `+` sign is an invalid character (browser restriction) even if you are using a `signed` validator. If you really wish to use the `+`, then change your input to a `type="text"`.

* `accepted` The field under validation must be `yes`, `on`, `1`, or `true`. Useful for validating "Terms of Service" acceptance.
* `alpha` Only alpha characters (including latin) are present (a-z, A-Z)
* `alpha_spaces` Only alpha characters (including latin) and spaces are present (a-z, A-Z)
* `alpha_num` Only alpha-numeric characters (including latin) are present (a-z, A-Z, 0-9)
* `alpha_num_spaces` Only alpha-numeric characters (with latin & spaces) are present (a-z, A-Z, 0-9)
* `alpha_dash` Only alpha-numeric characters + dashes, underscores are present (a-z, A-Z, 0-9, _-)
* `alpha_dash_spaces` Alpha-numeric chars + dashes, underscores and spaces (a-z, A-Z, 0-9, _-)
* `between:min,max` will auto-detect value type then use proper validator.
  * Type Number uses `between_num`, String use `between_len`.
* `between_date_iso:d1,d2` alias of `between_date_iso`.
* `between_date_euro_long:d1,d2` alias of `date_euro_long_between`.
* `between_date_euro_short:d1,d2` alias of `date_euro_short_between`.
* `between_date_us_long:d1,d2` alias of `date_us_long_between`.
* `between_date_us_short:d1,d2` alias of `date_us_short_between`.
* `between_len:min,max` Ensures the length of a string is between a min,max length.
* `between_num:min,max` Ensures the numeric value (int or float) is between a min,max number.
* `boolean` Ensures the value is `true` or `false` (`0` or `1` is also valid).
* `credit_card` Valid credit card number (AMEX, VISA, Mastercard, Diner's Club, Discover, JCB)
* `date_iso` Ensure date follows the ISO format (yyyy-mm-dd)
* `date_iso_between:d1,d2` Ensure date follows the ISO format and is between (d1) &amp; (d2)
* `date_iso_max:d` Date must follow ISO format and is lower or equal than date (d)
* `date_iso_min:d` Date must follow ISO format and is higher or equal than date (d)
* `date_euro_long` Date must follow the European long format (dd-mm-yyyy) or (dd/mm/yyyy)
* `date_euro_long_between:d1,d2` Date must follow European long format and is between (d1) &amp; (d2)
* `date_euro_long_max:d` Date must follow European long format and is lower or equal than date (d)
* `date_euro_long_min:d` Date must follow European long format and is higher or equal than date (d)
* `date_euro_short` Date must follow the Euro short format (dd-mm-yy) or (dd/mm/yy)
* `date_euro_short_between:d1,d2` Date must follow Euro short format and is between (d1) &amp; (d2)
* `date_euro_short_max:d` Date must follow Euro short format and is lower or equal than date (d)
* `date_euro_short_min:d` Date must follow Euro short format and is higher or equal than date (d)
* `date_us_long` Date must follow the US long format (mm-dd-yyyy) or (mm/dd/yyyy)
* `date_us_long_between:d1,d2` Date must follow the US long format and is between (d1) &amp; (d2)
* `date_us_long_max:d` Date must follow US long format and is lower or equal than date (d)
* `date_us_long_min:d` Date must follow US long format and is higher or equal than date (d)
* `date_us_short` Date must follow the US short format (mm-dd-yy) or (mm/dd/yy)
* `date_us_short_between:d1,d2` Date must follow the US short format and is between (d1) &amp; (d2)
* `date_us_short_max:d` Date must follow US short format and is lower or equal than date (d)
* `date_us_short_min:d` Date must follow US short format and is higher or equal than date (d)
* `different` alias of `different_input`
* `different_input:f` Must be different from another input field(f), where (f) must be the exact ngModel attribute of input field to compare to. The error message will use the input name or the `friendly-name` if it was provided on first input, ex.: `<input friendly-name="First Name".../>` will display :: *Field must be different from specified field "First Name"*.
* `different_input:f,t` Must be different from another input field(f), same as (different:f) but also include (t) for alternate input name to be displayed in the error message (it still uses a generic error message, if you really wish to replace the full error message then you should use `match:n:alt` see [:alt](https://github.com/ghiscoding/angular-validation/wiki/Alternate-Text-on-Validators))
* `digits:n` Ensures that field only has integer numbers and length precisely matches the specified length (n).
* `digits_between:min,max` Ensures that field only has integer numbers and is between a min,max length.
* `email` Checks for a valid email address
* `exact_len:n` Ensures that field length precisely matches the specified length (n).
* `float` as to be floating value (excluding integer)
* `float_signed` Has to be floating value (excluding int), could be signed (-/+) positive/negative.
* ~~`iban`~~ To properly validate an IBAN please use [Wiki - Custom Validation](https://github.com/ghiscoding/angular-validation/wiki/Custom-Validation-functions) with an external library like [Github arhs/iban.js](https://github.com/arhs/iban.js)

* `in` alias of `in_list`
* `in_list:foo,bar,..` Ensures the value is included inside the given list of values. The list must be separated by ',' and also accept words with spaces for example "ice cream".
* `int` Only positive integer (alias to `integer`).
* `integer` Only positive integer.
* `int_signed` Only integer, could be signed (-/+) positive/negative (alias to `integer_signed`).
* `integer_signed` Only integer, could be signed (-/+) positive/negative.
* `ip` alias of `ipv4`
* `ipv4` Check for valid IP (IPv4)
* `ipv6` Check for valid IP (IPv6)
* `match:f` Match another input field(f), where (f) must be the exact ngModel attribute of input field to compare to. The error message will use the `friendly-name` if it was provided on first input, ex.: `<input friendly-name="Password".../>` will display :: *Confirmation field does not match specified field "Password"*.
* `match:f,t` Match another input field(f), same as (match:f) but also include (t) for alternate input name to be displayed in the error message (it still uses a generic error message, if you really wish to replace the full error message then you should use `match:n:alt` see [:alt](https://github.com/ghiscoding/angular-validation/wiki/Alternate-Text-on-Validators))
* `match_input` alias of `match`.
* `max:n` will auto-detect value type then use proper validator.
  * Type Number uses `max_num`, String use `max_len`.
* `max_date_iso` alias of `date_iso_max`.
* `max_date_euro_long` alias of `date_euro_long_max`.
* `max_date_euro_short` alias of `date_euro_short_max`.
* `max_date_us_long` alias of `date_us_long_max`.
* `max_date_us_short` alias of `date_us_short_max`.
* `max_len:n` Checks field length, no longer than specified length where (n) is length parameter.
* `max_num:n` Checks numeric value to be lower or equal than the number (n).
* `min:n` will auto-detect value type then use proper validator.
  * Type Number uses `min_num`, String use `min_len`.
* `min_date_iso` alias of `date_iso_min`.
* `min_date_euro_long` alias of `date_euro_long_min`.
* `min_date_euro_short` alias of `date_euro_short_min`.
* `min_date_us_long` alias of `date_us_long_min`.
* `min_date_us_short` alias of `date_us_short_min`.
* `min_len:n` Checks field length, no shorter than specified length where (n) is length parameter.
* `min_num:n` Checks numeric value to be higher or equal than the number (n).
* `not_in` alias of `not_in_list`
* `not_in_list:foo,bar,..` Ensures the value is included inside the given list of values. The list must be separated by ',' and also accept words with spaces for example "ice cream".
* `numeric` Only positive numeric value (float, integer).
* `numeric_signed` Only numeric value (float, integer) can also be signed (-/+).
* `pattern` Ensure it follows a regular expression pattern... please see [Regular Expression Pattern](https://github.com/ghiscoding/angular-validation/wiki/Regular-Expression-Pattern)
* `required` Ensures the specified key value exists and is not empty
* `same` alias of `match`.
* `size` will auto-detect value type then use proper validator.
  * Type Number uses `exact_num`, String use `exact_len`.
* `time` Ensure time follows the format of (hh:mm) or (hh:mm:ss)
* `url` Check for valid URL or subdomain