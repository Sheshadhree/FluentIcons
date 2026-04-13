package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextItalic16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextItalic16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 2f)
            horizontalLineTo(7f)
            curveTo(6.724f, 2f, 6.5f, 2.224f, 6.5f, 2.5f)
            reflectiveCurveTo(6.724f, 3f, 7f, 3f)
            horizontalLineToRelative(2.474f)
            lineTo(5.656f, 13f)
            horizontalLineTo(3f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(2.724f, 14f, 3f, 14f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.276f, 13f, 9f, 13f)
            horizontalLineTo(6.726f)
            lineToRelative(3.818f, -10f)
            horizontalLineTo(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.276f, 2f, 13f, 2f)
            close()
        }
    }.build()
}
