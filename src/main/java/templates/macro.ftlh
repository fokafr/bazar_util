<#-- create the macro variable: -->
<#macro test>
  Test text
</#macro>

<#-- call the macro: -->
<@test/>

------------ Now macro with parameters ----------------------

<#macro testParm foo bar baaz>
Test test, and the params: ${foo}, ${bar}, ${baaz}
</#macro>

<#-- call the macro with parameters: -->
<@testParm foo= "a" bar="b" baaz=5*5-2/>

<#-- Macro with parameters and default parameter values: -->
<#macro test foo bar="Bar" baaz=-1>
  Test text, and the params: ${foo}, ${bar}, ${baaz}
</#macro>
<@test foo="a" bar="b" baaz=5*5-2/>
<@test foo="a" bar="b"/>
<@test foo="a" baaz=5*5-2/>
<@test foo="a"/>

<#-- complex macro -->

<#macro list title items>
  <p>${title?cap_first}:
  <ul>
    <#list items as x>
      <li>${x?cap_first}
    </#list>
  </ul>
</#macro>
<@list items=["mouse", "elephant", "python"] title="Animals"/>

<#-- The nested directive-->

<#macro do_twice>
  1. <#nested>
  2. <#nested>
</#macro>

<@do_twice>something</@do_twice>

<#-- The nested directive can create loop variables for the nested content -->
<#macro do_thrice>
  <#nested 1>
  <#nested 2>
  <#nested 3>
</#macro>
<@do_thrice ; x>
  ${x} Anything.
</@do_thrice>

<#-- A more complex example -->

<#macro repeat count>
  <#list 1..count as x>
    <#nested x, x/2, x==count>
  </#list>
</#macro>
<@repeat count=4 ; c, halfc, last>
  ${c}. ${halfc}<#if last> Last!</#if>
</@repeat>