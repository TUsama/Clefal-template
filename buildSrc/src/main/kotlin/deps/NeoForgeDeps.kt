package deps

object NeoForgeDeps {
    fun get(minecraft: String): List<VersionedDependency> {
        return buildDependencies{
            when (minecraft){
                "1.21.1" -> {
                    modstitchModImplementation ("maven.modrinth:curios:9.5.1+1.21.1")

                    "dev.anvilcraft.lib:anvillib-registrum-neoforge-1.21.1:2.0.0+snapshot.316".let {
                        modstitchModCompileOnly(it)
                        modstitchModRuntimeOnly(it)
                        modstitchJiJ (it)
                    }


                }


                "26.1.2" -> {

                    "dev.anvilcraft.lib:anvillib-registrum-neoforge-26.1:2.0.0+snapshot.328".let {
                        modstitchModCompileOnly(it)
                        modstitchModRuntimeOnly(it)
                        modstitchJiJ (it)
                    }
                }
            }
        }
    }
}