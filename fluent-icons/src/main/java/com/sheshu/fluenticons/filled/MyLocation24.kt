package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MyLocation24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MyLocation24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(0.513f, 0f, 0.935f, 0.386f, 0.993f, 0.883f)
            lineTo(13f, 3f)
            verticalLineToRelative(1.314f)
            curveToRelative(3.48f, 0.449f, 6.238f, 3.206f, 6.686f, 6.687f)
            lineTo(21f, 11f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.513f, -0.386f, 0.935f, -0.883f, 0.993f)
            lineTo(21f, 13f)
            horizontalLineToRelative(-1.314f)
            curveToRelative(-0.448f, 3.48f, -3.206f, 6.238f, -6.686f, 6.686f)
            verticalLineTo(21f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            curveToRelative(-0.513f, 0f, -0.935f, -0.386f, -0.993f, -0.883f)
            lineTo(11f, 21f)
            verticalLineToRelative(-1.314f)
            curveTo(7.52f, 19.238f, 4.764f, 16.481f, 4.315f, 13f)
            horizontalLineTo(3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            curveToRelative(0f, -0.513f, 0.386f, -0.935f, 0.883f, -0.993f)
            lineTo(3f, 11f)
            horizontalLineToRelative(1.314f)
            curveTo(4.762f, 7.52f, 7.52f, 4.763f, 11f, 4.315f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(0f, 4.25f)
            curveToRelative(-3.176f, 0f, -5.75f, 2.574f, -5.75f, 5.75f)
            reflectiveCurveToRelative(2.574f, 5.75f, 5.75f, 5.75f)
            reflectiveCurveToRelative(5.75f, -2.574f, 5.75f, -5.75f)
            reflectiveCurveTo(15.176f, 6.25f, 12f, 6.25f)
            close()
            moveTo(12f, 8f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
        }
    }.build()
}
