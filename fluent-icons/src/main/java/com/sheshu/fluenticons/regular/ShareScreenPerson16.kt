package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShareScreenPerson16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareScreenPerson16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(2.12f, 3f, 1f, 4.12f, 1f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 11.88f, 2.12f, 13f, 3.5f, 13f)
            horizontalLineToRelative(3.538f)
            curveTo(7.013f, 12.834f, 7f, 12.667f, 7f, 12.5f)
            curveToRelative(0f, -0.171f, 0.017f, -0.338f, 0.05f, -0.5f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 12f, 2f, 11.328f, 2f, 10.5f)
            verticalLineToRelative(-5f)
            curveTo(2f, 4.672f, 2.672f, 4f, 3.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(13.328f, 4f, 14f, 4.672f, 14f, 5.5f)
            verticalLineToRelative(0.841f)
            curveToRelative(0.273f, 0.41f, 0.447f, 0.891f, 0.49f, 1.41f)
            curveTo(14.5f, 7.887f, 14.612f, 8f, 14.75f, 8f)
            reflectiveCurveTo(15f, 7.888f, 15f, 7.75f)
            verticalLineTo(5.5f)
            curveTo(15f, 4.12f, 13.88f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(10f, 5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(1.5f, 4.5f)
            curveToRelative(0f, 1.245f, -1f, 2.5f, -3.5f, 2.5f)
            reflectiveCurveTo(8f, 13.75f, 8f, 12.5f)
            curveTo(8f, 11.672f, 8.672f, 11f, 9.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
