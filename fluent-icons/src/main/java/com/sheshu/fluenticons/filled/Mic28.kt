package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mic28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mic28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-8f)
            curveTo(18.5f, 4.015f, 16.485f, 2f, 14f, 2f)
            close()
            moveTo(7.5f, 13.75f)
            curveTo(7.5f, 13.337f, 7.164f, 13f, 6.75f, 13f)
            reflectiveCurveTo(6f, 13.338f, 6f, 13.75f)
            verticalLineToRelative(0.75f)
            curveToRelative(0f, 4.165f, 3.183f, 7.587f, 7.25f, 7.965f)
            verticalLineToRelative(2.785f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-2.785f)
            curveToRelative(4.067f, -0.378f, 7.25f, -3.8f, 7.25f, -7.965f)
            verticalLineToRelative(-0.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(0.75f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
            verticalLineToRelative(-0.75f)
            close()
        }
    }.build()
}
