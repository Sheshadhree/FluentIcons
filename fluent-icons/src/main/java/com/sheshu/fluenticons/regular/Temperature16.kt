package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Temperature16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Temperature16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 3.5f)
            curveTo(5f, 2.12f, 6.12f, 1f, 7.5f, 1f)
            reflectiveCurveTo(10f, 2.12f, 10f, 3.5f)
            verticalLineToRelative(5.45f)
            curveToRelative(0.618f, 0.631f, 1f, 1.496f, 1f, 2.45f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(4f, 13.333f, 4f, 11.4f)
            curveToRelative(0f, -0.954f, 0.382f, -1.819f, 1f, -2.45f)
            verticalLineTo(3.5f)
            close()
            moveTo(7.5f, 2f)
            curveTo(6.67f, 2f, 6f, 2.671f, 6f, 3.5f)
            verticalLineToRelative(5.887f)
            lineToRelative(-0.166f, 0.15f)
            curveTo(5.32f, 9.994f, 5f, 10.658f, 5f, 11.4f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -0.74f, -0.321f, -1.405f, -0.833f, -1.864f)
            lineTo(9f, 9.388f)
            verticalLineTo(3.5f)
            curveTo(9f, 2.672f, 8.328f, 2f, 7.5f, 2f)
            close()
            moveTo(8f, 6f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(7f, 5.724f, 7f, 6f)
            verticalLineToRelative(4.085f)
            curveToRelative(-0.583f, 0.206f, -1f, 0.762f, -1f, 1.415f)
            curveTo(6f, 12.328f, 6.67f, 13f, 7.5f, 13f)
            curveTo(8.328f, 13f, 9f, 12.328f, 9f, 11.5f)
            curveToRelative(0f, -0.653f, -0.417f, -1.209f, -1f, -1.415f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
