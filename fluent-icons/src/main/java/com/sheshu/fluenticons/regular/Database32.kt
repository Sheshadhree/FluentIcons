package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Database32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Database32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27f, 7f)
            curveToRelative(0f, -2.761f, -4.925f, -5f, -11f, -5f)
            reflectiveCurveTo(5f, 4.239f, 5f, 7f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 2.761f, 4.925f, 5f, 11f, 5f)
            reflectiveCurveToRelative(11f, -2.239f, 11f, -5f)
            verticalLineTo(7f)
            close()
            moveToRelative(-2f, 0f)
            curveToRelative(0f, 0.114f, -0.193f, 0.871f, -2.05f, 1.715f)
            curveTo(21.276f, 9.476f, 18.82f, 10f, 16f, 10f)
            curveToRelative(-2.82f, 0f, -5.275f, -0.524f, -6.95f, -1.285f)
            curveTo(7.192f, 7.87f, 7f, 7.115f, 7f, 7f)
            curveToRelative(0f, -0.114f, 0.193f, -0.871f, 2.05f, -1.715f)
            curveTo(10.724f, 4.524f, 13.18f, 4f, 16f, 4f)
            curveToRelative(2.82f, 0f, 5.275f, 0.524f, 6.95f, 1.285f)
            curveTo(24.808f, 6.13f, 25f, 6.885f, 25f, 7f)
            close()
            moveToRelative(0f, 2.876f)
            verticalLineTo(25f)
            curveToRelative(0f, 0.114f, -0.193f, 0.871f, -2.05f, 1.715f)
            curveTo(21.276f, 27.477f, 18.82f, 28f, 16f, 28f)
            curveToRelative(-2.82f, 0f, -5.275f, -0.523f, -6.95f, -1.285f)
            curveTo(7.192f, 25.87f, 7f, 25.115f, 7f, 25f)
            verticalLineTo(9.876f)
            curveTo(8.99f, 11.16f, 12.28f, 12f, 16f, 12f)
            curveToRelative(3.72f, 0f, 7.01f, -0.84f, 9f, -2.124f)
            close()
        }
    }.build()
}
