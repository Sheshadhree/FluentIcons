package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Blur24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Blur24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 12f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            curveToRelative(1.84f, 0f, 3.551f, 0.552f, 4.977f, 1.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(6.225f)
            curveToRelative(0.472f, 0.452f, 0.895f, 0.955f, 1.26f, 1.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(8.064f)
            curveToRelative(0.238f, 0.477f, 0.434f, 0.979f, 0.584f, 1.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(8.876f)
            curveTo(20.957f, 10.988f, 21f, 11.489f, 21f, 12f)
            horizontalLineToRelative(-9f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(8.945f)
            curveToRelative(-0.057f, 0.514f, -0.157f, 1.015f, -0.297f, 1.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(8.294f)
            curveToRelative(-0.223f, 0.528f, -0.495f, 1.03f, -0.81f, 1.5f)
            horizontalLineTo(12f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(6.708f)
            curveToRelative(-1.648f, 1.841f, -4.042f, 3f, -6.708f, 3f)
            curveToRelative(-4.97f, 0f, -9f, -4.03f, -9f, -9f)
            close()
        }
    }.build()
}
