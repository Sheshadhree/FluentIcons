package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextItalic20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextItalic20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.276f, 4f, 16f, 4f)
            horizontalLineToRelative(-3.157f)
            lineTo(8.227f, 16f)
            horizontalLineTo(11.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.776f, 17f, 11.5f, 17f)
            horizontalLineTo(4f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(3.724f, 16f, 4f, 16f)
            horizontalLineToRelative(3.156f)
            lineToRelative(4.615f, -12f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 4f, 8f, 3.776f, 8f, 3.5f)
            reflectiveCurveTo(8.224f, 3f, 8.5f, 3f)
            horizontalLineTo(16f)
            close()
        }
    }.build()
}
