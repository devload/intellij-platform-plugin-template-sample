package com.github.devload.intellijplatformplugintemplatesample.services

import com.github.devload.intellijplatformplugintemplatesample.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
