package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailTemplate32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailTemplate32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30f, 19.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.104f, 0.005f, -0.207f, 0.012f, -0.31f)
            lineToRelative(8.954f, 5.656f)
            curveToRelative(0.326f, 0.206f, 0.742f, 0.206f, 1.068f, 0f)
            lineToRelative(8.953f, -5.656f)
            curveTo(29.994f, 19.293f, 30f, 19.396f, 30f, 19.5f)
            close()
            moveTo(22.5f, 2f)
            curveTo(24.985f, 2f, 27f, 4.015f, 27f, 6.5f)
            verticalLineToRelative(7.19f)
            curveToRelative(-0.384f, -0.1f, -0.782f, -0.161f, -1.191f, -0.182f)
            lineTo(25.5f, 13.5f)
            horizontalLineToRelative(-10f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.518f, 0.065f, 1.02f, 0.188f, 1.5f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineToRelative(-16f)
            curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
            horizontalLineToRelative(16f)
            close()
            moveToRelative(3f, 13f)
            curveToRelative(1.65f, 0f, 3.09f, 0.888f, 3.874f, 2.212f)
            lineTo(20.5f, 22.816f)
            lineToRelative(-8.875f, -5.604f)
            curveTo(12.408f, 15.888f, 13.85f, 15f, 15.5f, 15f)
            horizontalLineToRelative(10f)
            close()
            moveTo(12f, 10f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(8f, 6f)
            curveTo(7.448f, 6f, 7f, 6.448f, 7f, 7f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(13f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
