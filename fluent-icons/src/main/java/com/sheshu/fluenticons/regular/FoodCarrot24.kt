package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FoodCarrot24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FoodCarrot24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 2.75f)
            curveTo(17.5f, 2.336f, 17.164f, 2f, 16.75f, 2f)
            reflectiveCurveTo(16f, 2.336f, 16f, 2.75f)
            verticalLineToRelative(4.013f)
            curveToRelative(-2.026f, -1.355f, -4.866f, -0.879f, -6.291f, 1.217f)
            lineTo(2.355f, 18.786f)
            curveToRelative(-0.556f, 0.818f, -0.45f, 1.91f, 0.255f, 2.608f)
            curveToRelative(0.715f, 0.707f, 1.84f, 0.804f, 2.667f, 0.23f)
            lineToRelative(10.79f, -7.469f)
            curveToRelative(2.056f, -1.424f, 2.51f, -4.178f, 1.176f, -6.155f)
            horizontalLineToRelative(4.007f)
            curveTo(21.664f, 8f, 22f, 7.664f, 22f, 7.25f)
            reflectiveCurveTo(21.664f, 6.5f, 21.25f, 6.5f)
            horizontalLineToRelative(-2.69f)
            lineToRelative(3.22f, -3.22f)
            curveToRelative(0.293f, -0.292f, 0.294f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.292f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(17.5f, 5.439f)
            verticalLineTo(2.75f)
            close()
            moveToRelative(-6.54f, 6.063f)
            curveToRelative(1.062f, -1.561f, 3.3f, -1.776f, 4.646f, -0.445f)
            curveToRelative(1.33f, 1.315f, 1.136f, 3.499f, -0.405f, 4.565f)
            lineToRelative(-10.789f, 7.47f)
            curveToRelative(-0.228f, 0.158f, -0.538f, 0.13f, -0.736f, -0.064f)
            curveToRelative(-0.194f, -0.192f, -0.223f, -0.494f, -0.07f, -0.72f)
            lineTo(10.96f, 8.813f)
            close()
        }
    }.build()
}
