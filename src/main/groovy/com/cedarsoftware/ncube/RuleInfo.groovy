package com.cedarsoftware.ncube

import com.cedarsoftware.util.CaseInsensitiveMap
import com.cedarsoftware.util.CaseInsensitiveSet
import groovy.transform.CompileStatic

/**
 * This class contains information about the rule execution.
 *
 * @author John DeRegnaucourt (jdereg@gmail.com)
 *         <br>
 *         Copyright (c) Cedar Software LLC
 *         <br><br>
 *         Licensed under the Apache License, Version 2.0 (the "License")
 *         you may not use this file except in compliance with the License.
 *         You may obtain a copy of the License at
 *         <br><br>
 *         http://www.apache.org/licenses/LICENSE-2.0
 *         <br><br>
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *         See the License for the specific language governing permissions and
 *         limitations under the License.
 */
@CompileStatic
class RuleInfo extends CaseInsensitiveMap<String, Object>
{
    // Convert Enums to String constants for performance gain
    private static final String RULES_EXECUTED = RuleMetaKeys.RULES_EXECUTED.name()
    private static final String RULE_STOP = RuleMetaKeys.RULE_STOP.name()
    private static final String SYSTEM_OUT = RuleMetaKeys.SYSTEM_OUT.name()
    private static final String SYSTEM_ERR = RuleMetaKeys.SYSTEM_ERR.name()
    private static final String ASSERTION_FAILURES = RuleMetaKeys.ASSERTION_FAILURES.name()
    private static final String LAST_EXECUTED_STATEMENT = RuleMetaKeys.LAST_EXECUTED_STATEMENT.name()
    private static final String AXIS_BINDINGS = RuleMetaKeys.AXIS_BINDINGS.name()

    RuleInfo()
    {
        // For speed, we are using the String (no function call - this code gets executed frequently)
        // Key = RuleMetaKeys.RULES_EXECUTED.name()
        put(RULES_EXECUTED, new ArrayList<MapEntry>())
    }

    /**
     * @return long indicating the number of conditions that fired (and therefore steps that executed).
     */
    long getNumberOfRulesExecuted()
    {
        return getAxisBindings().size()
    }

    void ruleStopThrown()
    {
        put(RULE_STOP, Boolean.TRUE)
    }

    /**
     * @return true if a RuleStop was thrown during rule execution
     */
    boolean wasRuleStopThrown()
    {
        return containsKey(RULE_STOP) && (Boolean.TRUE.equals(get(RULE_STOP)))
    }

    String getSystemOut()
    {
        if (containsKey(SYSTEM_OUT))
        {
            return (String) get(SYSTEM_OUT)
        }
        return ""
    }

    void setSystemOut(String out)
    {
        put(SYSTEM_OUT, out)
    }

    String getSystemErr()
    {
        if (containsKey(SYSTEM_ERR))
        {
            return (String) get(SYSTEM_ERR)
        }
        return ""
    }

    void setSystemErr(String err)
    {
        put(SYSTEM_ERR, err)
    }

    Set<String> getAssertionFailures()
    {
        if (containsKey(ASSERTION_FAILURES))
        {
            return (Set<String>) get(ASSERTION_FAILURES)
        }
        Set<String> failures = new CaseInsensitiveSet<>()
        put(ASSERTION_FAILURES, failures)
        return failures

    }

    void setAssertionFailures(Set<String> failures)
    {
        put(ASSERTION_FAILURES, failures)
    }

    Object getLastExecutedStatementValue()
    {
        if (containsKey(LAST_EXECUTED_STATEMENT))
        {
            return get(LAST_EXECUTED_STATEMENT)
        }
        return null
    }

    protected void setLastExecutedStatementValue(Object value)
    {
        put(LAST_EXECUTED_STATEMENT, value)
    }

    List<Binding> getAxisBindings()
    {
        if (containsKey(AXIS_BINDINGS))
        {
            return (List<Binding>)get(AXIS_BINDINGS)
        }
        List<Binding> bindings = new ArrayList<>()
        put(AXIS_BINDINGS, bindings)
        return bindings
    }
}
