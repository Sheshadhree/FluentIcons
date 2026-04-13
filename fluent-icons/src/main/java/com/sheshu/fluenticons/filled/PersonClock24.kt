package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.022f, 14f)
            curveTo(11.375f, 15.01f, 11f, 16.21f, 11f, 17.5f)
            curveToRelative(0f, 1.63f, 0.6f, 3.121f, 1.593f, 4.263f)
            curveTo(11.796f, 21.922f, 10.93f, 22f, 10f, 22f)
            curveToRelative(-3.146f, 0f, -5.532f, -0.905f, -7.098f, -2.74f)
            curveToRelative(-0.58f, -0.678f, -0.898f, -1.542f, -0.898f, -2.434f)
            verticalLineToRelative(-0.578f)
            curveToRelative(0f, -1.242f, 1.007f, -2.25f, 2.249f, -2.25f)
            horizontalLineToRelative(7.769f)
            close()
            moveTo(15f, 7.005f)
            curveToRelative(0f, -2.762f, -2.238f, -5f, -5f, -5f)
            curveToRelative(-2.761f, 0f, -5f, 2.238f, -5f, 5f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            curveToRelative(2.762f, 0f, 5f, -2.239f, 5f, -5f)
            close()
            moveTo(23f, 17.5f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveTo(12f, 14.462f, 12f, 17.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.462f, 5.5f, -5.5f)
            close()
            moveTo(17.5f, 14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(20.276f, 18f, 20f, 18f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
