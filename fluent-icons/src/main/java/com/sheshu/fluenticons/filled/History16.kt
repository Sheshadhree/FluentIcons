package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.History16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.History16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3.5f)
            curveToRelative(2.486f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveToRelative(-2.014f, 4.5f, -4.5f, 4.5f)
            curveToRelative(-2.267f, 0f, -4.144f, -1.678f, -4.455f, -3.86f)
            curveToRelative(-0.058f, -0.41f, -0.438f, -0.695f, -0.848f, -0.636f)
            curveToRelative(-0.41f, 0.058f, -0.695f, 0.438f, -0.637f, 0.848f)
            curveTo(2.474f, 11.762f, 4.975f, 14f, 8f, 14f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            curveTo(6.463f, 2f, 5.061f, 2.578f, 4f, 3.528f)
            verticalLineTo(2.75f)
            curveTo(4f, 2.336f, 3.664f, 2f, 3.25f, 2f)
            reflectiveCurveTo(2.5f, 2.336f, 2.5f, 2.75f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(6.164f, 5f, 5.75f, 5f)
            horizontalLineTo(4.646f)
            curveTo(5.47f, 4.079f, 6.668f, 3.5f, 8f, 3.5f)
            close()
            moveToRelative(0.5f, 2.25f)
            curveTo(8.5f, 5.336f, 8.164f, 5f, 7.75f, 5f)
            reflectiveCurveTo(7f, 5.336f, 7f, 5.75f)
            verticalLineToRelative(2.5f)
            curveTo(7f, 8.664f, 7.336f, 9f, 7.75f, 9f)
            horizontalLineToRelative(2f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.164f, 7.5f, 9.75f, 7.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(5.75f)
            close()
        }
    }.build()
}
