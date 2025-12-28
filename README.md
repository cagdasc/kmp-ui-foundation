# KMP UI Foundation [![](https://jitpack.io/v/cagdasc/multiplatform-uikit.svg)](https://jitpack.io/#cagdasc/kmp-ui-foundation)

![Kotlin multiplatform](https://img.shields.io/badge/Kotlin-Multiplatform-blueviolet?style=for-the-badge)
![Android](https://img.shields.io/badge/Android-supported-brightgreen?style=for-the-badge)
![JVM](https://img.shields.io/badge/JVM-supported-brightgreen?style=for-the-badge)

A Kotlin Multiplatform **UI foundation library** focused on **theming and visual consistency** across platforms.

This repository contains **UI-only modules**. It intentionally depends on a separate **platform foundation project** for
platform abstractions, coroutines, and dependency injection.

The goal of this project is to provide a **shared, reusable UI base layer** that can be consumed by multiple
applications.

---

## Modules Overview

### `theme`

Cross-platform theming primitives and design tokens.

**Responsibilities**:

* Define colors, typography, shapes, spacing, and other design tokens
* Provide a consistent theming API across platforms
* Act as the base layer for higher-level UI components

---

## Module Usage

```kotlin
dependencies {
    implementation("com.github.cagdasc.kmp-ui-foundation:<version>")
}
```

---

## Future Scope

Planned additions may include:

* Additional theme modules (tokens, typography variants)
* Shared UI primitives (non-feature components)
* Expanded platform target support

---

## License

    Copyright 2025 Cagdas Caglak
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
