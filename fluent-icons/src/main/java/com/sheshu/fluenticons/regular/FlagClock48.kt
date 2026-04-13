package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlagClock48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagClock48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 7.25f)
            curveTo(7.5f, 6.56f, 8.06f, 6f, 8.75f, 6f)
            horizontalLineToRelative(32.5f)
            curveToRelative(0.471f, 0f, 0.902f, 0.265f, 1.115f, 0.686f)
            curveToRelative(0.213f, 0.42f, 0.171f, 0.924f, -0.108f, 1.304f)
            lineTo(33.801f, 19.5f)
            lineToRelative(1.849f, 2.516f)
            curveTo(35.434f, 22.006f, 35.218f, 22f, 35f, 22f)
            curveToRelative(-0.79f, 0f, -1.563f, 0.07f, -2.314f, 0.205f)
            lineToRelative(-1.443f, -1.965f)
            curveToRelative(-0.324f, -0.44f, -0.324f, -1.04f, 0f, -1.48f)
            lineTo(38.78f, 8.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(22f)
            horizontalLineToRelative(12.8f)
            curveToRelative(-0.295f, 0.8f, -0.514f, 1.636f, -0.647f, 2.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(9.75f)
            curveTo(10f, 43.44f, 9.44f, 44f, 8.75f, 44f)
            reflectiveCurveTo(7.5f, 43.44f, 7.5f, 42.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(46f, 35f)
            curveToRelative(0f, 6.075f, -4.925f, 11f, -11f, 11f)
            reflectiveCurveToRelative(-11f, -4.925f, -11f, -11f)
            reflectiveCurveToRelative(4.925f, -11f, 11f, -11f)
            reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
            close()
            moveToRelative(-5f, 0f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.265f, 0.105f, 0.52f, 0.293f, 0.707f)
            curveTo(34.48f, 35.895f, 34.735f, 36f, 35f, 36f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
