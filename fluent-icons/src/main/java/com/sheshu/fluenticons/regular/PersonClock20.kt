package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonClock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonClock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
            moveToRelative(4f, -3f)
            curveTo(7.343f, 3f, 6f, 4.343f, 6f, 6f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            close()
            moveTo(2f, 13f)
            curveToRelative(0f, -1.113f, 0.903f, -2f, 2.009f, -2f)
            horizontalLineToRelative(6.248f)
            curveToRelative(-0.253f, 0.307f, -0.474f, 0.642f, -0.657f, 1f)
            horizontalLineTo(4.009f)
            curveTo(3.448f, 12f, 3f, 12.447f, 3f, 13f)
            curveToRelative(0f, 1.309f, 0.622f, 2.284f, 1.673f, 2.953f)
            curveTo(5.743f, 16.636f, 7.265f, 17f, 9f, 17f)
            curveToRelative(0.2f, 0f, 0.398f, -0.005f, 0.592f, -0.015f)
            curveToRelative(0.173f, 0.342f, 0.381f, 0.662f, 0.618f, 0.958f)
            curveTo(9.816f, 17.98f, 9.41f, 18f, 9f, 18f)
            curveToRelative(-1.855f, 0f, -3.583f, -0.386f, -4.865f, -1.203f)
            curveTo(2.833f, 15.967f, 2f, 14.69f, 2f, 13f)
            close()
            moveToRelative(17f, 1.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveTo(14.5f, 12f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(16f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.276f, 14f, 16f, 14f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
