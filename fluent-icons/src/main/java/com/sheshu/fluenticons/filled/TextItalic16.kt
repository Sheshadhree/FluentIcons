package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextItalic16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextItalic16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.8f, 2f)
            horizontalLineTo(7f)
            curveTo(6.584f, 2f, 6.25f, 2.336f, 6.25f, 2.75f)
            reflectiveCurveTo(6.584f, 3.5f, 7f, 3.5f)
            horizontalLineToRelative(2.01f)
            lineToRelative(-3.428f, 9f)
            horizontalLineTo(3.2f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(2.785f, 14f, 3.2f, 14f)
            horizontalLineTo(9f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(9.413f, 12.5f, 9f, 12.5f)
            horizontalLineTo(7.188f)
            lineToRelative(3.428f, -9f)
            horizontalLineTo(12.8f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.213f, 2f, 12.8f, 2f)
            close()
        }
    }.build()
}
