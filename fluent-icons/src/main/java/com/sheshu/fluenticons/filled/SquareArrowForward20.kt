package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SquareArrowForward20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareArrowForward20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(3.6f)
            curveTo(9.216f, 16.25f, 9f, 15.4f, 9f, 14.5f)
            curveTo(9f, 11.462f, 11.462f, 9f, 14.5f, 9f)
            curveToRelative(0.9f, 0f, 1.75f, 0.216f, 2.5f, 0.6f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(8.5f, 16f)
            curveToRelative(-2.485f, 0f, -4.5f, -2.015f, -4.5f, -4.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.015f, 4.5f, -4.5f, 4.5f)
            close()
            moveToRelative(0.896f, -6.396f)
            lineToRelative(0.897f, 0.896f)
            horizontalLineTo(14.75f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            verticalLineToRelative(0.25f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-0.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(1.543f)
            lineToRelative(-0.897f, 0.896f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(1.752f, -1.753f)
            curveToRelative(0.047f, -0.047f, 0.082f, -0.102f, 0.106f, -0.16f)
            curveTo(17.986f, 14.132f, 18f, 14.068f, 18f, 14f)
            reflectiveCurveToRelative(-0.014f, -0.132f, -0.038f, -0.191f)
            curveToRelative(-0.024f, -0.06f, -0.06f, -0.115f, -0.108f, -0.163f)
            lineToRelative(-1.75f, -1.75f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            close()
        }
    }.build()
}
