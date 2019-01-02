package com.apollographql.apollo.compiler.ir

import com.apollographql.apollo.compiler.NullableValueType
import javax.lang.model.element.Modifier

data class CodeGenerationContext(
    var reservedTypeNames: List<String>,
    val typeDeclarations: List<TypeDeclaration>,
    val fragmentsPackage: String = "",
    val typesPackage: String = "",
    val customTypeMap: Map<String, String>,
    val nullableValueType: NullableValueType,
    val ir: CodeGenerationIR,
    val useSemanticNaming: Boolean,
    val generateModelBuilder: Boolean,
    val useJavaBeansSemanticNaming: Boolean,
    val suppressRawTypesWarning: Boolean,
    val defaultAccessModifier: Modifier
)