package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MyLocation16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MyLocation16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 10.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(9.38f, 5.5f, 8f, 5.5f)
            reflectiveCurveTo(5.5f, 6.62f, 5.5f, 8f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveToRelative(0.75f, -8.75f)
            curveTo(8.75f, 1.336f, 8.414f, 1f, 8f, 1f)
            reflectiveCurveTo(7.25f, 1.336f, 7.25f, 1.75f)
            verticalLineToRelative(1.306f)
            curveTo(5.089f, 3.38f, 3.38f, 5.089f, 3.056f, 7.25f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 7.25f, 1f, 7.586f, 1f, 8f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(1.306f)
            curveToRelative(0.325f, 2.161f, 2.033f, 3.87f, 4.194f, 4.194f)
            verticalLineToRelative(1.306f)
            curveTo(7.25f, 14.664f, 7.586f, 15f, 8f, 15f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-1.306f)
            curveToRelative(2.161f, -0.325f, 3.87f, -2.033f, 4.194f, -4.194f)
            horizontalLineToRelative(1.306f)
            curveTo(14.664f, 8.75f, 15f, 8.414f, 15f, 8f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-1.306f)
            curveTo(12.62f, 5.089f, 10.911f, 3.38f, 8.75f, 3.056f)
            verticalLineTo(1.75f)
            close()
            moveTo(8f, 11.5f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveTo(6.067f, 4.5f, 8f, 4.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            close()
        }
    }.build()
}
