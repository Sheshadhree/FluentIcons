package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BatteryCharge32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BatteryCharge32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(4f, 5.448f, 4f, 6f)
            verticalLineToRelative(2f)
            horizontalLineTo(3f)
            curveTo(2.448f, 8f, 2f, 8.448f, 2f, 9f)
            verticalLineToRelative(3.5f)
            curveTo(2f, 13.88f, 3.12f, 15f, 4.5f, 15f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-8f)
            horizontalLineToRelative(1f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(9f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(7f, 5.448f, 7f, 6f)
            verticalLineToRelative(2f)
            horizontalLineTo(6f)
            verticalLineTo(6f)
            close()
            moveToRelative(7.5f, 2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.25f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineTo(23f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(13f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(19f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(28f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-10f)
            close()
        }
    }.build()
}
