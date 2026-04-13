package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Beaker32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Beaker32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 5f)
            verticalLineToRelative(8.438f)
            curveToRelative(0f, 0.814f, 0.248f, 1.608f, 0.71f, 2.277f)
            lineToRelative(5.71f, 8.248f)
            curveTo(27.896f, 26.092f, 26.372f, 29f, 23.783f, 29f)
            horizontalLineTo(8.217f)
            curveToRelative(-2.589f, 0f, -4.113f, -2.908f, -2.639f, -5.037f)
            lineToRelative(5.71f, -8.248f)
            curveTo(11.751f, 15.046f, 12f, 14.252f, 12f, 13.438f)
            verticalLineTo(5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-1f)
            close()
            moveToRelative(-6f, 8.438f)
            curveToRelative(0f, 1.22f, -0.373f, 2.412f, -1.067f, 3.415f)
            lineTo(12.139f, 18f)
            horizontalLineToRelative(7.721f)
            lineToRelative(-0.794f, -1.147f)
            curveTo(18.372f, 15.85f, 18f, 14.658f, 18f, 13.438f)
            verticalLineTo(5f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(8.438f)
            close()
            moveToRelative(-3.228f, 6.536f)
            lineToRelative(-3.55f, 5.127f)
            curveTo(6.668f, 25.904f, 7.243f, 27f, 8.218f, 27f)
            horizontalLineToRelative(15.565f)
            curveToRelative(0.976f, 0f, 1.55f, -1.096f, 0.994f, -1.899f)
            lineToRelative(-3.55f, -5.127f)
            curveTo(21.155f, 19.991f, 21.079f, 20f, 21f, 20f)
            horizontalLineTo(11f)
            curveToRelative(-0.078f, 0f, -0.155f, -0.009f, -0.228f, -0.026f)
            close()
        }
    }.build()
}
