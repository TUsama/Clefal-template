package deps

import org.gradle.api.artifacts.ExternalModuleDependency
import org.gradle.kotlin.dsl.accessors.runtime.addDependencyTo

object LoomDeps {
    fun get(minecraft: String): List<VersionedDependency> {
        return buildDependencies{
            when (minecraft) {
                ("1.20.1") -> {
                    modstitchModCompileOnly ("dev.emi:trinkets:3.7.2")
                    modstitchModImplementation("com.tterrag.registrate_fabric:Registrate:1.3.79-MC1.20.1")
                    modstitchJiJ("com.tterrag.registrate_fabric:Registrate:1.3.79-MC1.20.1")
                   

                    modstitchModImplementation ("curse.maven:modmenu-308702:5162837")
                   
                }

                ("1.21.1") -> {
                    modstitchModCompileOnly ("dev.emi:trinkets:3.10.0")
                    modstitchModCompileOnly ("curse.maven:accessories-938917:5727156")
                    modstitchModImplementation("com.tterrag.registrate_fabric:Registrate:1.3.77-MC1.21.1")
                    modstitchJiJ("com.tterrag.registrate_fabric:Registrate:1.3.77-MC1.21.1")
                    
                }

                ("1.21.4") -> {
                    
                }
            }
        }
    }

}