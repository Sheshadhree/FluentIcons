package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOneQuarter12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOneQuarter12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.12f)
            lineTo(4.172f, 3.798f)
            lineTo(1.686f, 4.16f)
            curveTo(1.259f, 4.222f, 0.999f, 4.584f, 1f, 4.958f)
            curveToRelative(0f, 0.2f, 0.077f, 0.404f, 0.242f, 0.566f)
            lineToRelative(1.8f, 1.754f)
            lineToRelative(-0.425f, 2.475f)
            curveTo(2.61f, 9.794f, 2.606f, 9.835f, 2.605f, 9.874f)
            curveToRelative(-0.001f, 0.045f, 0.001f, 0.09f, 0.007f, 0.133f)
            curveToRelative(0.075f, 0.52f, 0.657f, 0.857f, 1.165f, 0.59f)
            lineTo(5f, 9.954f)
            verticalLineTo(2.12f)
            close()
        }
    }.build()
}
