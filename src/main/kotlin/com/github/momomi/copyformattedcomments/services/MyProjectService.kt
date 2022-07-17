package com.github.momomi.copyformattedcomments.services

import com.intellij.openapi.project.Project
import com.github.momomi.copyformattedcomments.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
