package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cube28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cube28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.793f, 2.734f)
            curveToRelative(0.775f, -0.31f, 1.64f, -0.31f, 2.414f, 0f)
            lineToRelative(8.75f, 3.5f)
            curveTo(25.191f, 6.728f, 26f, 7.923f, 26f, 9.252f)
            verticalLineToRelative(9.505f)
            curveToRelative(0f, 1.329f, -0.81f, 2.524f, -2.043f, 3.017f)
            lineToRelative(-8.75f, 3.5f)
            curveToRelative(-0.775f, 0.31f, -1.64f, 0.31f, -2.414f, 0f)
            lineToRelative(-8.75f, -3.5f)
            curveTo(2.809f, 21.281f, 2f, 20.086f, 2f, 18.757f)
            verticalLineTo(9.252f)
            curveToRelative(0f, -1.329f, 0.81f, -2.524f, 2.043f, -3.018f)
            lineToRelative(8.75f, -3.5f)
            close()
            moveTo(8.052f, 9.071f)
            curveTo(7.672f, 8.905f, 7.23f, 9.077f, 7.063f, 9.456f)
            curveToRelative(-0.166f, 0.38f, 0.006f, 0.822f, 0.385f, 0.988f)
            lineToRelative(5.802f, 2.55f)
            verticalLineToRelative(6.759f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-6.758f)
            lineToRelative(5.802f, -2.55f)
            curveToRelative(0.38f, -0.167f, 0.552f, -0.61f, 0.385f, -0.989f)
            curveToRelative(-0.167f, -0.38f, -0.61f, -0.551f, -0.989f, -0.385f)
            lineTo(14f, 11.686f)
            lineTo(8.052f, 9.07f)
            close()
        }
    }.build()
}
