package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookTheta24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookTheta24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 16.5f)
            curveToRelative(2.21f, 0f, 4f, -2.462f, 4f, -5.5f)
            reflectiveCurveToRelative(-1.79f, -5.5f, -4f, -5.5f)
            reflectiveCurveToRelative(-4f, 2.462f, -4f, 5.5f)
            reflectiveCurveToRelative(1.79f, 5.5f, 4f, 5.5f)
            close()
            moveToRelative(1.615f, -2.493f)
            curveTo(13.596f, 14.72f, 13.006f, 15f, 12.5f, 15f)
            reflectiveCurveToRelative(-1.096f, -0.28f, -1.615f, -0.993f)
            curveToRelative(-0.372f, -0.512f, -0.666f, -1.201f, -0.802f, -2.007f)
            horizontalLineToRelative(4.834f)
            curveToRelative(-0.136f, 0.806f, -0.43f, 1.495f, -0.802f, 2.007f)
            close()
            moveToRelative(0f, -6.014f)
            curveToRelative(0.447f, 0.614f, 0.781f, 1.486f, 0.865f, 2.507f)
            horizontalLineToRelative(-4.96f)
            curveToRelative(0.084f, -1.021f, 0.418f, -1.893f, 0.865f, -2.507f)
            curveTo(11.404f, 7.28f, 11.994f, 7f, 12.5f, 7f)
            reflectiveCurveToRelative(1.096f, 0.28f, 1.615f, 0.993f)
            close()
            moveTo(6.5f, 2f)
            curveTo(5.12f, 2f, 4f, 3.12f, 4f, 4.5f)
            verticalLineToRelative(15f)
            curveTo(4f, 20.88f, 5.12f, 22f, 6.5f, 22f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(6.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(14.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.12f, 19.38f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            close()
            moveTo(19f, 18f)
            horizontalLineTo(5.5f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineTo(18f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}
