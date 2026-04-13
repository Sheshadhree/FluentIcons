package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowFlowUpRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowFlowUpRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.207f, 2.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineTo(26.586f, 8.5f)
            horizontalLineTo(19f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-0.09f)
            curveTo(12.44f, 18.94f, 10.195f, 17f, 7.5f, 17f)
            curveTo(4.462f, 17f, 2f, 19.462f, 2f, 22.5f)
            reflectiveCurveTo(4.462f, 28f, 7.5f, 28f)
            curveToRelative(2.696f, 0f, 4.94f, -1.94f, 5.41f, -4.5f)
            horizontalLineTo(13f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(7.586f)
            lineToRelative(-4.793f, 4.793f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(6.5f, -6.5f)
            curveTo(29.895f, 10.02f, 30f, 9.765f, 30f, 9.5f)
            curveToRelative(0f, -0.265f, -0.105f, -0.52f, -0.293f, -0.707f)
            lineToRelative(-6.5f, -6.5f)
            close()
        }
    }.build()
}
