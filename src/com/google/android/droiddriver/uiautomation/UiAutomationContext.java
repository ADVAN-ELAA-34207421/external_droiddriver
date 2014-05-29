/*
 * Copyright (C) 2013 DroidDriver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.droiddriver.uiautomation;

import android.app.Instrumentation;
import android.view.accessibility.AccessibilityNodeInfo;

import com.google.android.droiddriver.uiautomation.base.BaseUiAutomationContext;

class UiAutomationContext extends BaseUiAutomationContext<UiAutomationElement> {
  UiAutomationContext(Instrumentation instrumentation, UiAutomationDriver driver) {
    super(instrumentation, driver);
  }

  @Override
  protected UiAutomationElement newUiElement(AccessibilityNodeInfo node, UiAutomationElement parent) {
    return new UiAutomationElement(this, node, parent);
  }
}
