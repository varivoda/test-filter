package com.mutedtests.example;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;
import java.util.Optional;

/**
 * Created by Ivan Varivoda 19/05/2020
 */
public class IgnoreMutedTestsCondition implements ExecutionCondition {

    private TMSClient tmsClient = new TMSClient();

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {

        Optional<Method> method = context.getTestMethod();

        if (method.isEmpty()) {
            return ConditionEvaluationResult.enabled("");
        }

        return tmsClient.isTestMuted(method.get().getName()) ?
                ConditionEvaluationResult.disabled("test is moted") : ConditionEvaluationResult.enabled("");

    }

}
