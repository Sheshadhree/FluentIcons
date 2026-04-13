package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LinkMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LinkMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 8f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 12f, 9f, 11.776f, 9f, 11.5f)
            reflectiveCurveTo(9.224f, 11f, 9.5f, 11f)
            horizontalLineTo(11f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            curveTo(3.343f, 5f, 2f, 6.343f, 2f, 8f)
            curveToRelative(0f, 1.354f, 0.896f, 2.498f, 2.128f, 2.871f)
            curveToRelative(-0.075f, 0.324f, -0.118f, 0.66f, -0.126f, 1.003f)
            curveTo(2.276f, 11.431f, 1f, 9.864f, 1f, 8f)
            close()
            moveToRelative(17f, 4f)
            curveToRelative(0f, -1.354f, -0.896f, -2.498f, -2.128f, -2.871f)
            curveToRelative(0.075f, -0.324f, 0.118f, -0.66f, 0.127f, -1.003f)
            curveTo(17.724f, 8.569f, 19f, 10.136f, 19f, 12f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(9f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(1.5f)
            curveTo(10.776f, 8f, 11f, 8.224f, 11f, 8.5f)
            reflectiveCurveTo(10.776f, 9f, 10.5f, 9f)
            horizontalLineTo(9f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            close()
        }
    }.build()
}
