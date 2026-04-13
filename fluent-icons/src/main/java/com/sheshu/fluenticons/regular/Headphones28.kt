package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Headphones28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Headphones28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 26f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.513f, 0f, -0.936f, -0.386f, -0.993f, -0.883f)
            lineTo(18f, 25f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.513f, 0.386f, -0.936f, 0.883f, -0.993f)
            lineTo(19f, 16f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -5.799f, -4.701f, -10.5f, -10.5f, -10.5f)
            reflectiveCurveTo(3.5f, 8.201f, 3.5f, 14f)
            verticalLineToRelative(2f)
            horizontalLineTo(9f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-8f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.142f, -1.684f, 3.891f, -3.8f, 3.995f)
            lineTo(22f, 26f)
            horizontalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            close()
            moveTo(8.5f, 17.5f)
            horizontalLineToRelative(-5f)
            verticalLineTo(22f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(16f, 0f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(7f)
            horizontalLineTo(22f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4.5f)
            close()
        }
    }.build()
}
