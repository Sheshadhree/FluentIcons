package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowFlowUpRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFlowUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.854f, 2.147f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(13.293f, 5f)
            horizontalLineTo(9.5f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5.95f)
            curveTo(5.718f, 8.859f, 4.71f, 8f, 3.5f, 8f)
            curveTo(2.12f, 8f, 1f, 9.12f, 1f, 10.5f)
            reflectiveCurveTo(2.12f, 13f, 3.5f, 13f)
            curveToRelative(1.21f, 0f, 2.218f, -0.859f, 2.45f, -2f)
            horizontalLineTo(6.5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3.793f)
            lineToRelative(-2.147f, 2.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-3f, -3f)
            close()
            moveTo(5f, 10.5f)
            curveTo(5f, 11.328f, 4.328f, 12f, 3.5f, 12f)
            reflectiveCurveTo(2f, 11.328f, 2f, 10.5f)
            reflectiveCurveTo(2.672f, 9f, 3.5f, 9f)
            reflectiveCurveTo(5f, 9.672f, 5f, 10.5f)
            close()
        }
    }.build()
}
