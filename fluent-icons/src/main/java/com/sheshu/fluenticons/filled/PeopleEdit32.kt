package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PeopleEdit32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleEdit32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 9.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveTo(5f, 12.538f, 5f, 9.5f)
            reflectiveCurveTo(7.462f, 4f, 10.5f, 4f)
            reflectiveCurveTo(16f, 6.462f, 16f, 9.5f)
            close()
            moveTo(27f, 11f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
            moveTo(2f, 20f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(11f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(0.15f)
            reflectiveCurveToRelative(0f, 1.179f, -0.769f, 2.478f)
            lineToRelative(-2.006f, 2.023f)
            curveTo(14.97f, 25.433f, 13.147f, 26f, 10.5f, 26f)
            curveTo(2f, 26f, 2f, 20.15f, 2f, 20.15f)
            verticalLineTo(20f)
            close()
            moveToRelative(27.644f, 1.424f)
            lineToRelative(-8.61f, 8.543f)
            curveToRelative(-0.35f, 0.349f, -0.789f, 0.598f, -1.269f, 0.721f)
            lineToRelative(-3.02f, 0.778f)
            curveToRelative(-0.737f, 0.19f, -1.407f, -0.482f, -1.216f, -1.22f)
            lineToRelative(0.79f, -3.05f)
            curveToRelative(0.118f, -0.456f, 0.355f, -0.872f, 0.686f, -1.206f)
            lineToRelative(8.567f, -8.64f)
            curveToRelative(1.148f, -1.159f, 3.028f, -1.133f, 4.144f, 0.057f)
            curveToRelative(1.067f, 1.137f, 1.035f, 2.918f, -0.072f, 4.017f)
            close()
        }
    }.build()
}
