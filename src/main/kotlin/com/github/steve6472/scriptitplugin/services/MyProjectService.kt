package com.github.steve6472.scriptitplugin.services

import com.intellij.openapi.project.Project
import com.github.steve6472.scriptitplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
