package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Emoji16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Emoji16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 14f)
            curveToRelative(-3.314f, 0f, -6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            close()
            moveTo(6.25f, 7.75f)
            curveTo(6.664f, 7.75f, 7f, 7.414f, 7f, 7f)
            reflectiveCurveTo(6.664f, 6.25f, 6.25f, 6.25f)
            reflectiveCurveTo(5.5f, 6.586f, 5.5f, 7f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            close()
            moveTo(6.136f, 9.666f)
            curveToRelative(-0.184f, -0.205f, -0.5f, -0.223f, -0.705f, -0.039f)
            curveToRelative(-0.206f, 0.185f, -0.224f, 0.5f, -0.04f, 0.707f)
            curveTo(6.031f, 11.049f, 6.963f, 11.5f, 8f, 11.5f)
            reflectiveCurveToRelative(1.969f, -0.451f, 2.609f, -1.166f)
            curveToRelative(0.184f, -0.206f, 0.166f, -0.522f, -0.04f, -0.707f)
            curveToRelative(-0.205f, -0.184f, -0.521f, -0.166f, -0.705f, 0.04f)
            curveTo(9.405f, 10.178f, 8.74f, 10.5f, 8f, 10.5f)
            reflectiveCurveToRelative(-1.405f, -0.321f, -1.864f, -0.834f)
            close()
            moveTo(9.75f, 7.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(9f, 6.586f, 9f, 7f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
