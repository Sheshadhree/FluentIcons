package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Person32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Person32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 9f)
            curveToRelative(0f, 3.866f, -3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            close()
            moveToRelative(-2f, 0f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
            moveTo(7.5f, 18f)
            curveTo(5.567f, 18f, 4f, 19.567f, 4f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(9.859f, 29.177f, 12.802f, 30f, 16f, 30f)
            curveToRelative(3.198f, 0f, 6.14f, -0.823f, 8.315f, -2.207f)
            curveTo(26.477f, 26.417f, 28f, 24.393f, 28f, 22f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-17f)
            close()
            moveTo(6f, 21.5f)
            curveTo(6f, 20.672f, 6.672f, 20f, 7.5f, 20f)
            horizontalLineToRelative(17f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 1.473f, -0.94f, 2.949f, -2.759f, 4.106f)
            curveTo(21.434f, 27.256f, 18.877f, 28f, 16f, 28f)
            reflectiveCurveToRelative(-5.434f, -0.744f, -7.241f, -1.894f)
            curveTo(6.939f, 24.95f, 6f, 23.472f, 6f, 22f)
            verticalLineToRelative(-0.5f)
            close()
        }
    }.build()
}
