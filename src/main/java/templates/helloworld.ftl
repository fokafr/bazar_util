<#import "lib/utils.ftl" as u>
<@u.page>
  <p>${exampleObject.name} by ${exampleObject.developer}</p>

  <ul>
    <#list syst as system>
      <li>${system_index + 1}. ${system.name} from ${system.developer}</li>
    </#list>
  </ul>

  <#-- Just another example of using a macro: -->
  <@u.otherExample p1=11 p2=22 />
</@u.page>