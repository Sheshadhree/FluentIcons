package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Lightbulb24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Lightbulb24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.538f, 18.999f)
            lineToRelative(-0.29f, 1.259f)
            curveToRelative(-0.224f, 0.963f, -1.047f, 1.66f, -2.02f, 1.735f)
            lineTo(13.056f, 22f)
            horizontalLineToRelative(-2.111f)
            curveToRelative(-0.99f, 0f, -1.856f, -0.645f, -2.147f, -1.577f)
            lineTo(8.75f, 20.256f)
            lineToRelative(-0.29f, -1.257f)
            horizontalLineToRelative(7.077f)
            close()
            moveTo(12f, 2.001f)
            curveToRelative(4.004f, 0f, 7.25f, 3.246f, 7.25f, 7.25f)
            curveToRelative(0f, 2.136f, -0.936f, 4.093f, -2.765f, 5.84f)
            curveToRelative(-0.036f, 0.034f, -0.06f, 0.078f, -0.071f, 0.125f)
            lineTo(15.886f, 17.5f)
            horizontalLineTo(8.114f)
            lineToRelative(-0.526f, -2.283f)
            curveToRelative(-0.011f, -0.047f, -0.036f, -0.09f, -0.071f, -0.124f)
            curveToRelative(-1.83f, -1.748f, -2.767f, -3.705f, -2.767f, -5.841f)
            curveToRelative(0f, -4.004f, 3.246f, -7.25f, 7.25f, -7.25f)
            close()
        }
    }.build()
}
