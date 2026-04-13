package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Fluent48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fluent48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.17f, 4.163f)
            curveToRelative(-0.422f, -0.21f, -0.919f, -0.21f, -1.34f, 0f)
            lineToRelative(-12f, 6f)
            curveTo(11.32f, 10.418f, 11f, 10.937f, 11f, 11.505f)
            verticalLineToRelative(23.456f)
            curveToRelative(0f, 0.516f, 0.265f, 0.996f, 0.702f, 1.27f)
            lineToRelative(12f, 7.54f)
            curveToRelative(0.462f, 0.29f, 1.046f, 0.306f, 1.524f, 0.042f)
            curveTo(25.703f, 43.549f, 26f, 43.046f, 26f, 42.5f)
            verticalLineTo(30.432f)
            lineToRelative(11.17f, -5.585f)
            curveToRelative(0.51f, -0.254f, 0.83f, -0.774f, 0.83f, -1.342f)
            curveToRelative(0f, -0.568f, -0.321f, -1.087f, -0.83f, -1.342f)
            lineToRelative(-9.316f, -4.658f)
            lineToRelative(9.317f, -4.658f)
            curveTo(37.679f, 12.593f, 38f, 12.073f, 38f, 11.505f)
            curveToRelative(0f, -0.568f, -0.321f, -1.088f, -0.83f, -1.342f)
            lineToRelative(-12f, -6f)
            close()
        }
    }.build()
}
