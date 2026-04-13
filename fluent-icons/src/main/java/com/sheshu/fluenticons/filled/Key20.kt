package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Key20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Key20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 7.5f)
            curveTo(7f, 4.424f, 9.424f, 2f, 12.5f, 2f)
            reflectiveCurveTo(18f, 4.424f, 18f, 7.5f)
            reflectiveCurveTo(15.576f, 13f, 12.5f, 13f)
            curveToRelative(-0.493f, 0f, -1.007f, -0.046f, -1.5f, -0.18f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(9f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            verticalLineToRelative(0.5f)
            curveTo(7f, 17.328f, 6.328f, 18f, 5.5f, 18f)
            horizontalLineToRelative(-2f)
            curveTo(2.672f, 18f, 2f, 17.328f, 2f, 16.5f)
            verticalLineToRelative(-1.586f)
            curveToRelative(0f, -0.398f, 0.158f, -0.78f, 0.44f, -1.06f)
            lineToRelative(4.54f, -4.541f)
            curveToRelative(0.134f, -0.134f, 0.2f, -0.369f, 0.141f, -0.638f)
            curveTo(7.04f, 8.296f, 7f, 7.897f, 7f, 7.5f)
            close()
            moveTo(15f, 6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
