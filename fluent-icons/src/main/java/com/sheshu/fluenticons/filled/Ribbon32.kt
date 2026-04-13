package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ribbon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ribbon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 21.813f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.36f, 0.194f, 0.693f, 0.507f, 0.87f)
            curveToRelative(0.314f, 0.178f, 0.699f, 0.173f, 1.008f, -0.012f)
            lineTo(16f, 27.166f)
            lineToRelative(4.485f, 2.692f)
            curveToRelative(0.31f, 0.185f, 0.694f, 0.19f, 1.008f, 0.012f)
            curveTo(21.806f, 29.693f, 22f, 29.36f, 22f, 29f)
            verticalLineToRelative(-7.187f)
            curveToRelative(-1.747f, 1.07f, -3.801f, 1.687f, -6f, 1.687f)
            reflectiveCurveToRelative(-4.253f, -0.617f, -6f, -1.687f)
            close()
            moveTo(22f, 20f)
            curveToRelative(-1.671f, 1.256f, -3.749f, 2f, -6f, 2f)
            reflectiveCurveToRelative(-4.329f, -0.744f, -6f, -2f)
            curveToRelative(-0.123f, -0.091f, -0.243f, -0.186f, -0.36f, -0.284f)
            curveTo(7.416f, 17.883f, 6f, 15.107f, 6f, 12f)
            curveTo(6f, 6.477f, 10.477f, 2f, 16f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            curveToRelative(0f, 3.272f, -1.571f, 6.176f, -4f, 8f)
            close()
        }
    }.build()
}
