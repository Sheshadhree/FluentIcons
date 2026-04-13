package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonSubtract20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonSubtract20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveTo(7.79f, 2f, 6f, 3.79f, 6f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveTo(7f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(-1.991f, 5f)
            curveTo(3.903f, 11f, 3f, 11.887f, 3f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(6.417f, 17.614f, 8.145f, 18f, 10f, 18f)
            curveToRelative(0.085f, 0f, 0.17f, 0f, 0.255f, -0.003f)
            curveToRelative(-0.254f, -0.308f, -0.476f, -0.644f, -0.659f, -1.004f)
            curveToRelative(-1.567f, -0.052f, -2.937f, -0.41f, -3.923f, -1.04f)
            curveTo(4.623f, 15.283f, 4f, 14.31f, 4f, 13f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1.009f, -1f)
            horizontalLineToRelative(4.59f)
            curveToRelative(0.184f, -0.358f, 0.405f, -0.693f, 0.658f, -1f)
            horizontalLineTo(5.01f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-7f, 0f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 14f, 16.5f, 14f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            close()
        }
    }.build()
}
