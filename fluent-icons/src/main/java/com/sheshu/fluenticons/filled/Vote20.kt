package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Vote20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Vote20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 9f)
            horizontalLineToRelative(-1.268f)
            lineToRelative(1.732f, -3f)
            curveToRelative(0.276f, -0.478f, 0.112f, -1.09f, -0.366f, -1.366f)
            lineTo(11f, 3.134f)
            curveTo(10.522f, 2.858f, 9.91f, 3.022f, 9.634f, 3.5f)
            lineToRelative(-2.5f, 4.33f)
            curveTo(6.912f, 8.215f, 6.974f, 8.687f, 7.257f, 9f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 9f, 6f, 9.224f, 6f, 9.5f)
            reflectiveCurveTo(6.224f, 10f, 6.5f, 10f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 9f, 13.5f, 9f)
            close()
            moveToRelative(-3f, -5f)
            lineToRelative(2.598f, 1.5f)
            lineToRelative(-2.02f, 3.5f)
            horizontalLineTo(9.16f)
            lineTo(8f, 8.33f)
            lineTo(10.5f, 4f)
            close()
            moveToRelative(4.037f, 3f)
            lineTo(13.96f, 8f)
            horizontalLineToRelative(0.54f)
            lineToRelative(2.25f, 3f)
            horizontalLineTo(3.25f)
            lineTo(5.5f, 8f)
            horizontalLineToRelative(0.406f)
            curveToRelative(0.02f, -0.058f, 0.046f, -0.115f, 0.078f, -0.17f)
            lineTo(6.464f, 7f)
            horizontalLineTo(5.5f)
            curveTo(5.185f, 7f, 4.889f, 7.148f, 4.7f, 7.4f)
            lineToRelative(-2.5f, 3.333f)
            curveToRelative(-0.13f, 0.173f, -0.2f, 0.384f, -0.2f, 0.6f)
            verticalLineTo(16f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-4.667f)
            curveToRelative(0f, -0.216f, -0.07f, -0.427f, -0.2f, -0.6f)
            lineTo(15.3f, 7.4f)
            curveToRelative(-0.182f, -0.242f, -0.462f, -0.388f, -0.763f, -0.4f)
            close()
        }
    }.build()
}
