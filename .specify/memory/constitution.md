# AI Java E2E TAF Constitution
<!-- Example: Spec Constitution, TaskFlow Constitution, etc. -->

## Core Principles

### I. API-First Design
All test automation must target real API endpoints. Only the 'pet' category from Petstore is in scope. API contracts must be strictly followed and validated.

### II. Modern Java Stack
All code must use Java 21, Gradle 8, JUnit5, Retrofit, and AssertJ. Library versions are managed in gradle.properties. Gradle tasks use Groovy DSL.

### III. Test-Driven Development (NON-NEGOTIABLE)
All API calls must be covered by automated tests. TDD is mandatory: write tests first, then implement code to pass tests. Use AssertJ for assertions.

### IV. Integration & E2E Coverage
End-to-end tests must validate API workflows for the 'pet' category. Integration tests are required for all Retrofit client logic.

### V. Simplicity & Maintainability
Code must be simple, readable, and maintainable. Avoid unnecessary complexity. All dependencies and versions must be documented in gradle.properties.

### VI. Real API Test Implementation
All test automation MUST include actual, executable tests for API calls related to the 'pet' category. Stubs and placeholders are not sufficient; tests must validate real API behavior and contract compliance.

## Technology Stack Requirements
Java 21, Gradle 8, JUnit5, Retrofit, AssertJ. All dependencies must be declared in gradle.properties. Gradle tasks must use Groovy DSL. Only the 'pet' category API is in scope.

## Development Workflow & Quality Gates
All code changes require review. Tests must pass before merging. API contract changes require explicit approval. TDD and integration coverage are mandatory.

## Governance
This constitution supersedes all other practices for this project. Amendments require documentation, approval, and migration plan. All PRs/reviews must verify compliance with principles and technology stack. Complexity must be justified. Use README.md for runtime development guidance.

**Version**: 1.1.0 | **Ratified**: 2025-10-02 | **Last Amended**: 2025-10-02
<!-- Version: 1.1.0 | Ratified: 2025-10-02 | Last Amended: 2025-10-02 -->