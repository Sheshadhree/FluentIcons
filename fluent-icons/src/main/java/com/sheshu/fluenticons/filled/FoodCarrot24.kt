package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FoodCarrot24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodCarrot24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 2.75f)
            curveTo(17.5f, 2.336f, 17.164f, 2f, 16.75f, 2f)
            reflectiveCurveTo(16f, 2.336f, 16f, 2.75f)
            verticalLineToRelative(4.015f)
            curveToRelative(-2.026f, -1.358f, -4.867f, -0.881f, -6.293f, 1.215f)
            lineTo(2.353f, 18.786f)
            curveToRelative(-0.556f, 0.818f, -0.45f, 1.91f, 0.255f, 2.608f)
            curveToRelative(0.715f, 0.707f, 1.84f, 0.804f, 2.667f, 0.23f)
            lineToRelative(10.79f, -7.469f)
            curveTo(18.12f, 12.731f, 18.574f, 9.977f, 17.24f, 8f)
            horizontalLineToRelative(4.009f)
            curveTo(21.664f, 8f, 22f, 7.664f, 22f, 7.25f)
            reflectiveCurveTo(21.664f, 6.5f, 21.25f, 6.5f)
            horizontalLineToRelative(-2.69f)
            lineToRelative(3.22f, -3.22f)
            curveToRelative(0.293f, -0.292f, 0.294f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.292f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(17.5f, 5.439f)
            verticalLineTo(2.75f)
            close()
        }
    }.build()
}
