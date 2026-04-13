package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Alert48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Alert48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 19f)
            verticalLineToRelative(8.75f)
            curveToRelative(0f, 0.174f, -0.036f, 0.346f, -0.107f, 0.505f)
            lineTo(8.639f, 34.5f)
            horizontalLineToRelative(30.724f)
            lineToRelative(-2.756f, -6.245f)
            curveToRelative(-0.07f, -0.16f, -0.106f, -0.331f, -0.106f, -0.505f)
            verticalLineTo(19f)
            curveToRelative(0f, -6.904f, -5.596f, -12.5f, -12.5f, -12.5f)
            reflectiveCurveTo(11.5f, 12.096f, 11.5f, 19f)
            close()
            moveTo(18f, 37f)
            horizontalLineTo(8.254f)
            curveToRelative(-1.625f, 0f, -2.714f, -1.671f, -2.058f, -3.158f)
            lineTo(9f, 27.487f)
            verticalLineTo(19f)
            curveToRelative(0f, -8.284f, 6.716f, -15f, 15f, -15f)
            curveToRelative(8.284f, 0f, 15f, 6.716f, 15f, 15f)
            verticalLineToRelative(8.486f)
            lineToRelative(2.804f, 6.356f)
            curveTo(42.461f, 35.329f, 41.371f, 37f, 39.746f, 37f)
            horizontalLineTo(30f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(9.5f, 0f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-1f)
            close()
        }
    }.build()
}
